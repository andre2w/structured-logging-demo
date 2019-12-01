package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Random;

import static net.logstash.logback.argument.StructuredArguments.kv;

@Service
public class LogGenerator {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    Random random = new Random();

    @Scheduled(fixedRate = 1000)
    public void test() {
        int amount = getRandomNumberInRange(50, 1000);
        int pence = getRandomNumberInRange(10, 99);
        LOGGER.info("New authorization made",
                kv("transaction", new Transaction("GBP123456", "GBP098765", new BigDecimal(amount +"."+ pence), "BNKBL")));
    }

    private int getRandomNumberInRange(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
