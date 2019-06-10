package java8;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        SumFunctionalInterface sumF = (g, h,) => g + h;
        System.out.println(sumF.sum(100, 54));
    }
}
