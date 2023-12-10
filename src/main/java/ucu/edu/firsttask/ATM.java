package ucu.edu.firsttask;

public class ATM {
    private Tray firstTray;
    public ATM() {
        firstTray = new Tray500();
        Tray tray200 = new Tray200();
        Tray tray100 = new Tray100();
        firstTray.setNext(tray200);
        tray200.setNext(tray100);
        tray100.setNext(new Tray5());
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
