package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface StieltjesGammaRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 2, 2 };

  final public static IAST RULES = List(
    IInit(StieltjesGamma, SIZES),
    // StieltjesGamma(Undefined)=Undefined
    ISet(StieltjesGamma(Undefined),
      Undefined),
    // StieltjesGamma(0)=EulerGamma
    ISet(StieltjesGamma(C0),
      EulerGamma),
    // StieltjesGamma(0,a_):=-PolyGamma(0,a)
    ISetDelayed(StieltjesGamma(C0,a_),
      Negate(PolyGamma(C0,a))),
    // StieltjesGamma(Undefined,y_):=Undefined
    ISetDelayed(StieltjesGamma(Undefined,y_),
      Undefined),
    // StieltjesGamma(x_,Undefined):=Undefined
    ISetDelayed(StieltjesGamma(x_,Undefined),
      Undefined)
  );
}
