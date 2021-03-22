package com.company;

public class Main {

    public static void main(String[] args) {
        int[][]m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        sort(m);
    }
    public static void sort(int m[][]){
        boolean a = true;
        while(a){
            a = false;
            for(int i = 1; i < m.length; i++){
                if(m[i][0] < m[i - 1][0]){
                    int temp = m[i][0];
                    m[i][0] = m[i - 1][0];
                    m[i - 1][0] = temp;
                    a = true;
                }
            }
        }
        System.out.print("{");
        for(int i = 0; i < m.length; i++){
            if(i == m.length - 1){
                System.out.print("{" +m[i][0] + " , " + m[i][1]  + "}");
            }
            else{
                System.out.print("{" +m[i][0] + " , " + m[i][1]  + "}, ");
            }
        }
        System.out.print("}");
    }
}
