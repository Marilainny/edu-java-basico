package edu.java.lambda;

import org.w3c.dom.ls.LSOutput;

public class HelloWorldLambda {

    public static void main(String[] args) {
        //implementando lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World";

        System.out.println(helloWorldInterface.sayHelloWorld());

    }
}
