package com.example.EcommerceAPIs.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_order")
public class Order {

    @Id
    @Column(name="orderid")
    private Integer orderId;

    @JoinColumn(name="userid")
    @ManyToOne
    private User userId;

    @JoinColumn(name="productid")
    @ManyToOne
    private Product productId;

    @JoinColumn(name="adressid")
    @ManyToOne
    private Address adressId;
    @Column(name="quantity")
    private Integer quantity;

}
