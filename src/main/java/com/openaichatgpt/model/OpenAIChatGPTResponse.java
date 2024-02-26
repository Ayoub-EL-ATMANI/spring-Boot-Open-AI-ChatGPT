package com.openaichatgpt.model;

import lombok.Data;

import java.util.List;

@Data
public class OpenAIChatGPTResponse {
    private List<OpenAIChatGptChoice> choices;
}

