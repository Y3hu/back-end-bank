package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.dao.MessageDao;
import brainstation.springsecurityjwt.dto.MessageDto;
import brainstation.springsecurityjwt.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {

    private MessageDao messageDao;

    @Autowired
    public MessageServiceImpl(@Qualifier("MessageDao") MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    @Transactional
    @Override
    public Message findMessageById(int id) {
        Optional<MessageDto> messageFound = messageDao.findById(id);
        return messageFound.map(Message::new).orElse(null);
    }

    @Transactional
    @Override
    public void insertMessage(Message message) {
        if (message.getUser().getMessages() == null || message.getUser().getAccounts() == null) {
            message.getUser().setMessages(new ArrayList<>());
            message.getUser().setAccounts(new ArrayList<>());
        }
        messageDao.save(new MessageDto(message));
    }

    @Transactional
    @Override
    public List<Message> getAllMessages() {
        List<Message> list = new ArrayList<>();

        for(MessageDto m: messageDao.findAll()){
            Message message = new Message(m);
            list.add(message);
        }

        return list;
    }

    @Transactional
    @Override
    public void updateMessage(Message message) {
        insertMessage(message);
    }
}
