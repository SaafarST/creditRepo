package org.credirScore;

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

