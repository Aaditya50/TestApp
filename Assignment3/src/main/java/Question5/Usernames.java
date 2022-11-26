package Question5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/unames")
public class Usernames extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String uname = req.getParameter("uname");
		PrintWriter out = res.getWriter();
		out.println("Welcome "+uname);
		out.close();
	}
}
