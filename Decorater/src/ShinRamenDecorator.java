public class ShinRamenDecorator extends RamenDecorator {

    public ShinRamenDecorator(Noodle noodle) {
        super(noodle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("매운 조미료가 들어간다.");
    }
}
