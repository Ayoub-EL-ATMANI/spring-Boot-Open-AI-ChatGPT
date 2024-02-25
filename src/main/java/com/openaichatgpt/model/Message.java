package com.openaichatgpt.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message implements Serializable {


    private static final long serialVersionUID = 2405172041950251807L;
    private String role;
    private String content;
}
