public class Display {
    double diagonal;
    String producer;
    public Display (double diagonal,String producer, String matrixType){
        this.diagonal = diagonal;
        this.producer = producer;
        this.matrixType = matrixType;
    }
    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    String matrixType;

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", producer='" + producer + '\'' +
                ", matrixType='" + matrixType + '\'' +
                '}';
    }
}
