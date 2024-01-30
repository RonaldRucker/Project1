
import student.TestCase;

/**
 * This class tests the methods of Rectangle class,
 * ensuring that they work as they should.
 * 
 * @author <your_name>
 * @version <version_no>
 */
public class RectangleTest extends TestCase {

    private Rectangle A;
    private Rectangle B;
  //  private Rectangle C;
  //  private Rectangle D;

    /**
     * Initializes a rectangle object to be used for the tests.
     */
    public void setUp() {
        A = new Rectangle(1, 2, 3, 4);
        B = new Rectangle(1, 2, 3, 4);
       // C = new Rectangle(4, 3, 2, 1);
       // D = new Rectangle(1, 2, 3, 4);
    }


    public void testRectangleCoord() {
        assertEquals(1, A.getxCoordinate());
        assertEquals(2, A.getyCoordinate());
        assertEquals(3, A.getWidth());
        assertEquals(4, A.getHeight());
    }


    public void testIntersect() {
        assertTrue(A.intersect(B));
    }

}