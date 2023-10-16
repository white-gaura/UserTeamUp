package com.whitecrow.cva.onlys;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//@Component
public class SentEmail {

        @Scheduled(initialDelay = 500, fixedRate = Long.MAX_VALUE)
        public void doSentEmailJob() throws EmailException {
            StopWatch stopWatch = new StopWatch();
            System.out.println("goodgoodgood");
            stopWatch.start();
            SimpleEmail email = new SimpleEmail();
            email.setHostName("smtp.qq.com");//指定要使用的邮件服务器
            email.setSmtpPort(587);
            email.setAuthentication("1833525310@qq.com", "kajsymyzvhphcaea");
            email.setFrom("1833525310@qq.com");
            email.addTo("2142781881@qq.com");
            email.setSubject("测试");
            email.setMsg("测试");
            email.setSocketTimeout(1000000);
            email.send();
            stopWatch.stop();
            System.out.println(stopWatch.getTotalTimeMillis());
        }
    }

