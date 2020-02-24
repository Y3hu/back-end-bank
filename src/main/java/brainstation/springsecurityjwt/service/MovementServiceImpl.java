package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.dao.MovementDao;
import brainstation.springsecurityjwt.dto.MovementDto;
import brainstation.springsecurityjwt.model.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovementServiceImpl implements MovementService{

    private MovementDao movementDao;

    @Autowired
    public MovementServiceImpl(@Qualifier("MovementDao") MovementDao movementDao) {
        this.movementDao = movementDao;
    }

    @Transactional
    @Override
    public void insertMovement(Movement movement) {

        if(movement.getAccount().getUser().getMessages() == null) movement.getAccount().getUser().setMessages(new ArrayList<>());
        if(movement.getAccount().getUser().getAccounts() == null) movement.getAccount().getUser().setAccounts(new ArrayList<>());
        if(movement.getAccount().getMovements() == null) movement.getAccount().setMovements(new ArrayList<>());

        movementDao.save(new MovementDto(movement));
    }

    @Transactional
    @Override
    public List<Movement> getMovementsByAccountId(int id) {
        List<MovementDto> movements = movementDao.findAll();
        List<Movement> accountMovements = new ArrayList<>();

        for(MovementDto m: movements){
            if(m.getAccount().getId() == id){
                Movement movement = new Movement(m);
                accountMovements.add(movement);
            }
        }
        return accountMovements;
    }
}
