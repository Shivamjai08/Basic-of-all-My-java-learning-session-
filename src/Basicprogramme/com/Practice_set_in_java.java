package Basicprogramme.com;
//import java.util.Scanner;

public class Practice_set_in_java {
    public static void main(String[] args) {
        // Conditional statements in Java
        /*  -->question 1 :
        int a=10;
        if (a=11) {
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
 here we got an error in code
         */
        /* -->question 2: */
       /*
        byte m1,m2,m3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Marks in Physics ");
        m1=sc.nextByte();
        System.out.println("Enter Your Marks in Math");
        m2=sc.nextByte();
        System.out.println("Enter Your Marks in Chemistry");
        m3=sc.nextByte();
        float avg=m1+m2+m3/3.0f;
        System.out.println("You Overall Percentage is :" +avg);
        if (avg>=40 && m1>=33&& m2>=33&&m3>=33){
            System.out.println("Congratulation you have been promoted");
        }
        else {
            System.out.println("Sorry, you have been not promoted, Try again");
        }
        */
        // question 3
        // Income Tax Calculator
      /*

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your income in lakh's per annum");
        float tax=0;
        float income= sc.nextFloat();

        if (income<2.5f){
            tax=tax+0;}

        else if (income>2.5f && income<=5f) {
            tax=tax+0.05f*(income-2.5f);
        }
        else if (income>5f&& income<=10f) {
            tax =tax+ 0.05f*(5f-2.5f);
            tax = tax + 0.2f * (income -5f);
        }
        else if (income>5f) {
            tax = tax+ 0.05f*(10f-5f);
            tax =tax+ 0.2f*(5f-2.5f);
            tax = tax + 0.3f * (income -10f);

        }
        System.out.println("The Total tax is paid by  emplooye is :"+tax);


       */

        // question 4:-

        /*
Scanner sc=new Scanner(System.in);
        System.out.println("Find a Day By Number ");
        int day;
        day= sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday ");
            case 3 -> System.out.println("Wednesday ");
            case 4 -> System.out.println("Thursday ");
            case 5 -> System.out.println("Friday ");
            case 6 -> System.out.println("Saturday ");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Nothing Found  ");
       }
         */

/*
        Scanner sc=new Scanner(System.in);
        String websites=sc.next();
        if (websites .endsWith(".org")){
            System.out.println("This is organizational websites  ");
        }
        else if (websites.endsWith(".com")){
            System.out.println("This is commercial websites ");

        } else if (websites.endsWith(".in")) {
            System.out.println("This is indian websites  ");
}
*/

    }
}