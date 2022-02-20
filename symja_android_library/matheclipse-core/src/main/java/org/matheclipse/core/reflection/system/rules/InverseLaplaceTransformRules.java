package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface InverseLaplaceTransformRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 9 };

  final public static IAST RULES = List(
    IInit(InverseLaplaceTransform, SIZES),
    // InverseLaplaceTransform(s_,s_,t_):=DiracDelta'(t)
    ISetDelayed(InverseLaplaceTransform(s_,s_,t_),
      $($(Derivative(C1),DiracDelta),t)),
    // InverseLaplaceTransform(1/s_,s_,t_):=1
    ISetDelayed(InverseLaplaceTransform(Power(s_,CN1),s_,t_),
      C1),
    // InverseLaplaceTransform(s_^n_?IntegerQ,s_,t_):=1/(t^(1+n)*(-1-n)!)/;n<-1
    ISetDelayed(InverseLaplaceTransform(Power(s_,PatternTest(n_,IntegerQ)),s_,t_),
      Condition(Times(Power(t,Subtract(CN1,n)),Power(Factorial(Subtract(CN1,n)),CN1)),Less(n,CN1))),
    // InverseLaplaceTransform(1/(a_+s_),s_,t_):=E^(-a*t)/;FreeQ(a,s)
    ISetDelayed(InverseLaplaceTransform(Power(Plus(a_,s_),CN1),s_,t_),
      Condition(Exp(Times(CN1,a,t)),FreeQ(a,s))),
    // InverseLaplaceTransform((a_+s_)^n_,s_,t_):=1/(t^(1+n)*E^(a*t)*Gamma(-n))/;FreeQ({a,n},s)
    ISetDelayed(InverseLaplaceTransform(Power(Plus(a_,s_),n_),s_,t_),
      Condition(Times(Power(t,Subtract(CN1,n)),Power(Times(Exp(Times(a,t)),Gamma(Negate(n))),CN1)),FreeQ(list(a,n),s))),
    // InverseLaplaceTransform(1/(a_?RealNumberQ+s_^2),s_,t_):=If(a>0,Sin(Sqrt(a)*t)/Sqrt(a),(-1+E^(2*Sqrt(-a)*t))/(E^(Sqrt(-a)*t)*2*Sqrt(-a)))
    ISetDelayed(InverseLaplaceTransform(Power(Plus(PatternTest(a_,RealNumberQ),Sqr(s_)),CN1),s_,t_),
      If(Greater(a,C0),Times(Power(a,CN1D2),Sin(Times(Sqrt(a),t))),Times(Power(Times(Exp(Times(Sqrt(Negate(a)),t)),C2,Sqrt(Negate(a))),CN1),Plus(CN1,Exp(Times(C2,Sqrt(Negate(a)),t)))))),
    // InverseLaplaceTransform(s_/(a_?NumberQ+s_^2),s_,t_):=Cos(Sqrt(a)*t)/;a>0
    ISetDelayed(InverseLaplaceTransform(Times(s_,Power(Plus(PatternTest(a_,NumberQ),Sqr(s_)),CN1)),s_,t_),
      Condition(Cos(Times(Sqrt(a),t)),Greater(a,C0))),
    // InverseLaplaceTransform(1/(a_^2+s_^2),s_,t_):=Sin(a*t)/a/;FreeQ(a,s)
    ISetDelayed(InverseLaplaceTransform(Power(Plus(Sqr(a_),Sqr(s_)),CN1),s_,t_),
      Condition(Times(Power(a,CN1),Sin(Times(a,t))),FreeQ(a,s))),
    // InverseLaplaceTransform(1/(-a_^2+s_^2),s_,t_):=(-1+E^(2*a*t))/(E^(a*t)*2*a)/;FreeQ(a,s)
    ISetDelayed(InverseLaplaceTransform(Power(Plus(Negate(Sqr(a_)),Sqr(s_)),CN1),s_,t_),
      Condition(Times(Power(Times(Exp(Times(a,t)),C2,a),CN1),Plus(CN1,Exp(Times(C2,a,t)))),FreeQ(a,s))),
    // InverseLaplaceTransform(s_/(a_^2+s_^2),s_,t_):=Cos(a*t)/;FreeQ(a,s)
    ISetDelayed(InverseLaplaceTransform(Times(s_,Power(Plus(Sqr(a_),Sqr(s_)),CN1)),s_,t_),
      Condition(Cos(Times(a,t)),FreeQ(a,s)))
  );
}
