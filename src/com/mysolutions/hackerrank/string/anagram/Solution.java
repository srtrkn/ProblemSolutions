package com.mysolutions.hackerrank.string.anagram;

import java.util.Scanner;
//Java Anagrams


public class Solution {

    static boolean isAnagram(String a, String b) {

        if(a.length()!=b.length()) return false;
        else {

     
        char[] myCharArrayA= a.toUpperCase().toCharArray();

        char[] myCharArrayB=b.toUpperCase().toCharArray();


        java.util.Arrays.sort(myCharArrayA);

        java.util.Arrays.sort(myCharArrayB);

        if(java.util.Arrays.equals(myCharArrayA,myCharArrayB)) return true;
        else return false;
    }}

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}