package com.qap1;

public class Time {
    // 25 mins
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public String toString(){
        String formatHour = String.format("%02d", this.hour);
        String formatMinute = String.format("%02d", this.minute);
        String formatSecond = String.format("%02d", this.second);
        return formatHour + ":" + formatMinute + ":" + formatSecond;
    }

    public void nextSecond(){
        if (this.second == 59){
            this.setSecond(0);

            if (this.minute == 59){
                this.setMinute(0);

                if (this.hour == 23){
                    this.setHour(0);
                }else{this.setHour(this.hour+1);}

            }else{this.setMinute(this.minute+1);}

        }else{this.setSecond(this.second+1);}
    }

    public void previousSecond(){
        if (this.second == 0){
            this.setSecond(59);

            if (this.minute == 0){
                this.setMinute(59);

                if (this.hour == 0){
                    this.setHour(23);
                }else{this.setHour(this.hour-1);}

            }else{this.setMinute(this.minute-1);}

        }else{this.setSecond(this.second-1);}
    }
}
