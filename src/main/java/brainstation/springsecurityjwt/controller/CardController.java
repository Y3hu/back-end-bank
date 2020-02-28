package brainstation.springsecurityjwt.controller;

import brainstation.springsecurityjwt.model.Card;
import brainstation.springsecurityjwt.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/card")
@RestController
public class CardController {
    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping
    public Card insertCard(@RequestBody Card card){
        return cardService.insertCard(card);
    }

    @GetMapping(path = "{id}")
    public List<Card> getCardsByUserId(@PathVariable("id") int id){
        return cardService.getCardsByUserId(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCardById(@PathVariable("id") int id){
        cardService.deleteCardById(id);
    }
}
