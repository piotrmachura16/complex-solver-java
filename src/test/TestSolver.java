/**
 * Made by: Piotr Machura
 */
package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import algorithm.Solver;
import algorithm.Solver.Accuracy;
import parser.function.Complex;

/**
 * Test Solver with simple functions. Note that "expected" arrays are sorted in
 * ascending order according to method described in Complex.compareTo()
 * function. Test for each function is conducted 3 times at each accuracy level
 * to ensure the right amount of significant digits.
 *
 * Results were checked using Wolfram Mathematica v12.1
 */

public class TestSolver {
    static final int range = 5;

    @Test
    public void testSolver_1() {
        String f_z = "z";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_2() {
        String f_z = "z";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_3() {
        String f_z = "z";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_4() {
        String f_z = "sin(z)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(-Math.PI, 0), new Complex(0, 0), new Complex(Math.PI, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_5() {
        String f_z = "sin(z)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(-Math.PI, 0), new Complex(0, 0), new Complex(Math.PI, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_6() {
        String f_z = "sin(z)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(-Math.PI, 0), new Complex(0, 0), new Complex(Math.PI, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_7() {
        String f_z = "e^z";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_8() {
        String f_z = "e^z";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_9() {
        String f_z = "e^z";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_10() {
        String f_z = "e^z-1";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_11() {
        String f_z = "e^z-1";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_12() {
        String f_z = "e^z-1";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_13() {
        String f_z = "z-i";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(0, 1) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_14() {
        String f_z = "z-i";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(0, 1) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_15() {
        String f_z = "z-i";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(0, 1) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_16() {
        String f_z = "z^2+z-i";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(-1.30024, -0.624811), new Complex(0.300243, 0.624811) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_17() {
        String f_z = "z^2+z-i";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(-1.30024, -0.624811), new Complex(0.300243, 0.624811) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_18() {
        String f_z = "z^2+z-i";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(-1.30024, -0.624811), new Complex(0.300243, 0.624811) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_19() {
        String f_z = "z^3-e^z";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(-0.554392, -0.619406), new Complex(-0.554392, 0.619406),
                new Complex(1.85718, 0), new Complex(4.5364, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_20() {
        String f_z = "z^3-e^z";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(-0.554392, -0.619406), new Complex(-0.554392, 0.619406),
                new Complex(1.85718, 0), new Complex(4.5364, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_21() {
        String f_z = "z^3-e^z";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(-0.554392, -0.619406), new Complex(-0.554392, 0.619406),
                new Complex(1.85718, 0), new Complex(4.5364, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_22() {
        String f_z = "ln(z-i)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(1, 1) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_23() {
        String f_z = "ln(z-i)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(1, 1) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_24() {
        String f_z = "ln(z-i)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(1, 1) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_25() {
        String f_z = "ln(z^2-3*i)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(-1.44262, -1.03978), new Complex(1.44262, 1.03978) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_26() {
        String f_z = "ln(z^2-3*i)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(-1.44262, -1.03978), new Complex(1.44262, 1.03978) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_27() {
        String f_z = "ln(z^2-3*i)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(-1.44262, -1.03978), new Complex(1.44262, 1.03978) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_28() {
        String f_z = "1/z";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_29() {
        String f_z = "1/z";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_30() {
        String f_z = "1/z";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_31() {
        String f_z = "1/sin(z)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_32() {
        String f_z = "1/sin(z)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_33() {
        String f_z = "1/sin(z)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_34() {
        String f_z = "1/cos(z)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_35() {
        String f_z = "1/cos(z)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_36() {
        String f_z = "1/cos(z)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_37() {
        String f_z = "z/(e^z)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_38() {
        String f_z = "z/(e^z)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_39() {
        String f_z = "z/(e^z)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_40() {
        String f_z = "z/sin(z)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_41() {
        String f_z = "z/sin(z)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_42() {
        String f_z = "z/sin(z)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_43() {
        String f_z = "z/z^2";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_44() {
        String f_z = "z/z^2";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_45() {
        String f_z = "z/z^2";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = {};

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    // ! Does not pass
    @Test
    public void testSolver_46() {
        String f_z = "z/cos(z)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    // ! Does not pass
    @Test
    public void testSolver_47() {
        String f_z = "z/cos(z)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_48() {
        String f_z = "z/cos(z)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_49() {
        String f_z = "z/(e^z-e)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_50() {
        String f_z = "z/(e^z-e)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_51() {
        String f_z = "z/(e^z-e)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(5, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

    @Test
    public void testSolver_52() {
        String f_z = "z/(sin(z)-0.1)";
        Accuracy acc = Accuracy.LOW;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.001);
        }
    }

    @Test
    public void testSolver_53() {
        String f_z = "z/(sin(z)-0.1)";
        Accuracy acc = Accuracy.MED;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(range, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.0001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.0001);
        }
    }

    @Test
    public void testSolver_54() {
        String f_z = "z/(sin(z)-0.1)";
        Accuracy acc = Accuracy.HIGH;
        Complex[] expected = { new Complex(0, 0) };

        ArrayList<Complex> solutions = Solver.solve(5, f_z, acc);
        assertEquals(expected.length, solutions.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i].getRe(), solutions.get(i).getRe(), 0.00001);
            assertEquals(expected[i].getIm(), solutions.get(i).getIm(), 0.00001);
        }
    }

}