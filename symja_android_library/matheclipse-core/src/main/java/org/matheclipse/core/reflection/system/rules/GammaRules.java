package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface GammaRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 6, 3 };

  final public static IAST RULES = List(
    IInit(Gamma, SIZES),
    // Gamma(-5/2)=(-1)*1/15*8*Sqrt(Pi)
    ISet(Gamma(QQ(-5L,2L)),
      Times(QQ(-8L,15L),Sqrt(Pi))),
    // Gamma(-3/2)=1/3*4*Sqrt(Pi)
    ISet(Gamma(QQ(-3L,2L)),
      Times(QQ(4L,3L),Sqrt(Pi))),
    // Gamma(-1/2)=-2*Sqrt(Pi)
    ISet(Gamma(CN1D2),
      Times(CN2,Sqrt(Pi))),
    // Gamma(1/2)=Sqrt(Pi)
    ISet(Gamma(C1D2),
      Sqrt(Pi)),
    // Gamma(3/2)=Sqrt(Pi)/2
    ISet(Gamma(QQ(3L,2L)),
      Times(C1D2,Sqrt(Pi))),
    // Gamma(5/2)=1/4*3*Sqrt(Pi)
    ISet(Gamma(QQ(5L,2L)),
      Times(QQ(3L,4L),Sqrt(Pi))),
    // Gamma(a_,0):=ComplexInfinity/;Re(a)<0
    ISetDelayed(Gamma(a_,C0),
      Condition(CComplexInfinity,Less(Re(a),C0))),
    // Gamma(a_,0):=Gamma(a)/;Re(a)>0
    ISetDelayed(Gamma(a_,C0),
      Condition(Gamma(a),Greater(Re(a),C0))),
    // Gamma(a_,-1):=E*Subfactorial(-1+a)
    ISetDelayed(Gamma(a_,CN1),
      Times(E,Subfactorial(Plus(CN1,a)))),
    // Gamma(a_,Infinity):=0
    ISetDelayed(Gamma(a_,oo),
      C0),
    // Gamma(1/2,z_):=Sqrt(Pi)*Erfc(Sqrt(z))
    ISetDelayed(Gamma(C1D2,z_),
      Times(Sqrt(Pi),Erfc(Sqrt(z)))),
    // Gamma(-1/2,z_):=2/(E^z*Sqrt(z))-2*Sqrt(Pi)*Erfc(Sqrt(z))
    ISetDelayed(Gamma(CN1D2,z_),
      Plus(Times(C2,Power(Times(Power(E,z),Sqrt(z)),-1)),Times(CN2,Sqrt(Pi),Erfc(Sqrt(z))))),
    // Gamma(1,z_):=E^(-z)
    ISetDelayed(Gamma(C1,z_),
      Power(E,Negate(z)))
  );
}
