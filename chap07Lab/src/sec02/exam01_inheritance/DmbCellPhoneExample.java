package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
		
		//CellPhone���κ��� ��� ���� �ʵ�
		System.out.println("��: "+dmbCellPhone.model);
		System.out.println("����: "+dmbCellPhone.color);
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä��: "+dmbCellPhone.channel);
		
		// CellPhone���κ��� ��� ���� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellPhone.sendVoice("��~�� �ݰ����ϴ�.");
		dmbCellPhone.hangUp("��ȭ�� �����ϴ�.");
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
