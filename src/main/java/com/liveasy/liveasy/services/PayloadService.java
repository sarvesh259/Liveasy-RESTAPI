package com.liveasy.liveasy.services;

import java.util.List;
import java.util.Optional;

import com.liveasy.liveasy.entities.Payload;
public interface PayloadService {

	public List<Payload> getPayload();
	public Optional<Payload> getthatPayload(Long loadId);
	public Payload addPayload(Payload pay);
	public Payload updateLoad(Payload pay);
	public void deleteLoad(Long loadId);
}
