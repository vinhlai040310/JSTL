package lai.dev;

import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/laptops")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Tạo danh sách các hãng laptop
        List<String> laptops = Arrays.asList("Asus", "Lenovo", "MSI", "ThinkBook", "Legion");
        
        // Đặt danh sách vào request attribute để chuyển đến JSP
        request.setAttribute("laptops", laptops);
        
        // Chuyển tiếp đến trang JSP (index.jsp)
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
