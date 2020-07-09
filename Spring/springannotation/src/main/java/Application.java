import com.hwadee.spring.dao.IEmpDAO;
import com.hwadee.spring.service.HrService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
// 设置应用程序上下文件配置文件的路径
        String xmlPath = "classpath:applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        IEmpDAO empDAO = (IEmpDAO) ctx.getBean("edao");
        empDAO.create();

        HrService hrService = (HrService) ctx.getBean("hrService");
        hrService.entry();
    }
}
