package com.rapidtech.springdasar.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductCategory {
    private Product product;
    private Category category;
}

