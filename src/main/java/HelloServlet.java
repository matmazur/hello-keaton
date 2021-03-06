import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/test")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("name");
        if (name.toLowerCase().equals("michael")){
            resp.sendRedirect("https://www.youtube.com/watch?v=-T7WF7c80G8");
        }

        HttpSession session = req.getSession();
            session.setAttribute("name", name);

        req.getRequestDispatcher("fetch.jsp").forward(req, resp);
    }
}
