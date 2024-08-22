package com.manytomany;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class MovieTicketService {

    @Autowired
    
    private MovieTicketRepository movieTicketRepository;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public MovieTicket saveMovieTicket(MovieTicketDto movieTicketDto) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setMovieName(movieTicketDto.getMovieName());

        Set<User> users = new HashSet();
        for (UserDto userDto : movieTicketDto.getUsers()) {
            User user = userRepository.findByName(userDto.getName())
                .orElseGet(() -> {
                    User newUser = new User();
                    newUser.setName(userDto.getName());
                    return userRepository.save(newUser);
                });
            users.add(user);
        }

        movieTicket.setUsers(users);
        return movieTicketRepository.save(movieTicket);
    }

    public Optional<MovieTicket> findMovieTicketById(Long id) {
        return movieTicketRepository.findById(id);
    }

}