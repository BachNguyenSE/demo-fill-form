package com.software.template_certificate.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccompanyingPersonDTO {
    private String relationship;
    private String name;
    private String birthdate;
    private String nationality;
    private String residingWithApplicant;
}



