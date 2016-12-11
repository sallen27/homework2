/*Copyright © 2016 Sarah Allen and Breslin Wiley*/
package edu.elon.business;

import java.io.Serializable;
import java.lang.Math.*;
import java.text.DecimalFormat;

/**
 *
 * @author SarahAllen
 */
public class Investment implements Serializable {
  
  private double investmentAmount;
  private double interestRate;
  private double years;
  private double futureValue;
  
  public Investment(){
    investmentAmount = 0;
    interestRate = 0;
    years = 0;
    futureValue = 0;DecimalFormat df = new DecimalFormat("0.00");
  }
  
  public Investment(double investmentAmount, double interestRate, double years, 
          double futureValue){
    this.investmentAmount = investmentAmount;
    this.interestRate = interestRate;
    this.years = years;
    this.futureValue = futureValue;
  }
  
  public double getInvestmentAmount() {
    investmentAmount = Math.round(investmentAmount*100);
    investmentAmount = investmentAmount / 100;
     return investmentAmount;
  }
  
  public void setInvestmentAmount(double investmentAmount){
    this.investmentAmount = investmentAmount;
  }

  public double getInterestRate(){
    return interestRate;
  }
  
  public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
  }
  
  public double getYears(){
    return years;
  }
  
  public void setYears(double years){
    this.years = years;
  }
  
  public double getFutureValue(){
    futureValue = Math.round(futureValue*100);
    futureValue = futureValue / 100;
    return futureValue;
  }
  
  public void setFutureValue(double futureValue){
    this.futureValue = futureValue;
  }
  
  public void calculate(double investmentAmount, double interestRate, 
          double years){
    double interestR = interestRate * .01;
    futureValue =(investmentAmount * Math.pow((1 + interestR), years));
  }
}
  

