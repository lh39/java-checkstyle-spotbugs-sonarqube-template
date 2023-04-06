package de.lh39.checkstylesonarlinttemplate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

  @Test
  void contextLoads() {
    assertTrue(true);
  }

  @Test
  void mainTest() {
    Application.main(new String[] {});
  }

}
