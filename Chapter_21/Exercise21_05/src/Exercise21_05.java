/*
(Syntax highlighting) Write a program that converts a Java file into an HTML
file. In the HTML file, the keywords, comments, and literals are displayed in
bold navy, green, and blue, respectively. Use the command line to pass a Java file
and an HTML file. For example, the following command

   java Exercise21_05 Welcome.java Welcome.html


converts Welcome.java into Welcome.html. Figure 21.8a shows a Java file. The
corresponding HTML file is shown in Figure 21.8b.
 */


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise21_05 {
    private static final String Intro = "<body style=\"background-color:#2B2B2BFF;\">";
    private static final String End = "</body>";
    private static final String mainWord = "#CC7832FF";
    public static void main(String[]args) throws IOException, FileNotFoundException {
        if(args.length != 2){
            System.out.println("Usage: java Exercise21_05 Welcome.java Welcome.html");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        File targetFile = new File(args[1]);

        try(Scanner scanner = new Scanner(sourceFile);
            PrintWriter pw = new PrintWriter(targetFile)){
            String[] keywordString = {"abstract", "assert", "boolean",
                    "break", "byte", "case", "catch", "char", "class", "const",
                    "continue", "default", "do", "double", "else", "enum",
                    "extends", "for", "final", "finally", "float", "goto",
                    "if", "implements", "import", "instanceof", "int",
                    "interface", "long", "native", "new", "package", "private",
                    "protected", "public", "return", "short", "static",
                    "strictfp", "super", "switch", "synchronized", "this",
                    "throw", "throws", "transient", "try", "void", "volatile",
                    "while", "true", "false", "null"};
            Map<String, String> map = new HashMap<>();
            for(String str:keywordString){
                map.put(str, mainWord);
            }
            StringBuilder results = new StringBuilder();
            results.append(Intro + "\n    ");
            int indexVariable = 1;
            System.out.print(scanner.next());
            while(scanner.hasNext()){
                String variableStart = "<a" + indexVariable + ">";
                if(scanner.hasNextLine()){

                }
                else{
                    String str = scanner.next();
                    if(str.equals("//")){

                    }
                }
                String
                indexVariable++;
            }
        }
    }
}
