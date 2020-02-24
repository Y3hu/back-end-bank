package brainstation.springsecurityjwt.dao;

import brainstation.springsecurityjwt.dto.MovementDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MovementDao")
public interface MovementDao extends JpaRepository<MovementDto, Integer> {
}
