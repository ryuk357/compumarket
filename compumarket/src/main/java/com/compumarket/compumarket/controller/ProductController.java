package com.compumarket.compumarket.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.compumarket.compumarket.entities.Product;
import com.compumarket.compumarket.repositories.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	private ProductRepository repo;
		
		@GetMapping("/create")
		public String generateForm(Model model, @PathVariable("id") int id) {
				Product product = new Product();
				model.addAttribute("newProduct", product);
			return "ProductForm";
		}
		
		@GetMapping("/save")
		public String create(@ModelAttribute Product productFull, Model model) {	
			repo.save(productFull);
			return "redirect:/";
		}
		
		@GetMapping("{id}/show")
		public String display(Model model, @PathVariable("id")int id) {
			Product productFinded = repo.findById(id).get(); 
			Product product = new Product();
			model.addAttribute("current_product", productFinded);
			//add the route
			return null;
		}
		
		public String editProduct() {
			return null;
		}
		
		@GetMapping("{id}/delete")
		public String deleteProduct(Model model, @PathVariable("id") int id) {
			Product productFinded = repo.findById(id).get(); 
			repo.delete(productFinded);
			return "redirect:/";
		}
		
		@GetMapping("/showAll")
		public String allProduct(Model model) {
			List <Product> allProducts = repo.findAll();
			model.addAttribute("products", allProducts);
			return null;
		}	
}
