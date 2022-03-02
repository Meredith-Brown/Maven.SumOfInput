/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Main {

    public static String requestInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String inputString = scanner.nextLine();
        return inputString;
    }

    public static void main(String[] args){

        String s = Main.requestInput("Input a number great than 0.");
        int n = Integer.parseInt(s);
        int output = 0;
        if (n <= 0) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 1; i <= n; i++) {
                output = output + i;
            }
            System.out.println(output);
    }
    }
}
