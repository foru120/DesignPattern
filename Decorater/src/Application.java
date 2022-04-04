public class Application {
    public static void main(String[] args) {
        final Noodle ramen = new Ramen();
        ramen.assemble();
        System.out.println();

        final Noodle shinRamen = new ShinRamenDecorator(new Ramen());
        shinRamen.assemble();
        System.out.println();

        final Noodle raccoonRamen = new RaccoonRamenDecorator(new Ramen());
        raccoonRamen.assemble();
        System.out.println();

        final Noodle shinRaccoonRamen = new RaccoonRamenDecorator(new ShinRamenDecorator(new Ramen()));
        shinRaccoonRamen.assemble();
        System.out.println();
    }
}
