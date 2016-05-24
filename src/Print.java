import java.util.Stack;

/**
 * Created by Admin on 14.05.2016.
 */
public class Print extends Command {

    public Print(Stack s) {
        super(s);
    }

    @Override
    public void exec(double d) {
        try{ System.out.println(stack.peek()); }
        catch (Exception e) {}
    }
}
