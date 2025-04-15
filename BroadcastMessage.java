package com.pkstuff.test;

import org.apache.flink.api.common.typeinfo.TypeInfo;
import org.apache.flink.types.Row;

import java.io.Serializable;

@TypeInfo(BroadcastMessageTypeInfo.class)
public class BroadcastMessage implements Serializable
{
    public Row data;
    public boolean clearStateSignal;

    public BroadcastMessage() {}

    private BroadcastMessage(Row data, boolean clearStateSignal)
    {
        this.data = data;
        this.clearStateSignal = clearStateSignal;
    }

    public static BroadcastMessage ofData(Row data)
    {
        return new BroadcastMessage(data, false);
    }

    public static BroadcastMessage ofClearState()
    {
        return new BroadcastMessage(null, true);
    }

    public Row getData()
    {
        return data;
    }

    public boolean isClearStateSignal()
    {
        return clearStateSignal;
    }
}
