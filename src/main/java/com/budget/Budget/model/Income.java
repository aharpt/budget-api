package com.budget.Budget.model;

public class Income {

    private String title;
    private String plannedAmount;
    private String remainingAmount;
    private int year;
    private int month;
    private int day;

    public Income(String title, String plannedAmount, String remainingAmount, int year, int month, int day) {
        this.title = title;
        this.plannedAmount = plannedAmount;
        this.remainingAmount = remainingAmount;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(String plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public String getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Income{" +
                "title='" + title + '\'' +
                ", plannedAmount='" + plannedAmount + '\'' +
                ", remainingAmount='" + remainingAmount + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
