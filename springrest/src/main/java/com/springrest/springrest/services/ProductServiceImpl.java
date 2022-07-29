package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {

	
	List<Product>list;
	public ProductServiceImpl() {
		list=new ArrayList<>();
		list.add(new Product(11,"smartphone","touch screen","samsung"));
		list.add(new Product(12,"iphone","white color","apple"));
		list.add(new Product(13,"smartwatch","black color","noise"));
		list.add(new Product(11,"keypad","small","nokia"));
	}
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Product getProduct(long productId) {
		Product p=null;
		for (Product product:list) {
			if(product.getId()==productId) {
		
				p=product;
				break;
			}
		}
		return p;
	}

	@Override
	public Product addProduct(Product product) {
		list.add(product);
		return product;
	}

}
