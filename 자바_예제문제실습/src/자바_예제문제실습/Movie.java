package �ڹ�_���������ǽ�;

public class Movie {
	private String ��ȭ����;
	private String ��ȭ�帣;
	
	//�޼���
	//�⺻������
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ�������

	public Movie(String ��ȭ����, String ��ȭ�帣) {
		super();
		this.��ȭ���� = ��ȭ����;
		this.��ȭ�帣 = ��ȭ�帣;
	}

	public void set��ȭ����(String ��ȭ����) {
		this.��ȭ���� = ��ȭ����;
	}

	public void set��ȭ�帣(String ��ȭ�帣) {
		this.��ȭ�帣 = ��ȭ�帣;
	}

	public String get��ȭ����() {
		return ��ȭ����;
	}

	public String get��ȭ�帣() {
		return ��ȭ�帣;
	}

	@Override
	public String toString() {
		return "Movie [��ȭ����=" + ��ȭ���� + ", ��ȭ�帣=" + ��ȭ�帣 + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
