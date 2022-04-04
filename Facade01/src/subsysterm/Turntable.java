package subsysterm;

public class Turntable implements Switch {
    @Override
    public void on() {
        System.out.println("Truntable 이 움직입니다...");
    }

    @Override
    public void off() {
        System.out.println("Turntable 이 멈췄습니다.");
    }
}
