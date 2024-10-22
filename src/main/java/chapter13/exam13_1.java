package chapter13;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/13_2")
public class exam13_1 extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		req.getRequestDispatcher("chapter13/session01.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		if(id.equals("admin") && pw.equals("1234")) 
		{
			HttpSession session = req.getSession(true);	
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			req.getRequestDispatcher("chapter13/session01_result.jsp").forward(req, resp);
		}
		else 
		{
			System.out.println("세션 설정이 실패했습니다.");
		}
		
		//req.getRequestDispatcher("chapter13/session01_result.jsp").forward(req, resp);
	}

}
