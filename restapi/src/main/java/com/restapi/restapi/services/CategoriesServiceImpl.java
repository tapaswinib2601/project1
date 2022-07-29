package com.restapi.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.restapi.entities.Categories;

@Service
public class CategoriesServiceImpl implements CategoriesService {

	List<Categories> list;

	public CategoriesServiceImpl() {
		list = new ArrayList<>();
		list.add(new Categories(101, "electronics", "television", "samsung"));
		list.add(new Categories(102, "footware", "shoes", "nike"));
		list.add(new Categories(103, "clothes", "shirt", "adidas"));
		list.add(new Categories(104, "accessories", "bag", "skybag"));
	}

	@Override
	public List<Categories> getCategories() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Categories getCategories(long categoriesId) {
		Categories c = null;
		for (Categories categories : list) {
			if (categories.getId() == categoriesId) {

				c = categories;
				break;
			}
		}
		return c;
	}

	@Override
	public Categories addCategories(Categories categories) {
		list.add(categories);
		return categories;
	}

}
