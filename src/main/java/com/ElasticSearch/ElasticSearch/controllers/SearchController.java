package com.ElasticSearch.ElasticSearch.controllers;

import com.ElasticSearch.ElasticSearch.models.Product;
import com.ElasticSearch.ElasticSearch.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class SearchController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        Optional<Product> productOptional = productRepo.findById(id);
        return productOptional.orElse(null);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable String id) {
        productRepo.deleteById(id);
    }
    @GetMapping("/title/{title}")
    public List<Product> searchProductByTitle(@PathVariable String title) {
        return productRepo.findByTitle(title);
    }
}
