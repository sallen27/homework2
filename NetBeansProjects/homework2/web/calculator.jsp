<%--Copyright © 2016 Sarah Allen and Breslin Wiley--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/includes/header.html" %>
<div id="finalForm">
<jsp:useBean id="investment" scope="request" 
             class="edu.elon.business.Investment"/>
<label>Investment Amount: $</label>
<span><jsp:getProperty name="investment" 
                 property="investmentAmount"/></span><br>
<label>Yearly Interest Rate: </label>
<span><jsp:getProperty name="investment" property="interestRate"/></span><br>
<label>Number of Years: </label>
<span><jsp:getProperty name="investment" property="years"/></span><br>
<label>Future Value: $</label>
<span><jsp:getProperty name="investment" property="futureValue"/></span><br>
</div>
<br>

<form action="" method ="post">
    <input type ="hidden" name = "action" value="calculate">
</form>

<%@ include file="/includes/footer.jsp" %>