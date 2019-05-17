package JSON2Services.JSON2Services.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import JSON2Services.JSON2Services.Entity.Step1;

public interface Step1Repository extends MongoRepository<Step1, String> {

	Optional<Step1> findById(int id);

	Step1 findById(Step1 upStep1);

	String deleteById(int uid);

}
