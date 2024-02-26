package com.openaichatgpt.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OpenAIMessage {

    private String role;
    private String content;
}
