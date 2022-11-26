package com.example.demo2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.model.EventModel;

public interface EventDataAccess extends JpaRepository<EventModel, Integer> {

}
