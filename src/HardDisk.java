public class HardDisk {
    double hardDiskSpace;
    double numberOfDiscs;

    public HardDisk(double hardDiskSpace, double numberOfDiscs) {
        this.hardDiskSpace = hardDiskSpace;
        this.numberOfDiscs = numberOfDiscs;
    }

    public double getHardDiskSpace() {
        return hardDiskSpace;
    }

    public void setHardDiskSpace(double hardDiskSpace) {
        this.hardDiskSpace = hardDiskSpace;
    }

    public double getNumberOfDiscs() {
        return numberOfDiscs;
    }

    public void setNumberOfDiscs(double numberOfDiscs) {
        this.numberOfDiscs = numberOfDiscs;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "hardDiskSpace=" + hardDiskSpace +
                ", numberOfDiscs=" + numberOfDiscs +
                '}';
    }
}
