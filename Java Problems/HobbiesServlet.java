import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HobbiesServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form method=\"post\">");
        out.println("<h2>Select your hobbies:</h2>");
        out.println("<input type=\"checkbox\" name=\"hobby\" value=\"reading\">Reading<br>");
        out.println("<input type=\"checkbox\" name=\"hobby\" value=\"writing\">Writing<br>");
        out.println("<input type=\"checkbox\" name=\"hobby\" value=\"music\">Music<br>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form></body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String[] hobbies = request.getParameterValues("hobby");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Your selected hobbies:</h2>");

    for (String hobby : hobbies) 
    {
        out.println("<h3>" + hobby.toUpperCase() + "</h3>");
        if (hobby.equals("reading")) 
        {
            out.println("<p>Reading is a great way to expand your knowledge and imagination. .</p>");
        } 
        else if (hobby.equals("writing")) 
        {
            out.println("<p>Writing can be a fun and creative outlet for your thoughts and ideas.</p>");
        } 
        else if (hobby.equals("music")) 
        {
            out.println("<p>Music is a universal language that can evoke powerful emotions and bring people together.</p>");
        }
    }
    out.println("</body></html>");
}

}