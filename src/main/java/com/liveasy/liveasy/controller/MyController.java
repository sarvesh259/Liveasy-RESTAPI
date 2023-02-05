package com.liveasy.liveasy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.liveasy.entities.Payload;
import com.liveasy.liveasy.services.PayloadService;

@RestController
public class MyController {
	@Autowired
	private PayloadService payloadService;
	
	@GetMapping("/load")
	public List<Payload> getPayload()
	{
		return this.payloadService.getPayload();
	}
	@GetMapping("/load/{loadId}")
	public Optional<Payload> getthatPayload(@PathVariable Long loadId) {
		return this.payloadService.getthatPayload(loadId);
	}
	
	@PostMapping("/load")
	public Payload addPayload(@RequestBody Payload pay){
		return this.payloadService.addPayload(pay);
	}
	
	@PutMapping("/load")
	public Payload updateLoad(@RequestBody Payload pay) {
		return this.payloadService.updateLoad(pay);
	}
	
	@DeleteMapping("/load/{loadId}")
	public void deleteLoad(@PathVariable Long loadId) {
		this.payloadService.deleteLoad(loadId);
	}
}
