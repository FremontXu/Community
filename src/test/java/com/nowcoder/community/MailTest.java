package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * ClassName: MailTest <br/>
 * Description: <br/>
 * date: 2022/2/28 9:52<br/>
 *
 * @author thxx<br />
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTest {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void test(){
        mailClient.sendMail("575078522@qq.com","test","hello");
    }

    @Test
    public void testHTML(){
        Context context = new Context();
        context.setVariable("username","sss");

        templateEngine.process("/mail/demo",context);
        mailClient.sendMail("575078522@qq.com","html","hello");

    }

}
