package Calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
  @Test
  public void testSoma() {
    assertEquals(5, Calculadora.soma(3, 2));
  }
}
