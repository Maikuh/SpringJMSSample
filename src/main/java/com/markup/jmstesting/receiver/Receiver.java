package com.markup.jmstesting.receiver;

import com.markup.jmstesting.models.ChatMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "chat", containerFactory = "myFactory")
    public void receiveMessage(ChatMessage message) {
        System.out.println("Received <" + message + ">");
    }
}
