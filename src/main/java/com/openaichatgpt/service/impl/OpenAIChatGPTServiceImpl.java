package com.openaichatgpt.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openaichatgpt.model.OpenAIChatGPTRequest;
import com.openaichatgpt.model.OpenAIChatGPTResponse;
import com.openaichatgpt.model.OpenAIMessage;
import com.openaichatgpt.service.OpenAIChatGPTService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Slf4j
public class OpenAIChatGPTServiceImpl implements OpenAIChatGPTService {


    private final WebClient webClient;

    private final ObjectMapper mapper;

    @Value("${OPEN_AI_KEY}")
    private String OPEN_AI_KEY;


    public OpenAIChatGPTServiceImpl(WebClient webClient, ObjectMapper objectMapper) {
        this.webClient = webClient;
        this.mapper = objectMapper;
    }

    @Override
    public String processAskingChatGPT(List<OpenAIMessage> messages) {

        OpenAIChatGPTRequest request = OpenAIChatGPTRequest.builder()
                .temperature(1)
                .model("gpt-3.5-turbo")
                .maxTokens(100)
                .messages(messages).build();

        try {
            Object response =  webClient.post()
                    .header("Content-Type", "application/json")
                    .header("Authorization","Bearer "+OPEN_AI_KEY)
                    .bodyValue(mapper.writeValueAsString(request))
                    .exchangeToMono(rs -> rs.bodyToMono(ParameterizedTypeReference.forType(Object.class))).block();

            log.info("response body : {}",mapper.writeValueAsString(response));

            OpenAIChatGPTResponse openAIChatGPTResponse = mapper.convertValue(response, new TypeReference<OpenAIChatGPTResponse>(){});
            return openAIChatGPTResponse.getChoices().get(0).getMessage().getContent();
        }catch (Exception e){
            log.warn("message : {}",e.getMessage());
            return "ERROR";
        }
    }
}
