package com.WooJoo09.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Entity
@Getter
@Setter
@ToString
public class Dislike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dislikeNum;

    @ManyToOne
    @JoinColumn(name = "disTradeNum")
    private Trade disTradeNum;

    @ManyToOne
    @JoinColumn(name = "disMemNum")
    private Member disMemNum;
}
