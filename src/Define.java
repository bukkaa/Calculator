import java.util.Stack;

/**
 * Created by Admin on 19.05.2016.
 */
public class Define extends Command {

    public Define(Stack stack) {
        super(stack);
    }

    @Override
    public double var(double number) {
        return number;
    }

}
