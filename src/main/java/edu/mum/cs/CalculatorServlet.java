package edu.mum.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String num3 = req.getParameter("num3");
        String num4 = req.getParameter("num4"); //or you can use Integer.valueof()

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        if(num1 != "" && num2 != "") {
            int res = Integer.valueOf(num1) + Integer.valueOf(num2);
            out.print(num1 + " + " + num2 + " = " + res + "<br>");
        }

        if(num3 != "" && num4 != "") {
            int res2 = Integer.valueOf(num3) * Integer.valueOf(num4);
            out.print(num3 + " * " + num4 + " = " + res2);
        }
    }
}
