package com.project.dreamshops.service.product;

import com.project.dreamshops.model.Product;
import com.project.dreamshops.request.AddProductRequest;

import java.util.List;

public interface IProductService
{
    Product addProduct(AddProductRequest request);

    Product getProductById(Long id);

    void deleteProductById(Long id);
    Product updateProduct(Product product, Long productId);

    List<Product> getAllProducts();
    List<Product> getProductByBrand(String brand);
    List<Product> getProductByCategory(String category);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductByName(String name);
    List<Product> getProductByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);


}
