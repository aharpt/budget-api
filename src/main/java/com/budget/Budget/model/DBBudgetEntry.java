package com.budget.Budget.model;

import jakarta.persistence.*;

@Entity
@Table(name = "budgetentry")
public class DBBudgetEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "budget_type")
    private String budgetType;

    @Column(name = "planned_amount")
    private String plannedAmount;

    @Column(name = "received_amount")
    private String receivedAmount;

    @Column(name = "year")
    private Integer year;

    @Column(name = "month")
    private Integer month;

    @Column(name = "day")
    private Integer day;

    public long getId() {
        return id;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "DBIncome{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", budgetType='" + budgetType + '\'' +
                ", plannedAmount='" + plannedAmount + '\'' +
                ", receivedAmount='" + receivedAmount + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
