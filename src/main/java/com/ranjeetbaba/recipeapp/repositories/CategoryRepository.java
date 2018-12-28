package com.ranjeetbaba.recipeapp.repositories;

import com.ranjeetbaba.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
