package com.cafemanagement.POJO;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@NamedQuery(name = "Bill.getAllBills", query = "select b from Bill b order by b.id desc")
@NamedQuery(name = "Bill.getBillByUserName", query = "select b from Bill b where b.createdBy=:username order by b.id desc")


@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "bill")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Bill implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "email")
    private String email;
    @Column(name = "contactnumber")
    private String contactNumber;
    @Column(name = "paymentmethod")
    private String paymentMethod;
    @Column(name = "total")
    private Integer total;
    @Column(name = "productdetails", columnDefinition = "json")
    private String productDetail;
    @Column(name = "createdby")
    private String createdBy;



}
