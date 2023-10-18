package org.credirScore;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CreditScoringSystem {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setIncome(50000);
        customer.setEmploymentYears(5);
        customer.setCreditHistoryScore(700);

        int creditScore = calculateCreditScore(customer);
        System.out.println("Credit Score: " + creditScore);
    }

    class CreditInfo {
        private double creditAmount;
        private double interestRate;
        private String purposeOfLoan;
        private String creditCurrency;
        private int creditPeriod;  // in months
        private Date dateOfApproval;
        private double monthlyPayment;
        private double totalAmountOfRate;

        public double getCreditAmount() {
            return creditAmount;
        }

        public void setCreditAmount(double creditAmount) {
            this.creditAmount = creditAmount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public String getPurposeOfLoan() {
            return purposeOfLoan;
        }

        public void setPurposeOfLoan(String purposeOfLoan) {
            this.purposeOfLoan = purposeOfLoan;
        }

        public String getCreditCurrency() {
            return creditCurrency;
        }

        public void setCreditCurrency(String creditCurrency) {
            this.creditCurrency = creditCurrency;
        }

        public int getCreditPeriod() {
            return creditPeriod;
        }

        public void setCreditPeriod(int creditPeriod) {
            this.creditPeriod = creditPeriod;
        }

        public Date getDateOfApproval() {
            return dateOfApproval;
        }

        public void setDateOfApproval(Date dateOfApproval) {
            this.dateOfApproval = dateOfApproval;
        }

        public double getMonthlyPayment() {
            return monthlyPayment;
        }

        public void setMonthlyPayment(double monthlyPayment) {
            this.monthlyPayment = monthlyPayment;
        }

        public double getTotalAmountOfRate() {
            return totalAmountOfRate;
        }

        public void setTotalAmountOfRate(double totalAmountOfRate) {
            this.totalAmountOfRate = totalAmountOfRate;
        }
    }

    public static int calculateCreditScore(Customer customer) {
        int score = 0;

        // Factor 1: Income
        if (customer.getIncome() > 40000) {
            score += 20;
        } else {
            score += 10;
        }

        // Factor 2: Employment Years
        if (customer.getEmploymentYears() > 3) {
            score += 20;
        } else {
            score += 10;
        }

        // Factor 3: Credit History Score
        if (customer.getCreditHistoryScore() > 650) {
            score += 60;
        } else {
            score += 30;
        }

        return score;
    }
}


public enum MarriageStatus {
    SINGLE, MARRIED, DIVORCED, WIDOWED
}

public enum Region {
    NORTH, SOUTH, EAST, WEST, CENTRAL
}

class Customer {
    private int income;
    private int employmentYears;
    private int creditHistoryScore;

    // Getters and Setters...
    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getEmploymentYears() {
        return employmentYears;
    }

    public void setEmploymentYears(int employmentYears) {
        this.employmentYears = employmentYears;
    }

    public int getCreditHistoryScore() {
        return creditHistoryScore;
    }

    public void setCreditHistoryScore(int creditHistoryScore) {
        this.creditHistoryScore = creditHistoryScore;
    }
}

