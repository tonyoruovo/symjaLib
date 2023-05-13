package org.matheclipse.core.config;

import junit.framework.TestCase;
import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;
import org.apfloat.OverflowException;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.ApfloatNum;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IASTMutable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SystemConfigurationTest extends TestCase {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    F.initSymbols();
  }

  public void testApfloatStorage() {
    try {
      Apfloat apfloat = new Apfloat("9".repeat(1_000_000) + "." + "9".repeat(1_000_000));
      apfloat = ApfloatMath.pow(apfloat, new Apfloat("91212312" + ".1231236"));
      ApfloatNum apfloatNum = ApfloatNum.valueOf(apfloat);
      IInteger integerPart = apfloatNum.integerPart();
      System.out.println(integerPart.bitLength());
      fail("Should be fail");
    } catch (OverflowException e) {
      e.printStackTrace();
    }
  }

  public void testOverflowError() {
    String expr = "N(1.7*10^1,100)/N(2.5*10^1,100)*N(0,100)";
    ExprEvaluator evaluator = new ExprEvaluator();
    IExpr result = evaluator.eval(expr);
    assertEquals(result.toString(), "0");
  }

  public void testOverflowError02() {
    String expr = "ArcSin(N(1.7*10^1,100)/N(2.5*10^1,100)*N(0,100))";
    ExprEvaluator evaluator = new ExprEvaluator();
    IExpr result = evaluator.eval(expr);
    assertEquals(result.toString(), "0");
  }

  public void testDeterminePrecision() {
    ApfloatNum zero = ApfloatNum.valueOf(new Apfloat(new BigDecimal(BigInteger.ZERO), 30));
    ApfloatNum num = ApfloatNum.valueOf("1.7", 30);

    IASTMutable times = F.Times(num, zero);
    assertEquals(times.determinePrecision(), 30);
  }

}
