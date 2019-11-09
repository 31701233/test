package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuffixArrayTest {
	private int[] intArray2;
     @Test
        public void test00() throws Throwable {
            int[] intArray0 = new int[4];
            String string0 = "@?Z{";
            int[] intArray1 = new int[3];
            int int0 = 249;
            // Undeclared exception!
            try {
                SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray1);
                fail("Expecting exception: IllegalArgumentException");

            } catch (IllegalArgumentException e) {
                //
                // no message in exception (getMessage() returned null)
                //

            }
        }

        @Test
        public void test01() throws Throwable {
            int[] intArray0 = new int[4];
            intArray0[1] = 114;
            intArray0[2] = 1764;
            intArray0[3] = 413;
            SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray0);
            int[] intArray1 = new int[9];
            int int0 = 1;
            intArray1[0] = 0;
            intArray0[2] = 1;
            intArray1[2] = 413;
            intArray1[3] = 114;
            intArray1[4] = 413;
            intArray1[5] = 114;
            intArray1[6] = 1764;
            intArray1[7] = 1764;
            intArray1[8] = 1764;
            SuffixArray.sleq(intArray0, 1, intArray1, 0);
            SuffixArray.makeLCPArray(intArray1, intArray0, intArray1);
            // Undeclared exception!
            try {
                SuffixArray.makeSuffixArray(intArray0, intArray0, 1, (-1));
                fail("Expecting exception: ArrayIndexOutOfBoundsException");

            } catch (ArrayIndexOutOfBoundsException e) {
                //
                // 1
                //

            }
        }
                @Test
            public void test02() throws Throwable {
                int[] intArray0 = new int[8];
                SuffixArray.isSorted(intArray0, intArray0, 0);
                int int0 = 6;
                SuffixArray.isPermutation(intArray0, 6);
                // Undeclared exception!
                try {
                    SuffixArray.createSuffixArraySlow("", intArray0, intArray0);
                    fail("Expecting exception: IllegalArgumentException");

                } catch (IllegalArgumentException e) {
                    //
                    // no message in exception (getMessage() returned null)
                    //
                }
            }

            @Test
            public void test03() throws Throwable {
                int[] intArray0 = new int[4];
                intArray0[1] = 114;
                intArray0[2] = 1764;
                intArray0[3] = 413;
                SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray0);
                int[] intArray1 = new int[9];
                intArray1[0] = 1;
                intArray0[2] = 1;
                intArray1[2] = 413;
                intArray1[3] = 114;
                intArray1[4] = 413;
                intArray1[5] = 114;
                intArray1[6] = 1764;
                intArray1[7] = 1764;
                intArray1[8] = 1764;
                SuffixArray.sleq(intArray0, 1, intArray1, 0);
                SuffixArray.makeLCPArray(intArray1, intArray0, intArray1);
                SuffixArray.makeSuffixArray(intArray0, intArray0, 0, (-1));
            }
            @Test
            public void test06() throws Throwable {
                int[] intArray0 = new int[7];
                intArray0[0] = 0;
                intArray0[1] = 1;
                intArray0[2] = (-1557);
                intArray0[3] = (-2339);
                intArray0[4] = (-1366);
                intArray0[5] = 1;
                intArray0[6] = 0;
                SuffixArray.isPermutation(intArray0, 0);
                SuffixArray.isSorted(intArray0, intArray0, 0);
                // Undeclared exception!
                try {
                    SuffixArray.isSorted(intArray0, intArray0, 608);
                    fail("Expecting exception: ArrayIndexOutOfBoundsException");

                } catch (ArrayIndexOutOfBoundsException e) {
                    //
                    // -1557
                    //
                }
            }

            @Test
            public void test07() throws Throwable {
                int[] intArray0 = null;
                int int0 = 907;
                // Undeclared exception!
                try {
                    SuffixArray.isSorted((int[]) null, (int[]) null, 907);
                    fail("Expecting exception: NullPointerException");

                } catch (NullPointerException e) {
                    //
                    // no message in exception (getMessage() returned null)
                    //
                }
            }
            @Test
            public void test10() throws Throwable {
                int[] intArray0 = new int[4];
                int int0 = (-1);
                intArray0[0] = (-1);
                intArray0[1] = 2;
                intArray0[2] = (-1202);
                int int1 = 1543;
                intArray0[1] = 1543;
                SuffixArray.createSuffixArray("!ou", intArray0, intArray0);
                // Undeclared exception!
                try {
                    SuffixArray.makeSuffixArray(intArray0, intArray0, 256, (-4636));
                    fail("Expecting exception: NegativeArraySizeException");

                } catch (NegativeArraySizeException e) {
                    //
                    // no message in exception (getMessage() returned null)
                    //
                }
            }
             @Test
                public void test12() throws Throwable {
                    int[] intArray0 = new int[6];
                    intArray0[0] = 1288;
                    intArray0[1] = 0;
                    intArray0[2] = 1041;
                    intArray0[3] = (-1);
                    intArray0[4] = 256;
                    intArray0[5] = 0;
                    // Undeclared exception!
                    try {
                        SuffixArray.createSuffixArray("JmRx", intArray0, intArray0);
                        fail("Expecting exception: ArrayIndexOutOfBoundsException");

                    } catch (ArrayIndexOutOfBoundsException e) {
                        //
                        // 256
                        //
                    }
                }

                @Test
                public void test13() throws Throwable {
                    SuffixArray.computeLCP("X", "");
                }

                @Test(timeout = 4000)
                public void test14() throws Throwable {
                    int[] intArray0 = new int[2];
                    int int0 = (-2183);
                    intArray0[0] = (-2183);
                    int int1 = 256;
                    intArray0[1] = 256;
                    String string0 = "";
                    SuffixArray.printV(intArray0, "");
                    int int2 = 0;
                    int int3 = 2679;
                    // Undeclared exception!
                    SuffixArray.makeSuffixArray(intArray0, intArray0, 0, 2679);
                }

                @Test
                public void test15() throws Throwable {
                    int[] intArray0 = new int[5];
                    intArray0[0] = 0;
                    intArray0[1] = 0;
                    intArray0[2] = 0;
                    intArray0[3] = 0;
                    intArray0[4] = 196;
                    // Undeclared exception!
                    try {
                        SuffixArray.createSuffixArray((String) null, intArray0, intArray0);
                        fail("Expecting exception: NullPointerException");

                    } catch (NullPointerException e) {
                        //
                        // no message in exception (getMessage() returned null)
                        //
                    }
                }
                @Test
                public void test37() throws Throwable {
                    int[] intArray0 = new int[8];
                    intArray0[1] = 2;
                    intArray0[4] = (-1084);
                    intArray0[4] = (-2088);
                    intArray0[5] = 2;
                    intArray0[6] = (-1622);
                    intArray0[7] = (-1647);
                    SuffixArray.isSorted(intArray0, intArray0, 2);
                    // Undeclared exception!
                    try {
                        SuffixArray.isPermutation(intArray0, (-2906));
                        fail("Expecting exception: NegativeArraySizeException");

                    } catch (NegativeArraySizeException e) {
                        //
                        // no message in exception (getMessage() returned null)
                        //
                    }
                }


}
