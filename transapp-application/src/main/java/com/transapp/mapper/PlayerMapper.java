package com.focus.service.mapper;

import java.util.UUID;

import com.focus.service.domain.Player;
import com.focus.service.dto.PlayerRequestDto;
import com.focus.service.dto.CreatePlayerResponseDto;

public class PlayerMapper {

    public Player convert(PlayerRequestDto playerRequestDto) {
        Player player = new Player();
        player.setUuid(UUID.randomUUID());
        player.setFirstname(playerRequestDto.getFirstname());
        player.setSurname(playerRequestDto.getSurname());
        player.setEmail(playerRequestDto.getEmail());
        player.setPassword(playerRequestDto.getPassword());
        player.setUsername(playerRequestDto.getUsername());
        return player;
    }

    public CreatePlayerResponseDto convert(Player player) {
        CreatePlayerResponseDto playerResponseDto = new CreatePlayerResponseDto();
        playerResponseDto.setId(player.getUuid());
        return playerResponseDto;
    }

    
}
