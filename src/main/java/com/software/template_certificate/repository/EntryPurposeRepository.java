package com.software.template_certificate.repository;

import com.software.template_certificate.entity.EntryPurposeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryPurposeRepository extends JpaRepository<EntryPurposeEntity, Integer> {
    List<EntryPurposeEntity> findByApplicantId(Integer applicantId);
}
