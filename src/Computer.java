public class Computer {
    private Display display;
    private String brand;
    private String color;
    private HardDisk hardDisk;
    private RAM ram;
    private String videoCard;
    private Usbport usbport;
    private Keyboard keyboard;


    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public Usbport getUsbport() {
        return usbport;
    }

    public void setUsbport(Usbport usbport) {
        this.usbport = usbport;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Computer (Display display, String brand, String color, HardDisk hardDisk, RAM ram,
                     String videoCard, Usbport usbport, Keyboard keyboard) {

        this.display = display;
        this.brand = brand;
        this.color = color;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usbport = usbport;
        this.keyboard = keyboard;

    }

    @Override
    public String toString() {
        return
                "display:  " + display +"\n"+
                "brand:    " + brand + "\n" +
                "color:    " + color + "\n" +
                "hardDisk: " + hardDisk +"\n"+
                "ram:      " + ram +"\n"+
                "videoCard:" + videoCard +"\n" +
                "usbport:  " + usbport +"\n"+
                "keyboard: " + keyboard +"\n"+
                '}';
    }
}
