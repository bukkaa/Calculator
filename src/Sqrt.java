import java.util.Stack;

/**
 * Created by Admin on 19.05.2016.
 */
public class Sqrt extends Command {
    public Sqrt(Stack stack) {
        super(stack);
    }

    @Override
    public void exec(double number) {
        try {stack.push( Math.sqrt(stack.pop()) );}
        catch (Exception e) {}
    }
}
