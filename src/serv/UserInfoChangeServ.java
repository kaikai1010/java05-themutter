package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserInfoChangeLogic;
import model.UserLogin;

@WebServlet("/UserInfoChangeServ")
public class UserInfoChangeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to userInfoChange.jsp

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/userInfoChange.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to userInfoChangeDone.jsp

		//utf-8
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");

		HttpSession session = request.getSession();
		UserLogin ul = (UserLogin) session.getAttribute("ul");

		ul.setMail(mail);
		ul.setPass(pass);

		UserInfoChangeLogic logic = new UserInfoChangeLogic();
		boolean isUserInfoChange = logic.execute(ul);

		if(isUserInfoChange) {
			session.setAttribute("ul", ul);
		}

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/userInfoChangeDone.jsp");
		d.forward(request, response);
	}

}
