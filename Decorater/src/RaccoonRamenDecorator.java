public class RaccoonRamenDecorator extends RamenDecorator {

    public RaccoonRamenDecorator(Noodle noodle) {
        super(noodle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("다시마가 들어간다.");
    }
}
