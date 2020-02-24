package brainstation.springsecurityjwt.dao;

import brainstation.springsecurityjwt.dto.CardDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CardDao")
public interface CardDao extends JpaRepository<CardDto, Integer> {
}
