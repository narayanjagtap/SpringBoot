package in.sp.main.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/OpenProfile")
	public String openProfilePage(Model model) {
		String name = "Narayan Jagtap";
		model.addAttribute("modelName", name);
		return "profile";
	}
	
	@GetMapping("/OpenConditional")
	public String OpenConditionalPage(Model model) {
		int no1 = 12;
		int no2 = 34;
		
		model.addAttribute("number1", no1);
		model.addAttribute("number2", no2);
		return "Conditional";
	}
	
	@GetMapping("/OpenLooping")
	public String OpenLoopingPage(Model model){
		List<Integer> numbers = List.of(2,3,5,6);
		model.addAttribute("modelNumbers", numbers);
		return "looping";
	}
}
