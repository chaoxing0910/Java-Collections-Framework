package jihekuangjia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bookList=new ArrayList<>();
		Book book1=new Book();
		book1.setId("1");
		book1.setName("һ����");
		book1.setPrice("66");
		book1.setPress("������1");
		
		Book book2=new Book();
		book2.setId("2");
		book2.setName("������");
		book2.setPrice("88");
		book2.setPress("������2");
		
		bookList.add(book1);
		bookList.add(book2);
		
		for(Book book : bookList) {
			System.out.println(book);
		}
		
		Map<String,Book> book=new HashMap<String,Book>();
		
		book.put(book1.getId(),book1);
		book.put(book2.getId(),book2);
		
		for(Integer i=1;i<=book.size();i++) {
			System.out.println(book.get(i.toString()));
		}
	}

}
