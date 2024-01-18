package com.ll.firstBridge.domain.course.courseEnroll.entity;

import com.ll.firstBridge.domain.course.course.entity.Course;
import com.ll.firstBridge.domain.member.member.entity.Member;
import com.ll.firstBridge.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class CourseEnroll extends BaseEntity {

    private LocalDateTime cancelDate;

    @ManyToOne(optional = false)
    private Course course;

    @ManyToOne(optional = false)
    private Member member;


}
