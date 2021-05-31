package cn.zhoujc.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    /**
     * PID （process id） 进程（时间，空间） 线程 (最小的计算单元)
     *
     * Tomcat 是一个 servlet 容器，10 service
     * 一个广泛使用的Java web应用服务器
     *
     * servlet，service + applet
     * Context：上下文
     * 网络协议，七层网络协议，Http 协议 的知识，阮一峰
     * Rest 风格的 api，类型：get，post
     */
    @RequestMapping("/")
    public String index() {
        return "hello spring boot";
    }

    @RequestMapping("/add")
    public Integer add(Integer a, Integer b) {
        System.out.println("计算加法: " + a.toString() + "+" + b.toString());
        return a + b;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}