package com.kfc.api;

import org.springframework.boot.SpringApplication;

public class TestKfcApplication {

  public static void main(String[] args) {
    SpringApplication.from(KfcApplication::main).with(TestcontainersConfiguration.class).run(args);
  }
}
