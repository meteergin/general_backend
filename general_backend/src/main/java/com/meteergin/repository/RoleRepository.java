package com.meteergin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meteergin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
