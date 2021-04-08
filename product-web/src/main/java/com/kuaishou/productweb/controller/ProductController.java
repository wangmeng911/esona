package com.kuaishou.productweb.controller;

import com.kuaishou.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/list")
    public Map list() {
        Product product = new Product();
        product.setProductName("小米粥");
        product.setProductPrice(new BigDecimal(2.0));
        product.setProductStock(100);

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", 000);
        resultMap.put("message", "成功");
        resultMap.put("data", Arrays.asList(product));
        return resultMap;
    }
}
