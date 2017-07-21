package com.transapp.api;

import java.util.UUID;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.focus.service.dto.CreatePlayerResponseDto;
import com.focus.service.dto.GetPlayerResponseDto;
import com.focus.service.dto.PlayerRequestDto;

public interface TransactionManagementApi {

	@RequestMapping(method = RequestMethod.POST, value = "/transactions")
	CreatePlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto) throws NotFoundException;

	@RequestMapping(method = RequestMethod.GET, value = "/transactions")
	GetPlayerResponseDto getPlayer(UUID playerUuid);
}
