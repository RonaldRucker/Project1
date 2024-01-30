
/**
 * This class holds the coordinates and dimensions of a rectangle and methods to
 * check if it intersects or has the same coordinates as an other rectangle.
 * 
 * @author CS Staff
 * 
 * @version 2024-01-22
 */
public class Rectangle {
    // the x coordinate of the rectangle
    private int xCoordinate;
    // the y coordinate of the rectangle
    private int yCoordinate;
    // the distance from the x coordinate the rectangle spans
    private int width;
    // the distance from the y coordinate the rectangle spans
    private int height;

    /**
     * Creates an object with the values to the parameters given in the
     * xCoordinate, yCoordinate, width, height
     * 
     * @param x
     *            x-coordinate of the rectangle
     * @param y
     *            y-coordinate of the rectangle
     * @param w
     *            width of the rectangle
     * @param h
     *            height of the rectangle
     */
    public Rectangle(int x, int y, int w, int h) {
        xCoordinate = x;
        yCoordinate = y;
        width = w;
        height = h;
    }


    /**
     * Getter for the x coordinate
     *
     * @return the x coordinate
     */
    public int getxCoordinate() {
        return xCoordinate;
    }


    /**
     * Getter for the y coordinate
     *
     * @return the y coordinate
     */
    public int getyCoordinate() {
        return yCoordinate;
    }


    /**
     * Getter for the width
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Getter for the height
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Checks if the invoking rectangle intersects with rec.
     * 
     * @param r2
     *            Rectangle parameter
     * @return true if the rectangle intersects with rec, false if not
     */
    public boolean intersect(Rectangle r2) {
        
        private int x2 = r2.getxCoordinate();
        private int y2 = r2.getyCoordinate();
        private int w2 = r2.getWidth();
        private int h2 = r2.getHeight();
        if ((xCoordinate + width < x2 || xCoordinate > x2 + w2) 
            && (yCoordinate > y2 + h2 || yCoordinate + height < y2))
        {
            return false;
        }
        return true;

    }

    /**
     * 
     */

    /**
     * Checks, if the invoking rectangle has the same coordinates as rec.
     * 
     * @param rec
     *            the rectangle parameter
     * @return true if the rectangle has the same coordinates as rec, false if
     *         not
     */
    public boolean equals(Object rec) {
        if (rec.getClass() != this.getClass())
        {
            return false;
        }
        else if(rec.getxCoordinate() != this.getxCoordinate() ||
                rec.getxCoordinate() != this.getxCoordinate() ||
                rec.getHeight() != this.getHeight() ||
                rec.getWidth() != this.getWidth()) 
        {
            return false;
        }
        return true;
    }


    /**
     * Outputs a human readable string with information about the rectangle
     * which includes the x and y coordinate and its height and width
     * 
     * @return a human readable string containing information about the
     *         rectangle
     */
    public String toString() {
        return xCoordinate + ", " +
               yCoordinate + ", " + 
               height + ", " + 
               width + ")";
    }


    /**
     * Checks if the rectangle has invalid parameters
     * 
     * @return true if the rectangle has invalid parameters, false if not
     */
    public boolean isInvalid() {
        if (this.getHeight() == 0 || 
            this.getWidth() == 0 ||
            this.getxCoordinate() == 0 ||
            this.getyCoordinate() == 0) {
        return true;
        }
        return false;
    }
}
