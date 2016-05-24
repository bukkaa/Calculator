import java.util.Stack;

/**
 * Created by Admin on 19.05.2016.
 */
public class Pop extends Command {
    public Pop(Stack stack) {
        super(stack);
    }

    @Override
    public void exec(double number) {
        try {stack.pop();}
        catch (Exception e) {}
    }
}
