package com.curd.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.curd.entity.Product;
import com.curd.repository.ProductRepo;

import jakarta.annotation.PostConstruct;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	
//	@PostConstruct
//	public void initDB()
//	{
//		List<Product> ls=IntStream.rangeClosed(0, 100)
//				.mapToObj(i->(new Product("product "+i ,new Random().nextInt(100),new Random().nextInt(3000))))
//						.collect(Collectors.toList());
//		repo.saveAll(ls);
//	}
	public List<Product> findAll()
	{
		return repo.findAll();
	}
	public List<Product> findProductWithSorting(String field)
	{
		return repo.findAll(Sort.by(Sort.Direction.ASC,(field)));
	}
	public Page<Product> findProductWithPagination(int offset,int pageSize)
	{
		Page<Product> page=repo.findAll(PageRequest.of(offset, pageSize));
		return page;
	}
	public Page<Product> findProductWithPaginationAndSort(int offset,int pageSize,String field)
	{
		Page<Product> page=repo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
		return page;
	}
}
