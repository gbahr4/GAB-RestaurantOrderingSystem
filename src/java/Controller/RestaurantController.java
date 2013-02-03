
package Controller;

import Model.RestaurantModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Purpose: Restaurant Ordering System Controller
 * Author: Greg Bahr
 * Revision: 1.0
 */
public class RestaurantController extends HttpServlet {
    private static final String RESULT_PAGE = "/bill.jsp";
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
        
        String item1 = request.getParameter("primeRib");      
        String item2 = request.getParameter("porkTenderloin");         
        String item3 = request.getParameter("chickenCordonBleu");      
        String item4=request.getParameter("frenchOnionSoup");        
        String item5=request.getParameter("chickenCordonBleu");
             
        RestaurantModel model = new RestaurantModel();
        
        Object totalBill = model.calculateTotalBill(item1,item2,item3,item4,
                item5);
        request.setAttribute("totalBill",totalBill);
        
        Object tax = model.calculateTax(totalBill);
        request.setAttribute("tax", tax);
        
        Object tip = model.calculateTip(totalBill, tax);
        request.setAttribute("tip",tip);
        
        Object grandTotal = model.calculateGrandTotal(totalBill, tax, tip);
        request.setAttribute("grandTotal",grandTotal);
       
        RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(RESULT_PAGE);
                dispatcher.forward(request, response);
        
    }
            

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
