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
import JSON2Services.JSON2Services.Services.Step3Interface;

@RestController
public class Step3Controller {

	@Autowired
	private Step3Interface step3service;

	@PostMapping("/addStep3")
	public String addStep(@RequestBody Step3 step3) {
		step3service.addStep3(step3);
		return step3.toString();
	}

	@GetMapping("/allStep3")
	public List<Step3> findAll() {
		return step3service.findAll();
	}

	@GetMapping("/allStep3/{id}")
	public Optional<Step3> findById(@RequestBody Step3 step3, @PathVariable int id) {
		return step3service.findById(id);
	}

	@PutMapping("/allStep3/{id}")
	public void updateStep3(@RequestBody Step3 step3, @PathVariable int id) {
		step3service.findById(id);
		step3service.addStep3(step3);
		System.out.println("Updated successful");
	}

	@DeleteMapping("/allStep3/{id}")
	public void deleteById(@RequestBody Step3 step3, @PathVariable int uid) {
		step3service.deleteByid(uid);
	}

}
