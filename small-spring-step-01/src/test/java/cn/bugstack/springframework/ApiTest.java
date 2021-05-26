package cn.bugstack.springframework;

import cn.bugstack.springframework.bean.UserService;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void BeanFactoryTest() {
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUser();
    }
}
