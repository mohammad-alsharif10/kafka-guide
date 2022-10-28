package com.guide.kafkaproducer.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.guide.kafkaproducer.util.Constants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(Constants.EMPLOYEE_TOPIC)
                .partitions(6)
                .replicas(3)
                .build();
    }

//    @Bean
//    public NewTopic topic2() {
//        return TopicBuilder.name("test_replica_error")
//                .partitions(3)
//                .replicas(2)
//                .build();
//    }

//    @Bean
//    public ProducerFactory<String, String> producerFactory() {
//        return new DefaultKafkaProducerFactory<>(producerConfigs());
//    }

//    @Bean
//    public Map<String, Object> producerConfigs() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "pkc-6ojv2.us-west4.gcp.confluent.cloud:9092");
//        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        props.put(ProducerConfig.CLIENT_ID_CONFIG, "THE_PRODUCER_APPLICATION");
//        props.put(ProducerConfig.ACKS_CONFIG, "all");
//        props.put(ProducerConfig.LINGER_MS_CONFIG, 10000);
//
//        // See https://kafka.apache.org/documentation/#producerconfigs for more properties
//        return props;
//    }


//    @Bean
//    public KafkaTemplate<String, String> kafkaTemplate() {
//        return new KafkaTemplate<>(producerFactory());
//    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
