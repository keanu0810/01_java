package �ڹ�_���������ǽ�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AnimalMain {
	// fileSave
	// ���޹��� ������ ���Ͽ� �����ϰ� �����ϴ� �ڵ��ۼ�
	public void fileSave(String �����̸�) {

		File file = new File(�����̸�);

		// ������ �����ϰ� ���� �ۼ��ϴ� wrtie ����
		try {
			FileWriter fw = new FileWriter(file);

			// ���Ͽ� ���ڿ��� �ۼ��� �� �����鼭 ��±��� �����ִ� Bufferede writer ���
			BufferedWriter bw = new BufferedWriter(fw);

			// Animal ��ü ���� ���ۼ��ؼ� ����
			Animal ���� = new Animal("�����", 3);
			// toString ���� ��µȴ� ������ ����
			bw.write(����.toString());
			System.out.println("������ �������� ����Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// Animal ���� = new Animal("�ڳ���", 2);
		// System.out.println(����);
		AnimalMain �����������ϸ���� = new AnimalMain();
		�����������ϸ����.fileSave("animal.txt");
	}
}
