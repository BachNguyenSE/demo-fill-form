package com.software.template_certificate.repository;

import com.software.template_certificate.entity.AccompanyingPersonsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccompanyingPersonRepository extends JpaRepository<AccompanyingPersonsEntity, Integer> {
    List<AccompanyingPersonsEntity> findByApplicantId(Integer applicantId);
}