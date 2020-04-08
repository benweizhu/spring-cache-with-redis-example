package me.zeph.example.spring.springcachewithredis.model;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Job {
  private long id;
  private String name;
  private double salary;
}
