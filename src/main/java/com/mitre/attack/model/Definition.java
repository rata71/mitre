package com.mitre.attack.model;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Definition {

  @Column(name = "statement", columnDefinition = "VARCHAR(100)")
  private String statement;
}
