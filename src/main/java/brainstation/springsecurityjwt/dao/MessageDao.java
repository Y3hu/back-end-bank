package brainstation.springsecurityjwt.dao;

import brainstation.springsecurityjwt.dto.MessageDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MessageDao")
public interface MessageDao extends JpaRepository<MessageDto, Integer> {
}
