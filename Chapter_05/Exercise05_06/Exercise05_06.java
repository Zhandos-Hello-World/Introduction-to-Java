/*
(Conversion from square meter to ping) Write a program that displays the following
two tables side by side (note that 1 ping = 3.305 square meters):
Ping    Square meter  |  Square meter     Ping
10            33.050  |  30              9.077
15            49.575  |  35             10.590
...
75           247.875  |  95             28.744
80           264.400  |  100            30.257


*/

public class Exercise05_06{

    public static void main(String[] args) {
        System.out.printf("%-8s%14s%-2s%13s%10s\n", "Ping", "Square meter", " |", "Square meter", "Ping");
        for(int pingI = 10, squareMeterI = 30; pingI <=80 && squareMeterI <= 100; pingI +=5, squareMeterI += 5){
            System.out.printf("%-8d%14.3f%-3s%-13d%9.3f\n", pingI, pingI * 3.305, " |", squareMeterI, squareMeterI / 3.305);
        }
    }
}
