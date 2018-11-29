package com.meteergin.repository;

import org.springframework.data.repository.CrudRepository;
import com.meteergin.model.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}