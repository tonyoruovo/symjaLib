package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules159 { 
  public static IAST RULES = List( 
IIntegrate(3181,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),CN1),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Integrate(Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),CN1),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),FreeQ(List(a,b,e,f),x))),
IIntegrate(3182,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),CN1D2),x_Symbol),
    Condition(Simp(Times(C1,EllipticF(Plus(e,Times(f,x)),Times(CN1,b,Power(a,CN1))),Power(Times(Sqrt(a),f),CN1)),x),And(FreeQ(List(a,b,e,f),x),GtQ(a,C0)))),
IIntegrate(3183,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),CN1D2),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(b,Sqr(Sin(Plus(e,Times(f,x)))),Power(a,CN1)))),Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),CN1D2)),Integrate(Power(Plus(C1,Times(b,Sqr(Sin(Plus(e,Times(f,x)))),Power(a,CN1))),CN1D2),x),x),And(FreeQ(List(a,b,e,f),x),Not(GtQ(a,C0))))),
IIntegrate(3184,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(e,Times(f,x))),Sin(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),Plus(p,C1)),Power(Times(C2,a,f,Plus(p,C1),Plus(a,b)),CN1)),x)),Dist(Power(Times(C2,a,Plus(p,C1),Plus(a,b)),CN1),Integrate(Times(Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),Plus(p,C1)),Simp(Subtract(Plus(Times(C2,a,Plus(p,C1)),Times(b,Plus(Times(C2,p),C3))),Times(C2,b,Plus(p,C2),Sqr(Sin(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(a,b),C0),LtQ(p,CN1)))),
IIntegrate(3185,Integrate(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),CN1D2)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),Not(IntegerQ(p))))),
IIntegrate(3186,Integrate(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,CN1)),Subst(Integrate(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Subtract(Plus(a,b),Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Subtract(m,C1)))))),
IIntegrate(3187,Integrate(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,CN1)),Subst(Integrate(Times(Power(x,m),Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(p)))),
IIntegrate(3188,Integrate(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Integrate(Times(Power(x,m),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),CN1D2)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),Not(IntegerQ(p))))),
IIntegrate(3189,Integrate(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(d,Plus(Times(C2,IntPart(Times(C1D2,Subtract(m,C1)))),C1)),Power(Times(d,Sin(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,Subtract(m,C1))))),Power(Times(f,Power(Sqr(Sin(Plus(e,Times(f,x)))),FracPart(Times(C1D2,Subtract(m,C1))))),CN1)),Subst(Integrate(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Subtract(Plus(a,b),Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m))))),
IIntegrate(3190,Integrate(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Integrate(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Subtract(m,C1)))))),
IIntegrate(3191,Integrate(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Integrate(Times(Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(p)))),
IIntegrate(3192,Integrate(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Integrate(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),Not(IntegerQ(p))))),
IIntegrate(3193,Integrate(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(d,Plus(Times(C2,IntPart(Times(C1D2,Subtract(m,C1)))),C1)),Power(Times(d,Cos(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,Subtract(m,C1))))),Power(Times(f,Power(Sqr(Cos(Plus(e,Times(f,x)))),FracPart(Times(C1D2,Subtract(m,C1))))),CN1)),Subst(Integrate(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m))))),
IIntegrate(3194,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sqr(Sin(Plus(e,Times(f,x)))),x))),Dist(Times(Power($s("ff"),Times(C1D2,Plus(m,C1))),Power(Times(C2,f),CN1)),Subst(Integrate(Times(Power(x,Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,$s("ff"),x)),p),Power(Power(Subtract(C1,Times($s("ff"),x)),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sqr(Sin(Plus(e,Times(f,x)))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Subtract(m,C1)))))),
IIntegrate(3195,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Integrate(Times(Power(Times(d,$s("ff"),x),m),Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,m),x),IntegerQ(p)))),
IIntegrate(3196,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Integrate(Times(Power(x,m),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),Not(IntegerQ(p))))),
IIntegrate(3197,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Sqr(Cos(Plus(e,Times(f,x)))),Times(C1D2,Plus(m,C1))),Power(Times(d,f,Power(Sin(Plus(e,Times(f,x))),Plus(m,C1))),CN1)),Subst(Integrate(Times(Power(Times($s("ff"),x),m),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m))))),
IIntegrate(3198,Integrate(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Integrate(Times(Power(Times(d,$s("ff"),x),n),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,n,p),x),IntegerQ(Times(C1D2,Subtract(m,C1)))))),
IIntegrate(3199,Integrate(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT),Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,CN1)),Subst(Integrate(Times(Power(Times(c,$s("ff"),x),m),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(n,C1))),Power(Subtract(Plus(a,b),Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,c,e,f,m,p),x),IntegerQ(Times(C1D2,Subtract(n,C1)))))),
IIntegrate(3200,Integrate(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(list(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(n,C1)),Power(f,CN1)),Subst(Integrate(Times(Power(x,n),Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,Plus(m,n)),p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n)),IntegerQ(p))))
  );
}
