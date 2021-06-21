/*
(Central city) Given a set of cities, the central city is the city that has the shortest
total distance to all other cities. Write a program that prompts the user to enter
the number of cities and the locations of the cities (coordinates), and finds the
central city and its total distance to all other cities.
*/
import java.util.Scanner;

public class Exercise08_21 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = str.nextInt();
        double [][]Cities = new double[numberOfCities][2];
        System.out.print("Enter the coordinates of the cities: ");
        for(int i = 0; i < Cities.length; i++){
            for(int j = 0; j < Cities[i].length; j++){
                Cities[i][j] = str.nextDouble();
            }
        }
        minDistance(Cities);
    }
    public static void minDistance(double[][]city){
        double []coordinates = new double[city.length - 1];
        int index = 0;
        for(int i = 0; i < city.length; i++){
            double[] current = new double[city.length - 1];
            int k = 0;
            for(int j = 0; j < city.length; j++){
                if(i != j){
                    double distance = Math.sqrt(Math.pow((city[i][0] - city[j][0]), 2) + Math.pow((city[i][1] - city[j][1]), 2));
                    current[k] = distance;
                    k++;
                }
            }
            if(i == 0){
                if (current.length >= 0) System.arraycopy(current, 0, coordinates, 0, current.length);
            }
            else{
                boolean check = true;
                for(int j = 0; j < current.length; j++){
                    if(coordinates[j] > current[j]){
                        check = false;
                        break;
                    }
                }
                coordinates = (check ? current:coordinates);
                index = (check ? i:index);
            }
        }
        double sum = 0;
        for(double value:coordinates){
            sum+=value;
        }

        System.out.println("The central city is at (" + city[index][0] + ", " + city[index][1] + ")");
        System.out.printf("The total distance to all other cities is %-1.2f", sum);


    }
}