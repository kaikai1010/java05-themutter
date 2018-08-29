package serv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MutterPostDAO;
import model.Mutter;
import model.UserLogin;

@WebServlet("/MutterPostServ")
public class MutterPostServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to mutterPost.jsp

		MutterPostDAO dao = new MutterPostDAO();
		List<Mutter> list = dao.find();
		request.setAttribute("list", list);

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/mutterPost.jsp");
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forwarded to mutterPost.jsp

		//UTF-8
		String text = request.getParameter("text");

		if(text == null || text.length() == 0) {
			request.setAttribute("errorMsg", "MUTTER, please.");
		}
		else {
			Mutter m = new Mutter();
			m.setText(text);

			HttpSession session = request.getSession();
			UserLogin ul = (UserLogin) session.getAttribute("ul");

			MutterPostDAO dao = new MutterPostDAO();
			dao.create(ul, m);

			List<Mutter> list = dao.find();
			request.setAttribute("list", list);
		}

		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/mutterPost.jsp");
		d.forward(request, response);
	}
}
