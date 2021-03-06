package com.qap1;

public class Date {
    // 15 mins
    // https://stackoverflow.com/questions/17098329/add-leading-zeroes-to-a-string
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String toString(){
        String formatDay = String.format("%02d", this.day);
        String formatMonth = String.format("%02d", this.month);
        String formatYear = String.format("%02d", this.year);
        return formatDay + "/" + formatMonth + "/" + formatYear;
    }
}
