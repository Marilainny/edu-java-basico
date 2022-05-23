package edu.java.lambda;

public class IncrementByFiveTraditional implements IncrementByFiveInterface{


    @Override
    public int incrementByFive(int a) {
        return a + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = new IncrementByFiveTraditional();

        System.out.println(incrementByFiveInterface.incrementByFive(2));
    }
}
