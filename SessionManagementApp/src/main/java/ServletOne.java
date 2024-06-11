

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletOne() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    String username;
	    username=request.getParameter("username");
	    HttpSession session=request.getSession();
	    session.setAttribute("user",username);
	    out.println("In Servlet One!");
	    out.prinltn("User:"+username);
	    out.println("<a herf='ServletTwo'>Click to Proceed!</a>");
		// TODO Auto-generated method stub
	}

}
