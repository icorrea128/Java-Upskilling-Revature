package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ArduinoMicroController {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long microControllerId;
    String microControllerTransducer;
    double microControllerVolts;
    double microControllerOhms;
    float lux;

    public ArduinoMicroController(long microControllerId, String microControllerTransducer, double microControllerVolts, double microControllerOhms, float lux) {
        this.microControllerId = microControllerId;
        this.microControllerTransducer = microControllerTransducer;
        this.microControllerVolts = microControllerVolts;
        this.microControllerOhms = microControllerOhms;
        this.lux = lux;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArduinoMicroController that = (ArduinoMicroController) o;
        return microControllerId == that.microControllerId && Double.compare(that.microControllerVolts, microControllerVolts) == 0 && Double.compare(that.microControllerOhms, microControllerOhms) == 0 && Objects.equals(microControllerTransducer, that.microControllerTransducer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(microControllerId, microControllerTransducer, microControllerVolts, microControllerOhms);
    }
}
