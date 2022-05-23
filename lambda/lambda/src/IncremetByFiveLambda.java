import edu.java.lambda.IncrementByFiveInterface;

public class IncremetByFiveLambda{

    public static void main(String[] args) {

        IncrementByFiveInterface incrementByFiveInterface = (x) -> x + 5;

        System.out.println(incrementByFiveInterface.incrementByFive(2));
    }
}
