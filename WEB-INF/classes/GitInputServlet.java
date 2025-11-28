import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GitInputServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException,IOException {
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("name");
            String caste = request.getParameter("caste");

            Human h = new Human(name,caste);

            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");

            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>あなたの名前</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("姓は"+h.getName());
            out.println("名は"+h.getCaste());
            out.println("</html>");
        }
} 
class Human {
    private String name;
    private String caste;
    public Human(String n,String c) {
        name = n;
        caste = c;
    }
    public String getName() {
        return name;
    }
    public String getCaste() {
        return caste;
    }
}