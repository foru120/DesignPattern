package subsysterm.facade;

import subsysterm.*;
import subsysterm.var.Mode;

import java.util.Arrays;
import java.util.List;

public class Microwave {
    private Cooler cooler;
    private Magnetron magnetron;
    private Turntable turntable;
    private TimerChecker timerChecker;
    private Mode mode;
    private List<Switch> switches;
    private boolean isActive;

    public Microwave(Mode mode) {
        this(new Cooler(), new Magnetron(), new Turntable(), mode);
    }

    public Microwave(Cooler cooler, Magnetron magnetron, Turntable turntable, Mode mode) {
        this.cooler = cooler;
        this.magnetron = magnetron;
        this.turntable = turntable;
        this.timerChecker = new TimerChecker(mode.getValue(), this);
        this.mode = mode;
        this.switches = Arrays.asList(cooler, magnetron, turntable, timerChecker);
    }

    public void on() {
        this.switches.forEach(Switch::on);
        isActive = true;
    }

    public void off() {
        this.switches.forEach(Switch::off);
        isActive = false;
    }

    public void getMode() {
        System.out.println("현재 모드는... " + mode.name());
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
