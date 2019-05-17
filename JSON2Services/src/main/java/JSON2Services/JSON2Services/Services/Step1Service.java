package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JSON2Services.JSON2Services.Entity.Step1;
import JSON2Services.JSON2Services.Repository.Step1Repository;

@Service
public class Step1Service implements Step1Interface {

	@Autowired
	private Step1Repository repository;

	@Override
	public Step1 addnew(Step1 step1) {
		return repository.save(step1);
	}

	@Override
	public List<Step1> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Step1> findById(int id) {

		return repository.findById(id);
	}

	@Override
	public Step1 updateStep1(Step1 upStep1) {

		return repository.findById(upStep1);
	}

	@Override
	public String deleteById(int uid) {

		return repository.deleteById(uid);
	}

}
