package com.im;

import com.im.server.BootNettyUdpBootstrapThread;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableDubbo
@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication
public class ImSocketApplication {

    private static int udpPort;
    @Value("${udp.port}")
    public void setUdpPort(int value) {
        udpPort = value;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ImSocketApplication.class);
        app.run(args);
        BootNettyUdpBootstrapThread thread = new BootNettyUdpBootstrapThread(udpPort);
        thread.start();
        System.out.println( "Im Socket application started!" );
    }
}
