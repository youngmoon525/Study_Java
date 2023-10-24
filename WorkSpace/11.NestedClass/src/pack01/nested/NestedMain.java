package pack01.nested;

import javax.swing.JPanel;

import pack01.nested.Nested.NesInner;
import pack01.nested.Nested.NesInner2;

public class NestedMain {
	public static int field2 = 10;
	
	public static void main(String[] args) {
		//static은 항상 메모리에 먼저 올라가는 성질이 있음 -> 바로 사용
		Nested.field2 = 10;
		Nested.method2();
		
		//인스턴스 멤버
		Nested nas = new Nested();
		nas.field = 20;
		nas.method();
		
		NesInner nes = nas.new NesInner();
		nes.iField = "KYM";
		nes.iMethod();
		//NesInner naa = new Nested().new NesInner();
		
		System.out.println(Nested.NesInner2.sField2);
		NesInner2 nes2 = new Nested.NesInner2();
		nes2.iField = "KYM";
		nes2.iMethod();
		
	}
}
