package concreate;

public class ComputerFactory {
    private BluePrint bluePrint;

    public void setBluePrint(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public Computer create() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();

        return bluePrint.getComputer();
    }
}
