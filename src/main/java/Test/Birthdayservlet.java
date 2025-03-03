package Test;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;


@WebServlet("/birthday")
public class Birthdayservlet extends GenericServlet {
    protected void doGet(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
