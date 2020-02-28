package brainstation.springsecurityjwt.controller;

import brainstation.springsecurityjwt.model.Favorite;
import brainstation.springsecurityjwt.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/favorite")
@RestController
public class FavoriteController {
    private FavoriteService favoriteService;

    @Autowired
    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

    @PostMapping
    public void insertFavorite(@RequestBody Favorite favorite){
        favoriteService.insertFavorite(favorite);
    }

    @GetMapping(path = "{id}")
    public List<Favorite> getFavoritesByUserId(@RequestParam("id") int id){
        return favoriteService.getFavoritesByUserId(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteFavoriteById(@RequestParam("id") int id){
        favoriteService.deleteFavoriteById(id);
    }

}
