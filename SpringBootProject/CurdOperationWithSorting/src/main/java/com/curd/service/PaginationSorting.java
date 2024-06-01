package com.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curd.entity.APIResponse;
import com.curd.entity.Product;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
@RequestMapping("/product")
public class PaginationSorting {

	@Autowired
	ProductService service;
	
	@GetMapping
	public APIResponse<List<Product>> getProducts() {
		List<Product> allProducts=service.findAll();
		return new APIResponse<>(allProducts.size(),allProducts);
	}
	@GetMapping("/{field}")
	public APIResponse<List<Product>> getProductsWithSort(@PathVariable String field)
	{
		List<Product> allProducts =service.findProductWithSorting(field);
		return new APIResponse<>(allProducts.size(),allProducts);

	}
	@GetMapping("pagination/{offset}/{pageSize}")
	public APIResponse<Page<Product>> getProductsWithPagination(@PathVariable int offset,@PathVariable int pageSize)
	{
		Page<Product> allProducts =service.findProductWithPagination(offset,pageSize);
		return new APIResponse<>(allProducts.getSize(),allProducts);

	}
	@GetMapping("pagination/{offset}/{pageSize}/{field}")
	public APIResponse<Page<Product>> getProductsWithPaginationAndSort(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field)
	{
		Page<Product> allProducts =service.findProductWithPaginationAndSort(offset,pageSize,field);
		return new APIResponse<>(allProducts.getSize(),allProducts);

	}
	public static void main(String[] args) {
		SpringApplication.run(PaginationSorting.class,args);
	}
}
