package controller;

import dao.MessageDao;
import domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/message")
public class RestController {

    @Autowired
    private MessageDao messageDao;

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageDao.getMessages();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/test")
    public String getIt() {
        return "Tested OK!";
    }
}
