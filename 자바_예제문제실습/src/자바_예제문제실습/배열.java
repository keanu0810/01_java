package �ڹ�_���������ǽ�;

public class �迭 {
	public static void main(String[] args) {
		Circle[] ���� = new Circle[2];
		// i ���� ��������� ������ Ȯ��
		// ��[0] ��[1] �� �ڸ��� ���� ������� ������ Ȯ��
		System.out.println("��[0] : " + ����[0]);
		// null�� ���� �ʵ��� ���� �־��ְų�, null ����
		����[0] = new Circle(2.5);
		����[1] = new Circle(3.5);

		// for���� ���� Ȯ��
		for (int i = 0; i < ����.length; i++) {
			System.out.println(����[i].getRadius());

		}
	}
}
