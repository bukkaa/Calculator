import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public Map<String, Command> m = new HashMap<>();

    public void Calculator() {
        m.put("PUSH", new Push() );
        m.put("PRINT", new Print() );
        System.out.println("created " + m);
    }
}
