package com.software.template_certificate.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "accompanying_persons")
public class AccompanyingPersonsEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "applicant_id")
    private Integer applicantId;

    @Column(name = "relationship")
    private String relationship;

    @Column(name = "name")
    private String name;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "residing_with_applicant")
    private String residingWithApplicant;

}
