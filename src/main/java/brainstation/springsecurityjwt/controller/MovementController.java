package brainstation.springsecurityjwt.controller;

import brainstation.springsecurityjwt.model.Movement;
import brainstation.springsecurityjwt.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/movement")
@RestController
public class MovementController {

    private MovementService movementService;

    @Autowired
    public MovementController(MovementService movementService) {
        this.movementService = movementService;
    }

    @PostMapping
    public void insertMovement(@RequestBody Movement movement){
        movementService.insertMovement(movement);
    }

    @GetMapping(path = "{id}")
    public List<Movement> getMovementsByAccountId(@PathVariable("id") int id){
        return movementService.getMovementsByAccountId(id);
    }
}
