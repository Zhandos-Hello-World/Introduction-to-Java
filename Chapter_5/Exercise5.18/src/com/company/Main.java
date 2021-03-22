package com.company;
public class Main {
    public static void main(String[] args) {
        int row = 6;
        int q = 1;
        int t = 1;
        int e = 6;
        System.out.println("Pattern A      Pattern B      Pattern C      Pattern D      ");
        while(q <= row){
            for(int i = 1; i <= t; i++){
                if(i == row){
                    System.out.print(i);
                }
                else{
                    System.out.print(i + " ");
                }
            }
            for(int j = 0; j < (2 * (row - t)) - 1; j++){
                System.out.print(" ");
            }
            System.out.print("    ");


            for(int j = 1; j <= e; j++){
                    System.out.print(j + " ");
            }
                for(int i = 0; i < 2 * (row - e) - 1; i++){
                    System.out.print(" ");
            }

            if(row == e){
                System.out.print("   ");
            }
            else if(e == 1){
                System.out.print("   ");
            }
            else{
                System.out.print("    ");
            }




            for(int j = 0; j < (2 * (row - t)) - 1; j++){
                System.out.print(" ");
            }

            for(int j = t; j >= 1; j--){
                if(j == 1){
                    System.out.print(j);
                }
                else{
                    System.out.print(j + " ");
                }
            }

            System.out.print("     ");
            for(int i = 1; i <= e; i++){
                System.out.print(i + " ");
            }
            System.out.println();
            q++;
            t++;
            e--;
        }
    }
}
