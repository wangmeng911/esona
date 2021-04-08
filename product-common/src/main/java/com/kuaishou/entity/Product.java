package com.kuaishou.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    //商品的名称
    private String productName;
    //商品的价格
    private BigDecimal productPrice;
    //商品的库存
    private int productStock;
}
