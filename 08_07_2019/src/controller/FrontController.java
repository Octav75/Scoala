package controller;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController (Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    public void isAutenticUser (){
        System.out.println("The user is authentic");
    }

    public void trackRequest(){
        System.out.println("request");
    }

    public void dispatchRequest(){
        System.out.println("dispatch request");
    }
}
