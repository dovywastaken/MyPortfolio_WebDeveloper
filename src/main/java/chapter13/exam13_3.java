package chapter13;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/13_3")
public class exam13_3 extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//전처리
		
		String name;
		String value;
		
		HttpSession session = req.getSession(false);
		
		Enumeration en = session.getAttributeNames();
		int i = 0;
		
		while(en.hasMoreElements()) 
		{
			i++;
			name = en.nextElement().toString();
			value = session.getAttribute(name).toString();
			
			System.out.println("설정된 세션의 속성 이름 [ " + i + " ] : " + name + "<br>");
			System.out.println("설정된 세션의 속성 값 [ " + i + " ] : " + value + "<br>");
		}
		
		
		//이동
		req.getRequestDispatcher("chapter13/session03.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{

	}

}
