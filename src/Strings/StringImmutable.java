package Strings;

public class StringImmutable {
    public static void main(String[] args){
        //concatenation of string
        String str="Hello";
        str.concat("world");
        System.out.println(str);
        str=str.concat("world");
        System.out.println(str);
    }
}
