package com.example.buysell.services;

import com.example.buysell.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product(++ID, "PlayStation 5", "Simple description", 70000, "Moscow", "Thomas"));
        products.add(new Product(++ID, "Xbox Series X", "Simple description", 45000, "Moscow", "Thomas"));
    }
    public List<Product> listProducts() {return products;}
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }
    public Product getProductById(Long id){

        for (Product product: products){
            if (product.getId().equals(id)) return product;
        }
        return null;
    }

}
