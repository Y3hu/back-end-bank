package brainstation.springsecurityjwt.controller;

import brainstation.springsecurityjwt.model.User;
import brainstation.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/user")
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "{id}")
    public User findUserById(@PathVariable("id") int id){
        return userService.findUserById(id);
    }

    @GetMapping
    public User findUserByEmailAndPassword(@RequestParam("email") String email, @RequestParam("password") String password){
        return userService.findUserByEmailAndPassword(email, password);
    }

    @PostMapping
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
