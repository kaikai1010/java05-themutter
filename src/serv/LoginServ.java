package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;
import model.UserLogin;

@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to login.jsp

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/login.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to loginDone.jsp

		//utf-8
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		UserLogin ul = null;
		User u = new User(id, pass);
		LoginLogic logic = new LoginLogic();
		ul = logic.execute(u);

		if(ul != null) {
			HttpSession session = request.getSession();
			session.setAttribute("ul", ul);
		}

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/loginDone.jsp");
		d.forward(request, response);
	}
}
