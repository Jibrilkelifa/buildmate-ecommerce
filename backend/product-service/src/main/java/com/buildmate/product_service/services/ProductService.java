package com.buildmate.product_service.services;

import com.buildmate.product_service.dto.ProductDto;
//import com.buildmate.product_service.mapper.ProductMapper;
import com.buildmate.product_service.model.Product;
import com.buildmate.product_service.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

//    public List<ProductDto> getAll() {
//        return repository.findAll()
//                .stream()
//                .map(ProductMapper::toDto)
//                .collect(Collectors.toList());
//    }

    public ProductDto getById(Long id) {
        return repository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public ProductDto create(ProductDto dto) {
        Product product = repository.save(ProductMapper.toEntity(dto));
        return ProductMapper.toDto(product);
    }

//    public ProductDto update(Long id, ProductDto dto) {
//        Product existing = repository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Product not found"));
//        existing.setName(dto.getName());
//        existing.setDescription(dto.getDescription());
//        existing.setCategory(dto.getCategory());
//        existing.setImageUrl(dto.getImageUrl());
//        existing.setPrice(dto.getPrice());
//        existing.setStockQuantity(dto.getStockQuantity());
//        return ProductMapper.toDto(repository.save(existing));
//    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}