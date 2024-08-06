package TwoArguments_Functional_Interface;

import java.util.function.BiConsumer;

public class BiconsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (str1,str2) -> System.out.println(str1+" "+str2);
        biConsumer.accept("Hello","World");
    }
}
