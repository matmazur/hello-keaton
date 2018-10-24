import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("name");
        if (name.toLowerCase().equals("michael")){
            resp.sendRedirect("fu.jsp");
        }

            req.setAttribute("name", name);

        req.getRequestDispatcher("fetch.jsp").forward(req, resp);
    }
}
