import concreate.Computer;
import concreate.ComputerBuilder;

public class Main {
    public static void main(String[] args) {
        Computer computer = ComputerBuilder
                .start()
                .setCpu("i7")
                .setRam("8g")
                .setStorage("256g ssd")
                .build();

        System.out.println(computer.toString());
    }
}
