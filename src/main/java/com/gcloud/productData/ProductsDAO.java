package com.gcloud.productData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductsDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getProductNameById(String Id){
        return jdbcTemplate.queryForObject("SELECT FROM PRODUCTS WHERE ID=?",new Object[]{Id}, String.class);
    }
}
