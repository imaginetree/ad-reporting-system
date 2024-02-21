package adreportingsystemuntitled.infra;

import adreportingsystemuntitled.config.kafka.KafkaProcessor;
import adreportingsystemuntitled.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ReportListManagementRepository reportListManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AdRecordingStarted'"
    )
    public void wheneverAdRecordingStarted_ChangeAdvertisingInformation(
        @Payload AdRecordingStarted adRecordingStarted
    ) {
        AdRecordingStarted event = adRecordingStarted;
        System.out.println(
            "\n\n##### listener ChangeAdvertisingInformation : " +
            adRecordingStarted +
            "\n\n"
        );

        // Sample Logic //
        ReportListManagement.changeAdvertisingInformation(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AdRecordingCompleted'"
    )
    public void wheneverAdRecordingCompleted_ChangeAdvertisingInformation(
        @Payload AdRecordingCompleted adRecordingCompleted
    ) {
        AdRecordingCompleted event = adRecordingCompleted;
        System.out.println(
            "\n\n##### listener ChangeAdvertisingInformation : " +
            adRecordingCompleted +
            "\n\n"
        );

        // Sample Logic //
        ReportListManagement.changeAdvertisingInformation(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RecordedAdSendStarted'"
    )
    public void wheneverRecordedAdSendStarted_ReceiveRecordedAd(
        @Payload RecordedAdSendStarted recordedAdSendStarted
    ) {
        RecordedAdSendStarted event = recordedAdSendStarted;
        System.out.println(
            "\n\n##### listener ReceiveRecordedAd : " +
            recordedAdSendStarted +
            "\n\n"
        );

        // Sample Logic //
        ReportListManagement.receiveRecordedAd(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
