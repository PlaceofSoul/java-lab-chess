package chessPiece;

/*
 * @author robson
 */
public abstract class ChessPiece {

	 private int value;

	    /**
	     * Setting value for the pieces 
	     * @param value
	     */
	    public ChessPiece(int value){
	        this.setValue(value);
	    }

	    /**
	     * @return value
	     */
	    public int getValue() {
	        return value;
	    }

	    /**
	     * @param value
	     */
	    public void setValue(int value) {
	        this.value = value;
	    }

	    /**
	     * Print how the piece move 
	     */
	    public abstract void move();

	    /**
	     * @param o
	     * @return true if it's equals, false if not
	     */
	    @Override
	    public boolean equals(Object o) {
	        if(o != null) {
	            if(o == this){
	                return true;
	            }
	            if(!(o instanceof ChessPiece)){
	                return false;
	            }

	            ChessPiece piece = (ChessPiece) o;
	            return this.getValue() == piece.getValue();
	        }

	        return false;
	    }

	    /**
	     * @return hashCode
	     */
	    
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + this.getValue();
	        return result;
	    }

	    /**
	     * @return description about this piece
	     */
	    @Override
	    public String toString() {
	        return "ChessPiece";
	    }
}
