package de.lh39.checkstylesonarlinttemplate.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceTest {

  @Autowired
  TestService service;

  @Test
  void serviceReturnsDummyValue() {
    assertEquals("test", this.service.test());
  }
}