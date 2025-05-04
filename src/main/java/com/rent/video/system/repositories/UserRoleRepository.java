package com.rent.video.system.repositories;

import com.rent.video.system.model.RoleEntity;
import com.rent.video.system.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRoleRepository extends JpaRepository<RoleEntity, String> {

    Optional<RoleEntity> findByRolename(String rolename);
}
