package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.patternmatching.Matcher;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface LogRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 18, 4 };

  final public static IAST RULES = List(
    IInit(Log, SIZES),
    // Log(Undefined)=Undefined
    ISet(Log(Undefined),
      Undefined),
    // Log(1)=0
    ISet(Log(C1),
      C0),
    // Log(E)=1
    ISet(Log(E),
      C1),
    // Log(E^x_?RealNumberQ):=x
    ISetDelayed(Log(Exp(PatternTest(x_,RealNumberQ))),
      x),
    // Log(E^x_Complex):=x+2*I*Pi*Floor((Pi-Im(x))/(2*Pi))
    ISetDelayed(Log(Exp($p(x,Complex))),
      Plus(x,Times(C2,CI,Pi,Floor(Times(Power(C2Pi,CN1),Subtract(Pi,Im(x))))))),
    // Log(E^I)=I
    ISet(Log(Exp(CI)),
      CI),
    // Log(1/E^I)=-I
    ISet(Log(Exp(CNI)),
      CNI),
    // Log(0.0)=Indeterminate
    ISet(Log(CD0),
      Indeterminate),
    // Log(0)=-Infinity
    ISet(Log(C0),
      Noo),
    // Log(I)=1/2*I*Pi
    ISet(Log(CI),
      Times(CC(0L,1L,1L,2L),Pi)),
    // Log(-I)=1/2*I*-Pi
    ISet(Log(CNI),
      Times(CC(0L,1L,-1L,2L),Pi)),
    // Log(GoldenRatio)=ArcCsch(2)
    ISet(Log(GoldenRatio),
      ArcCsch(C2)),
    // Log(1/2*(1+Sqrt(5)))=ArcCsch(2)
    ISet(Log(Times(C1D2,Plus(C1,CSqrt5))),
      ArcCsch(C2)),
    // Log(Infinity)=Infinity
    ISet(Log(oo),
      oo),
    // Log(-Infinity)=Infinity
    ISet(Log(Noo),
      oo),
    // Log(I*Infinity)=Infinity
    ISet(Log(DirectedInfinity(CI)),
      oo),
    // Log(-I*Infinity)=Infinity
    ISet(Log(DirectedInfinity(CNI)),
      oo),
    // Log(ComplexInfinity)=Infinity
    ISet(Log(CComplexInfinity),
      oo),
    // Log(a_,b_):=Log(b)/Log(a)
    ISetDelayed(Log(a_,b_),
      Times(Log(b),Power(Log(a),CN1))),
    // Log(a_,E):=1/Log(a)
    ISetDelayed(Log(a_,E),
      Power(Log(a),CN1)),
    // Log(a_,E^m_Integer):=m/Log(a)
    ISetDelayed(Log(a_,Exp($p(m, Integer))),
      Times(m,Power(Log(a),CN1))),
    // Log(a_,0):=-Infinity/Log(a)
    ISetDelayed(Log(a_,C0),
      Times(CN1,oo,Power(Log(a),CN1))),
    // Log(a_,1)=0
    ISet(Log(a_,C1),
      C0),
    // Log(a_,-1):=(I*Pi)/Log(a)
    ISetDelayed(Log(a_,CN1),
      Times(CI,Pi,Power(Log(a),CN1))),
    // Log(E,z_):=Log(z)
    ISetDelayed(Log(E,z_),
      Log(z)),
    // Log(1,z_)=ComplexInfinity
    ISet(Log(C1,z_),
      CComplexInfinity),
    // Log(-1,z_):=-I/Pi*Log(z)
    ISetDelayed(Log(CN1,z_),
      Times(CNI,Power(Pi,CN1),Log(z)))
  );
}
