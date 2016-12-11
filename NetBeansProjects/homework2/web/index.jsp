<%--Copyright © 2016 Sarah Allen and Breslin Wiley--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
  
  <%@ include file="/includes/header.html" %>


    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <form action="calculate" method="post">
      <input type="hidden" name="action" value="add">
      <p><label for="investmentAmount">Investment Amount</label>
          <input name="investmentAmount" type="number" class="text" 
                 id="investmentAmount" min="0" tabindex="100" autofocus 
                 required
                 title="Enter Investment Amount"></p>
      <p><label for="interestRate">Yearly Interest Rate</label>
          <input name="interestRate" type="number" class="text" 
                 id="interestRate" 
                 tabindex="100" min="0" required 
                 title="Enter Interest Rate"></p>
      <p><label for="years">Number of Years</label>
          <input name="years" type="number" class="text" id="years"
                 tabindex="100" required min="0"
                 placeholder="Integer number of years" 
                 title="Enter number of years"></p>

      <p><input type="submit" value="Calculate" id="submit" /></p>
    </form>

    <%@ include file="/includes/footer.jsp" %>