
package Controller;

import Model.MenuItem;
import Model.OrderService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Purpose: Order Controller
 *  Author: Greg Bahr
 *  Revision: 3.0
 */
public class OrderController extends HttpServlet {
    private static final String RESULT_PAGE = "/bill.jsp";
    private String[] order;
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        order = request.getParameterValues("menuItems");
      
             
        OrderService service = new OrderService();
        Double totalBill = service.calculateTotalBill(order);    
        request.setAttribute("totalBill",totalBill);
        List<MenuItem> orderList  = service.getOrderList();
        request.setAttribute("orderList", orderList);
        
        Object tax = service.calculateTax(totalBill);
        request.setAttribute("tax", tax);
        
        Object tip = service.calculateTip(totalBill, tax);
        request.setAttribute("tip",tip);
        
        Object grandTotal = service.calculateGrandTotal(totalBill, tax, tip);
        request.setAttribute("grandTotal",grandTotal);
       
        RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(RESULT_PAGE);
                dispatcher.forward(request, response);
        
    }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}