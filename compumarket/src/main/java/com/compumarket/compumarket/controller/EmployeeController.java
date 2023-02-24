package com.compumarket.compumarket.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.compumarket.compumarket.entities.Employee;
import com.compumarket.compumarket.repositories.EmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeRepository repo;
		
		@GetMapping("/create")
		public String generateForm(Model model, @PathVariable("id") int id) {
				Employee employee = new Employee();
				model.addAttribute("newEmployee", employee);
			return "EmployeeForm";
		}
		
		@GetMapping("/save")
		public String createEmployee(@ModelAttribute Employee employeeFull, Model model) {	

			repo.save(employeeFull);
			return "redirect:/";
		}
		
		@GetMapping("{id}/show")
		public String displayEmployee(Model model, @PathVariable("id")int id) {
			Employee employeeFinded = repo.findById(id).get(); 
			Employee employee = new Employee();
			model.addAttribute("current_employee", employeeFinded);
			//add the route
			return null;
		}
		
		public String editEmployee() {
			return null;
		}
		
		@GetMapping("{id}/delete")
		public String deleteEmployee(Model model, @PathVariable("id") int id) {
			Employee employeeFinded = repo.findById(id).get(); 
			repo.delete(employeeFinded);
			return "redirect:/";
		}
		
		@GetMapping("/showAll")
		public String allEmployee(Model model) {
			List <Employee> allEmployees = repo.findAll();
			model.addAttribute("customers", allEmployees);
			return null;
		}	
}
