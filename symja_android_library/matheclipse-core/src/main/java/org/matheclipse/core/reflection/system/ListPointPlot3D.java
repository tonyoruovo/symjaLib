package org.matheclipse.core.reflection.system;

import org.matheclipse.core.eval.Errors;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.eval.util.OptionArgs;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** Plot a list of Points in 3 dimensions */
public class ListPointPlot3D extends AbstractEvaluator {
  public ListPointPlot3D() {}

  @Override
  public IExpr evaluate(final IAST ast, EvalEngine engine) {
    Errors.printExperimental(S.ListPointPlot3D);
    if (ast.argSize() > 0) {
      if (ast.argSize() > 1) {
        final OptionArgs options = new OptionArgs(ast.topHead(), ast, 2, engine);
        if (options.isInvalidPosition(1)) {
          return options.printNonopt(ast, 1, engine);
        }
        // IExpr colorFunction = options.getOption(S.ColorFunction);
        // if (colorFunction.isPresent()) {
        // // ... color function is set...
        // }
      }
      int[] dimension = ast.arg1().isMatrix(false);
      if (dimension != null) {
        // convert possible sparse array expression:
        IAST heightValueMatrix = (IAST) ast.arg1().normal(false);
        if (dimension[0] > 3) {
          if (dimension[1] == 3) {
            IASTAppendable pointList = F.mapList(heightValueMatrix, x -> x);
            // for (int i = 1; i < heightValueMatrix.size(); i++) {
            // IAST rowList = (IAST) heightValueMatrix.get(i);
            // pointList.append(rowList);
            // }
            IASTAppendable result = F.Graphics3D(F.Point(pointList));
            if (ast.argSize() > 1) {
              // add same options to Graphics3D
              result.appendAll(ast, 2, ast.size());
            }
            return result;
          } else if (dimension[1] > 3) {
            IASTAppendable pointList = F.ListAlloc(dimension[0] * dimension[1]);
            for (int i = 1; i < heightValueMatrix.size(); i++) {
              IAST rowList = (IAST) heightValueMatrix.get(i);
              for (int j = 1; j < rowList.size(); j++) {
                pointList.append(//
                    F.list(F.ZZ(i), F.ZZ(j), rowList.get(j)));
              }
            }
            IASTAppendable result = F.Graphics3D(F.Point(pointList));
            if (ast.argSize() > 1) {
              // add same options to Graphics3D
              result.appendAll(ast, 2, ast.size());
            }
            return result;
          }
        }

      }
    }
    return F.NIL;

  }

  @Override
  public void setUp(final ISymbol newSymbol) {}
}
