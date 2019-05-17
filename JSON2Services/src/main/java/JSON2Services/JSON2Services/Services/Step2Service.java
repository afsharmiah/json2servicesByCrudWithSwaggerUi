package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JSON2Services.JSON2Services.Entity.Step2;
import JSON2Services.JSON2Services.Repository.Step2Repository;

@Service
public class Step2Service implements Step2Interface {
	@Autowired
	private Step2Repository repo2;

	@Override
	public Step2 addEmp(Step2 step2) {
		return repo2.save(step2);
	}

	@Override
	public Step2 updateEmp(Step2 upStep2) {
		return repo2.save(upStep2);
	}

	@Override
	public List<Step2> findAll() {
		return repo2.findAll();
	}

	@Override
	public Optional<Step2> findById(int id) {

		return repo2.findById(id);
	}

	@Override
	public String deleteRecord(int uid) {
		return repo2.deleteById(uid);
	}

}
