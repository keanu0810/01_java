package �ڹ�_���������ǽ�;

import java.io.Serializable;

/*
 ĸ��ȭ ��Ģ�� �°� �����ϱ�
 //�ʵ�
 String �����̸�;
 int ����;
 
 //�޼���
  //Getter
  //Setter
   �⺻������
   �ʼ�������
   @Override toString Ȱ���ؼ� ���ڿ� ����ϱ�
 */
public class Animal implements Serializable{

//�ʵ�
	private String ȣ����;
	private int ����;

//�⺻������	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

//�ʼ�������
	public Animal(String ȣ����, int ����) {
		super();
		this.ȣ���� = ȣ����;
		this.���� = ����;
	}

//Setter
	public void setȣ����(String ȣ����) {
		this.ȣ���� = ȣ����;
	}

	public void set����(int ����) {
		this.���� = ����;
	}

//Getter
	public String getȣ����() {
		return ȣ����;
	}

	public int get����() {
		return ����;
	}

//toString
	@Override
	public String toString() {
		return "Animal [ȣ����=" + ȣ���� + ", ����=" + ���� + ", toString()=" + super.toString() + "]";
	}

}
