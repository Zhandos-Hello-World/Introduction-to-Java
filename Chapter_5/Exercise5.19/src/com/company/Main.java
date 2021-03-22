package com.company;

public class Main {
        public static void main(String[] args) {
            int a = 8;
            int w = 1;
            int c = a;
            int k = 0;
            for(int q = 1; q <= a; q++){
                for(int i = 1; i < 4 * c; i++){
                    System.out.print(" ");
                }
                for(int i = 1; i <= w; i*=2){
                    if(i >= 10 && i < 100){
                        System.out.print(i + "  ");
                    }
                    else if(i >= 100){
                        System.out.print(i + " ");
                    }
                    else{
                        System.out.print(i + "   ");
                    }
                }

                for(int i = k; i >= 1; i/=2){
                    if(i >= 10 && i < 100){
                        System.out.print(i + "  ");
                    }
                    else if(i >= 100){
                        System.out.print(i + " ");
                    }
                    else{
                        System.out.print(i + "   ");
                    }
                }
                System.out.println();
                w *= 2;
                k = w / 2;
                c--;
                }
            }
        }
