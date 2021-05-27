/*
(Rename files) Suppose you have a lot of files in a directory named Exercisei_j,
where i and j are digits. Write a program that pads a 0 before i if i is a single
digit. For example, a file named Exercise2_1 in a directory will be renamed to
Exercise02_1. In Java, when you pass the symbol * from the command line,
it refers to all files in the directory (see Supplement III.V). Use the following
command to run your program:
java Exercise12_28 *
*/
import java.io.File;
//you need to write another path which this class mustn't be and file which contains all Exercises(Exercise1, Exercise2, ..., Exercisei) nustn't have number. Good luck!!!
public class Exercise12_28{
    private static char []arr;
    public static void main(String[]args){
        if(args.length != 1){
            System.out.print("Usage: Exercise21_27 Directory");
            System.exit(1);
        }
        File path = new File(args[0]);
        if(path.exists()){
            File[]files = path.listFiles();
            for(int i = 0; i < files.length; i++){
                arr = files[i].getPath().toCharArray();
                change();
                addZero();
                String pathStr = "";
                for(char value:arr){
                    pathStr = pathStr.concat(String.valueOf(value));
                }
                if(files[i].renameTo(new File(pathStr))){
                    System.out.println("System renamed files successfully!!!");
                }
            }
        }
        else{
            System.out.print("File is not found");
        }
    }
    public static void addZero(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '_'){
                leftSide(i);
                break;
            }
        }
    }
    public static void leftSide(int index){
        int q = 0;
        for(int i = index; i >= 0; i--){
            if(arr[i] >= '0' && arr[i] <= '9'){
                q++;
            }
        }
        if(q != 2){
            char[]main = new char[arr.length + 1];
            for(int i = 0; i < main.length; i++){
                if(i <= index - 2){
                    main[i] = arr[i];
                }
                else if(i == index - 1){
                    main[i] = '0';
                }
                else{
                    main[i] = arr[i - 1];
                }
            }
            arr = main;
        }
    }




    public static void change(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '.'){
                arr[i] = '_';
                break;
            }
        }
    }
}