package Assignment1.module1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        char grade;
        if(marks>=90&&marks<=100)
            grade='A';
        else if(marks>=80)
            grade='B';
         else if(marks>=70)
            grade='C';
          else if(marks>=60)
            grade='D';
           else
            grade='F';
           switch(grade) {
               case 'A':
                   System.out.println("Grade A");
                   break;
               case 'B':
                   System.out.println("Grade B");
                   break;

               case 'C':
                   System.out.println("Grade C");
                   break;
               case 'D':
                   System.out.println("Grade D");
                   break;
               case 'F':
                   System.out.println("Grade F");
                   break;
           }
           sc.close();


    }
}
