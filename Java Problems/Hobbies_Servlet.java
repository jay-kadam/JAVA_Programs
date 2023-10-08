import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hobbies_Servlet extends HttpServlet 
{

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String[] hobbies = request.getParameterValues("hobby");

    out.println("<html>");
    out.println("<head><title>Selected Hobbies</title></head>");
    out.println("<body>");

    if (hobbies == null || hobbies.length == 0) {
      out.println("<p>No hobbies selected.</p>");
    } else {
      out.println("<p>Selected hobbies:</p>");
      out.println("<ul>");
      for (String hobby : hobbies) {
        out.println("<li>" + hobby + "</li>");
        out.println("<ul>");
        switch(hobby){
            case "reading":
              out.println("<li>Reading is a great way to learn new things and escape into new worlds.</li>");
              break;
            case "playing":
              out.println("<li>Playing sports is a great way to stay active and socialize with others.</li>");
              break;
            case "traveling":
              out.println("<li>Traveling is a great way to experience new cultures and expand your horizons.</li>");
              break;
            case "cooking":
              out.println("<li>Cooking is a great way to experiment with new flavors and express your creativity in the kitchen.</li>");
              break;
            case "music":
              out.println("<li>Listening to music is a great way to relax and improve your mood.</li>");
              break;
            default:
              break;
        }
        out.println("</ul>");
      }
      out.println("</ul>");
    }

    out.println("</body></html>");
  }
}