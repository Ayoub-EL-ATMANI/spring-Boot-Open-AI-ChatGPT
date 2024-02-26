# spring-Boot-Open-AI-ChatGPT.

This is an example of a Spring Boot 3.2.3 application developed using Java 17. The application utilizes the OpenAI ChatGPT API to facilitate interactive conversations and deliver information to users.

## Prerequisites

- Java 17: Make sure you have Java 17 installed.

## Getting Started

1. Clone the repository:

   git clone https://github.com/Ayoub-EL-ATMANI/spring-Boot-Open-AI-ChatGPT.git
   
   cd spring-Boot-Open-AI-ChatGPT

### Project Structure ###

   spring-Boot-Open-AI-ChatGPT/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.openaichatgpt/
│   │   │       ├── controller/
│   │   │       ├── service/
|   |   |       |   └── impl/
│   │   │       └── config
|   |   |       └── model
│   │   └── resources/
│   │       ├── application.properties
│   │       
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md

### configuration ###

you need to configure the OPEN_AI_KEY in application.properties , you can generate the key from this link https://platform.openai.com/api-keys  :

OPEN_AI_KEY=<YOUR_KEY>  

