package telran.measure;

public enum LengthUnit {
MM(1), CM(10), IN(25.4f), M(1000),KM(1_000_000);
	float value;
	LengthUnit(float value) {
		this.value = value;
	}
	public Length between(Length l1, Length l2) {
		//TODO
		//returns Length object as length between l1 and l2 in "this" units
		return null;
	}
	//TODO methods TBD
	
	
}