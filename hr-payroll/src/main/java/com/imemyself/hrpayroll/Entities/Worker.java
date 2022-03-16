package com.imemyself.hrpayroll.Entities;

import java.util.Objects;

public class Worker {

    private Long id;
    private String name;
    private Double dailyIncome;

    public Worker() {
    }

    public Worker(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return this.dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Worker id(Long id) {
        setId(id);
        return this;
    }

    public Worker name(String name) {
        setName(name);
        return this;
    }

    public Worker dailyIncome(Double dailyIncome) {
        setDailyIncome(dailyIncome);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Worker)) {
            return false;
        }
        Worker worker = (Worker) o;
        return Objects.equals(id, worker.id) && Objects.equals(name, worker.name)
                && Objects.equals(dailyIncome, worker.dailyIncome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dailyIncome);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", dailyIncome='" + getDailyIncome() + "'" +
                "}";
    }

}
