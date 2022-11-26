package Question6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/operations")
public class Operations extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		String add = req.getParameter("add");
		String sub = req.getParameter("sub");
		String mul = req.getParameter("mul");
		String div = req.getParameter("div");
		
		out.println("Output ");
		
		if(add.equals("on")) {
			out.println("Addition = "+(num1+num2));
		}
		if(sub.equals("on")) {
			out.println("Substraction = "+(num1-num2));
		}
		if(mul.equals("on")) {
			out.println("Multiplication = "+(num1*num2));
		}
		if(div.equals("on")) {
			out.println("Division = "+(num1/num2));
		}
		
		out.close();
	}
}
