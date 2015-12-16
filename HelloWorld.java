/**
 * Created by Admin on 16-12-2015.
 */
public class HelloWorld {

        public static void main(String[] args) {
            System.out.println("hello world");
            printName();
            int aNumber = 5;
            int result = aNumber * aNumber;
            System.out.println(result);
            int methodResult = squareInteger(10);
            System.out.println("method square is " + methodResult);
        }

        public static void printName(){
            System.out.println("repelsteeltje");
        }

        public static int squareInteger(int a){
            return a * a;
        }

    }

