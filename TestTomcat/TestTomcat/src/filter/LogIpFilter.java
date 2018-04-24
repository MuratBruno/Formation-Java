package filter;

import java.io.IOException;
import java.time.Instant;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LogIpFilter
 */
@WebFilter(filterName="LogIpFilter",urlPatterns=("/*"))
public class LogIpFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LogIpFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
    @Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		// Recupere la date et l'heure instant et l'adresse IP du client et l'affiche dans la console
		
		Instant t = Instant.now();
		HttpServletRequest hsr = (HttpServletRequest) request;
		System.out.println("Date / Heure : " + t +" et Adresse IP du client : " + hsr.getRemoteAddr());
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
