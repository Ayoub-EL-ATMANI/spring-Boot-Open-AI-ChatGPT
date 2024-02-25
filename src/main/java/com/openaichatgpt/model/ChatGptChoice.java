package com.openaichatgpt.model;

import lombok.Data;

@Data
public class ChatGptChoice {
    private String text;
    private Message message;
}
