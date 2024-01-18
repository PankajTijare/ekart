package com.reljicd.util;


import com.reljicd.model.Product;
import org.springframework.data.domain.Page;

/**
 * @author Dusan Raljic
 */
public class Pager {

    private final Page<Product> products;

    public Pager(Page<Product> products) {
        this.products = products;
    }

    public int getPageIndex() {
        return products.getNumber() + 1;
    }
