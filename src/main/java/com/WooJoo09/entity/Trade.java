package com.WooJoo09.entity;

import com.WooJoo09.constant.DoneTrade;
import com.WooJoo09.constant.TradeMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OnDelete(action = OnDeleteAction.CASCADE)
//    @OneToMany(mappedBy = "tradeNum", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "complainTrade", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "goodTradeNum", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "disTradeNum", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Long tradeNum;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category; // pk의 타입으로 자동으로 들어가지는듯?

    @ManyToOne
    @JoinColumn(name = "host")
    private Member host;

    @Column(nullable = false)
    private int countPartner;

    @Column(nullable = false, length = 60)
    private String product;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false, length = 20)
    private String location;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime writeDate;

    @Column(nullable = false)
    private Date dueDate;

    @Enumerated(EnumType.STRING)
    private TradeMethod tradeMethod;

    @Column(nullable = false, length = 2000)
    private String productDetail;

    @Column(length = 50)
    private String tradePlace;

    @Enumerated(EnumType.STRING)
    private DoneTrade doneTrade;

}
