package com.buildmate.product_service.controller;

import com.buildmate.product_service.dto.ProductDto;
import com.buildmate.product_service.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProductDto get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ProductDto create(@RequestBody ProductDto dto) {
        return service.create(dto);
    }

//    @PutMapping("/{id}")
//    public ProductDto update(@PathVariable Long id, @RequestBody ProductDto dto) {
//        return service.update(id, dto);
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
