package ncs4.test2;
//��
public class Fruit implements Comparable<Fruit> {
	//�ʵ�
	String name;
	int price;
	int quantuty;
	//�⺻������
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	//�μ������� ���ϸ� ���ϰ��� ����
	public Fruit(String name, int price, int quantuty) {
		super();
		this.name = name;
		this.price = price;
		this.quantuty = quantuty;
	}
	
	//toString
	@Override
	public String toString() {
		return " [name=" + name 
				+ ", price=" + price 
				+ ", quantuty=" + quantuty ;
			
	}
	
	@Override
	public int compareTo(Fruit ���Ϻ�) {
		return this.name.compareTo(name);
	}
	
}
