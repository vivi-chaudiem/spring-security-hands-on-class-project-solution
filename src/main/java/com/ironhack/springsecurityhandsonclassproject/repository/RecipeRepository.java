package com.ironhack.springsecurityhandsonclassproject.repository;

import com.ironhack.springsecurityhandsonclassproject.dao.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
