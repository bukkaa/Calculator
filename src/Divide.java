import java.util.Stack;

/**
 * Created by Admin on 19.05.2016.
 */
public class Divide extends Command {
    public Divide(Stack stack) {
        super(stack);
    }

    @Override
    public void exec(double number) {
        double sum = stack.pop();
        try {
            sum /= stack.pop();
            stack.push(sum);
        }
        catch (Exception e) {}
    }
}
