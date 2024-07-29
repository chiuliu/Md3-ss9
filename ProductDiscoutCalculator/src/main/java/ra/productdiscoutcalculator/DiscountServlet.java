package ra.productdiscoutcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DiscountServlet",value = "/display-discount")

public class DiscountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// lấy dữ liệu từ form
        String productDescription = req.getParameter("productDescription");
        double price = Double.parseDouble(req.getParameter("price"));
        double discount = Double.parseDouble(req.getParameter("discount"));

        // tính toán

        double discountAmount = price * discount * 0.01 ;
        double discountPrice = price - discountAmount ;

        // Đặt các giá trị vào request để hiển thị trên  trang kết quả

        req.setAttribute("productDescription", productDescription);
        req.setAttribute("price", price);
        req.setAttribute("discount", discount);
        req.setAttribute("discountAmount", discountAmount);
        req.setAttribute("discountPrice", discountPrice);

        // Chuyển hướng đến trang kết quả
        req.getRequestDispatcher("/display-discount.jsp").forward(req, resp);



    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




    }
}

