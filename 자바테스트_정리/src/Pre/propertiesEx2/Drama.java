package Pre.propertiesEx2;

import Pre.propertiesEx.Movies;
//					implements
public class Drama implements Comparable<Movies>{
	private String name;
	private int ��ÿ���;
	private int ����;





//�޼���
	// Getter
	public String getName() {
		return name;
	}

	public int get��ÿ���() {
		return ��ÿ���;
	}

	public int get����() {
		return ����;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void set��ÿ���(int ��ÿ���) {
		this.��ÿ��� = ��ÿ���;
	}

	public void set����(int ����) {
		this.���� = ����;
	}
	
	// �⺻������
	public Drama() {
		// TODO Auto-generated constructor stub
	}
	
	// �ʼ�������

public Drama(String name, int ��ÿ���, int ����) {
	super();
	this.name = name;
	this.��ÿ��� = ��ÿ���;
	this.���� = ����;
}


	// toString
@Override
public String toString() {
	return "Drama [name=" + name + ", ��ÿ���=" + ��ÿ��� + ", ����=" + ���� + ", toString()=" + super.toString() + "]";
}
	
	// compareto
@Override
public int compareTo(Movies o) {
	
	return 0;
}
}
