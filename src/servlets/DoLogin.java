package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data (사용자가 입력한 데이터를 읽어들인다)
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//perform business logic
		
		PrintWriter out = response.getWriter();
		
		//build HTML code
		String htmlResponse="<html>";
		
		htmlResponse+="<h2> Your name is:" + username + "<br/>";
		htmlResponse+="Your password is:" + password + "<h2>";
		htmlResponse+="</html>";
		
		out.println(htmlResponse);
	}	

}
