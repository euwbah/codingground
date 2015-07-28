/**
 * Created by Matthew on 28/7/2015.
 */
public class Operator {
    public enum OperatorGroup {
        /**
         * 1st order; split by '.&nbsp;'.
         * f(x) | x[i] | . | x++ | x-- | new
         */
        Primary,
        /**
         * 2nd order; no split.
         * ++x | --x | !x | +x | -x
         */
        Unary,
        /**
         * 3rd order; split by all operators
         * * | / | %
         */
        Multiplicative,
        /**
         * 4th order; split by all operators
         * + | -
         */
        Additive,
        /**
         * 5th order; split by all operators
         * &lt | &lt= | &gt | &gt=
         */
        Relational,
        /**
         * 6th order; split by all operators
         * == | !=
         */
        Equatorial,
        /**
         * 7th order; split by all operators
         */
        ConditionalAND,
        /**
         * 8th order; split by all operators
         */
        ConditionalOR,
        /**
         * 9th order; split by all operators
         * condition ? true : false
         */
        Conditional,
        /**
         * 10th order; split by all operators. Right-associative
         * = | += | -= | *= | /= | %=
         */
        Assignement
    }
}
