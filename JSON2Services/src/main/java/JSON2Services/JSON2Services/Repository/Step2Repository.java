package JSON2Services.JSON2Services.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import JSON2Services.JSON2Services.Entity.Step2;

public interface Step2Repository extends MongoRepository<Step2, String> {

	Optional<Step2> findById(int id);

	String deleteById(int uid);

}
