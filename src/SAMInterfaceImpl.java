public class SAMInterfaceImpl implements SAMInterface {
    @Override
    public String helloWorld() {
        return "Java 8";
    }

    @Override
    public void bar() {
        System.out.println("Hello 8");
    }

    public static void main(String[] args){
        SAMInterface samInterface = new SAMInterfaceImpl();
        System.out.println(samInterface.helloWorld());
        System.out.println(SAMInterface.CustomMsg("This is new."));
    }
}
