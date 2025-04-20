package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.main.entities.User;
import in.sp.main.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/regPage")
	public String OpenRegPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user, Model model)
	{
		boolean status = userService.registerUser(user);

		if(status)
		{
		    model.addAttribute("successMsg", "User registered successfully");
		}
		else
		{
		    model.addAttribute("errorMsg", "User not registered due to some error");
		}
		
	    return "register";
	}

	
	@GetMapping("/loginPage")
	public String openLoginPage (Model model) {

	    model.addAttribute("user", new User());
	    return "login";

	}
	
	
	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user, Model model)
	{

	    User validUser = userService.loginUser(user.getEmail(), user.getPassword());

	    if(validUser != null)
	    {
	    	model.addAttribute("modelName", validUser.getName());
	        return "profile";
	    }
	    else
	    {
	        model.addAttribute("errorMsg", "Email id and password didnt matched");
	        return "login";
	    }

	}
	
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
	    HttpSession session = request.getSession(false);
	    if (session != null) {
	        session.invalidate();
	        System.out.println("User logged out successfully.");
	    }
	    return "redirect:/loginPage";
	}

	
}
