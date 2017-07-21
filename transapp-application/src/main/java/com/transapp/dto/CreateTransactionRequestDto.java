package com.transapp.dto;

import java.util.UUID;

public class CreateTransactionRequestDto {

	private UUID uuid;

	public UUID getId() {
		return uuid;
	}

	public void setId(UUID uuid) {
		this.uuid = uuid;
	}
}
