package telran.measure;

public class Length implements Comparable<Length>{
	private float amount;
	private LengthUnit lengthUnit;
	
	public Length(float amount, LengthUnit lengthUnit) {
		this.amount = amount;
		this.lengthUnit = lengthUnit;
	}
	
	@Override	
	public boolean equals(Object obj) {
		return compareTo((Length)obj) == 0;
	}

	@Override
	
	public int compareTo(Length o) {
		return Float.compare(getAmount(), o.convert(lengthUnit).getAmount());
	}
	
	public Length convert(LengthUnit unit) {
		return new Length(getAmount() * getUnit().getValue() / unit.value, unit);
	}
	@Override
	
	public String toString() {
		return String.valueOf(getAmount()) + getUnit();
	}

	public float getAmount() {
		return amount;
	}

	public LengthUnit getUnit() {
		return lengthUnit;
	}
	
	
}