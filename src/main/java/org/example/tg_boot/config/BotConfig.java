package org.example.tg_boot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Data
@Configuration
@PropertySource("config.properties")
public class BotConfig {

    @Value("${bot.name}")
    String botName;
    @Value("${bot.token}")
    String token;
    @Value("${bot.chatId}")
    String chatId;
}
