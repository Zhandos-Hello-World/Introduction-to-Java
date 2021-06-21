/*
(Sort two-dimensional array) Write a method to sort a two-dimensional array
using the following header:

    public static void sort(int m[][])

The method performs a primary sort on rows, and a secondary sort on columns.
For example, the following array
    
    {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}}
 
will be sorted to

    {{4, 5}, {4, 2}, {4, 1}, {1, 7}, {1, 2}, {1, 1}}.
*/
import java.util.Arrays;
public class Exercise08_16{

    public static void main(String[] args) {
        int[][]m = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sort(m);

        System.out.print("{");
        for(int i = 0; i < m.length; i++){
            System.out.print("{" + m[i][0] + ", " + m[i][1] + "}");
            if(i != m.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("}");


    }
    public static void sort(int m[][]){
        boolean check = true;
        while(check){
            check = false;
            for(int i = 1; i < m.length; i++){
                if(m[i - 1][0] < m[i][0]){
                    int[]arr = m[i - 1];
                    m[i - 1] = m[i];
                    m[i] = arr;
                    check = true;
                }
            }
        }
        check = true;
        while(check){
            check = false;
            for(int i = 1; i < m.length; i++){
                if(m[i - 1][1] < m[i][1] && m[i - 1][0] == m[i][0]){
                    int temp = m[i - 1][1];
                    m[i - 1][1] = m[i][1];
                    m[i][1] = temp;
                    check = true; 
                }
            }
        }
    }
}
