package com.openaichatgpt.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class OpenAIChatGPTRequest {

    private String model = "gpt-3.5-turbo";
    private List<Message> messages;
    private int temperature = 1;
    @JsonProperty("max_tokens")
    private int maxTokens = 100;
}
