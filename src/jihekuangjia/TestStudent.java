package jihekuangjia;

import java.util.HashMap;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Student> studentMap=new HashMap<>();
		while (true) {
			System.out.println("������ѧ����Ϣ:ѧ�� ���� ����");
			String inputData = input.nextLine();
			if ("exit".equals(inputData)) {
				break;
			}
			String[] info = inputData.split(" ");
			Student student=new Student();
			student.setId(Integer.parseInt(info[0]));
			student.setName(info[1]);
			student.setAge(Integer.parseInt(info[2]));
			studentMap.put(student.getId(),student);
			  System.out.println("������ѧ��ѧ�š�����������,����˳���м��Կո����");
			  inputData=input.nextLine();  
			}
		  for(Integer i=1;i<=studentMap.size();i++) {
			  System.out.println(studentMap.get(i.toString()));
			  }
		  }
}