package com.aplose.smooss;

import java.io.IOException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet implementation class MailServlet
 * 
 */

@WebServlet(urlPatterns = "/MailServlet")

public class MailServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @see HttpServlet#HttpServlet()
	 * 
	 */

	public MailServlet() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String mailContent = request.getParameter("mailContent");

		try {

			Context initialContext = new InitialContext();
			Context envContext = (Context) initialContext.lookup("java:comp/env");
			Session mailSession = (Session) envContext.lookup("mail/Session");
			Message message = new MimeMessage(mailSession);
			message.setFrom(new InternetAddress("contact@smooss.fr"));
			InternetAddress to[] = new InternetAddress[1];
			to[0] = new InternetAddress(email);
			message.setRecipients(Message.RecipientType.TO, to);
			message.setSubject(subject);
			message.setContent(mailContent, "text/plain");
			Transport.send(message);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}