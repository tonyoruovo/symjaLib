package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface StandardDeviationRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 2 };

  final public static IAST RULES = List(
    IInit(StandardDeviation, SIZES),
    // StandardDeviation(NormalDistribution()):=1
    ISetDelayed(StandardDeviation(NormalDistribution()),
      C1),
    // StandardDeviation(NormalDistribution(m_,s_)):=s
    ISetDelayed(StandardDeviation(NormalDistribution(m_,s_)),
      s)
  );
}
