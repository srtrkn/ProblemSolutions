package com.mysolutions.hackerrank.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc =new Scanner(System.in);


        int n=sc.nextInt();
        List<Integer> myList=new ArrayList<Integer>();

        for(int i=0; i<n; i++){

            myList.add(sc.nextInt());
        }


     int operationCount=sc.nextInt();
     for(int k=0;k<operationCount;k++){

         String operation=sc.next();
      

         if(operation.equals("Insert")){
         int index=sc.nextInt();
         int elem=sc.nextInt();

         myList.add(elem);
         }
          if(operation.equals("Delete")){

            int index=sc.nextInt();
            myList.remove(index);
         }
     }
    for(Integer m:myList){
        System.out.print(m);
        System.out.print(" ");
    }
    }
}
