package com.pace.product.dao;
import java.util.ArrayList;

import com.pace.product.bean.Product;
public class ProductDAO {
ArrayList<Product> productList=new ArrayList<Product>();

public void addDetails(Product product) {
productList.add(product);
}
public ArrayList<Product> sendDetails(){
return productList;
}

}
