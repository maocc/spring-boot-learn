package com.maocc.mongodb.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author maocc
 * @description
 * @date: 2018/5/8 13:38
 */

public interface UserRepository extends MongoRepository<User, Long> {

	User findByUsername(String username);

}
