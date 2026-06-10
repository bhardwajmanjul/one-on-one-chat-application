package com.mypack.repositories;

import com.mypack.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room,String> {

    //Get room using room id
    @Query("{'roomId': ?0}")
    Room findByRoomId(String roomId);
}
