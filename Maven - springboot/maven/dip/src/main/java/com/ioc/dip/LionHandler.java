package com.ioc.dip;

public class LionHandler implements AnimalHandler {
    private AnimalHelper helper;   
    public LionHandler(AnimalHelper helper) {    
        this.helper = helper;
    }
    @Override
    public void handle() {
        System.out.println("LionHandler  in  action");
        helper.help();
    }
}