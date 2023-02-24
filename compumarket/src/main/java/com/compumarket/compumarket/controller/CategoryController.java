package com.compumarket.compumarket.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.compumarket.compumarket.entities.Category;
import com.compumarket.compumarket.entities.Employee;
import com.compumarket.compumarket.repositories.CategoryRepository;
import com.compumarket.compumarket.repositories.EmployeeRepository;

@Controller
@RequestMapping("/category")
public class CategoryController {
	private CategoryRepository repo;
	
	@GetMapping("/create")
	public String generateForm(Model model, @PathVariable("id") int id) {
			Category category = new Category();
			model.addAttribute("newEmployee", category);
		return "CategoryForm";
	}
	
	@GetMapping("/save")
	public String create(@ModelAttribute Category categoryFull, Model model) {	
		repo.save(categoryFull);
		return "redirect:/";
	}
	
	@GetMapping("{id}/show")
	public String display(Model model, @PathVariable("id")int id) {
		Category categoryFinded = repo.findById(id).get(); 
		Category category = new Category();
		model.addAttribute("current_category", categoryFinded);
		//add the route
		return null;
	}
	
	public String editCategory() {
		return null;
	}
	
	@GetMapping("{id}/delete")
	public String deleteCategory(Model model, @PathVariable("id") int id) {
		Category categoryFinded = repo.findById(id).get(); 
		repo.delete(categoryFinded);
		return "redirect:/";
	}
	
	@GetMapping("/showAll")
	public String allCategory(Model model) {
		List <Category> allCategories = repo.findAll();
		model.addAttribute("categories", allCategories);
		return null;
	}	
}
