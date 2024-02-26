package com.openaichatgpt.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OpenAIChatGPTAskingRequest implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;

    private transient List<OpenAIMessage> messages;
}