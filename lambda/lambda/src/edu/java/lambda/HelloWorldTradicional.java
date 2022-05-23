package edu.java.lambda;

/*
Classe que implementa o método da Interface HelloWorldInterface
 da forma tradicional do Java.

@author Marilainny Martins
@note Comparação Lambda com o tradicional Java.
 */
public class HelloWorldTradicional implements HelloWorldInterface {

    @Override
    public String sayHelloWorld() {
        return "Hello World Mary";
    }

    public static void main(String[] args) {
        HelloWorldTradicional helloWorldTradicional = new HelloWorldTradicional();
        System.out.println(helloWorldTradicional.sayHelloWorld());
    }
}
