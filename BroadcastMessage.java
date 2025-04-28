package com.pkstuff.test;

import org.apache.flink.api.common.typeinfo.TypeInfo;
import org.apache.flink.types.Row;

import java.io.Serializable;

@TypeInfo(BroadcastMessageTypeInfo.class)
public class BroadcastMessage implements Serializable
{
    public Row data;
    public boolean clearStateSignal;
    public int dataSize;
    public double signalStrength;

    public BroadcastMessage() {}

    private BroadcastMessage(Row myRowData, boolean clearStateSignal, int dataSize, double signalStrength)
    {
        this.data = myRowData;
        this.clearStateSignal = clearStateSignal;
        this.dataSize = dataSize;
        this.signalStrength = signalStrength;
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

    public Row getDataSize()
    {
        return dataSize;
    }
    public Row getSignalStrength()
    {
        return signalStrength;
    }

    public boolean isClearStateSignal()
    {
        return clearStateSignal;
    }
}
