package examples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCyle")
public class LifeCyle extends HttpServlet {
	int initCount = 1;
	int serviceCount = 1;
	int destroyCount = 1;

	// 웹 브라우저에서 첫 샐행할때 호출됨
	@Override
	public void init() throws ServletException {
		System.out.println("init 메소드가 첫 실행할때 호출됨:" + initCount++);
	}

	@Override
	public void destroy() {
		System.out.println("destroy 메소드가 톰캣 종료할때 호출됨:" + destroyCount++);
	}

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("service 요청될때마다 호출됨:" + serviceCount++);
//	}

//	서비스 메소드가 있으면 호출안된다
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}