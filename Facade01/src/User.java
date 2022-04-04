import subsysterm.facade.Microwave;
import subsysterm.var.Mode;

public class User {
    public static void main(String[] args) {
        Microwave microwave = new Microwave(Mode.NORMAL);
        microwave.on();
    }
}
