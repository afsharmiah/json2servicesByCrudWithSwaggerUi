package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JSON2Services.JSON2Services.Entity.Step3;
import JSON2Services.JSON2Services.Repository.Step3Repository;

@Service
public class Step3Service implements Step3Interface {

	@Autowired
	private Step3Repository repository3;

	@Override
	public Step3 addStep3(Step3 step3) {

		return repository3.save(step3);
	}

	@Override
	public List<Step3> findAll() {
		return repository3.findAll();
	}

	@Override
	public Optional<Step3> findById(int id) {

		return repository3.findById(id);
	}

	@Override
	public Step3 updateStep3(Step3 step3) {

		return repository3.save(step3);
	}

	@Override
	public void deleteByid(int uid) {
		repository3.deleteById(uid);

	}
}
