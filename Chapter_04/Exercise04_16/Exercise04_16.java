/*

(Random character) Write a program that displays a random lowercase letter using
the Math.random() method

*/
public class Exercise04_16{

    public static void main(String[] args) {
        int a =1 + (int)(Math.random() * 26);
        char d;
        switch (a){
            case 1:d = 'A';break;
            case 2:d = 'B';break;
            case 3:d = 'C';break;
            case 4:d = 'D';break;
            case 5:d = 'E';break;
            case 6:d = 'F';break;
            case 7:d = 'G';break;
            case 8:d = 'H';break;
            case 9:d = 'I';break;
            case 10:d = 'J';break;
            case 11:d = 'K';break;
            case 12:d = 'L';break;
            case 13:d = 'M';break;
            case 14:d = 'N';break;
            case 15:d = 'O';break;
            case 16:d = 'P';break;
            case 17:d = 'Q';break;
            case 18:d = 'R';break;
            case 19:d = 'S';break;
            case 20:d = 'T';break;
            case 21:d = 'U';break;
            case 22:d = 'V';break;
            case 23:d = 'W';break;
            case 24:d = 'X';break;
            case 25:d = 'Y';break;
            case 26:d = 'Z';break;
            default:d = '0';break;
        }
        System.out.print(d);
    }
}
