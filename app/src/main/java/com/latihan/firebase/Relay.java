package com.latihan.firebase;

public class Relay {
    private String on;
    private String off;

    public String getOn(){
        return on;
    }

    public String getOff(){
        return off;
    }

    public  void setOn(String on){
        this.on = on;
    }

    public void setOff(String off) {
        this.off = off;
    }

    public Relay(String on, String off){
        this.on = on;
        this.off = off;
    }
}
