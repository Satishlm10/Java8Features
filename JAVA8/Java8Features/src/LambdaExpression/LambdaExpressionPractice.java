package LambdaExpression;

public class LambdaExpressionPractice {
    public static void main(String[] args) {
    Example ex = () -> System.out.println("Hello from Example functional interface");

    ex.printHello();

    Example2 ex2 = () -> System.out.println("Hello from Example2 functional interfacee");
    ex2.printHello();

    Calculator add = (a,b)-> a+b ;
    Calculator sub = (a,b)-> a-b ;
    Calculator mul = (a,b)-> a*b ;
    Calculator div = (a,b)-> a/b ;

        System.out.println(add.calculate(10,5));
        System.out.println(sub.calculate(10,5));
        System.out.println(mul.calculate(10,5));
        System.out.println(div.calculate(10,5));
    }



}

@FunctionalInterface
interface Example {
    void printHello();
}

@FunctionalInterface
interface Example2 extends Example{
    @Override
    void printHello();
}

@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);


}


