package brainstation.springsecurityjwt.dao;

import brainstation.springsecurityjwt.dto.AccountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AccountDao")
public interface AccountDao extends JpaRepository<AccountDto, Integer> {
}
