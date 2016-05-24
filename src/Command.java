import java.util.Stack;

public class Command {
    Stack<Double> stack = new Stack();

    public Command(Stack stack) {
        this.stack = stack;
    }

    public void exec(double number) throws Exception {

    }

    public double var(double number) {

        return number;
    }

}
