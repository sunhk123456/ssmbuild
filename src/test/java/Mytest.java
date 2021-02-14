import com.shk.pojo.Books;
import com.shk.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {
    @Test
    public void tests(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookServiceImpl bookServiceImpl = classPathXmlApplicationContext.getBean("BookServiceImpl", BookServiceImpl.class);
        List<Books> books = bookServiceImpl.queryAllBook();
        for (Books book : books) {
            System.out.println(book);

        }
    }
}
