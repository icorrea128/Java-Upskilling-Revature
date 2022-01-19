package Day11.SpringDependencyInjection.java.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    int id;
    String graphicsCard;
    String semiConductor;
    String ipAddress;

    public Computer(int id, String graphicsCard, String semiConductor, String ipAddress) {
        this.id = id;
        this.graphicsCard = graphicsCard;
        this.semiConductor = semiConductor;
        this.ipAddress = ipAddress;
    }

    public Computer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getSemiConductor() {
        return semiConductor;
    }

    public void setSemiConductor(String semiConductor) {
        this.semiConductor = semiConductor;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


}
