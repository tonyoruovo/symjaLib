package org.matheclipse.core.eval.exception.sympy;

import org.matheclipse.core.eval.exception.FlowControlException;

public class ValueError extends FlowControlException {
  public ValueError(String message) {
    super(message);
  }
}
