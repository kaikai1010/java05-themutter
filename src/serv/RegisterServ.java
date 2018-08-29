package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegisterLogic;
import model.User;

@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to register.jsp

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/register.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to registerDone.jsp

		//utf-8
		String id = request.getParameter("id");
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");

		User u = new User(id, mail, pass);
		RegisterLogic logic = new RegisterLogic();
		boolean isRegister = logic.execute(u);

		if(isRegister) {
			request.setAttribute("u", u);
		}

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/registerDone.jsp");
		d.forward(request, response);
	}
}
