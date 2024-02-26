package com.openaichatgpt.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OpenAIChatGPTRequest {

    private String model;
    private List<OpenAIMessage> messages;
    private int temperature;
    @JsonProperty("max_tokens")
    private int maxTokens;
}
