package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface RoomDao extends JpaRepository<Room, Long>, RoomDaoCustom {
    List<Room> findByBuildingId(Long buildingId);
    Room findByName(String name);
}