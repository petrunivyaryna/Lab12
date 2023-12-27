package ucu.edu.firsttask;

public class ATM {
    private Tray firstTray;
    public ATM() {
        firstTray = new TrayFiveHundread();
        Tray tray200 = new TrayTwoHundread();
        Tray tray100 = new TrayHundread();
        firstTray.setNext(tray200);
        tray200.setNext(tray100);
        tray100.setNext(new TrayFive());
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
