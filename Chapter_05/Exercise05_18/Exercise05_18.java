/*
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
Figure of the Exercise05_18
*/


public class Exercise05_18 {
    public static void main(String[] args) {
        System.out.printf("%-18s%-18s%-18s%-18s\n", "Pattern A", "Pattern B", "Pattern C", "Pattern D");
        for(int i = 1; i <= 6; i++){
            String increase = "";
            String decrease = "";
            for(int j = 1; j <= i; j++){
                increase += "* ";
            }

            for(int j = 6; j >= i; j--){
                decrease += "* ";
            }
            System.out.printf("%-18s%-17s%11s%18s\n", increase.trim(), decrease.trim(), increase.trim(), decrease.trim());
        }
    }
}