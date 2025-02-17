package Basicprogramme.com;

public class practice_set_loop {
    public static void main(String[] args) {
//  practice problem 1
    /*
        int n =6;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++){
                System.out.print("*");
        }
                System.out.print("\n");
            }
        */

        // practice problem 2 :
// use while loop print n even number
       /*
         int n =0;
        while (n<=10){

            System.out.println(2*n);
             n++;
        }
*/
        // practice question 3
        // fint the sum of n even number using loop in java
       /*
        int sum=0;
        int n=3;
        for (int i=0; i<n; i++){

            sum=sum+(2*i);
        }
        System.out.println("Sum of Even Number is :");
        System.out.println(sum);
       */
        // practice problem 4
        // question: using a loop make a multiplication table of n ?

       /*
        int n = 5;
        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d*%d=%d \n",n,i,n*i);

        }

        */
        // practice question 5
        // use loop to create a 10 table programme in reverse order?
      /*
        int n=10;
        for (int i=10;i>=1;i--){
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }

       */
        //practice problem 6:
        // question : find the factorial of 5! using while loop
        /*
        int n=3;
         //What is factorial n= n*n-1*n-2*n-3.....1
        //5!=5*4*3*2*1
        int i=1;
        int factorial=1;
        while (i<=n){
            factorial *=i;
            i++;

        }
        System.out.println(factorial);

         */
        // practice problem 7
        // question :using for loop calculate factorial 5!?
        /*
        int n=5;
                int factorial=1;
        for ( int i=1;  i<=n;i++){
            factorial*=i;
        }
        System.out.println(factorial);

         */
        // practice probleme 8 using loop caluate the sum of table 8?
        int n = 8;
/*
        int sum=0;
        for (int i = 1; i <= 10; i++) {

            sum+=n*i;

        }
        System.out.println(sum);

 */
    }
        }