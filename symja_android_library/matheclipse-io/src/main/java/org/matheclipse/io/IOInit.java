package org.matheclipse.io;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.expression.S;
import org.matheclipse.gpl.numbertheory.BigIntegerPrimality;
import org.matheclipse.image.ImageInit;
import org.matheclipse.io.builtin.BioFunctions;
import org.matheclipse.io.builtin.DatasetFunctions;
import org.matheclipse.io.builtin.DynamicSwingFunctions;
import org.matheclipse.io.builtin.FileIOFunctions;
import org.matheclipse.io.builtin.SwingFunctions;

public class IOInit {
  public static void init() {
    // set for only small prime factorization
    // Config.PRIME_FACTORS = new Primality();

    // set for BigInteger prime factorization
    Config.PRIME_FACTORS = new BigIntegerPrimality();

    // initialize from module matheclipse-image:
    ImageInit.init();

    S.Import.setEvaluator(new org.matheclipse.io.builtin.Import());
    S.IntegerName.setEvaluator(new org.matheclipse.io.builtin.IntegerName());
    S.RemoveDiacritics.setEvaluator(new org.matheclipse.io.builtin.RemoveDiacritics());
    S.SemanticImport.setEvaluator(new org.matheclipse.io.builtin.SemanticImport());
    S.SemanticImportString.setEvaluator(new org.matheclipse.io.builtin.SemanticImportString());
    S.Transliterate.setEvaluator(new org.matheclipse.io.builtin.Transliterate());
    FileIOFunctions.initialize();
    DynamicSwingFunctions.initialize();
    SwingFunctions.initialize();
    DatasetFunctions.initialize();
    BioFunctions.initialize();

  }
}
