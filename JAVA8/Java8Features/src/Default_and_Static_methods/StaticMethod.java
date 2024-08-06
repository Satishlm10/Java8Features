package Default_and_Static_methods;

public class StaticMethod implements Interf{
    public static void main(String[] args) {
         StaticMethod s = new StaticMethod();
         /*
         cannot access static   method inside interface using
         implementation class object or
         implementation class name
         s.m1();
         StaticMethod.m1();

          */
         // only accessible using interface name only
         Interf.m1();

    }
}

interface Interf{
    public static void m1(){
        System.out.println("Static method inside interface");
    }
}
