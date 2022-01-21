package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArduinoMicroController {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long microControllerId;
    String microControllerTransducer;
    double microControllerVolts;
    double microControllerOhms;

    public ArduinoMicroController(long microControllerId, String microControllerTransducer, double microControllerVolts, double microControllerOhms) {
        this.microControllerId = microControllerId;
        this.microControllerTransducer = microControllerTransducer;
        this.microControllerVolts = microControllerVolts;
        this.microControllerOhms = microControllerOhms;
    }

    public ArduinoMicroController() {
    }

    public long getMicroControllerId() {
        return microControllerId;
    }

    public void setMicroControllerId(long microControllerId) {
        this.microControllerId = microControllerId;
    }

    public String getMicroControllerTransducer() {
        return microControllerTransducer;
    }

    public void setMicroControllerTransducer(String microControllerTransducer) {
        this.microControllerTransducer = microControllerTransducer;
    }

    public double getMicroControllerVolts() {
        return microControllerVolts;
    }

    public void setMicroControllerVolts(double microControllerVolts) {
        this.microControllerVolts = microControllerVolts;
    }

    public double getMicroControllerOhms() {
        return microControllerOhms;
    }

    public void setMicroControllerOhms(double microControllerOhms) {
        this.microControllerOhms = microControllerOhms;
    }


}
