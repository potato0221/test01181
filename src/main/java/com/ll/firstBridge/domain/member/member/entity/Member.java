package com.ll.firstBridge.domain.member.member.entity;

import com.ll.firstBridge.domain.course.courseEnroll.entity.CourseEnroll;
import com.ll.firstBridge.global.jpa.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Member extends BaseEntity {

    @Column(unique = true, length = 50)
    private String username;

    @Column(length = 72)
    private String password;

    @Column(length = 20)
    private String nickname;

    private int point = 0;

    private boolean report = false;

    @Column(unique = true)
    private String refreshToken;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<CourseEnroll> courseEnrollList;


}
