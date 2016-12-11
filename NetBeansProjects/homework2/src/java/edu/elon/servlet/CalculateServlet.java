/*Copyright © 2016 Sarah Allen and Breslin Wiley*/
package edu.elon.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.elon.business.*;
/**
 *
 * @author SarahAllen
 */

public class CalculateServlet extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  

  
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    doPost(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    
    String url = "/calculator.jsp";
    
    String action = request.getParameter("action");
    if (action == null){
      action = "join";
    }
    
    if (action.equals("join")){
      url = "/index.jsp";
    }
    
    else if (action.equals("add")){
    String investmentAmountS = request.getParameter("investmentAmount");
    String interestRateS = request.getParameter("interestRate");
    String yearsS = request.getParameter("years");
    
    double investmentAmount = Double.parseDouble(investmentAmountS);
    double interestRate = Double.parseDouble(interestRateS);
    double years = Double.parseDouble(yearsS);
    
    Investment investment = new Investment();
    investment.setInvestmentAmount(investmentAmount);
    investment.setInterestRate(interestRate);
    investment.setYears(years);
    
    investment.calculate(investmentAmount, interestRate, years);
    request.setAttribute("investment",investment);
    }
    
            getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    
  }



}
