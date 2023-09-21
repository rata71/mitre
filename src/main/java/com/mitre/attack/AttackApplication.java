package com.mitre.attack;

import com.mitre.attack.exception.AttackException;
import com.mitre.attack.repository.ItemRepository;
import com.mitre.attack.service.impl.ItemServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class AttackApplication {

  @Autowired private ItemServiceImpl itemService;

  public static void main(String[] args) {
    SpringApplication.run(AttackApplication.class, args);
  }

  @PostConstruct
  void postConstruct() {
    try {
      log.info("PLEASE WAIT - LOADING DATA");
      itemService.loadData();
      log.info("LOADING DATA HAS FINISHED");
    } catch (AttackException ae) {
      log.error(ae.getMessage());
    }
  }
}
