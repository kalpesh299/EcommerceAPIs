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
@Table(name="tbl_user")
public class User {

    @Id
    @Column(name="user_id")
    private Integer userId;
    @Column(name="username")
    private String userName;
    @Column(name="user_pass")
    private String userPassword;
    @Column(name="user_email")
    private String email;

    @Column(name="user_phono")
    private String phonenumber;
}
