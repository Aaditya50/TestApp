package Questions1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Dates")
public class Dates extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();   
	    out.println(d.format(date));
		out.close();
	}
}
