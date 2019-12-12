package BID.SWE;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Exercise4Impl impl = new Exercise4Impl();
        impl.Method1().forEach(s -> System.out.println(s));
    }
}

