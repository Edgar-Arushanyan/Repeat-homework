package Repeat_homework_17April;

public class Main {
    public static void main(String[] args) {

        // 1. Stringconcate
        Stringconcate strConcate = (a, b) -> Integer.toString(a) + (b);
        System.out.println(strConcate.concate(1, 1));  // 11




        // 2. Checkable

        Checkable checkable = in -> in.length() == 2;
        System.out.println(checkable.check("Hi"));  //true
        System.out.println(checkable.check("Hello"));//false



        // 3. Printable

        Printable printable = str-> {
            System.out.println("!"+str+"!");
        };
        printable.print("string"); // !string!



        // 4. Producable
        // написать лямбда выражение такое что будет печататься "Hello World"

        Producable producable = ()-> "Hello World";
        System.out.println(producable.produce()); // Hello World

        // 5. Transformable - написать лямбда выражение такое что если длина строки =4,
        // то вернуть четыре звездочки иначе вернуть строку без изменений

        Transformable transformable = in -> in.length() == 2 ? in= "****" : in;

        System.out.println(transformable.modify("hi")); // ****
        System.out.println(transformable.modify("hello")); // hello







    }


}
