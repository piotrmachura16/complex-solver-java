/**
 * Written by: Piotr Machura
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import parser.main.Parser;

/**
 * Test simple parser cases - no variables, just reduction of numerical values *
 * Results were checked using Wolfram Mathematica v12.1
 */
public class TestParserNoVariables {

    @Test
    public void testParserNoVariables_1() {
        String f_z = "1+j";
        assertEquals(1, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(1, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_2() {
        String f_z = "1+j*3";
        assertEquals(1, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(3, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_3() {
        String f_z = "(1+j)*3";
        assertEquals(3, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(3, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_4() {
        String f_z = "(1+2j)*3";
        assertEquals(3, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(6, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_5() {
        String f_z = "(1+2j)^3";
        assertEquals(-11, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(-2, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_6() {
        String f_z = "(1-2j)^3";
        assertEquals(-11, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(2, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_7() {
        String f_z = "ln((1-2j)^3)";
        assertEquals(2.41416, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(2.96174, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_8() {
        String f_z = "log((1-2j)^3)";
        assertEquals(1.04846, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(1.28627, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_9() {
        String f_z = "sqrt((1-2j)^3)";
        assertEquals(0.300283, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(3.33019, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_10() {
        String f_z = "sin((2*3-2j)^0.5)";
        assertEquals(0.662856, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(0.327118, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_11() {
        String f_z = "cos((3/2-2j)^0.5)";
        assertEquals(0.196581, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(0.758133, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_12() {
        String f_z = "tan((3/2-2j)^(1+j))";
        assertEquals(0.0354331, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(-0.0695134, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_13() {
        String f_z = "tan((3/2-2j)^(1-j))";
        assertEquals(-0.118284, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(-0.764827, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_14() {
        String f_z = "2*sinh((3/2-2j)^(1+j))";
        assertEquals(553.55, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(-38.555, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_15() {
        String f_z = "(2+j)*cosh((3/2-2j)^(j+2j))";
        assertEquals(2.84705e6, Parser.eval(f_z).getComplexValue().getRe(), 1e2);
        assertEquals(1.8104e6, Parser.eval(f_z).getComplexValue().getIm(), 1e2);
    }

    @Test
    public void testParserNoVariables_16() {
        String f_z = " ((2+j)^2)/tanh((3/2-2j)^(j+2j))";
        assertEquals(-3, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(-4, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_17() {
        String f_z = " ((2+j)^2) -asin((3/2-2j)^(j+2j))";
        assertEquals(4.1774, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(0.525645, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_18() {
        String f_z = " ((2+j)^2) + acos((3/2-2j)^(5+2j))";
        assertEquals(5.80389, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(11.1292, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_19() {
        String f_z = " ((2+j)/2) + atan((3/2-2j)^(5/2j))";
        assertEquals(0.934827, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(0.426161, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_20() {
        String f_z = " e^(acos((3/2-2j)^(5+2j)))";
        assertEquals(10.945, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(12.3591, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

    @Test
    public void testParserNoVariables_21() {
        String f_z = " e^(acos((3/2-2j)^(pi)))";
        assertEquals(-16.7372, Parser.eval(f_z).getComplexValue().getRe(), 0.001);
        assertEquals(-7.66505, Parser.eval(f_z).getComplexValue().getIm(), 0.001);
    }

}