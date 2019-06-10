package java8;

import java.util.function.Function;

@FunctionalInterface
public interface SumFunctionalInterface {
    int a;
    int b;
    int sum = a + b;

    boolean sum(int i, int i1);
}
