package com.im.server;


public class BootNettyUdpBootstrapThread extends Thread {

    private final int port;

    public BootNettyUdpBootstrapThread(int port){
        this.port = port;
    }

    public void run() {
        BootNettyUdpBootstrapServer iotUdpBootstrap = new BootNettyUdpBootstrapServer();
        iotUdpBootstrap.setPort(port);
        iotUdpBootstrap.startup();
    }


}
