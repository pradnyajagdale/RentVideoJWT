package com.rent.video.system.repositories;

import com.rent.video.system.model.RoleEntity;
import com.rent.video.system.model.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VideoRepository extends JpaRepository<VideoEntity, String> {

    @Modifying
    @Transactional
    @Query("UPDATE VideoEntity v SET v.director = :director WHERE v.title = :title")
    public int updateVideo(@Param("title") String title, @Param("director") String director);

    @Query("DELETE FROM VideoEntity v WHERE v.title = :title")
    public int deleteVideo(@Param("title") String title);
}
