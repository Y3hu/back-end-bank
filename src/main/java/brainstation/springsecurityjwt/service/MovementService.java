package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.model.Movement;

import java.util.List;

public interface MovementService {

    public void insertMovement(Movement movement);
    public List<Movement> getMovementsByAccountId(int id);
}
