package com.rentorent;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RentorentonlineServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Hello, world - Varun </h1>");
	}
}
