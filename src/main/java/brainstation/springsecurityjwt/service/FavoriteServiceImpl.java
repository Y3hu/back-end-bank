package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.dao.FavoriteDao;
import brainstation.springsecurityjwt.dto.FavoriteDto;
import brainstation.springsecurityjwt.model.Favorite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    private FavoriteDao favoriteDao;

    @Autowired
    public FavoriteServiceImpl(@Qualifier("FavoriteDao") FavoriteDao favoriteDao) {
        this.favoriteDao = favoriteDao;
    }

    @Override
    @Transactional
    public void insertFavorite(Favorite favorite) {
        favoriteDao.save(new FavoriteDto(favorite));
    }

    @Override
    @Transactional
    public List<Favorite> getFavoritesByUserId(int id) {
        List<FavoriteDto> userFavoritesList = favoriteDao.findAll();
        List<Favorite> list = new ArrayList<>();

        for (FavoriteDto f: userFavoritesList){
            if(f.getId() == id){
                Favorite favorite = new Favorite(f);
                list.add(favorite);
            }
        }

        return list;
    }

    @Override
    @Transactional
    public void deleteFavoriteById(int id) {
        favoriteDao.deleteById(id);
    }
}
