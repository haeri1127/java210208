package mybatis.step1;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BookDao {
	//이것을 통하여 xml문서의 정보를 읽어서 커넥션을 얻어내는데 사용함
	String resource = "mybatis/step1/MapperConfig.xml";
	SqlSessionFactory sqlMapper = null;
	public List<Map<String,Object>> getBookList(){
		List<Map<String,Object>>bookList = null;
		SqlSession session = null;
		try {
			//insert here
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			session = sqlMapper.openSession(); //연결통로 갖는것
			String currentTime = session.selectOne("currentTime");
			System.out.println("currentTime = "+currentTime);
		} catch (Exception e) {
			e.printStackTrace(); //toString보다 힌트를 많이 줌
		}
		return bookList;
	}
	public static void main(String[] args) {
		BookDao bdao = new BookDao();
		bdao.getBookList();
		List<Map<String,Object>>bookList = null;
		bookList = bdao.getBookList();
		System.out.println(bookList);

	}

}
