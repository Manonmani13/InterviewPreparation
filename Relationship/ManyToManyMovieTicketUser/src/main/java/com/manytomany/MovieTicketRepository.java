package com.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTicketRepository extends JpaRepository<MovieTicket, Long> {
}