package com.restapi.restapi.services;

import java.util.List;

import com.restapi.restapi.entities.Categories;

public interface CategoriesService {

	public List<Categories> getCategories();

	public Categories getCategories(long categoriesId);

	public Categories addCategories(Categories categories);
}
