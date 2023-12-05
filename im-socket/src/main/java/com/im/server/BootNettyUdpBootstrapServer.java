package com.im.server;


import com.im.handler.BootNettyUdpSimpleChannelInboundHandler;
import com.im.service.SpringUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import lombok.Getter;
import lombok.Setter;

/**
 * 蚂蚁舞
 */
public class BootNettyUdpBootstrapServer {

    @Getter
    @Setter
    private EventLoopGroup eventLoopGroup;

    @Setter
    @Getter
    private int port;

    /**
     * 启动服务
     */
    public void startup() {

        try {
            eventLoopGroup = new NioEventLoopGroup(20);
            Bootstrap serverBootstrap = new Bootstrap();
            serverBootstrap = serverBootstrap.group(eventLoopGroup);
            serverBootstrap = serverBootstrap.channel(NioDatagramChannel.class);
            serverBootstrap = serverBootstrap.option(ChannelOption.SO_BROADCAST, true);
            serverBootstrap = serverBootstrap.handler(new ChannelInitializer<NioDatagramChannel>() {
                @Override
                protected void initChannel(NioDatagramChannel ch) throws Exception {
                    BootNettyUdpSimpleChannelInboundHandler handler = SpringUtil.getApplicationContext().getBean(BootNettyUdpSimpleChannelInboundHandler.class);
                    ch.pipeline().addLast(handler);
                }
            });
            ChannelFuture f = serverBootstrap.bind(port).sync();
            if (f.isSuccess()) {
                System.out.println("netty udp start " + port);
                f.channel().closeFuture().sync();
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            System.out.println("netty udp close!");
            eventLoopGroup.shutdownGracefully();
        }
    }

    /**
     * 关闭服务
     */
    public void shutdown() {
        eventLoopGroup.shutdownGracefully();
    }
}
