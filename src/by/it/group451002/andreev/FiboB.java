package by.it.group451002.andreev;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи со вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    BigInteger fastB(Integer n) {
        if (n==0) return BigInteger.ZERO;
        if (n==1) return BigInteger.ONE;

        BigInteger[] Fib = new BigInteger[n + 1];
        Fib[0]= BigInteger.ZERO;
        Fib[1]= BigInteger.ONE;

        for (int i = 2; i<= n; i++) {
            Fib[i]= Fib[i - 1].add(Fib[i-2]);
        }

        return Fib[n];
    }

}

