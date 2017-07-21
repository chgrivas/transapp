package com.focus.service.service;

import com.focus.service.dto.PlayerRequestDto;

import java.util.UUID;

import com.focus.service.domain.Player;
import com.focus.service.dto.CreatePlayerResponseDto;

public interface PlayerService {

    CreatePlayerResponseDto createPlayer(PlayerRequestDto playerRequestDto);

    Player getPlayer(UUID playerUuid);
}
