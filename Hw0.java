//package com.gradescope.hw0;


public class Hw0 {
   
    private String name;
    public int intArray[];
    public int sum = 0;

    public Hw0 (String name){
        this.name = name;
    }


    public int addAll(int arr ){
        // int intArray[];
        // int sum = 0;
        intArray = new int[arr];  
        for (int i = 0; i <= 50 ; i++){
            sum += i;
            System.out.println(sum);
        }
        return (sum);
    }
    public void copyList(int arr ){
        // int intArray;
        // intArray = new int[arr];  
        for (int i = 0; i <= 50 ; i++){
            
            System.out.println(i);
        }
    }


    public static void main(String[]args){
        Hw0 user = new Hw0( "Rachel");
        System.out.println("Prints out sum ");
        user.addAll(50);
        System.out.println("Prints out list of numbers 0 - 50 ");
        user.copyList(50); 
        
    }
}
