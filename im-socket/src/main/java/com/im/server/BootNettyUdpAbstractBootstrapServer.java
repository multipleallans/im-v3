package com.im.server;


import com.im.handler.BootNettyUdpSimpleChannelInboundHandler;
import com.im.service.BootNettyUdpBootstrap;
import io.netty.channel.ChannelPipeline;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BootNettyUdpAbstractBootstrapServer implements BootNettyUdpBootstrap {

@Autowired
BootNettyUdpSimpleChannelInboundHandler handler;

    void initChannelHandler(ChannelPipeline channelPipeline) {
        System.out.println("initChannelHandler");

        wsServer.getSpringCtx().getBean(BootNettyUdpSimpleChannelInboundHandler.class);
        channelPipeline.addLast(handler);
    }


}
