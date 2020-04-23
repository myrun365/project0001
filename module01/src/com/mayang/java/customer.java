package com.mayang.java;

public class customer {

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

//sout  /soutp  /soutm   /soutv   / xxx.sout
        System.out.println("HelloWorld!!!");
        System.out.println("customer.main");
        System.out.println("args = [" + args + "]");
        System.out.println("customer.main");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


//fori
        String[] arr = new String[]{"mayang","Tom","Teson"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
//iter
        for (String s : arr) {
            System.out.println(s);
            
        }

//itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }




    }



}
