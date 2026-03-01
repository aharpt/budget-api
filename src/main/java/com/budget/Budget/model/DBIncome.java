package com.budget.Budget.model;

import jakarta.persistence.*;

@Entity
@Table(name = "income")
public class DBIncome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "plannedamount")
    private String plannedAmount;

    @Column(name = "remainingamount")
    private String remainingAmounnt;

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

    public String getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(String plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public String getRemainingAmounnt() {
        return remainingAmounnt;
    }

    public void setRemainingAmounnt(String remainingAmounnt) {
        this.remainingAmounnt = remainingAmounnt;
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
                ", plannedAmount='" + plannedAmount + '\'' +
                ", remainingAmounnt='" + remainingAmounnt + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
