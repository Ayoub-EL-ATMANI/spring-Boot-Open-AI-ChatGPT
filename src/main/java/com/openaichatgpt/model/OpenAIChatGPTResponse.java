package com.openaichatgpt.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class OpenAIChatGPTResponse {

    private List<OpenAIChatGptChoice> choices;
}

