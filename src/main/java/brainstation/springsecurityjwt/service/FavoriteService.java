package brainstation.springsecurityjwt.service;


import brainstation.springsecurityjwt.model.Favorite;

import java.util.List;

public interface FavoriteService {

    public void insertFavorite(Favorite favorite);
    public List<Favorite> getFavoritesByUserId(int id);
    public void deleteFavoriteById(int id);
}
