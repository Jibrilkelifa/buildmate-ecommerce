//package com.buildmate.product_service.mapper;
//
//import com.buildmate.product_service.dto.ProductDto;
//import com.buildmate.product_service.model.Product;
//
//public class ProductMapper {
//    public static ProductDto toDto(Product product) {
//        return ProductDto.builder()
//                .id(product.getId())
//                .name(product.getName())
//                .description(product.getDescription())
//                .category(product.getCategory())
//                .imageUrl(product.getImageUrl())
//                .price(product.getPrice())
//                .stockQuantity(product.getStockQuantity())
//                .build();
//    }
//
//    public static Product toEntity(ProductDto dto) {
//        return Product.builder()
//                .id(dto.getId())
//                .name(dto.getName())
//                .description(dto.getDescription())
//                .category(dto.getCategory())
//                .imageUrl(dto.getImageUrl())
//                .price(dto.getPrice())
//                .stockQuantity(dto.getStockQuantity())
//                .build();
//    }
//}
