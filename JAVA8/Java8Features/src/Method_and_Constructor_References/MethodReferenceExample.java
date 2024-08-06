package Method_and_Constructor_References;

public class MethodReferenceExample {
    public static void m2(){
        System.out.println("Method Reference Example");
        System.out.println("Method Reference Example");
        System.out.println("Method Reference Example");
    }

    public static void main(String[] args) {
        Interf i = MethodReferenceExample::m2;
    }
}

@FunctionalInterface
interface Interf{
    public void m1();
}
