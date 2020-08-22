package org.matheclipse.core.builtin;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.BuiltInSymbol;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.expression.S;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IBuiltInSymbol;
import org.matheclipse.core.interfaces.IEvaluator;
import org.matheclipse.core.interfaces.IExpr;

public class SourceCodeFunctions {

	final static String GITHUB = "https://github.com/";
	final static String POM_PATH = "axkr/symja_android_library/blob/master/symja_android_library/matheclipse-core/";
	final static String SRC_PATH = "src/main/java/";

	/**
	 * Generated by class: <code>org.matheclipse.core.preprocessor.GithubSymjaFunctionLineNumber</code>
	 */
	public final static int[] LINE_NUMBER_OF_JAVA_CLASS = new int[] { //
			0, 0, 0, 128, 137, 146, 0, 0, 0, 155, //
			0, 0, 168, 178, 0, 0, 0, 0, 0, 0, 0, //
			187, 200, 136, 225, 362, 203, 0, 496, 403, 694, 47, //
			92, 137, 181, 0, 0, 0, 474, 0, 558, 145, 31, //
			44, 0, 98, 130, 719, 380, 0, 558, 633, 176, 200, //
			282, 358, 454, 551, 609, 694, 657, 740, 832, 907, 1050, //
			500, 80, 128, 333, 771, 567, 901, 188, 82, 35, 62, //
			0, 0, 0, 52, 0, 0, 0, 0, 0, 0, 1798, //
			0, 0, 65, 103, 133, 117, 1619, 250, 564, 466, 251, //
			400, 568, 663, 735, 109, 680, 244, 873, 80, 76, 32, //
			347, 1060, 98, 0, 0, 0, 0, 203, 247, 225, 207, //
			0, 793, 879, 918, 0, 971, 1060, 0, 0, 1806, 121, //
			172, 0, 0, 47, 0, 254, 0, 452, 92, 0, 161, //
			533, 0, 489, 64, 1019, 231, 538, 229, 1208, 170, 0, //
			1186, 0, 617, 1459, 1528, 275, 200, 1209, 580, 665, 643, //
			0, 1131, 297, 330, 117, 751, 144, 248, 268, 893, 0, //
			0, 0, 0, 1283, 0, 26, 450, 1375, 949, 63, 277, //
			1813, 0, 0, 1494, 1006, 1444, 321, 383, 1017, 1074, 720, //
			0, 0, 1545, 123, 49, 109, 171, 147, 0, 430, 876, //
			1820, 791, 23, 1037, 1370, 1172, 68, 1598, 165, 240, 1705, //
			1337, 1647, 1722, 139, 2775, 19, 764, 1442, 1861, 1069, 52, //
			0, 439, 165, 52, 16, 78, 127, 1217, 376, 0, 491, //
			455, 327, 0, 0, 1745, 1890, 1997, 2038, 1128, 1838, 1829, //
			308, 82, 835, 906, 931, 997, 0, 0, 0, 241, 1264, //
			265, 298, 1075, 1122, 0, 1409, 0, 0, 334, 0, 1181, //
			2887, 536, 31, 0, 0, 1232, 0, 105, 1351, 1392, 1271, //
			1447, 1378, 1357, 607, 1163, 2171, 2091, 0, 381, 13, 49, //
			0, 0, 747, 802, 0, 57, 1369, 1470, 78, 93, 55, //
			0, 75, 218, 333, 428, 555, 167, 188, 0, 1168, 1402, //
			387, 460, 530, 3055, 279, 1534, 410, 1644, 842, 491, 346, //
			0, 0, 1471, 1962, 260, 324, 22, 1362, 1873, 3193, 714, //
			3275, 36, 33, 0, 1733, 0, 2301, 1488, 1929, 2203, 2176, //
			2229, 2322, 1922, 2087, 1966, 0, 2273, 296, 0, 964, 92, //
			0, 1029, 0, 0, 36, 156, 1149, 480, 635, 1093, 2442, //
			299, 0, 1454, 728, 854, 0, 0, 480, 556, 0, 546, //
			2480, 2522, 966, 1522, 14, 1564, 655, 1663, 410, 427, 497, //
			2405, 53, 67, 2448, 726, 1627, 0, 138, 1387, 605, 63, //
			151, 137, 1751, 1555, 1820, 581, 2616, 2698, 0, 0, 0, //
			567, 0, 29, 69, 0, 2099, 2056, 513, 447, 467, 525, //
			2188, 125, 0, 217, 61, 267, 314, 384, 425, 0, 0, //
			0, 0, 1605, 1980, 0, 1712, 2753, 2351, 901, 0, 775, //
			821, 0, 2517, 1825, 1980, 724, 0, 15, 1829, 502, 1686, //
			1845, 714, 0, 0, 0, 0, 248, 790, 0, 21, 299, //
			0, 678, 681, 739, 0, 845, 2573, 987, 658, 1044, 585, //
			836, 1739, 1081, 1995, 2072, 0, 2148, 0, 2121, 0, 648, //
			0, 854, 1793, 0, 0, 338, 0, 2888, 0, 369, 447, //
			860, 357, 918, 297, 0, 0, 76, 14, 46, 15, 1117, //
			37, 2807, 77, 230, 132, 334, 1935, 899, 223, 788, 844, //
			19, 30, 959, 2004, 39, 1046, 0, 558, 0, 607, 675, //
			0, 722, 0, 762, 1989, 0, 0, 0, 0, 802, 2513, //
			842, 510, 2984, 658, 769, 0, 170, 248, 208, 712, 890, //
			0, 3478, 2556, 3580, 2180, 2448, 1869, 36, 3056, 742, 2040, //
			0, 1978, 2027, 3131, 2273, 2358, 155, 3247, 3325, 0, 0, //
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 71, //
			0, 330, 71, 2607, 2151, 2717, 0, 0, 176, 223, 33, //
			33, 32, 0, 0, 819, 2030, 2181, 2203, 998, 1138, 3625, //
			2419, 2149, 0, 271, 193, 2386, 2767, 0, 0, 2893, 459, //
			1881, 2221, 941, 987, 1004, 1073, 1184, 545, 977, 606, 2498, //
			0, 2539, 1853, 2609, 611, 2714, 2515, 69, 0, 0, 328, //
			3846, 3881, 75, 3987, 81, 1071, 671, 2951, 2999, 0, 86, //
			933, 0, 0, 2654, 28, 2745, 0, 382, 2283, 0, 0, //
			1003, 1210, 0, 3062, 2071, 0, 3378, 3125, 3210, 2341, 57, //
			29, 19, 0, 0, 0, 71, 451, 539, 1103, 24, 4136, //
			145, 2805, 3396, 2881, 0, 0, 0, 1257, 1316, 1402, 1462, //
			3279, 10, 3031, 3085, 0, 2961, 0, 3136, 2831, 943, 4363, //
			2925, 3206, 0, 0, 167, 0, 0, 661, 0, 2997, 0, //
			0, 0, 0, 2485, 0, 0, 0, 0, 747, 1557, 1676, //
			0, 1428, 58, 990, 1039, 3280, 0, 1289, 1335, 323, 0, //
			807, 3047, 19, 77, 0, 0, 4689, 0, 3513, 3741, 16, //
			1914, 1028, 3346, 3496, 0, 1062, 1489, 0, 0, 3639, 3669, //
			1083, 749, 1862, 2459, 2577, 0, 32, 27, 0, 0, 2717, //
			2958, 0, 4751, 16, 1256, 1300, 0, 2604, 2752, 2927, 3083, //
			3153, 3240, 3393, 3946, 3405, 880, 0, 3168, 3488, 1109, 4243, //
			4287, 4198, 0, 0, 4154, 4256, 3736, 3857, 3770, 3928, 1005, //
			0, 3950, 4006, 164, 4567, 93, 1377, 3112, 244, 0, 3222, //
			0, 1113, 3271, 4885, 236, 0, 299, 788, 5023, 2017, 1530, //
			1174, 1298, 20, 12, 59, 92, 170, 255, 306, 449, 5054, //
			4334, 4334, 4059, 0, 4421, 0, 0, 0, 1086, 0, 2058, //
			0, 0, 0, 221, 0, 0, 0, 0, 4455, 4678, 4755, //
			4899, 5005, 5172, 5077, 888, 2168, 5116, 3324, 5152, 0, 1389, //
			155, 3889, 1279, 0, 1380, 5246, 5319, 149, 1419, 0, 3405, //
			1198, 1242, 1449, 3473, 0, 3515, 3600, 3677, 0, 1588, 2230, //
			2381, 0, 5395, 5438, 0, 0, 0, 0, 1079, 1421, 1697, //
			1373, 323, 1508, 32, 120, 0, 4549, 4695, 1504, 133, 2487, //
			1246, 2657, 3499, 2760, 1356, 5242, 0, 0, 1537, 80, 1676, //
			1756, 2218, 0, 892, 978, 0, 0, 5537, 5606, 4760, 4211, //
			1139, 493, 2268, 2316, 5333, 0, 5367, 1508, 4348, 4454, 0, //
			0, 228, 325, 364, 401, 422, 457, 478, 513, 0, 551, //
			600, 678, 735, 333, 1539, 1619, 5396, 0, 133, 5666, 4534, //
			0, 43, 1600, 0, 4989, 4944, 138, 350, 0, 4801, 0, //
			5556, 2389, 1839, 1873, 0, 0, 1176, 772, 1234, 0, 5785, //
			198, 1671, 1745, 6144, 6329, 6375, 5985, 2883, 3026, 3803, 15, //
			645, 407, 539, 573, 428, 0, 795, 1929, 2027, 2593, 2420, //
			177, 100, 5103, 6071, 2575, 826, 866, 3606, 3633, 912, 928, //
			674, 3534, 3942, 0, 0, 6467, 3674, 2648, 2683, 0, 3744, //
			667, 0, 45, 51, 32, 0, 3918, 0, 1777, 0, 0, //
			0, 0, 4007, 2763, 5639, 6560, 1830, 360, 1548, 3908, 0, //
			4615, 0, 268, 4067, 1915, 1982, 2055, 997, 3957, 1267, 367, //
			4013, 0, 4296, 5860, 4077, 1317, 1199, 1264, 1326, 0, 5955, //
			954, 988, 1022, 1066, 0, 0, 2825, 2893, 0, 0, 1434, //
			1496, 2947, 0, 4139, 0, 1888, 0, 1699 };

	/**
	 * 
	 * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation in static
	 * initializer</a>
	 */
	private static class Initializer {

		private static void init() {
			S.FunctionURL.setEvaluator(new FunctionURL());
		}
	}

	private static class FunctionURL extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.arg1().isBuiltInSymbol()) {
				IBuiltInSymbol builtin = (IBuiltInSymbol) ast.arg1();
				String url = functionURL(builtin);
				if (url != null) {
					return F.stringx(url);
				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize(IAST ast) {
			return IOFunctions.ARGS_1_1;
		}
	}

	private static String buildURL(final Class<?> clazz, int line) {
		StringBuilder buf = new StringBuilder(512);
		buf.append(GITHUB);
		buf.append(POM_PATH);
		buf.append(SRC_PATH);
		String canonicalName = clazz.getCanonicalName();
		String packageName = clazz.getPackage().getName();
		String parentClass = canonicalName.substring(packageName.length() + 1);
		int index = parentClass.indexOf('.');
		if (index > 0) {
			parentClass = parentClass.substring(0, index);
		}
		String packagePath = packageName.replace('.', '/');
		buf.append(packagePath);
		buf.append('/');
		buf.append(parentClass);
		buf.append(".java#L");
		buf.append(line);
		return buf.toString();
	}

	public static String functionURL(IBuiltInSymbol builtin) {
		int ordinal = builtin.ordinal();
		if (ordinal > 0 && ordinal < LINE_NUMBER_OF_JAVA_CLASS.length) {
			int line = LINE_NUMBER_OF_JAVA_CLASS[ordinal];
			if (line > 0) {
				IEvaluator evaluator = builtin.getEvaluator();
				if (evaluator != null && evaluator != BuiltInSymbol.DUMMY_EVALUATOR) {
					Class<? extends IEvaluator> clazz = evaluator.getClass();
					return buildURL(clazz, line);
				}
			}
		}
		return null;
	}

	public static void initialize() {
		Initializer.init();
	}

	private SourceCodeFunctions() {

	}

}
