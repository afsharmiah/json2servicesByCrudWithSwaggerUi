package JSON2Services.JSON2Services.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JSON2Services.JSON2Services.Entity.Step4;
import JSON2Services.JSON2Services.Repository.Step4Repository;

@Service
public class Step4Service implements Step4Interface {

	@Autowired
	private Step4Repository repository4;

	@Override
	public List<Step4> findAll() {
		return repository4.findAll();
	}

	@Override
	public Step4 saveStep4(Step4 step4) {
		return repository4.save(step4);
	}

	@Override
	public Optional<Step4> findById(int id) {

		return repository4.findById(id);
	}

	@Override
	public Step4 updateStep4(Step4 updateStep4) {

		return repository4.save(updateStep4);
	}

	@Override
	public void deleteByid(int uid) {
		repository4.deleteById(uid);

	}

}
