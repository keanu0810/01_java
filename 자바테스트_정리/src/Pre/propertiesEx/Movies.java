package Pre.propertiesEx;

public class Movies implements Comparable<Movies> {
	private String name;
	private int ����;
	private int ������;

//�޼���
	// �⺻������
	public Movies() {
		// TODO Auto-generated constructor stub
	}
	// �ʼ�������

	public Movies(String name, int ����, int ������) {
		super();
		this.name = name;
		this.���� = ����;
		this.������ = ������;
	}

	// Getter
	public String getName() {
		return name;
	}

	public int get����() {
		return ����;
	}

	public int get������() {
		return ������;
	}
	// Setter

	public void setName(String name) {
		this.name = name;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

	public void set������(int ������) {
		this.������ = ������;
	}

	// toString
	@Override
	public String toString() {
		return "name=" + name + ", ����=" + ���� + ", ������=" + ������ ;
	}

	// compareTo
@Override
public int compareTo(Movies o) {
	// TODO Auto-generated method stub
	return 0;
}
	}
