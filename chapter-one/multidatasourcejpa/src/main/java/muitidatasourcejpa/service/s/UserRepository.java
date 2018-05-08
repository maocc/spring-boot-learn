package muitidatasourcejpa.service.s;

import muitidatasourcejpa.domain.s.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author maocc
 * @description
 * @date: 2018/5/7 17:58
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
