package Method_and_Constructor_References;

public class MethodReferenceExample2 {

    public void m1(){
        for (int i = 0; i<100;i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        MethodReferenceExample2 methodReferenceExample2 = new MethodReferenceExample2();
        // using method reference
        Runnable r = methodReferenceExample2 :: m1;
        Thread thread = new Thread(r);
        thread.start();

        // using lambda expression
        Runnable r2 = () -> {
            for (int i = 0; i<100;i++){
                System.out.println("Child 2 Thread");
            }
        };
        Thread thread2 = new Thread(r2);
        thread2.start();

        for (int i = 0; i<100;i++){
            System.out.println("Main Thread");
        }



    }
}
