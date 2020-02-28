package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.model.User;

public interface UserService {

    public User findUserById(int id);
    public void insertUser(User user);
    public User findUserByEmailAndPassword(String email, String password);
    public void updateUser(User user);
}
