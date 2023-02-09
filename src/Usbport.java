public class Usbport {
    private String typeOfPort;
    private String portsId;

    public Usbport(String typeOfPort,String portsId) {
        this.typeOfPort = typeOfPort;
        this.portsId = portsId;
    }

    public String getTypeOfPort() {
        return typeOfPort;
    }

    public void setTypeOfPort(String typeOfPort) {
        this.typeOfPort = typeOfPort;
    }

    public String getPortsId() {
        return portsId;
    }

    public void setPortsId(String portsId) {
        this.portsId = portsId;
    }

    @Override
    public String toString() {
        return "Usbport{" +
                "typeOfPort='" + typeOfPort + '\'' +
                ", portsId='" + portsId + '\'' +
                '}';
    }
}
