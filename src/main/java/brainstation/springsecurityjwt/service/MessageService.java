package brainstation.springsecurityjwt.service;

import brainstation.springsecurityjwt.model.Message;

import java.util.List;

public interface MessageService {

    public Message findMessageById(int id);
    public void insertMessage(Message message);
    public List<Message> getAllMessages();
    public void updateMessage(Message message);
}
