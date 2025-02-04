package com.software.template_certificate.service;

import com.software.template_certificate.dto.AccompanyingPersonDTO;
import com.software.template_certificate.dto.ApplicationDTO;
import com.software.template_certificate.entity.AccompanyingPersonsEntity;
import com.software.template_certificate.entity.ApplicantEntity;
import com.software.template_certificate.entity.EntryPurposeEntity;
import com.software.template_certificate.repository.AccompanyingPersonRepository;
import com.software.template_certificate.repository.ApplicantRepository;
import com.software.template_certificate.repository.EntryPurposeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationService {

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private EntryPurposeRepository entryPurposeRepository;

    @Autowired
    private AccompanyingPersonRepository accompanyingPersonRepository;

    public ApplicationDTO convertToDTO(ApplicantEntity applicant) {
        ApplicationDTO dto = new ApplicationDTO();

        // Mapping
        dto.setApplicantId(applicant.getId());
        dto.setNationality(applicant.getNationality());
        dto.setName(applicant.getName());
        dto.setGender(applicant.getGender());
        dto.setBirthdate(applicant.getBirthdate().toString());
        dto.setPlaceOfBirth(applicant.getPlaceOfBirth());
        dto.setMaritalStatus(applicant.getMaritalStatus());
        dto.setOccupation(applicant.getOccupation());
        dto.setHomeAddress(applicant.getHomeAddress());
        dto.setJapanAddress(applicant.getJapanAddress());
        dto.setPassportNumber(applicant.getPassportNumber());
        dto.setPassportExpiration(applicant.getPassportExpiration().toString());
        dto.setEntryDate(applicant.getEntryDate().toString());
        dto.setPortOfEntry(applicant.getPortOfEntry());
        dto.setStayDuration(applicant.getStayDuration());

        // Mapping EntryPurpose Entities
        List<EntryPurposeEntity> entryPurposes = entryPurposeRepository.findByApplicantId(applicant.getId());
        List<String> purposes = entryPurposes.stream()
                .map(EntryPurposeEntity::getPurpose)
                .collect(Collectors.toList());
        dto.setEntryPurposes(purposes);

        // Mapping AccompanyingPersons
        List<AccompanyingPersonsEntity> accompanyingPersons = accompanyingPersonRepository.findByApplicantId(applicant.getId());
        List<AccompanyingPersonDTO> accompanyingPersonDTOs = accompanyingPersons.stream()
                .map(this::convertAccompanyingPersonToDTO)
                .collect(Collectors.toList());
        dto.setAccompanyingPersons(accompanyingPersonDTOs);

        return dto;
    }

    private AccompanyingPersonDTO convertAccompanyingPersonToDTO(AccompanyingPersonsEntity person) {
        AccompanyingPersonDTO dto = new AccompanyingPersonDTO();
        dto.setRelationship(person.getRelationship());
        dto.setName(person.getName());
        dto.setBirthdate(person.getBirthdate().toString());
        dto.setNationality(person.getNationality());
        dto.setResidingWithApplicant(person.getResidingWithApplicant());
        return dto;
    }

    public ApplicationDTO getApplicationDTO(Integer applicantId) {
        return applicantRepository.findById(applicantId)
                .map(this::convertToDTO)
                .orElse(null);
    }
}

