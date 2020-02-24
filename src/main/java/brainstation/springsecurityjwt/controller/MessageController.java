package brainstation.springsecurityjwt.controller;

import brainstation.springsecurityjwt.model.Message;
import brainstation.springsecurityjwt.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("api/message")
@RestController
public class MessageController {
    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public void insertMessage(@RequestBody Message message){
        messageService.insertMessage(message);
    }

    @GetMapping
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }

    @GetMapping(path = "{id}")
    public Message findMessageById(@PathVariable("id") int id){
        return messageService.findMessageById(id);
    }

    @PutMapping
    public void updateMessage(@RequestBody Message message){
        messageService.updateMessage(message);
    }
}
