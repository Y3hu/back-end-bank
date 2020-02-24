package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.model.User;

import java.util.List;

public interface UserService {

    public User findUserById(int id);
    public void insertUser(User user);
    public List<User> getAllUsers();
    public void updateUser(User user);
}
