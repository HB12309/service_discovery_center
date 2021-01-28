package cn.ebing.center.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiscoveryApplication {
    public static void main(String[] args) {
        System.out.println("===== DiscoveryApplication 准备启动 =====");
        SpringApplication.run(DiscoveryApplication.class, args);
        System.out.println("===== DiscoveryApplication 启动完成 =====");
    }
}
