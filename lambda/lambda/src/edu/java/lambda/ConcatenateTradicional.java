package edu.java.lambda;

public class ConcatenateTradicional implements ConcatenateInterface{

    @Override
    public String sconcat(String a, String b) {
        return a + " "+ b;
    }

    public static void main(String[] args) {

        ConcatenateTradicional concatenateTradicional = new ConcatenateTradicional();
        System.out.println(concatenateTradicional.sconcat("Hello", "World"));
    }
}
