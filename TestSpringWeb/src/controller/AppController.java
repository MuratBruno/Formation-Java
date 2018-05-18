package controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.User;

@Controller
public class AppController {

	private static final Logger logger = Logger.getLogger(AppController.class);
	
//	@GetMapping("/pages/")
//	public String login(Model model) {
//		
//		return "redirect:login";
//	}
	
	@GetMapping("/pages/login")
	public String loginForm(Model model) {
		
		model.addAttribute("loginForm", new User());
		return "login";
	}
	
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }
    
    @RequestMapping(value = { "/login"}, method = RequestMethod.GET)
    public String loginPage(ModelMap model) {
        return "login";
    }
 
    @RequestMapping(value = { "/products"}, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "products";
    }
 
    @RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "contactus";
    }
	

	@PostMapping("login")
	public String login(@Valid @ModelAttribute("loginForm")User userForm, BindingResult bindingResults) {
		logger.info("login demarré");
		//logs debug message
		
		if(logger.isDebugEnabled()) {
			logger.debug("Inside : printHello");
		}
		
		//logs exception
		logger.error("C'est un message d'erreur", new Exception("En cours de Test"));
		logger.info("login terminé");
		
		if (bindingResults.hasErrors()) {
			return "login";
		}
		
		return "redirect:home";

	}
	


}