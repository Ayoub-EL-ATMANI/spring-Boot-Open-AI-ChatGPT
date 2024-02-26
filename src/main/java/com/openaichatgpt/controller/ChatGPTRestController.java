package com.openaichatgpt.controller;

import com.openaichatgpt.model.OpenAIChatGPTAskingRequest;
import com.openaichatgpt.service.OpenAIChatGPTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class ChatGPTRestController {

    private OpenAIChatGPTService chatGPTService;

    public ChatGPTRestController(OpenAIChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping("/asking-chat-gpt")
    public String searchChatGPT(@RequestBody OpenAIChatGPTAskingRequest request) {
        return chatGPTService.processAskingChatGPT(request.getMessages());
    }

}