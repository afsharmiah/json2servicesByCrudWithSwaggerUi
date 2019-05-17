package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import JSON2Services.JSON2Services.Entity.Step3;

public interface Step3Interface {

	Step3 addStep3(Step3 step3);// insert

	Step3 updateStep3(Step3 step3);// update

	Optional<Step3> findById(int id);// find by id

	List<Step3> findAll();// find all

	void deleteByid(int uid);// delete

}
