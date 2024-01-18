package com.ll.firstBridge.domain.course.video.entity;

import com.ll.firstBridge.domain.course.course.entity.Course;
import com.ll.firstBridge.domain.course.summaryNote.entity.SummaryNote;
import com.ll.firstBridge.global.jpa.BaseEntity;
import jakarta.persistence.*;
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
public class Video extends BaseEntity {

    @Column(length = 150)
    private String url;

    @Column(length = 300)
    private String overView;

    @ManyToOne(optional = false)
    private Course course;

    @OneToMany(mappedBy = "video", cascade = CascadeType.REMOVE)
    private List<SummaryNote> summaryNotes;

}
