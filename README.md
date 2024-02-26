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

### Rest API ###

1 - Post  ====>     http://localhost:8081/api/v1/asking-chat-gpt 

2 - the body example is  : 

{
    "messages": [
        {
            "role": "user",
            "content": " can you get the second Newton formula ?"
        }
    ]
}

response example is  :  


The second Newton formula, also known as Newton's second law of motion, states that the acceleration of an object is directly proportional to the net force acting on it and inversely proportional to its mass. Mathematically, it can be expressed as:
F = ma

Where:
F = net force acting on the object
m = mass of the object
a = acceleration of the object

This formula is one of the fundamental principles of classical mechanics and is crucial for understanding the motion of objects under
