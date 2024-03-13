package edu.tucn.ispse.lecture3.ex3equals;

/**
 * @author Radu Miron
 * @version 1
 */
public class MainTricks {
    public static void main(String[] args) {
        integers();
        strings();
    }

    public static void integers(){
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 100;
        Integer i4 = 100;
        Integer i5 = 128;
        Integer i6 = 128;

        System.out.println("i1 == i2? " + (i1 == i2));//true
        System.out.println("i3 == i4? " + (i3 == i4));//true
        System.out.println("i5 == i6? " + (i5 == i6));//true?
    }

    public static void strings(){
        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        String s4 = new String("aaa");

        System.out.println("s1 == s2? " + (s1 == s2)); // true
        System.out.println("s1 == s3? " + (s1 == s3)); // false
        System.out.println("s3 == s4? " + (s3 == s4)); // false
        System.out.println("s3.equals(s4)? " + s3.equals(s4)); // true
        System.out.println("s1.equals(s4)? " + s1.equals(s4)); // true
    }
}
