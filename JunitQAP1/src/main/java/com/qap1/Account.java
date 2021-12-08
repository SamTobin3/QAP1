package com.qap1;

public class Account {
    // 45 mins
    // https://www.w3schools.com/java/java_constructors.asp
    // https://java.meritcampus.com/core-java-topics/class-with-multiple-constructors-in-java
    // https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value?rq=1
    // https://keyincollege289.sharepoint.com/sites/SoftwareDevelopmentS4-Fall2021/Shared%20Documents/Forms/AllItems.aspx?id=%2Fsites%2FSoftwareDevelopmentS4%2DFall2021%2FShared%20Documents%2FClass%20Meetings%2FRecordings%2FAdvanced%20Programming%20%28java%29%20%2D%20Class%20Lecture%20%26%20Office%20Hour%2D20210917%5F123021%2DMeeting%20Recording%2Emp4&parent=%2Fsites%2FSoftwareDevelopmentS4%2DFall2021%2FShared%20Documents%2FClass%20Meetings%2FRecordings
    private String id;
    private String name;
    private int balance = 0;

    Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getBalance(){
        return this.balance;
    }
    
    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        }else{
            System.out.print("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= this.balance){
            another.credit(amount);
            this.debit(amount);
        }
        return this.balance;
    }

    public String toString(){
        return "Account[id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
    }
}
