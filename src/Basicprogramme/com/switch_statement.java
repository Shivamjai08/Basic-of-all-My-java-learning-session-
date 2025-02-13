package Basicprogramme.com;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
//        int age;
//        System.out.println("Enter Your Age:");
//        Scanner sc=new Scanner(System.in);
//        age=sc.nextInt();

//        if (age>56)
//        {
//            System.out.println("you are experienced");
//        } else if (age>46) {
//            System.out.println("you are semi experienced ");
//        } else if (age>36) {
//            System.out.println("you are semi,semi - experienced");
//
//
//        }
//        else {
//            System.out.println("you are not eligible ");

            // ->  Switch case Control Statements
          /*  switch (age){
                case 18 :
                System.out.println("you are going to eligible for DL ");
                break;
                case 23:
                    System.out.println("you are going to become a developer ");
                    break;
                case 60:
                    System.out.println("its time of your retired ");
                    break;
                default:
                    System.out.println("Enjoy your life ");

        }

           */
        // using variable in switch statement
       /* char var= 'u';
        switch (var) {
            case 'u':
                System.out.println("you are going to eligible for DL ");
                break;
            case 'h':
                System.out.println("you are going to become a developer ");
                break;
            case 'r':
                System.out.println("its time of your retired ");
                break;
            default:
                System.out.println("Enjoy your life ");
        }
*/
        //---> using string in switch case statement:


        String var="shubham"; // This is enhanced switch statements
        switch (var) {
            case "shubham" -> System.out.println("you are going to eligible for DL ");
            case "shivam" -> System.out.println("you are going to become a developer ");
            case "rahul" -> System.out.println("its time of your retired ");
            default -> System.out.println("Enjoy your life ");
        }


        System.out.println("Thanks for visit   ");
    }
}
