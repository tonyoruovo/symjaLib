package org.matheclipse.io.builtin;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.builtin.StringFunctions;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.eval.util.OptionArgs;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IASTAppendable;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.FEConfig;

public class FileIOFunctions {
  /**
   * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation
   * in static initializer</a>
   */
  private static class Initializer {

    private static void init() {
      if (!Config.FUZZY_PARSER) {
        S.FileNames.setEvaluator(new FileNames());
      }
    }
  }

  private static final class FileNames extends AbstractCoreFunctionEvaluator {
    @Override
    public IExpr evaluate(final IAST ast, EvalEngine engine) {
      try {
        if (ast.isAST0()) {
          String userDirectory = Paths.get("").toAbsolutePath().toString();
          File sourceLocation = new File(userDirectory);
          final String[] files = sourceLocation.list();
          if (files != null) {
            IASTAppendable result = F.ListAlloc(files.length);
            for (int i = 0; i < files.length; i++) {
              result.append(files[i]);
            }
            return result;
          }
          return F.CEmptyList;
        }
        if (ast.size() == 2) {
          IExpr arg1 = engine.evaluate(ast.arg1());
          if (arg1.isList()) {
            return ((IAST) arg1).mapThread(ast, 1);
          }

          boolean ignoreCase = false;
          if (ast.size() > 2) {
            final OptionArgs options = new OptionArgs(ast.topHead(), ast, 2, engine, true);
            IExpr option = options.getOption(S.IgnoreCase);
            if (option.isTrue()) {
              ignoreCase = true;
            }
          }

          java.util.regex.Pattern pattern =
              StringFunctions.toRegexPattern(arg1, true, ignoreCase, ast, engine);
          if (pattern == null) {
            return F.NIL;
          }
          String userDirectory = Paths.get("").toAbsolutePath().toString();
          File sourceLocation = new File(userDirectory);
          final String[] files = sourceLocation.list();
          if (files != null) {
            IASTAppendable result = F.ListAlloc(files.length);
            for (int i = 0; i < files.length; i++) {
              java.util.regex.Matcher matcher = pattern.matcher(files[i]);
              if (matcher.matches()) {
                result.append(files[i]);
              }
            }
            return result;
          }
          return F.CEmptyList;
        }
      } catch (InvalidPathException ipex) {
        if (FEConfig.SHOW_STACKTRACE) {
          ipex.printStackTrace();
        }
      }
      return F.CEmptyList;
    }

    @Override
    public int[] expectedArgSize(IAST ast) {
      return ARGS_0_3;
    }

    @Override
    public void setUp(ISymbol newSymbol) {
      newSymbol.setAttributes(ISymbol.HOLDALL);
    }
  }

  public static void initialize() {
    Initializer.init();
  }

  private FileIOFunctions() {}
}
