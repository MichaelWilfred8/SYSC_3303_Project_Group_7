package Enums;

public enum FloorButtonDirection {
	DOWN(0),
	UP(1);
	
	private int value;
	
	private FloorButtonDirection (int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public String toString(){
		if (this.value == 0){
			return "DOWN";
		} else {
			return "UP";
		}
	}
	
	
	/**	
	 * Generates a byte value for the enum
	 * 
	 * @return	The byte value for this enum
	 */
	public byte getByte(){
		switch(this.value) {
			case 1:
				return 0x01;
			case 0:
				return 0x00;
			default:
				return (Byte) null; //TODO: edit this case to return a null different value?
		}
	}
	
	/**
	 * Converts a given byte value into an Enum of the same value
	 * 
	 * @param b	the byte to be converted
	 * @return a FloorButtonDirection enum that matches the byte parameter
	 */
	public FloorButtonDirection convertFromByte(byte b){
		switch(b){
			case 0x01:
				return UP;
			case 0x00:
				return DOWN;
			default:
				return null;
		}
	}
}
