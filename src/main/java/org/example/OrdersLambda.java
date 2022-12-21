package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;

import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;

public class OrdersLambda {
    public String handlerRequest(KinesisEvent event, Context context){

        event.getRecords();
        for(KinesisEvent.KinesisEventRecord record: event.getRecords()){
            String data = StandardCharsets.UTF_8.decode(record.getKinesis().getData()).toString();
            System.out.println(data);
        }

        return "Success 200";
    };
}
