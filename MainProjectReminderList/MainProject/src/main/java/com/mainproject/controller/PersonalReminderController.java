package com.mainproject.controller;

import com.mainproject.dto.PersonalReminderDto;
import com.mainproject.entity.PersonalReminder;
import com.mainproject.entity.Reminders;
import com.mainproject.service.PersonalReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/personalreminder")
public class PersonalReminderController {
    @Autowired
    private PersonalReminderService personalReminderService;
    public PersonalReminderController(PersonalReminderService personalReminderService) {
        super();
        this.personalReminderService = personalReminderService;
    }
    @PostMapping
    public String createReminder(@ModelAttribute("reminder") PersonalReminderDto registrationDto) {
        personalReminderService.save(registrationDto);
        return "redirect:/personalreminder?success";
    }
    @GetMapping
    public String showReminder() {
        return "personalreminder";
    }
    @ModelAttribute("reminder")
    public PersonalReminderDto PersonalReminderDto() {
        return new PersonalReminderDto();
    }
    @GetMapping("/getAll")
    public String getSamplePage(Model model) {
        // Add data to be displayed on the view
        model.addAttribute("list", personalReminderService.getAllReminders());
        return "plist";
    }
    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        PersonalReminder remiders = personalReminderService.getById(id);
        model.addAttribute("reminders", remiders);
        return "pupdate";
    }
    @GetMapping("/update")
    public String updateForm(@ModelAttribute("reminder") PersonalReminderDto registrationDto) {
        personalReminderService.save(registrationDto);
        return "redirect:/personalreminder/getAll";
    }

    @GetMapping("/deleteRemiders/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        personalReminderService.deleteViaId(id);
        return "redirect:/personalreminder/getAll";

    }
}
