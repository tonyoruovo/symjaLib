package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface Hypergeometric2F1RegularizedRules {
  final public static IAST RULES = List(
    // Hypergeometric2F1Regularized(a_,b_,c_,0):=1/Gamma(c)
    ISetDelayed(Hypergeometric2F1Regularized(a_,b_,c_,C0),
      Power(Gamma(c),CN1)),
    // Hypergeometric2F1Regularized(a_,b_,b_,x_):=1/((1-x)^a*Gamma(a))
    ISetDelayed(Hypergeometric2F1Regularized(a_,b_,b_,x_),
      Power(Times(Power(Subtract(C1,x),a),Gamma(a)),CN1))
  );
}
