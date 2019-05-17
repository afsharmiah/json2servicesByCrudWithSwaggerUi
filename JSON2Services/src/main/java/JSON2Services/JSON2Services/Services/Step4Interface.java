package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import JSON2Services.JSON2Services.Entity.Step4;

public interface Step4Interface {

	List<Step4> findAll();

	Step4 saveStep4(Step4 step4);

	Step4 updateStep4(Step4 step4);

	Optional<Step4> findById(int id);

	void deleteByid(int uid);// delete

}
