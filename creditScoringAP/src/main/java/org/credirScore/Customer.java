package org.credirScore;

public class Customer {
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
