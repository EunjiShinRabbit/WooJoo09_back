package com.WooJoo09.entity;

import com.WooJoo09.constant.AcceptTrade;
import com.WooJoo09.constant.IsImg;
import com.WooJoo09.constant.IsRead;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chatNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "partnerNum")
    private Partner partnerNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender")
    private Member sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver")
    private Member receiver;

    @Column(nullable = false, length = 500)
    private String chatContent;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime chatTime;

    @Enumerated(EnumType.STRING)
    private IsRead isRead;

    @Enumerated(EnumType.STRING)
    private IsImg isImg;

}
