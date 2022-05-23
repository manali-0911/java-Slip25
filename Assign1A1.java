import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Assign1A1 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException,IOException
		{
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("Information of Client: <br>");
			out.println("Ip Address: " + req.getRemoteAddr() +"\n<br>");
			out.println("Name: "+ req.getRemoteHost() + "\n<br>");
			out.println("Browser: "+ req.getHeader("User-Agent") + "\n<br>");
			out.println("\nInformation of the server: <br>");
			out.println("Name: "+ req.getServerName() + "\n<br>");
			out.println("Port: "+ req.getServerPort() + "\n<br>");
			out.println("</body>");
			out.println("</html>");
		}
}
