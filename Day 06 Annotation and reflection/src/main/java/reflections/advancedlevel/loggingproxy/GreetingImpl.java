package reflections.advancedlevel.loggingproxy;

public class GreetingImpl implements Greeting {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
