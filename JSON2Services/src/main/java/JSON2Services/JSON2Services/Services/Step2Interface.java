package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import JSON2Services.JSON2Services.Entity.Step2;

public interface Step2Interface {

	Step2 addEmp(Step2 step2);

	List<Step2> findAll();

	Step2 updateEmp(Step2 upStep2);

	Optional<Step2> findById(int id);

	String deleteRecord(int uid);

}
