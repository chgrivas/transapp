package com.focus.service.dto;

import java.util.UUID;

public class CreatePlayerResponseDto {

	private UUID uuid;

	public UUID getId() {
		return uuid;
	}

	public void setId(UUID uuid) {
		this.uuid = uuid;
	}
}
