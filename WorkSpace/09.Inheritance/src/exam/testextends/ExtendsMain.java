package exam.testextends;

public class ExtendsMain {
	public static void main(String[] args) {
		//Parent_Class의 모든 멤버에 접근해서 출력 또는 호출 해보기
		Prent_Class parent = new Prent_Class("");//인스턴스화 : 인스턴스 멤버가 모두 메모리에 올라감
		//클래스 .찍고 나오는 멤버 : 스태틱
		//인스턴스화 과정 후 객체에 .찍고 나오는 멤버 : 인스턴스
		
		System.out.println(parent.parent_field1);
		System.out.println(parent.parent_field2);
		//System.out.println(parent.parent_field3);private 접근 제한(외부로부터 접근x)
		parent.parentMethod();
		
		
		Child_Class child = new Child_Class("");
		System.out.println(child.child_field);
		System.out.println(child.parent_field1);
		System.out.println(child.parent_field2);
		child.parentMethod();
		child.childMethod();
		
	}
}
