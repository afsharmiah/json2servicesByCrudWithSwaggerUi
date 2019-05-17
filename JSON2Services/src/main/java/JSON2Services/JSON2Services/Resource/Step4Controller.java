package JSON2Services.JSON2Services.Resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import JSON2Services.JSON2Services.Entity.Step3;
import JSON2Services.JSON2Services.Entity.Step4;
import JSON2Services.JSON2Services.Services.Step4Interface;

@RestController
public class Step4Controller {
	@Autowired
	private Step4Interface step4Service;

	@GetMapping("/allStep4")
	public List<Step4> findAll() {
		return step4Service.findAll();
	}

	@PostMapping("/addStep4")
	public Step4 saveStep4(@RequestBody Step4 step4) {
		return step4Service.saveStep4(step4);
	}

	@GetMapping("/allStep4/{id}")
	public Optional<Step4> findById(@RequestBody Step4 step4, @PathVariable int id) {
		return step4Service.findById(id);
	}

	@DeleteMapping("/allStep4/{uid}")
	public void deleteById(@RequestBody Step3 step3, @PathVariable int uid) {
		step4Service.deleteByid(uid);
	}

	@PutMapping("/allStep4/{id}")
	public void updateById(@RequestBody Step4 step4, @PathVariable int id) {
		step4Service.findById(id);
		step4Service.saveStep4(step4);
	}

}
