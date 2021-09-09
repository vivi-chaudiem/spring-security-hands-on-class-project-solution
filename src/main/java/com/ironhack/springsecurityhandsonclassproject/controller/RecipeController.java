package com.ironhack.springsecurityhandsonclassproject.controller;

import com.ironhack.springsecurityhandsonclassproject.dao.Recipe;
import com.ironhack.springsecurityhandsonclassproject.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping
    List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @PostMapping
    Recipe create(@RequestBody Recipe recipe){
        return recipeRepository.save(recipe);
    }
}
