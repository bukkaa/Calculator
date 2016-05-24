import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Double;

import static java.lang.System.err;
import static java.lang.System.getenv;
import static java.lang.System.in;

public class Main {
    public static Exception main(String[] a) throws Exception {
        Scanner scan = new Scanner(in);
        Stack<Double> stack = new Stack();
        Map<String, Double> m = new HashMap<>();
        Map<String, Command> list = new HashMap<>();
        String str;
        String[] com;

        list.put("PUSH", new Push(stack));
        list.put("POP", new Pop(stack));
        list.put("STOP", new Stop(stack));
        list.put("DEFINE", new Define(stack));
        list.put("+", new Plus(stack));
        list.put("-", new Minus(stack));
        list.put("*", new Multiply(stack));
        list.put("/", new Divide(stack));
        list.put("SQRT", new Sqrt(stack));
        list.put("PRINT", new Print(stack));


        while (true) {

            str = scan.nextLine();
            com = str.split(" ");

            try {
            if (com.length == 2) {

                    if (m.containsKey(com[1])) list.get(com[0]).exec(m.get(com[1]));
                    else list.get(com[0]).exec(Double.parseDouble(com[1]));
            } else if (com.length == 3) m.put(com[1], Double.parseDouble(com[2]));
            else list.get(com[0]).exec(0.00);
            } catch (Exception e) {System.err.println("Goodbye!"); return e;}
        }

    }

}
