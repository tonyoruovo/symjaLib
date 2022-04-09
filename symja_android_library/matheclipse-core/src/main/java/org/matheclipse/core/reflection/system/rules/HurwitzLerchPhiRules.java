package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface HurwitzLerchPhiRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 1, 3 };

  final public static IAST RULES = List(
    IInit(HurwitzLerchPhi, SIZES),
    // HurwitzLerchPhi(0,1,1)=1
    ISet(HurwitzLerchPhi(C0,C1,C1),
      C1),
    // HurwitzLerchPhi(z_,s_,1):=PolyLog(s,z)/z
    ISetDelayed(HurwitzLerchPhi(z_,s_,C1),
      Times(Power(z,CN1),PolyLog(s,z))),
    // HurwitzLerchPhi(z_,0,a_):=1/(1-z)
    ISetDelayed(HurwitzLerchPhi(z_,C0,a_),
      Power(Subtract(C1,z),CN1)),
    // HurwitzLerchPhi(0,s_,a_):=a^(-s)
    ISetDelayed(HurwitzLerchPhi(C0,s_,a_),
      Power(a,Negate(s))),
    // HurwitzLerchPhi(z_,1,1):=-Log(1-z)/z
    ISetDelayed(HurwitzLerchPhi(z_,C1,C1),
      Times(CN1,Power(z,CN1),Log(Subtract(C1,z)))),
    // HurwitzLerchPhi(-1,s_,1):=(1-2^(1-s))*Zeta(s)
    ISetDelayed(HurwitzLerchPhi(CN1,s_,C1),
      Times(Subtract(C1,Power(C2,Subtract(C1,s))),Zeta(s))),
    // HurwitzLerchPhi(0,1,a_):=1/a
    ISetDelayed(HurwitzLerchPhi(C0,C1,a_),
      Power(a,CN1))
  );
}
