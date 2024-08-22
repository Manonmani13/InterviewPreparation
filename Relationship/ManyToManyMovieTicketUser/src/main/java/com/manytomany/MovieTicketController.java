package com.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-tickets")
public class MovieTicketController {

    @Autowired
    private MovieTicketService movieTicketService;

    @PostMapping
    public MovieTicket createMovieTicket(@RequestBody MovieTicketDto movieTicket) {
        return movieTicketService.saveMovieTicket(movieTicket);
    }

    @GetMapping("/{id}")
    public MovieTicket getMovieTicketById(@PathVariable Long id) {
        return movieTicketService.findMovieTicketById(id).orElse(null);
    }

    // Other endpoints as needed
}