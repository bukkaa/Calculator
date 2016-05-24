import java.util.Stack;

/**
 * Created by Admin on 19.05.2016.
 */
public class Stop extends Command {
    public Stop(Stack stack) {
        super(stack);
    }

    @Override
    public void exec(double number) throws Exception {
        throw new Exception();

//        написать собственный класс стоп-исключения class MyStopException extends RuntimeException() { вывод сообщения? }
//        тогда в while в main'е просто окружаю if трай-кетчем на мое исключение
    }
}
