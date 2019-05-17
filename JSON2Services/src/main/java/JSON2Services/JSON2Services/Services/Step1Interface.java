package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import JSON2Services.JSON2Services.Entity.Step1;

public interface Step1Interface {

	Step1 addnew(Step1 step1);

	List<Step1> findAll();

	Optional<Step1> findById(int id);

	Step1 updateStep1(Step1 upStep1);

	String deleteById(int uid);

}
