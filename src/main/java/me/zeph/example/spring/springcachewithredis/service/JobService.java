package me.zeph.example.spring.springcachewithredis.service;

import me.zeph.example.spring.springcachewithredis.model.Job;
import org.springframework.stereotype.Service;

@Service
public class JobService {
  public Job getJob(long id) {
    return Job.builder().id(id).name("job").salary(10000).build();
  }
}
