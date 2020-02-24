package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.dao.CardDao;
import brainstation.springsecurityjwt.dto.CardDto;
import brainstation.springsecurityjwt.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    private CardDao cardDao;

    @Autowired
    public CardServiceImpl(@Qualifier("CardDao") CardDao cardDao) {
        this.cardDao = cardDao;
    }

    @Transactional
    @Override
    public void insertCard(Card card) {
        cardDao.save(new CardDto(card));
    }

    @Transactional
    @Override
    public List<Card> getCardsByUserId(int id) {
        List<CardDto> cardsList = cardDao.findAll();
        List<Card> userCards = new ArrayList<>();
        for(CardDto c: cardsList){
            if(c.getAccountId() == id){
                Card card = new Card(c);
                userCards.add(card);
            }
        }
        return userCards;
    }

    @Transactional
    @Override
    public void deleteCardById(int id) {
        cardDao.deleteById(id);
    }
}
