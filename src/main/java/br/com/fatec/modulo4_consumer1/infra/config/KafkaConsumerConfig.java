package br.com.fatec.modulo4_consumer1.infra.config;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
public class KafkaConsumerConfig {

    @Bean
    public Logger logger() {
        return org.slf4j.LoggerFactory.getLogger("Consumer1Logger");
    }

    @Bean
    public JsonDeserializer<?> jsonDeserializer() {
        JsonDeserializer<Object> deserializer = new JsonDeserializer<>();
        deserializer.addTrustedPackages("*");
        deserializer.setRemoveTypeHeaders(true);
        deserializer.setUseTypeHeaders(false);
        return deserializer;
    }
}
