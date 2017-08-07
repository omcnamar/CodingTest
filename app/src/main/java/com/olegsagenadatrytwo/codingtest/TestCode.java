package com.olegsagenadatrytwo.codingtest;

import android.content.Intent;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by omcna on 8/7/2017.
 */

//Coding test:
//        1. Method to tell you if a string is a palindrome
//        2. Create a singleton class and make it thread safe
//3. Simple Java Program to check or find if a number is Armstrong number or not.
//        An Armstrong number of three digit is a number whose sum of cubes of its digit is equal
//        to its number. For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or 1+125+27=153

 //   4. Method to push 4 string items in a stack and then pop all four with printing them.
public class TestCode {

    public static void main(String[] args) {

        //Test the palindrome method
        String testPalindrome = "SaadaaS";
        if(isPalindrome(testPalindrome)){
            System.out.println("The string " + testPalindrome + " is palindrome");
        }else{
            System.out.println("The string " + testPalindrome + " is NOT palindrome");

        }
        String testPalindrome2 = "SaadaaaS";
        if(isPalindrome(testPalindrome2)){
            System.out.println("The string " + testPalindrome2 + " is palindrome");
        }else{
            System.out.println("The string " + testPalindrome2 + " is NOT palindrome");

        }

        PushPop();
        //test armStrong
        String n = "371";
        boolean isArmStr = isArmStrong(n);
        if(isArmStr){
            System.out.println("The number " + n + " is arm strong");
        }else{
            System.out.println("The number " + n + " is NOT arm strong");

        }


    }
    public static boolean isArmStrong(String number){
        double original = Double.parseDouble(number);
        ArrayList<Integer> singleDigits= new ArrayList<>();
        for(int i = 0; i < number.length(); i++){
            String indivStr = String.valueOf(number.charAt(i));
            int indivInt = Integer.parseInt(indivStr);
            singleDigits.add(indivInt);
        }

        double total = 0;
        for(int i = 0; i < singleDigits.size(); i++){
            total = total + Math.pow(singleDigits.get(i), 3);
        }
        if(total == original){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            stack.push(String.valueOf(s.charAt(i)));
        }
        for(int i = 0; i < s.length(); i++){
            if(!String.valueOf(s.charAt(i)).equals(stack.pop())){
                return false;
            }
        }
        return true;
    }
    public static void PushPop(){
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        Stack<String> stack = new Stack<>();
        stack.push(one);
        stack.push(two);
        stack.push(three);
        stack.push(four);

        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
