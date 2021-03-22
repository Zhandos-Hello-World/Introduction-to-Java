package com.company;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        double A_1 = 3.4;
        double A_2 = 2.1;
        double B_1 = 50.2;
        double B_2 = 0.55;
        double res_1 = 44.5;
        double res_2 =5.9;
        double det = (A_1 * B_2) - (A_2 * B_1);
        double detX = (res_1 * B_2) - (res_2 * B_1);
        double detY = (res_2 * A_1) - (res_1 * A_2);
        double resultX = detX/det;
        double resultY = detY/det;
        System.out.println(resultX);
        System.out.println(resultY);
    }
}
