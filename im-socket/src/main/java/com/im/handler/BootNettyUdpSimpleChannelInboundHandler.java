package com.im.handler;

import com.im.cache.BootNettyUdpDataCache;
import com.im.dto.BootNettyUdpData;
import com.im.service.BusinessService;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BootNettyUdpSimpleChannelInboundHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    @Autowired
    private BusinessService businessService;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
        long time_stamp = System.currentTimeMillis()/1000;
        System.out.println("received client data: "+packet.content().toString(CharsetUtil.UTF_8)+"--ip:"+packet.sender().getAddress()+"--port:"+packet.sender().getPort());
        try {
            BootNettyUdpData bootNettyUdpData = new BootNettyUdpData();
            bootNettyUdpData.setAddress(packet.sender().getAddress().toString());
            bootNettyUdpData.setContent("received client data: "+packet.content().toString(CharsetUtil.UTF_8));
            bootNettyUdpData.setTime_stamp(time_stamp);
            BootNettyUdpDataCache.bootNettyUdpDataList.add(bootNettyUdpData);
            businessService.udpHandleMethod(packet.content().toString());
            ctx.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer("udp server response timestamp: "+ time_stamp, CharsetUtil.UTF_8), packet.sender()));

        } catch (Exception e) {
            e.printStackTrace();
            ctx.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer("exception", CharsetUtil.UTF_8), packet.sender()));
            System.out.println("received exception--data:"+packet.content().toString(CharsetUtil.UTF_8)+"--"+e.toString());
        }

    }

}
