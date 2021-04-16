package servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/operacion")
public class servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   
        
        String numero1 = req.getParameter("numero1");
        String numero2 = req.getParameter("numero2");
        
        int sum, resta, multiplica, division, num1, num2;
                
        num1 = Integer.parseInt(numero1);
        num2 = Integer.parseInt(numero2);
                 
      sum = num1 + num2;
      resta = num1 - num2;
      multiplica = num1 * num2;
      division = num1 / num2;
      
      response(resp,"la suma es: " + sum + "\n" + ", la resta es: " + resta + "\n" + 
              ", la multiplicacion es: " + multiplica + "\n" + " y la division es: " + division);
        
    }

    private void response(HttpServletResponse resp, String mensaje)
            throws IOException {

        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<link rel='stylesheet' href='css/micss.css'>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>" + mensaje + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
