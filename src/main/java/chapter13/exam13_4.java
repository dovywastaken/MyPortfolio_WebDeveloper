package chapter13;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/13_4")
public class exam13_4 extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//전처리
		HttpSession session = req.getSession(true);	
		String user_id = (String)session.getAttribute("id");
		System.out.println(user_id);
		String user_pw = (String)session.getAttribute("pw");
		System.out.println(user_pw);
		
		session.setAttribute("id", user_id);
		session.setAttribute("pw", user_pw);
		
		req.getRequestDispatcher("chapter13/session04.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{

	}

}
