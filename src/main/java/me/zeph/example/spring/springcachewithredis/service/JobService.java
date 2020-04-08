package me.zeph.example.spring.springcachewithredis.service;

import me.zeph.example.spring.springcachewithredis.model.Job;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class JobService {

  @Cacheable("job")
  public Job getJob(long id) {
    return Job.builder().id(id).name("job").salary(10000).build();
  }
}
