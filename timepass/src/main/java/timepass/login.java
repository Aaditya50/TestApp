package timepass;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@WebServlet("/loginServlet")
public class login extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletRequest res) throws IOException {
		String uname = req.getParameter("uname");
		String upass = req.getParameter("upass");
		
		
	}
}
