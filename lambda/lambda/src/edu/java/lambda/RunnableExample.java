package edu.java.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        //exemplo tradicional
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for (int i =0; i<10; i++){
                    sum += i;

                    System.out.println("Tradicional: "+sum);
                }

            }
        };
        new Thread(runnable).start();

        //implementação usando o lambda
        Runnable runnable1 = () -> {
          int sum = 0;
          for (int i=0; i<10; i++){
              sum += i;

              System.out.println("Runnable Lambda: " + sum);
          }
        };
        new Thread(runnable1).start();

        //implementação usando Thread com lamba
        new Thread( () -> {
            int sum = 0;

            for (int i=0; i<10; i++){
                sum = sum + i;
                System.out.println("Thread Lambda: "+ sum);
            }
        }).start();
    }
}
