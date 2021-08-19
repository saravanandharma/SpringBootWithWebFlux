package com.saravanan.webfluxdemo;

import org.springframework.web.reactive.function.client.WebClient;

public class DemoWebClient {

    WebClient client = WebClient.create("http://localhost:8080");

    public void startWebClient(){
        client.get();

    }
}
