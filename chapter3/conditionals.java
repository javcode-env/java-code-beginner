
public class conditionals {

    public static void main(String[] args) {
        // int age = 21;

        // if(age >= 22) {
        //          System.out.println("You can purchase macbook");
        // }
        // else if (age == 18) {
        //          System.out.println("You can purchase macbook with parental permission");
        // }
        // else {
        //          System.out.println("You cannot purchase macbook");
        // }
        // String signal = "Green";
        // if (signal.equals("Red")){
        //          System.out.println("Stop");
        // }
        // else if(signal.equals("Yellow")){
        //          System.out.println("Get ready");
        // }
        // else if(signal.equals("Green")){
        //          System.out.println("Go");
        // }
        // else{
        //          System.out.println("Invalid signal");
        // }
        // Example 1 : Day of the week
        int day = 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2: 
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

                default:
                System.out.println("Invalid day");
        }
    }
}
