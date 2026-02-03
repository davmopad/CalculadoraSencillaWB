/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;
import CalculadoraL.cCalculadora;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "CalculadoraServlet", urlPatterns = {"/CalculadoraServlet"})
public class CalculadoraServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            String num1Str = request.getParameter("numero1");
            String num2Str = request.getParameter("numero2");
            String operacion = request.getParameter("operacion");
            double n1 = Double.parseDouble(num1Str);
            double n2 = Double.parseDouble(num2Str);
            cCalculadora miCalculadora = new cCalculadora();
            double resultado = miCalculadora.calcular(n1, n2, operacion);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Resultado</title></head>");
            out.println("<body>");
            out.println("<h1>Resultado de la operacion</h1>");
            out.println("<p>Operacion: " + operacion + "</p>");
            out.println("<h2>El resultado es: " + resultado + "</h2>");
            out.println("<a href='Calculadora.html'>Volver a calcular</a>");
            out.println("</body>");
            out.println("</html>");
        }catch (NumberFormatException e){
            response.getWriter().println("intentar de nuevo");
        } 
    }
}
    
