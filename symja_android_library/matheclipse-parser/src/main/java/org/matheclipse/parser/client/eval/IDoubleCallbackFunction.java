/*
 * Copyright 2005-2008 Axel Kramer (axelclk@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.matheclipse.parser.client.eval;

import org.matheclipse.parser.client.ast.FunctionNode;

/**
 * A call back function which could be used in <code>DoubleEvaluator</code>, for evaluating
 * user-defined functions.
 */
@FunctionalInterface
public interface IDoubleCallbackFunction {
  public double evaluate(DoubleEvaluator engine, FunctionNode function, double[] args);
}
