package me.zeph.example.spring.springcachewithredis.model;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Job implements Serializable {
  private long id;
  private String name;
  private double salary;
}
