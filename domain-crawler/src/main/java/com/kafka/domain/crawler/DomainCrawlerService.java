package com.kafka.domain.crawler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.sql.SQLOutput;

@Service
public class DomainCrawlerService {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    private final String KAFKA_TOPIC="web-domains";

    public DomainCrawlerService(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void crawl(String name) {



       Mono<DomainList> domainListMono= WebClient.create()
                .get()
                .uri("https://api.domainsdb.info/v1/domains/search?domain="+name)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(DomainList.class);

       domainListMono.subscribe(domainsList->{
           domainsList.getDomains().forEach(domain -> {
               kafkaTemplate.send(KAFKA_TOPIC,domain);
               System.out.println("Domain mesaage"+domain.getDomain());
           });
       });
    }
}
