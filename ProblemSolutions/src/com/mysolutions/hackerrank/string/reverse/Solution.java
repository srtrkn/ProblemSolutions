package com.mysolutions.hackerrank.string.reverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */


  
        StringBuilder myStringBuilder = new StringBuilder(); 
  
        // amyStringBuilderppend a string into StringBuilder input1 
        myStringBuilder.append(A); 
  
        // reverse StringBuilder input1 
        myStringBuilder = myStringBuilder.reverse(); 
  
        // print reversed String 

        if(myStringBuilder.toString().equals(A)) System.out.println("Yes");
        else   System.out.println("No");

    }
}