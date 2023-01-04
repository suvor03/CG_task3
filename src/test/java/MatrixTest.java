import Math.Matrix.Matrix3;
import Math.Matrix.Matrix4;
import Math.Vector.Vector3;
import Math.Vector.Vector4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MatrixTest {
    Matrix3 A = new Matrix3(new float[] {1, 1, 1, 2, 2, 2, 3, 3, 3});
    Matrix3 B = new Matrix3(new float[] {7, 7, 7, 8, 8, 8, 9, 9, 9});

    Matrix4 C = new Matrix4(new float[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4});
    Matrix4 D = new Matrix4(new float[] {5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8});

    Vector3 u = new Vector3(new float[] {8, 8, 7});
    Vector4 v = new Vector4(new float[] {8, 8, 7, 7});
    @Test
    public void testForSumMatrix3() {
        float[] actual = Matrix3.sumMatrix3(A, B);
        float[] expected = new float[] {8, 8, 8, 10, 10, 10, 12, 12, 12};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSumMatrix4() {
        float[] actual = Matrix4.sumMatrix4(C, D);
        float[] expected = new float[] {6, 6, 6, 6, 8, 8, 8, 8, 10, 10, 10, 10, 12, 12, 12, 12};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForSubtractMatrix3() {
        float[] actual = Matrix3.subtractMatrix3(A, B);
        float[] expected = new float[] {-6, -6, -6, -6, -6, -6, -6, -6, -6};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForSubtractMatrix4() {
        float[] actual = Matrix4.subtractMatrix4(C, D);
        float[] expected = new float[] {-4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForMultiplyMatrix3() {
        float[] actual = Matrix3.multiplyMatrix3(A, B);
        float[] expected = new float[] {24, 24, 24, 48, 48, 48, 72, 72, 72};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForMultiplyMatrix4() {
        float[] actual = Matrix4.multiplyMatrix4(C, D);
        float[] expected = new float[] {26, 26, 26, 26, 52, 52, 52, 52, 78, 78, 78, 78, 104, 104, 104, 104};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForMultiplyMatrix3ToVector3() {
        float[] actual = Matrix3.multiplyMatrix3ToVector3(A, u);
        float[] expected = new float[] {23, 46, 69};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForMultiplyMatrix4ToVector4() {
        float[] actual = Matrix4.multiplyMatrix4ToVector4(D, v);
        float[] expected = new float[] {150, 180, 210, 240};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForTransposeMatrix3() {
        float[] actual = Matrix3.transposeMatrix3(B);
        float[] expected = new float[] {7, 8, 9, 7, 8, 9, 7, 8, 9};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForTransposeMatrix4() {
        float[] actual = Matrix4.transposeMatrix4(C);
        float[] expected = new float[] {1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForCreateUnitMatrix3() {
        float[] actual = Matrix3.createUnitMatrix3();
        float[] expected = new float[] {1, 0, 0, 0, 1, 0, 0, 0, 1};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForCreateUnitMatrix4() {
        float[] actual = Matrix4.createUnitMatrix4();
        float[] expected = new float[] {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testForCreateNullMatrix3() {
        float[] actual = Matrix3.createNullMatrix3();
        float[] expected = new float[] {0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(actual, expected);
    }
    @Test
    public void testForCreateNullMatrix4() {
        float[] actual = Matrix4.createNullMatrix4();
        float[] expected = new float[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(actual, expected);
    }
}