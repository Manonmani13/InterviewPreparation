package com.mainproject.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class PersonalReminderDto {

    private String message;

    private LocalDateTime startTime;

    private LocalDateTime endTime;



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public PersonalReminderDto(String message, LocalDateTime startTime, LocalDateTime endTime) {
        this.message = message;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public PersonalReminderDto() {
    }
}
