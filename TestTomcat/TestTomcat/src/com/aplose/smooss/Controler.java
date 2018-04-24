package com.aplose.smooss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controler
 */
@WebServlet()
public class Controler extends HttpServlet {

	public static final String CONF = "/WEB-INF/conf.txt";

	private HashMap<String, Action> actions = new HashMap<String, Action>();
	private HashMap<String, String> success = new HashMap<String, String>();
	private HashMap<String, String> errors = new HashMap<String, String>();

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init() throws ServletException {
		try {
		super.init();
		
			ServletContext context = getServletContext();
			InputStream is = context.getResourceAsStream(CONF);
			
			if(is != null) {
				BufferedReader bfr = new BufferedReader(new InputStreamReader(is));
				
				for (String line = bfr.readLine(); line != null; line = bfr.readLine()) {
					
					if(line.trim().startsWith("#")) {
						continue;
					}
					
					String[] confLine = line.split(";");
					
					if (confLine.length == 4) {
						// 1 er element
						String actionName = confLine[0];
						

							actions.put(actionName, (Action)Class.forName(confLine[1]).newInstance());

						// 2 ème element
						@SuppressWarnings("unused")
						String successName = confLine[1];
						success.put(actionName, confLine[2]);
						// 3 ème element
						errors.put(actionName, confLine[3]);
						
						}
						}
					}
				} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Action action;
		String pAction = request.getParameter("actionName");
		if (null == pAction) {
			pAction = "login.do";
		}
		action = actions.get(pAction);
		
		if (null != action) {
		
			try {
				
			Boolean executeSuccess = action.execute(request, response);
			
			RequestDispatcher dispatcher = null;
			String url = null;
			
			if (executeSuccess) {
				url = success.get(pAction);
			}else {
				url = errors.get(pAction);
			}
			dispatcher = getServletContext().getRequestDispatcher(url);
			if (dispatcher!=null) {
				dispatcher.forward(request, response);
			}

			} catch (Exception ex) {
				Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

}
