package �ڹ�_���������ǽ�;

public class Circle {
	public static final double PI = 3.14;
	public double radius;

	public Circle(double radius) {

		this.radius = radius;
	}
//Getter Setter

	public static double getPi() {
		return PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("������" + radius + "cm�� ���� �׸��ϴ�.");
	}

	public static void main(String[] args) {
		Circle �� = new Circle(2.5);
		��.draw();
	}

}
