package org.easyarch.pipeline.broker.persist.mem.disruptor;

import org.easyarch.pipeline.broker.msg.Body;
import org.easyarch.pipeline.broker.msg.Header;
import org.easyarch.pipeline.broker.msg.Message;
import org.easyarch.pipeline.broker.persist.mem.disruptor.pub.MessagePublisher;

/**
 * Created by xingtianyu on 17-5-19
 * 下午3:18
 * description:
 */

public class Test {

    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();
        publisher.publish(new Message(new Header(),new Body("henno world")));
        System.out.println("DisruptorHolder.getDisruptor().getCursor():"+ MessageHolder.getDisruptor().getCursor());
        MessageHolder holder = new MessageHolder();
        System.out.println("getMessage:"+holder.getMessage());
    }
}