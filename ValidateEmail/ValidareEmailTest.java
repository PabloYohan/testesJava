package ValidateEmail;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidareEmailTest {
  @Test
  public void testValidaEmail() {
    assertEquals(true, ValidateEmail.validaEmail("pablo@gmail.com"));
    assertEquals(true, ValidateEmail.validaEmail("pablito.yhn@teste.br"));
    assertEquals(false, ValidateEmail.validaEmail("@teste.br"));
    assertEquals(false, ValidateEmail.validaEmail("pablo@com"));
  }
}
