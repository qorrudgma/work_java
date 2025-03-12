package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld2")
public class HelloWorld2 extends HttpServlet {
	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		HttpServletRequest: 요청 객체 타입
//		HttpServletResponse: 응답 객체 타입
		resp.setContentType("text/heml");
//		객체 생성(out 객체는 웹브라우저에 출력할수 있음)
		PrintWriter out = resp.getWriter();
		out.println("<html>");

		out.println("<head>");
		out.println("<title>");
		out.println("Hello!");
		out.println("</title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<h1>Hello World~!!</h1>");
		out.println("</body>");

		out.println("</html>");
	}
}