package org.matheclipse.core.visit;

import java.util.function.Function;
import org.matheclipse.core.eval.EvalAttributes;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IASTMutable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IPattern;
import org.matheclipse.core.interfaces.IPatternObject;
import org.matheclipse.core.interfaces.IPatternSequence;

/**
 * Replace all occurrences of expressions where the given <code>function.apply()</code> method
 * returns a non <code>F.NIL</code> value. The visitors <code>visit()</code> methods return <code>
 * F.NIL</code> if no substitution occurred.
 */
public class VisitorReplaceAllWithPatternFlags extends VisitorReplaceAll {
  // private boolean onlyNamedPatterns;

  public VisitorReplaceAllWithPatternFlags(Function<IExpr, IExpr> function) {
    super(function);
  }

  private IExpr visitPatternObject(IPatternObject element) {
    IExpr temp = fFunction.apply(element);
    if (temp.isPresent()) {
      if (temp.isOneIdentityAST1()) {
        return temp.first();
      }
    }
    return temp;
  }

  @Override
  public IExpr visit(IPattern element) {
    return visitPatternObject(element);
  }

  @Override
  public IExpr visit(IPatternSequence element) {
    return visitPatternObject(element);
  }

  @Override
  public IExpr visit(IASTMutable ast) {
    if (ast.isPatternMatchingFunction()) {
      return F.NIL;
    }

    int i = fOffset;
    int size = ast.size();
    IASTMutable result = F.NIL;
    while (i < size) {
      IExpr temp = ast.get(i).accept(this);
      if (temp.isPresent()) {
        // something was evaluated - return a new IAST:
        result = ast.setAtCopy(i++, temp);
        while (i < size) {
          temp = ast.get(i).accept(this);
          if (temp.isPresent()) {
            result.set(i, temp);
          }
          i++;
        }

        if (result.isAST()) {
          return EvalAttributes.simpleEval(result);
        }
        return result;
      }
      i++;
    }

    return F.NIL;
  }
}
