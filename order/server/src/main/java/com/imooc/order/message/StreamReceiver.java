package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Created by ZXoho
 * 2018/8/25 16:04
 * stream接收信号，发送信号在controller
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

    @StreamListener(StreamClient.OUTUT)
    public void process(Object message) {
        log.info("StreamReceiver: {}", message);
    }
}
