package FuncInterface;

public class LambdaExpressionExample {

    public static void main(String[] args) {

        Addable addable = (a,b) -> {
            return a+b;
        };

        System.out.println(addable.add(10,20));
    }
}
