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

import JSON2Services.JSON2Services.Entity.Step1;
import JSON2Services.JSON2Services.Services.Step1Interface;

@RestController
public class Step1Controller {

	@Autowired
	private Step1Interface step1Service;

	@PostMapping("/addStep1")
	public String saveStep1(@RequestBody Step1 step1) {
		step1Service.addnew(step1);
		return step1.toString();
	}

	@GetMapping("/allStep1")
	public List<Step1> getStep1() {
		return step1Service.findAll();
	}

	@GetMapping("//allStep1/{id}")
	public Optional<Step1> findById(@RequestBody Step1 step1, @PathVariable int id) {
		return step1Service.findById(id);
	}

	@PutMapping("/allStep1/{id}")
	public void update(@RequestBody Step1 step1, @PathVariable int id) {
		step1Service.findById(id);
		step1Service.addnew(step1);

	}

	@DeleteMapping("/allStep1/{uid}")
	public String deleteById(@RequestBody Step1 step1, @PathVariable int uid) {
		step1Service.deleteById(uid);
		return "record has been deleted with id:  " + uid;

	}

}
