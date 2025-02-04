package com.software.template_certificate.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "entry_purpose")
public class EntryPurposeEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "applicant_id")
    private Integer applicantId;
    @Column(name = "purpose")
    private String purpose;
}
