//package DesignPatterns.demo.demodesignPatterns.singleton;
//
//public class LazySingleton {
//    private static LazySingleton instace;
//    private LazySingleton(){}
//
//    private static synchronized LazySingleton getInstance(){
//        if (instace == null){
//            instace = new LazySingleton();
//        }
//        return instace;
//    }
//
//    public void message1(){
//        System.out.println("Message one");
//    }
//
//    public void message2(){
//        System.out.println("Message two");
//    }
//}
//
