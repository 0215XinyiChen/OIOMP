import com.hwadee.spring.dao.IEmpDAO;
import com.hwadee.spring.service.HrService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // 配置文件路径
        String xmlPath = "classpath:applicationContext.xml";
        // 创建 Spring 应用程序上下文对象，初始化 Spring IoC 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlPath);
        // 获取 IEmpDAO 的一个实例
        IEmpDAO edao = (IEmpDAO) ctx.getBean("edaoe");
        edao.create();
        HrService hrService = (HrService) ctx.getBean("hrService");
        //不能这样使用 hrService.setEmpDAO(edao);
        hrService.entry();
    }
}
