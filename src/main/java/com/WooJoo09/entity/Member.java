package com.WooJoo09.entity;

import com.WooJoo09.constant.IsActive;
import com.WooJoo09.constant.ReceiveAd;
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
public class Member {
    //fetch의 디폴트 값은 @xxToOne에서는 EAGER, @xxToMany에서는 LAZY
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OnDelete(action = OnDeleteAction.CASCADE)
//    @OneToMany(mappedBy = "host", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "partMemNum", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "sender", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "receiver", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "complainant", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "goodMemNum", cascade = CascadeType.REMOVE, orphanRemoval = true)
//    @OneToMany(mappedBy = "disMemNum", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Long memberNum;

    @Column(unique = true, nullable = false, length = 20)
    private String id;

    @Column(nullable = false, length = 20)
    private String pwd;

    @Column(unique = true, nullable = false, length = 20)
    private String nickname;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(unique = true, nullable = false, length = 20)
    private String phone;

    @Column(nullable = false)
    private Date birthDate; // 시분초 없이 년월일만

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime regDate;

    // Enum 타입에 포함된 이름 자체를 db에 넣겠다는 의미
    @Enumerated(EnumType.STRING)
    private ReceiveAd receiveAd;

    @Column(length = 500)
    private String pfImg;

    @Column(length = 1000)
    private String introduce;

    @Enumerated(EnumType.STRING)
    private IsActive isActive;

}
