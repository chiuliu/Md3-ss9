package ra.login_register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "webServlet", value = "/auth-servlet")
public class AuthServlet extends HttpServlet {

    // method là get


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // req - request
        // resp - response
      req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    // method là post


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username"); // name
        String password = req.getParameter("password"); //name

        if (username.equals("admin") && password.equals("123")) {
            req.getRequestDispatcher("/WEB-INF/admin.jsp").forward(req, resp);
            //chuyển hướng đến trang view

        }
        else {
            req.setAttribute("error", "Invalid username or password");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);

        }

//        System.out.println("username: " + username + " password: " + password);
    }
}
