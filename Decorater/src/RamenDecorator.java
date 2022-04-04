public class RamenDecorator implements Noodle {
    private Noodle noodle;

    public RamenDecorator(Noodle noodle) {
        this.noodle = noodle;
    }

    @Override
    public void assemble() {
        noodle.assemble();
    }
}
