package com.mainproject.service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.mainproject.dto.ReminderDto;
import com.mainproject.entity.Reminders;
import com.mainproject.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReminderService {
	@Autowired
	private ReminderRepository reminderRepo;
	public Reminders save(ReminderDto reminderDto) {
		Reminders reminder = new Reminders();
		reminder.setName(reminderDto.getName());
		reminder.setMessage(reminderDto.getMessage());
		reminder.setDate(reminderDto.getDate());
		return reminderRepo.save(reminder);
	}
	public List<Reminders> getAllReminders()
    {
        return reminderRepo.findAll();
    }
	  public Reminders getById(Long id)
	    {
	        Optional<Reminders> optional = reminderRepo.findById(id);
	        Reminders employee = null;
	        if (optional.isPresent())
	        	reminderRepo.deleteById(id);
	        else
	            throw new RuntimeException(
	                "Remider not found for id : " + id);
	        return employee;
	    }
 
     public void deleteViaId(long id)
    {
    	 reminderRepo.deleteById(id);
    }
     public String checkIfBirthdayToday() {
         LocalDate today = LocalDate.now();
         List<Reminders> usersWithBirthdayToday = reminderRepo.findByDate(today);
         
         if (!usersWithBirthdayToday.isEmpty()) {
             // Construct and return a message indicating the birthdays
             StringBuilder message = new StringBuilder("Today is the birthday of: ");
             for (Reminders user : usersWithBirthdayToday) {
                 message.append(user.getName()).append(", ");
             }
             return message.toString();
         } else {
             return null; // No birthdays today
         }
     }
}
