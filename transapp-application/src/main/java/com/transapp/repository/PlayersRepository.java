package com.focus.service.repository;


import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.focus.service.domain.Player;

public interface PlayersRepository extends MongoRepository<Player, UUID> {
    
}
