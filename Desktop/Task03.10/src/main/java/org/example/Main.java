package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int sumTwoNum(int num1,int num2){
        return num1+num2;
    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    };

    public static boolean isVowel(String s){
        String vowels="aeiuəüıoö";
        if(vowels.contains(s.toLowerCase())){
            return true;
        }
        return false;

    }

    public static boolean isSame(String a,String b){
        if(a.equals(b)){
            return true;
        }
        return false;

    }

    public static int increaseNum(int num){
        return num++;
    }

    public static int oppsiteNum(int num){
        return num*(-1);
    }

    public static void main(String[] args) {

        //task1:
        int num1=12;
        int num2=5;
        System.out.println(sumTwoNum(num1,num2));

        //task2:
        System.out.println(isEven(num1));

        //task3:
        System.out.println(isVowel("i"));

        //task4:
        int fullPart=num1/num2;
        int residualPart=num1%num2;
        System.out.println("fullPart " +fullPart);
        System.out.println("residualPart " +residualPart);

         //task5;
        System.out.println(isSame("Car","Cars"));

        //task6;
        System.out.println(increaseNum(15));

        //task7
        System.out.println(oppsiteNum(5));

        //task8
        String [] arr={"A","B","C","D","E","F","G","H","J","K"};
        System.out.println("2 ci emenet: " + arr[1] + " sonuncudan 1 əvvəlki element "+ arr[arr.length-2]);

        //task9
        int sum=0;
        int [] nums={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        //task10
        double avarega=sum/nums.length;

    }
}