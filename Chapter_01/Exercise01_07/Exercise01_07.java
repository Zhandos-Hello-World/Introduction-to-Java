/*
(Approximate p) p can be computed using the following formula:
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1 / 13))
*/

public class Exercise01_07{
    public static void main(String[] args) {
        System.out.println(4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0 / 9.0) - (1.0/11.0)));
        System.out.println(4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0 / 9.0) - (1.0/11.0) + (1.0 / 13.0)));
    }
}
