package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class BufferedReaderExample {
    public static void main(String[] args) throws IOException { //this will gving to JVM to handle thisException
       // Scanner sc=new Scanner();
       // String = sc.nextline();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str=br.readLine();
                int a=Integer.parseInt(str);
    }
}
