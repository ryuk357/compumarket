package com.compumarket.compumarket.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.compumarket.compumarket.entities.Customer;
import com.compumarket.compumarket.entities.Employee;
import com.compumarket.compumarket.repositories.CustomerRepository;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	private CustomerRepository repo;
	
	@GetMapping("/create")
	public String generateForm(Model model, @PathVariable("id") int id) {
			Customer customer = new Customer();
			model.addAttribute("newUser", customer);
		return "CustomerForm";
	}
	
	@GetMapping("/save")
	public String createCustomer(@ModelAttribute Customer customerFull, Model model) {	
//		String redirection = ""; 
//		if (customerFull.getId() !=0) {
//			Customer customerFinded = repo.findById(customerFull.getId()).get(); 
//			customerFinded.setLastName(customerFull.getLastName());
//			customerFinded.setFirstName(customerFull.getFirstName());
//			customerFinded.setEmail(customerFull.getEmail());
//			customerFinded.setAddress(customerFull.getAddress());
//			customerFinded.setPwd(customerFull.getPwd());
//			repo.save(customerFinded);
//			redirection = "redirect:/tp/" + customerFinded.getId() + "/show";
//			
//		} else {
			repo.save(customerFull);
//			redirection = "redirect:/tp/";
//		}
		return "redirect:/";
	}
	
	@GetMapping("{id}/show")
	public String displayCustomer(Model model, @PathVariable("id")int id) {
		Customer customerFinded = repo.findById(id).get(); 
		Customer customer = new Customer();
		model.addAttribute("current_employee", customerFinded);
		//add route
		return null;
	}
	
	public String editCustomer() {
		return null;
	}
	
	@GetMapping("{id}/delete")
	public String deleteCustomer(Model model, @PathVariable("id") int id) {
		Customer customerFinded = repo.findById(id).get(); 
		repo.delete(customerFinded);
		return "redirect:/";
	}
	
	@GetMapping("/showAll")
	public String allCustomer(Model model) {
		List <Customer> allCustomers = repo.findAll();
		model.addAttribute("customers", allCustomers);
		return null;
	}	
	
//	@GetMapping("/createCustomer")
//	public String create(Model model, CustomerRepository repo) {
//		this.repo = repo;
//		Customer customer = new Customer();
//		model.addAttribute("newEmployee", customer);
//		repo.save(customer);
//		return null;
//	}
}
