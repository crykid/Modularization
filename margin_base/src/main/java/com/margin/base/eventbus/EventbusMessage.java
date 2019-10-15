package com.margin.base.eventbus;

/**
 * Created by:blank
 * Created on: 2019/10/15.2:18
 * Description:
 */
public class EventbusMessage<T> {

    public Enum messageId;
    public T data;

    public EventbusMessage(Enum messageId, T data) {
        this.messageId = messageId;
        this.data = data;
    }
}
