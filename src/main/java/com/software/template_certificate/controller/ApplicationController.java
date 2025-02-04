package com.software.template_certificate.controller;

import com.software.template_certificate.dto.ApplicationDTO;
import com.software.template_certificate.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public String showApplicationForm() {
    return "home";
}
    @GetMapping("/{applicantId}")
    public String getApplication(@PathVariable Integer applicantId, Model model) {

        ApplicationDTO applicationDTO = applicationService.getApplicationDTO(applicantId);

        if (applicationDTO == null) {
            model.addAttribute("errorMessage", "No users found with ID: " + applicantId);
            return "errorPage";
        }

        model.addAttribute("model", applicationDTO);
        return "applicationForm";
    }
}

