package chessPiece;
/*
 * @author robson
 */
public class Bishop {
	 /**
     * value = 3
     * @param value
     */
    public Bishop(int value) {
        super(value);
    }

    /**
     * Print move()
     */
    
    @Override
    public void move() {
        System.out.println("diagonally");
    }

    /**
     * @return description about this piece
     */
    
    @Override
    public String toString() {
        return "Bishop [move: diagonally]";
    }

}
