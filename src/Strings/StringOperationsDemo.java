package Strings;

public class StringOperationsDemo {
    public static void main(String[] args) {
        //created String
        String s1="Java Programming";
        String s2=new String("Java Programming");
        System.out.println("Original String:"+s1);
        //length
        System.out.println("Length is:"+s1.length());
        //charAt
        System.out.println("characterAtIndex2:"+s1.charAt(2));
        //toUpperCase() and tolowerCase()
        System.out.println("uppercase:"+s1.toUpperCase());
        System.out.println("lowercase:"+s1.toLowerCase());
        //equals() and ==
        System.out.println("using ==:"+s1==s2);
        System.out.println("using equals():"+s1.equals(s2));
        //compare To()
        System.out.println("using compareTo()"+s1.compareTo(s2));
        //substring()
        System.out.println("substring (0 to 4)"+s1.substring(0,4));
        //contain()
        System.out.println("contains 'program" +s1.contains("Programming"));
        //IndexOf()
        System.out.println("s1.indexOf('a')");
        //Replace()
        System.out.println("Replace Java with Python:"+s1.replace("java","python"));
        System.out.println(s1);
        s1=s1.replace("Java","Python");
        //startwith() and endswith()
        System.out.println("starts with Java:"+s1.startsWith("Java"));
        System.out.println("ends With mming:"+s1.endsWith("mming"));
        //trim()
        String s3="sushma";
        System.out.println(s3);
        System.out.println(s3.trim());
        //concat()
        System.out.println("concat()"+s1.concat("language"));
        //isEmpty()
        String str=" ";
        System.out.println(" Is Empty?"+str.isEmpty());
        //split()
        String sentence="Java is very easy language :";
        String[] arr=sentence.split(" ");
        for(String i:arr){
            System.out.println(i);
            //isBlank()
            String s5=" ";
            System.out.println("isBlank function: "+s5.isBlank());
        }
    }
}
