package service;

import beans.ArduinoMicroController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.CRUDRepositoryMicroControllers;

import java.util.List;

@Service
public class ArduinoMicroControllerService {
    @Autowired
    CRUDRepositoryMicroControllers crudRepositoryMicroControllers;

    public CRUDRepositoryMicroControllers getCrudRepositoryMicroControllers() {
        return crudRepositoryMicroControllers;
    }

    public void setCrudRepositoryMicroControllers(CRUDRepositoryMicroControllers crudRepositoryMicroControllers) {
        this.crudRepositoryMicroControllers = crudRepositoryMicroControllers;
    }

    public ArduinoMicroController save(ArduinoMicroController arduinoMicroController){
        return crudRepositoryMicroControllers.save(arduinoMicroController);
    }

    public ArduinoMicroController find(long microControllerId){
        return crudRepositoryMicroControllers.findById(microControllerId).get();
    }

    public List<ArduinoMicroController> findAll(){
        return (List<ArduinoMicroController>) crudRepositoryMicroControllers.findAll();
    }

    public void delete(long microControllerId){
        crudRepositoryMicroControllers.deleteById(microControllerId);
    }
}
