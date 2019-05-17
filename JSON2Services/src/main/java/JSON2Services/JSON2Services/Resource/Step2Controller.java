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

import JSON2Services.JSON2Services.Entity.Step2;
import JSON2Services.JSON2Services.Services.Step2Interface;

@RestController
public class Step2Controller {

	@Autowired
	private Step2Interface step2Service;

	@PostMapping("/addStep2")
	public String saveStep2(@RequestBody Step2 step2) {
		step2Service.addEmp(step2);
		return step2.toString();
	}

	@GetMapping("/allStep2")
	public List<Step2> getStep1s() {
		return step2Service.findAll();
	}

	@GetMapping("/allStep2/{id}")
	public Optional<Step2> findById(@RequestBody Step2 step2, @PathVariable int id) {
		return step2Service.findById(id);
	}

	@PutMapping("/allStep2/{id}")
	public void updateStep2(@RequestBody Step2 step2, @PathVariable int id) {
		step2Service.updateEmp(step2);
		step2Service.addEmp(step2);
	}

	@DeleteMapping("/allStep2/{uid}")
	public String deleteRecord(@RequestBody Step2 step2, @PathVariable int uid) {
		step2Service.deleteRecord(uid);
		return "Record deleted: " + uid;
	}

}
