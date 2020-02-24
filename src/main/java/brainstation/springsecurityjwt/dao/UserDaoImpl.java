//package brainstation.springsecurityjwt.dao;
//
//import brainstation.springsecurityjwt.dto.UserDto;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository("UserDao")
//public class UserDaoImpl implements UserDao{
//
//    @Override
//    @Query("SELECT t FROM user t where t.id = :id")
//    public UserDto findUserById(int id) {
//        return null;
//    }
//
//    @Override
//    public List<UserDto> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<UserDto> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<UserDto> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public List<UserDto> findAllById(Iterable<Integer> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Integer integer) {
//
//    }
//
//    @Override
//    public void delete(UserDto userDto) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends UserDto> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//    }
//
//    @Override
//    public <S extends UserDto> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserDto> List<S> saveAll(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Optional<UserDto> findById(Integer integer) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends UserDto> S saveAndFlush(S s) {
//        return null;
//    }
//
//    @Override
//    public void deleteInBatch(Iterable<UserDto> iterable) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public UserDto getOne(Integer integer) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserDto> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends UserDto> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserDto> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserDto> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends UserDto> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends UserDto> boolean exists(Example<S> example) {
//        return false;
//    }
//}
