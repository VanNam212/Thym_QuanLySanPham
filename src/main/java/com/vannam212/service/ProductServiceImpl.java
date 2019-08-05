package com.vannam212.service;

import com.vannam212.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(0, new Product(0, "Iphone 6", 10000000));
        products.put(1, new Product(1, "Iphone 7", 14000000));
        products.put(2, new Product(2, "Iphone 8", 20000000));
        products.put(3, new Product(3, "Iphone X", 24000000));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        product.setId(products.size());
        products.put(products.size(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
