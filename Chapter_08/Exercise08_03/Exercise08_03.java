/*
(Sort students on grades) Rewrite Listing 8.2, GradeExam.java,
to display students in decreasing order of the number of correct answers.
*/

public class Exercise08_03{

    public static void main(String[] args) {
        char[][] answers =  {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        String[] arr = new String[8];
        int[] arrCurrentCount = new int[8];
        System.out.println("Without sorting:");
        for(int i = 0; i < answers.length; i++){
            int correctCount = 0;
            for(int j = 0; j < answers[i].length; j++){
                if(answers[i][j] == keys[j]){
                    correctCount++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + correctCount);
            arr[i] = "Student " + i + "'s correct count is " + correctCount;
            arrCurrentCount[i] = correctCount;
            save(i, correctCount, arrCurrentCount, arr);
        }
        System.out.print("Sorting with ID:");
        sortingWithID(arrCurrentCount, arr);


    }
    public static void save(int i, int correctCount, int[] arrCorrectCount, String []arr){
        arr[i] = "Student " + i + "'s correct count is " + correctCount;
        arrCorrectCount[i] = correctCount;
    }
    public static void sortingWithID(int[] arrCorrectCount, String[] arr){
        boolean a = true;
        while (a) {
            a = false;
            for (int i = 1; i < arrCorrectCount.length; i++) {
                if (arrCorrectCount[i - 1] < arrCorrectCount[i]) {
                    int temp = arrCorrectCount[i - 1];
                    arrCorrectCount[i - 1] = arrCorrectCount[i];
                    arrCorrectCount[i] = temp;
                    String save = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = save;
                    a = true;
                }
            }
        }
        for(String s:arr){
            System.out.print("\n" + s);
        }
    }
}
