package com.focus.service.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.focus.service.api.PlayerApi;
import com.focus.service.domain.Player;
import com.focus.service.dto.PlayerRequestDto;
import com.focus.service.dto.CreatePlayerResponseDto;
import com.focus.service.dto.GetPlayerResponseDto;
import com.focus.service.service.PlayerService;
import com.focus.service.vaildator.PlayerValidator;

@RestController
public class PlayerController implements PlayerApi {

    @Autowired
    PlayerService playerService;

    @Autowired
    PlayerValidator playerValidator;

	@Override
	public CreatePlayerResponseDto createPlayer(@RequestBody PlayerRequestDto playerRequestDto) throws NotFoundException {
	    playerValidator.validate(playerRequestDto);
	    return playerService.createPlayer(playerRequestDto);
	}

    @Override
    public GetPlayerResponseDto getPlayer(@PathVariable UUID playerUuid) {
        Player player = playerService.getPlayer(playerUuid);
        GetPlayerResponseDto getPlayerResponseDto = new GetPlayerResponseDto();
        getPlayerResponseDto.setFirstname(player.getFirstname());
        getPlayerResponseDto.setSurname(player.getSurname());
        getPlayerResponseDto.setEmail(player.getEmail());
        getPlayerResponseDto.setUsername(player.getUsername());
        getPlayerResponseDto.setPassword(player.getPassword());
        getPlayerResponseDto.setUuid(player.getUuid());

        System.out.println("here");
        
        return getPlayerResponseDto;
    }

}
