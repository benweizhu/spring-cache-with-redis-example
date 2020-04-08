package me.zeph.example.spring.springcachewithredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringCacheWithRedisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCacheWithRedisApplication.class, args);
  }

}
