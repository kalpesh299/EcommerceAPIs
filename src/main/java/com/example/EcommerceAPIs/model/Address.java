package com.example.EcommerceAPIs.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_adress")
public class Address {

    @Id
    @Column(name="adressid")
    private Integer adressId;
    @Column(name="adress")
    private String address;
    @Column(name="landmark")
    private String landMark;
    @Column(name="phonenumber")
    private String phoneNumer;
    @Column(name="zip")
    private String zipCode;
    @Column(name="state")
    private String state;

    @JoinColumn(name="userid")
    @OneToOne
    private User userId;//here userid is our foreign key which helping to join adress tabel with user tabel



}
