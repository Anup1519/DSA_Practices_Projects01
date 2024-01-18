package com.anup;

public class SumOfAllEvenNumber {
    public static void main(String args[]){
        int sum = 0;
        for(int i=0; i<=100; i++){
            if(i%2==0){
                sum+=i;
            }
// add
        }
        System.out.println("The sum of all even numbers between 1 to 100 is  " +sum);
    }
}
