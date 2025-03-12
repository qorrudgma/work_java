package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld3")
public class HelloWorld3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/heml");
//		한글은 깨져서 'charset=UTF-8(또는 EUC-KR)' 을 추가해야함
//		resp.setContentType("text/heml; charset=EUC-KR");
		resp.setContentType("text/heml; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");

		out.println("<head>");
		out.println("<title>");
		out.println("Hello!");
		out.println("</title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<h1>안녕하세요~!!</h1>");
		out.println("</body>");

		out.println("</html>");
	}
}