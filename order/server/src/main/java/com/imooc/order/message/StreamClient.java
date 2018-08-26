package com.imooc.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by ZXoho
 * 2018/8/25 16:01
 */
public interface StreamClient {

    String INPUT = "myMessage1";
    String OUTUT = "myMessage2";

    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output(StreamClient.OUTUT)
    MessageChannel output();
}
