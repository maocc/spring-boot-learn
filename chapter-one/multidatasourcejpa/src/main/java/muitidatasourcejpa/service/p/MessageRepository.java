package muitidatasourcejpa.service.p;

import muitidatasourcejpa.domain.p.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author maocc
 * @description
 * @date: 2018/5/7 17:59
 */

public interface MessageRepository extends JpaRepository<Message, Long> {
}
