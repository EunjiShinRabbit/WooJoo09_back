package com.WooJoo09.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class ProductImg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long imgNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tradeNum")
    private Trade tradeNum;

    @Column(nullable = false, length = 500)
    private String imgUrl;

}
