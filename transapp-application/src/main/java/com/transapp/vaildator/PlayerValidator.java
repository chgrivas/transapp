package com.focus.service.vaildator;

import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.focus.service.dto.PlayerRequestDto;

public class PlayerValidator {

    public void validate(PlayerRequestDto playerRequestDto) throws NotFoundException {
        Optional.ofNullable(playerRequestDto).orElseThrow(() -> new NotFoundException());
    }
}
