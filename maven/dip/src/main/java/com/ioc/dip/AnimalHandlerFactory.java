package com.ioc.dip;

public final class AnimalHandlerFactory {
    private static AnimalHandler instance = null;   
    private AnimalHandlerFactory() {};
    public static synchronized AnimalHandler buildHandler() {
        if (instance == null) {
            AnimalHelper helper = new TigerHelper();
            instance = new TigerHandler(helper); 
        }
        return instance;
    }
} 