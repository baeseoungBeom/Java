package sub3;

public class Adder {
	
	// �ɹ�����
	private int x;
	
	// ������
	Adder(int x){
		this.x = x;
	}
	
	//getter, setter �޼���
	// �ܺο��� �ɹ������� ���� ���������� �ʿ��� ��� ����ϴ� �޼���
	public int getX() {
		return x;
	}
	//�ܺο��� 3���޾ƿ��� 3�� �����ϴ°�.
	public void setX(int x) {
		this.x = x;
	}
	
	
	public void add(int x) {
		this.x = x + 50;	
	}
	public void add(int[] arr) {
		arr[0]++;		
	}
	public void add(Adder a1) {
		int x = a1.getX() + 40;
		a1.setX(x);
		
	}
	public Adder addNew(Adder a2) {
		a2 = new Adder(1);
		return a2;
	}
}
