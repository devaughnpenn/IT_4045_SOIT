package com.soit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloSoitController {
	
	//Controller method to view form
	@RequestMapping("/viewForm")
	public String viewForm() {
		return "hellosoitform";
	}
	//Controller method to process the form( read form data and add data to the model)
	@RequestMapping("/processForm")
	public String processForm(
			@RequestParam("facultyName") String Name, Model model) {
		//Read the request parameter from the HTML form 
	
		//Convert the inserted data to all caps
		Name = Name.toUpperCase();
		//Create message for the results
		String result = "Hello Professor! " + Name; 
		//Add message to the results
		model.addAttribute("message",result);
		return "hellosoit";
	}
}
