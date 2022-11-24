package com.WooJoo09.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Entity
@Getter
@Setter
@ToString
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long goodNum;

    @ManyToOne
    @JoinColumn(name = "goodTradeNum")
    private Trade goodTradeNum;

    @ManyToOne
    @JoinColumn(name = "goodMemNum")
    private Member goodMemNum;

}
