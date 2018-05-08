package jpa.service;

import jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author maocc
 * @description
 * @date: 2018/5/7 13:53
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);

	User findByNameAndAge(String name, Integer age);

	@Query("select u from User u where u.name=:name")
	User findUser(@Param("name") String name);
}
