import concreate.Computer;
import concreate.ComputerFactory;
import concreate.LgGramBluePrint;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBluePrint(new LgGramBluePrint());

        Computer computer = factory.create();
        System.out.println(computer.toString());
    }
}
