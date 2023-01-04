import Math.Vector.Vector2;
import Math.Vector.Vector3;
import Math.Vector.Vector4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {
    Vector2 a = new Vector2(new float[] {2, 3});
    Vector2 b = new Vector2(new float[] {6, 7});

    Vector3 c = new Vector3(new float[] {3, 3, 4});
    Vector3 d = new Vector3(new float[] {7, 8, 7});

    Vector4 e = new Vector4(new float[] {0, 0, 9, 9});
    Vector4 f = new Vector4(new float[] {2, 7, 4, 9});


    @Test
    public void testForSumVectors2() {
        float[] actual = Vector2.sumVectors2(a, b);
        float[] expected = new float[] {8, 10};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSumVectors3() {
        float[] actual = Vector3.sumVectors3(c, d);
        float[] expected = new float[] {10, 11, 11};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSumVectors4() {
        float[] actual = Vector4.sumVectors4(e, f);
        float[] expected = new float[] {2, 7, 13, 18};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSubtractVectors2() {
        float[] actual = Vector2.subtractVectors2(a, b);
        float[] expected = new float[] {-4, -4};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSubtractVectors3() {
        float[] actual = Vector3.subtractVectors3(c, d);
        float[] expected = new float[] {-4, -5, -3};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSubtractVectors4() {
        float[] actual = Vector4.subtractVectors4(e, f);
        float[] expected = new float[] {-2, -7, 5, 0};

        assertArrayEquals(actual, expected);
    }

//    @Test
//    public void testForMultiplyVector2ToScalar() {
//        float[] actual = Vector2.multiplyVectors2ToScalar(a);
//        float[] expected = new float[] {10, 15};
//
//        assertArrayEquals(actual, expected);
//    }
//    @Test
//    public void testForMultiplyVector3ToScalar() {
//        float[] actual = Vector3.multiplyVectors3ToScalar(c);
//        float[] expected = new float[] {15, 15, 20};
//
//        assertArrayEquals(actual, expected);
//    }
//    @Test
//    public void testForMultiplyVector4ToScalar() {
//        float[] actual = Vector4.multiplyVectors4ToScalar(e);
//        float[] expected = new float[] {0, 0, 45, 45};
//
//        assertArrayEquals(actual, expected);
//    }
//
//    @Test
//    public void testForDivideVector2ToScalar() {
//        float[] actual = Vector2.divideVector2ByScalar(a);
//        float[] expected = new float[] {0.4F, 0.6F};
//
//        assertArrayEquals(actual, expected);
//    }
//    @Test
//    public void testForDivideVector3ToScalar() {
//        float[] actual = Vector3.divideVector3ByScalar(c);
//        float[] expected = new float[] {0.6F, 0.6F, 0.8F};
//
//        assertArrayEquals(actual, expected);
//    }
//    @Test
//    public void testForDivideVector4ToScalar() {
//        float[] actual = Vector4.divideVector4ByScalar(e);
//        float[] expected = new float[] {0, 0, 1.8F, 1.8F};
//
//        assertArrayEquals(actual, expected);
//    }

    @Test
    public void testForCountVector2Length() {
        float actual = Vector2.countVector2Length(a);
        float expected = 3.6055512F;

        assertEquals(actual, expected);
    }
    @Test
    public void testForCountVector3Length() {
        float actual = Vector3.countVector3Length(c);
        float expected = 5.8309519F;

        assertEquals(actual, expected);
    }
    @Test
    public void testForCountVector4Length() {
        float actual = Vector4.countVector4Length(e);
        float expected = 12.72792206F;

        assertEquals(actual, expected);
    }

    @Test
    public void testForNormalizeVector2() {
        float[] actual = Vector2.normalizeVector2(a);
        float[] expected = new float[] {0.4F, 0.6F};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForNormalizeVector3() {
        float[] actual = Vector3.normalizeVector3(c);
        float[] expected = new float[] {0.3F, 0.3F, 0.4F};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForNormalizeVector4() {
        float[] actual = Vector4.normalizeVector4(e);
        float[] expected = new float[] {0, 0, 0.5F, 0.5F};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForScalarMultiplyVectors2() {
        float actual = Vector2.scalarMultiplyVectors2(a, b);
        float expected = 33;

        assertEquals(actual, expected);
    }
    @Test
    public void testForScalarMultiplyVectors3() {
        float actual = Vector3.scalarMultiplyVectors3(c, d);
        float expected = 73;

        assertEquals(actual, expected);
    }
    @Test
    public void testForScalarMultiplyVectors4() {
        float actual = Vector4.scalarMultiplyVectors4(e, f);
        float expected = 117;

        assertEquals(actual, expected);
    }

    @Test
    public void testForVectorMultiplyVectors3() {
        float[] actual = Vector3.vectorMultiplyVectors3(c, d);
        float[] expected = new float[] {-11, 7, 3};

        assertArrayEquals(actual, expected);
    }
}