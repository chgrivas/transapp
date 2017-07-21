package com.focus.service.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.focus.service.domain.Player;
import com.focus.service.dto.PlayerRequestDto;
import com.focus.service.dto.CreatePlayerResponseDto;
import com.focus.service.mapper.PlayerMapper;
import com.focus.service.repository.PlayersRepository;

public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayersRepository repository;
    
    @Autowired
    private PlayerMapper playerMapper;
    
    public CreatePlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto) {
        Player player = playerMapper.convert(playerRequestDto);
        System.out.println(player.getFirstname());
        repository.save(player);
        return playerMapper.convert(player);
    }

    @Override
    public Player getPlayer(UUID playerUuid) {
        return repository.findOne(playerUuid);
    }
}
