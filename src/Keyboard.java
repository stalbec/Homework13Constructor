public class Keyboard {
 private String podScvetka;
 private String dopKeyboard;

    public Keyboard(String podScvetka, String dopKeyboard) {
        this.podScvetka = podScvetka;
        this.dopKeyboard = dopKeyboard;
    }

    public String getPodScvetka() {
        return podScvetka;
    }

    public void setPodScvetka(String podScvetka) {
        this.podScvetka = podScvetka;
    }

    public String getDopKeyboard() {
        return dopKeyboard;
    }

    public void setDopKeyboard(String dopKeyboard) {
        this.dopKeyboard = dopKeyboard;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "podScvetka='" + podScvetka + '\'' +
                ", dopKeyboard='" + dopKeyboard + '\'' +
                '}';
    }
}
