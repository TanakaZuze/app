package com.chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class ChatMessage {

    private Long chatId;
    private String sender;
    private String context;
}
