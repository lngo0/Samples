@FunctionalInterface
public interface SAMInterface {
    default String helloWorld() {
        return "Hello World";
    }

    static String CustomMsg(String msg) {
        return msg;
    }

    void bar();
}
