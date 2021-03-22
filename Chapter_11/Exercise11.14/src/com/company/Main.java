package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        list1 = input();
        System.out.print("Enter five integers for list2: ");
        list2 = input();
        System.out.print("The combined list is ");
        sum = union(list1, list2);
        list1.clear();
        list2.clear();
        for(int value : sum){
            System.out.print(value + " ");
        }
    }
    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            sum.add(list1.get(i));
        }
        for(int i = 0; i < list2.size(); i++){
            sum.add(list2.get(i));
        }
        return sum;
    }
    public static ArrayList<Integer> input(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner str = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            int num = str.nextInt();
            list.add(num);
        }
        return list;
    }
}
