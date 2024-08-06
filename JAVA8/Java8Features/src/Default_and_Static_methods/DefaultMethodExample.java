package Default_and_Static_methods;

/*
public class DefaultMethodExample implements Interf {
    @Override
    public void m1(){
        System.out.println("Overriding Default method in implementation class");
    }
    public static void main(String[] args) {
        DefaultMethodExample d = new DefaultMethodExample();
        d.m1(); // accessing default method in implementation class

    }
}

interface Interf{
    default void m1(){
        System.out.println("Default method");
    }
}

 */

public class DefaultMethodExample implements Left,Right {
    @Override
    public void m1(){
        // if we access the m1 method without overriding then ambiguity arise and compiler throws error
        System.out.println("Default method wrt multiple inheritance");

        // we can also use super keyword to access the desired default method in any interface
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args) {
        DefaultMethodExample d = new DefaultMethodExample();
        d.m1(); // accessing default method in implementation class

    }
}


interface Left{
    default void m1(){
        System.out.println("Left default method");
    }
}

interface Right{
    default void m1(){
        System.out.println("Right default method");
    }
}
