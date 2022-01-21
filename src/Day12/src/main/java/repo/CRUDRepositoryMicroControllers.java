package repo;

import beans.ArduinoMicroController;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRUDRepositoryMicroControllers extends CrudRepository<ArduinoMicroController,Long> {
}
