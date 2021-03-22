
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String e = "                ";
        String s = "            ";
        String d = "            ";
        String q = "      ";
        System.out.println("Kilograms Pounds" + s + "|" + s + "Pounds Kilograms");
        int l = 20;
        double res;
        double res1;
        int f1 = 12;
        for(int i = 1; i < 199; i+= 2){
            res = (double) (i * 2.2);
            res1 = (double)(l / 2.2);
            String s1 = String.format("%.1f", res);
            String s2 = String.format("%.2f", res1);
            System.out.println(i + s + s1 + d +"|" + e + l + q + s2);
            l += 5;
        }
    }
}
