import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
     Keyboard keyboard = new Keyboard("Yes", "No");
     Usbport usbport = new Usbport("Super speed", "port_hhh");
     RAM ram = new RAM(8,"Samsung");
     HardDisk hardDisk = new HardDisk(500, 2);
     Display display = new Display(19,"Dell","CPI");
     Computer computer = new Computer(display,"Dell","Black",hardDisk,ram,"GeForce",usbport,keyboard);
        System.out.println(computer);

    }
}