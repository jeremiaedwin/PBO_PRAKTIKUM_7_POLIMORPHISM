package studi_kasus_2;

abstract class Shape {
	private String shapeName;
	
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}
	public abstract double area();
	public String toString() {
		return "Shape Name : " + shapeName;
	}
}
