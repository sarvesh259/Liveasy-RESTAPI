package com.liveasy.liveasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liveasy.liveasy.entities.Payload;

public interface payloaddao extends JpaRepository<Payload,Long> {

}
