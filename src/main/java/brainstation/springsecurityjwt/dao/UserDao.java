package brainstation.springsecurityjwt.dao;

import brainstation.springsecurityjwt.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public interface UserDao extends JpaRepository<UserDto, Integer> {

}
