package com.liveasy.liveasy.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liveasy.liveasy.dao.payloaddao;
import com.liveasy.liveasy.entities.Payload;
@Service
public class PayloadServiceImpl implements PayloadService {

	@Autowired
	private payloaddao loaddao;
	
	
	@Override
	public List<Payload> getPayload() {
		// TODO Auto-generated method stub
		return loaddao.findAll();
	}
	
	@Override
	public Optional<Payload> getthatPayload(Long loadId)
	{
		
		return loaddao.findById(loadId);
	}
	
	@Override
	public Payload addPayload(Payload pay)
	{
		loaddao.save(pay);
		return pay;
	}
	
	@Override
	public Payload updateLoad(Payload pay)
	{
		loaddao.save(pay);
		return pay;
	}
	
	@Override
	public void deleteLoad(Long loadId)
	{
		loaddao.deleteById(loadId);
	}

}
