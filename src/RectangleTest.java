
import student.TestCase;

/**
 * This class tests the methods of Rectangle class,
 * ensuring that they work as they should.
 * 
 * @author <your_name>
 * @version <version_no>
 */
public class RectangleTest extends TestCase {


    /**
     * Initializes a rectangle object to be used for the tests.
     */
    public void setUp() {
        Rectangle rec = new Rectangle(1,2,3,4);
    }

    // TODO: implement tests
    public void testDimensions() {
        assertEquals(rec.getxCoordinate(), 1);
    }
    
}
