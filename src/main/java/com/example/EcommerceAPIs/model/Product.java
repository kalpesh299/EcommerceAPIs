package com.example.EcommerceAPIs.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_product")
public class Product {

    @Id
    @Column(name="productid")
    private Integer productId;
    @Column(name="productname")
    private String productName;
    @Column(name="productprice")
    private Integer productPrice;
    @Column(name="description")
    private String description;

    @Column(name="category")
    private String category;

    @Column(name="brand")
    private String brand;

}
