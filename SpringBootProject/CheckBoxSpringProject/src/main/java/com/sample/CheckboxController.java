package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckboxController {

//    @Autowired
//    private CheckboxStatusRepository repository;

    @GetMapping("/api/checkbox-status")
    public CheckboxStatus getCheckboxStatus() {
        // For simplicity, returning a hardcoded value
        CheckboxStatus status = new CheckboxStatus();
        status.setShowCheckbox(false); // or false based on your logic
        return status;
    }
}