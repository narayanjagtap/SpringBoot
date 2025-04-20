package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.main.entity.User;
import in.sp.main.services.UserService;

@Controller		//it's an annotation to use for handal http request.
public class MyController {
	
	@Autowired
	private UserService userService;
	
//	@GetMapping("/regPage")
//    public String openRegPage(Model model) {
//        model.addAttribute("user", new User());  // Adds an empty User object to the model
//        return "register";  // Returns the "register" view (the registration page)
//    }
	@GetMapping("/regPage")
    public String showRegistrationPage() {
        return "register"; // This should match the JSP file name
    }
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user, Model model) {
	    boolean status = userService.registerUser(user);
	    
	    if (status) {
	        model.addAttribute("successMsg", "User registered successfully...");
	        return "redirect:/regPage";  // Redirects to clear form data and avoid duplicate submission
	    } else {
	        model.addAttribute("errorMsg", "User NOT registered due to some error...");
	        return "register";  // Stay on the same page in case of an error
	    }
	}

}
