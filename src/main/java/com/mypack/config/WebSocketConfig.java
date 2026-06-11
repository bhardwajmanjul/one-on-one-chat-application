package com.mypack.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig  implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        //topic/messages
        config.setApplicationDestinationPrefixes("/app");
        // /app/chat
        // server-side: @MessagingMapping("/chat)


    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")
                // यहाँ आपके नए रेंडर फ्रंटएंड का लिंक आएगा और साथ ही लोकलहोस्ट भी रहेगा ताकि आप लैपटॉप पर भी टेस्ट कर सकें
                .setAllowedOrigins("https://my-chat-frontend-0ltj.onrender.com", "http://localhost:5173")
                .withSockJS();
    }
    // /chat endpoint par connection apkaa establish hoga..

}
