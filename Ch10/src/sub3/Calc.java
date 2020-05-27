package sub3;

public class Calc {
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		int z = x + y;
		return z;
	}
	public int minus(int x, int y) {
		int z = x - y;
		return z;
	}
	public int multi(int x, int y) {
		int z = x * y;
		return z;
	}
	
	//�ش� �޼���� ������ �߻��� �� �ִٴ� ���ɼ����� throws ������ ���� ȣ���ϴ� �ʿ� �˸�
	public int div(int x, int y) throws Exception{
		//�߻��Ҽ��ִ¿����� 3���̹Ƿ� throw�ڿ� s�� ���δ�.
		//������ �߻��Ҷ� �޼��带 ȣ���ϴ� ������ ������ ������.
		if(y < 0) {
			Exception e = new Exception("y�� ��� �̾�� �մϴ�.");
			throw e;
		}else if(y == 1) {
			Exception e = new Exception("y�� 1�� �Ǹ� �ȵ˴ϴ�.");
			throw e;
		}
		
		int	z = x / y; //y�� 0�̸� ���ٿ��� ������ ����
		
		return z;
	}
	
}
