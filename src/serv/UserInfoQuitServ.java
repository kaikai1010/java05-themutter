package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserInfoQuitLogic;
import model.UserLogin;

@WebServlet("/UserInfoQuitServ")
public class UserInfoQuitServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to UserInfoQuitDone.jsp

		HttpSession session = request.getSession();
		UserLogin ul = (UserLogin) session.getAttribute("ul");

		UserInfoQuitLogic logic = new UserInfoQuitLogic();
		logic.execute(ul);

		session.invalidate();

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/userInfoQuitDone.jsp");
		d.forward(request, response);
	}

}
