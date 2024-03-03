package com.relation.boot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailId_unique",
                columnNames = "studentEmail"
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long StudentId;
    private String studentName;
    @Column(name = "email_address",nullable = false)
    private String studentEmail;

    @Embedded
    private Guardian guardian;
}
