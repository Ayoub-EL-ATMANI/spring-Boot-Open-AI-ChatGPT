package com.openaichatgpt.service;

import com.openaichatgpt.model.OpenAIMessage;

import java.util.List;

public interface OpenAIChatGPTService {

    String processAskingChatGPT(List<OpenAIMessage> messages);
}
