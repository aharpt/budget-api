package com.budget.Budget.model;

public class BudgetEntry {

    private String title;
    private String budgetType;
    private String plannedAmount;
    private String receivedAmount;
    private int year;
    private int month;
    private int day;

    public BudgetEntry(String title, String budgetType, String plannedAmount, String receivedAmount, int year, int month, int day) {
        this.title = title;
        this.budgetType = budgetType;
        this.plannedAmount = plannedAmount;
        this.receivedAmount = receivedAmount;
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

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public String getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(String plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public String getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(String receivedAmount) {
        this.receivedAmount = receivedAmount;
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
        return "BudgetEntry{" +
                "title='" + title + '\'' +
                ", budgetType='" + budgetType + '\'' +
                ", plannedAmount='" + plannedAmount + '\'' +
                ", receivedAmount='" + receivedAmount + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
