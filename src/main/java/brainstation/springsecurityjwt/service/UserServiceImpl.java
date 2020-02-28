package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.dao.UserDao;
import brainstation.springsecurityjwt.dto.UserDto;
import brainstation.springsecurityjwt.model.Account;
import brainstation.springsecurityjwt.model.Message;
import brainstation.springsecurityjwt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(@Qualifier("UserDao") UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public User findUserById(int id) {
       Optional<UserDto> userFound = userDao.findById(id);

       if(userFound.isPresent()){
           User user = new User(userFound.get());
           user.setMessages(userFound.get().getMessages().stream().map(Message::new).collect(Collectors.toList()));
           user.setAccounts(userFound.get().getAccounts().stream().map(Account::new).collect(Collectors.toList()));
           return user;
       }
       return null;
        //return userFound.map(User::new).orElse(null);

    }

    @Transactional
    @Override
    public void insertUser(User user){
        if(user.getMessages() == null) user.setMessages(new ArrayList<>());
        if(user.getAccounts() == null) user.setAccounts(new ArrayList<>());
        userDao.save(new UserDto(user));
    }

    @Transactional
    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        List<UserDto> usersList = userDao.findAll();
        for(UserDto u: usersList){
            if(u.getEmail().equals(email) && u.getPassword().equals(password)){
                return new User(u);
            }
        }

        return null;
    }

//    @Override
//    public List<User> getAllUsers() {
//        List<User> userList = new ArrayList<>();
//        List<UserDto> userDtoList= userDao.findAll();
//
//        for(UserDto u: userDtoList){
//            User user = new User(u);
//            userList.add(user);
//        }
//
//        return userList;
//    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.save(new UserDto(user));
    }
}
