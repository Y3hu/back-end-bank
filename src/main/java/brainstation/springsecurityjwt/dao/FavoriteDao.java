package brainstation.springsecurityjwt.dao;

import brainstation.springsecurityjwt.dto.FavoriteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("FavoriteDao")
public interface FavoriteDao extends JpaRepository<FavoriteDto, Integer> {
}
