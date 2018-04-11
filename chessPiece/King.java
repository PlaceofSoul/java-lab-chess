package chessPiece;
/*
 * @author robson
 */
public class King {
	
	 /**
     * value = 1000
     * @param value
     */
	
    public King(int value) {
        super(value);
    }

    /**
     * Print how the piece move
     */
    
    @Override
    public void move() {
        System.out.println("one square");
    }

    /**
     * @return description about this piece
     */
    
    @Override
    public String toString() {
        return "King [move: one square]";
    }

}
