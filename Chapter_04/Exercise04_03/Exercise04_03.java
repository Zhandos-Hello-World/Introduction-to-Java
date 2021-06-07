/*
(Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; Orlando,
Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure in Section
4.1 to compute the estimated area enclosed by these four cities. (Hint: Use the
formula in Programming Exercise 4.2 to compute the distance between two cities.
Divide the polygon into two triangles and use the formula in Programming Exercise
2.19 to compute the area of a triangle.)
*/

import java.util.*;
public class Exercise04_03{

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        double charlotteX = 35.2270869;
        double charlotteY =-80.8431267;

        double atlantaX = 33.7489954;
        double atlantaY =-84.3879824;

        double savannahX = 32.0835407;
        double savannahY =-81.0998342;

        double orlandoX = 28.5383355;
        double orlandoY =-81.3792365;

        double side1 = Math.sqrt(Math.pow(charlotteX - savannahX, 2) + Math.pow(charlotteY - savannahY, 2));
        double side2 = Math.sqrt(Math.pow(atlantaX - savannahX, 2) + Math.pow(atlantaY - savannahY, 2));
        double side3 = Math.sqrt(Math.pow(atlantaX - charlotteX, 2) + Math.pow(atlantaY - charlotteY, 2));

        double s = (side1 + side2 + side3) / 2.0;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        side1 = Math.sqrt(Math.pow(orlandoX - savannahX, 2) + Math.pow(orlandoY - savannahY, 2));
        side3 = Math.sqrt(Math.pow(orlandoX - atlantaX, 2) + Math.pow(orlandoY - atlantaY, 2));

        s = (side1 + side2 + side3) / 2.0;
        area += Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.print("The area is " + area);

    }
}
