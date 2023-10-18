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
//        int score = 0;
//
//        // Factor 1: Income
//        if (customer.getIncome() > 40000) {
//            score += 20;
//        } else {
//            score += 10;
//        }
//
//        // Factor 2: Employment Years
//        if (customer.getEmploymentYears() > 3) {
//            score += 20;
//        } else {
//            score += 10;
//        }
//
//        // Factor 3: Credit History Score
//        if (customer.getCreditHistoryScore() > 650) {
//            score += 60;
//        } else {
//            score += 30;
//        }
//
//        return score;
//    }
}

class Customer {
    private int age;
    private Gender gender;
    private int BKITScore;
    private int creditTakenPrior;
    private Education education;
    private MarriageStatus marriageStatus;
    private Region region;
    private Dependents dependents;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getBKITScore() {
        return BKITScore;
    }

    public void setBKITScore(int BKITScore) {
        this.BKITScore = BKITScore;
    }

    public int getCreditTakenPrior() {
        return creditTakenPrior;
    }

    public void setCreditTakenPrior(int creditTakenPrior) {
        this.creditTakenPrior = creditTakenPrior;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public MarriageStatus getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(MarriageStatus marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Dependents getDependents() {
        return dependents;
    }

    public void setDependents(Dependents dependents) {
        this.dependents = dependents;
    }
}

