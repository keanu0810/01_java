package �ڹ�_���������ǽ�;

/*
 ĸ��ȭ
 String ����̸� �迵��
 int ���� 10
 ������ ��� �����
 toString ���
 
 PersonMain person.txt ����
 * */
public class Person {
	private String �̸�;
	private int ����;

//������
	public Person() {
		// TODO Auto-generated constructor stub
	}

//�ʼ�������
	public Person(String �̸�, int ����) {
		super();
		this.�̸� = �̸�;
		this.���� = ����;
	}

//Setter

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

//Getter
	public String get�̸�() {
		return �̸�;
	}

	public int get����() {
		return ����;
	}

	@Override
	public String toString() {
		return "Person [�̸�=" + �̸� + ", ����=" + ���� + ", toString()=" + super.toString() + "]";
	}

}
