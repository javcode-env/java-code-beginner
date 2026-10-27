package chapter6;

public class methods {

         static void welcome(){
                  System.out.println("Welcome to java"); // simple method
         }

         public static int multiplyByFive(int number) {
                  return number * 5;  // this is method with parameter 
         }

         public static void main(String[] args) {
             welcome();

             int result = multiplyByFive(5);
             System.out.println(result);
         }
}
