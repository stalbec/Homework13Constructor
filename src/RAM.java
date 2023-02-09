public class RAM {
    private double spaceOfRam;
    private String manufacturer;

    public RAM(double spaceOfRam, String manufacturer){
        this.spaceOfRam = spaceOfRam;
        this.manufacturer = manufacturer;
    }

    public double getSpaceOfRam() {
        return spaceOfRam;
    }

    public void setSpaceOfRam(double spaceOfRam) {
        this.spaceOfRam = spaceOfRam;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "spaceOfRam=" + spaceOfRam +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
