package com.company;

public class Main {

    public static void main(String[] args) {
        String [][]saveQ = new String[8][8];
        boolean[][]saveFt = new boolean[8][8];
        falseInTrue(saveFt);
        for(int x = 0; x < 7; x++){
            for(int i = 0; i < saveFt.length; i++){
                for(int j = 0; j < saveFt.length; j++){
                    if(saveFt[i][j]){
                        saveQ[i][j] = "Q";
                        trueIndexInFalse(saveFt, i, j);
                    }
                }
            }
        }
        input(saveQ);

    }
    public static void input(String[][] saveQ){
        for(int i = 0; i < saveQ.length; i++){
            System.out.print("|");
            for(int j = 0; j < saveQ[i].length; j++){
                String q = " ";
                if(saveQ[i][j] == "Q"){
                    q = "Q";
                }
                System.out.print(q + "|");
            }
            System.out.println();
        }
    }
    public static void falseInTrue(boolean [][]q){
        for(int i = 0; i < q.length; i++){
            for(int j = 0; j < q[i].length; j++){
                q[i][j] = true;
            }
        }
    }
    public static void trueIndexInFalse(boolean[][]q, int x, int y){
        for(int i = 0; i < q.length; i++){
            q[x][i] = false;
            q[i][y] = false;
        }
        diagonal(q, x, y);
    }

    public static void diagonal(boolean[][] q, int x, int y){
        int num1 = 0, num2 = 0;
        for(int i = x - 1; i >= 0; i--){
            for(int j = y - 1; j >= 0; j--){
                if(i == 0 || j == 0){
                    num1 = x;
                    num2 = y;
                }
            }
        }
        for(int i = num1, j = num2; i < q.length; i++, j++){
            if(j == q.length){
                break;
            }
            q[i][j] = false;
        }
        boolean[][]temp = new boolean[8][8];
        for(int i = 0; i < q.length; i++){
            for(int j = 0; j < q[i].length; j++){
                temp[j][i] = q[i][j];
            }
        }


        for(int i = num1, j = num2; i < q.length; i++, j++){
            if(j == temp.length){
                break;
            }
            temp[i][j] = false;
        }
        for(int i = 0; i < q.length; i++){
            for(int j = 0; j < q[i].length; j++){
                 q[i][j] = temp[j][i];
            }
        }



    }
}


