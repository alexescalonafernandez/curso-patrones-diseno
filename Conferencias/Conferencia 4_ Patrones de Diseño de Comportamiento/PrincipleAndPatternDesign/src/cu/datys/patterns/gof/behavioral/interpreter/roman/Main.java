package cu.datys.patterns.gof.behavioral.interpreter.roman;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        System.out.println(interpreter.roman2decimal("MCMXXVIII"));
    }
}
