package com.software.template_certificate.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "applicant")
public class ApplicantEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "place_of_birth")
    private String placeOfBirth;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "japan_address")
    private String japanAddress;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "passport_expiration")
    private Date passportExpiration;

    @Column(name = "entry_date")
    private Date entryDate;

    @Column(name = "port_of_entry")
    private String portOfEntry;

    @Column(name = "stay_duration")
    private String stayDuration;

    @Column(name = "accompanying_persons")
    private String accompanyingPersons;
}
