package Basicprogramme.com;
import java.util.Scanner;
public class formate_specifire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i=0;i<3;i++);
        String s1= sc.next();

        int x= sc.nextInt();
        System.out.println("================================");
        System.out.printf("%-15S%03d\n",s1,x);
    }
}
