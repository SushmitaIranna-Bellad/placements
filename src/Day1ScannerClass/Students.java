package Day1ScannerClass;

import java.util.Scanner;

public class Students {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 subjects");
    double s1=sc.nextDouble();
    double s2=sc.nextDouble();
    double s3=sc.nextDouble();
    double s4=sc.nextDouble();
    double s5=sc.nextDouble();
    double total=s1+s2+s3+s4+s5;
    double percentage=(total/500)*100;
    if (percentage >= 75){
        System.out.println("Grade A");
    }
        else if (percentage >= 50){
            System.out.println("Grade B");
        }
        else if (percentage >= 30){
            System.out.println("Grade C");
        }
        else{
            System.out.println("fail");
    }
}
}
