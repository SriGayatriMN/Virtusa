package com.ioc.dip;


public class CircusService {
    
    private AnimalHandler handler = null;       
    
    public CircusService(AnimalHandler handler) {     
        this.handler = handler;
    }
    
    public void process() {
        handler.handle();
    }
    public static void main(String[] args) {
        AnimalHandler handler = AnimalHandlerFactory.buildHandler();
        CircusService service = new CircusService(handler);
        service.process();    
    }
}
 
