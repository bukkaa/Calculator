import java.util.Stack;

public class Push extends Command {

    public Push(Stack s) {
        super(s);
    }

    @Override
    public void exec(double d) {
        stack.push(d);
    }
}
