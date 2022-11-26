package com.ioc.dip;



public class TigerHandler implements AnimalHandler {
    private AnimalHelper helper;  
    
    public TigerHandler(AnimalHelper helper) {    
        this.helper = helper;
    }
    
    public void handle() {
        System.out.println("TigerHandler  in  action");
        helper.help();
    }    
}