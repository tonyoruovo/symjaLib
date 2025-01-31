package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface PolyGammaRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 8, 2 };

  final public static IAST RULES = List(
    IInit(PolyGamma, SIZES),
    // PolyGamma(0,-5/2)=46/15-EulerGamma-Log(4)
    ISet(PolyGamma(C0,QQ(-5L,2L)),
      Plus(QQ(46L,15L),Negate(EulerGamma),Negate(Log(C4)))),
    // PolyGamma(0,1)=-EulerGamma
    ISet(PolyGamma(C0,C1),
      Negate(EulerGamma)),
    // PolyGamma(-1,1)=0
    ISet(PolyGamma(CN1,C1),
      C0),
    // PolyGamma(-1,0)=Infinity
    ISet(PolyGamma(CN1,C0),
      oo),
    // PolyGamma(1,1)=Pi^2/6
    ISet(PolyGamma(C1,C1),
      Times(QQ(1L,6L),Sqr(Pi))),
    // PolyGamma(1,1/4)=Pi^2+8*Catalan
    ISet(PolyGamma(C1,C1D4),
      Plus(Times(C8,Catalan),Sqr(Pi))),
    // PolyGamma(1,3/4)=-8*Catalan+Pi^2
    ISet(PolyGamma(C1,QQ(3L,4L)),
      Plus(Times(CN8,Catalan),Sqr(Pi))),
    // PolyGamma(2,5/6)=4*Sqrt(3)*Pi^3-182*Zeta(3)
    ISet(PolyGamma(C2,QQ(5L,6L)),
      Plus(Times(C4,CSqrt3,Power(Pi,C3)),Times(ZZ(-182L),Zeta(C3)))),
    // PolyGamma(0,n_Integer):=-EulerGamma+HarmonicNumber(-1+n)/;n>0
    ISetDelayed(PolyGamma(C0,$p(n, Integer)),
      Condition(Plus(Negate(EulerGamma),HarmonicNumber(Plus(CN1,n))),Greater(n,C0))),
    // PolyGamma(Undefined,y_):=Undefined
    ISetDelayed(PolyGamma(Undefined,y_),
      Undefined),
    // PolyGamma(x_,Undefined):=Undefined
    ISetDelayed(PolyGamma(x_,Undefined),
      Undefined)
  );
}
