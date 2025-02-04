package com.software.template_certificate.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApplicationDTO {
    private Integer applicantId;
    private String nationality;
    private String name;
    private String gender;
    private String birthdate;
    private String placeOfBirth;
    private String maritalStatus;
    private String occupation;
    private String homeAddress;
    private String japanAddress;
    private String passportNumber;
    private String passportExpiration;
    private String entryDate;
    private String portOfEntry;
    private String stayDuration;
    private List<String> entryPurposes;
    private List<AccompanyingPersonDTO> accompanyingPersons;
}



