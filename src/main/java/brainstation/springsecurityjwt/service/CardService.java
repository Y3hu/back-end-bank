package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.model.Card;

import java.util.List;

public interface CardService {

    public void insertCard(Card card);
    public List<Card> getCardsByUserId(int id);
    public void deleteCardById(int id);

}
