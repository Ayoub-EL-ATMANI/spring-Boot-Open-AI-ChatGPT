package com.openaichatgpt.model;

import lombok.Data;

@Data
public class OpenAIChatGptChoice {
    private String text;
    private Message message;
}
