package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import adreportingsystemuntitled.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RecordedAdSendStarted extends AbstractEvent {

    private Long id;

    public RecordedAdSendStarted(AdRecordingManagement aggregate) {
        super(aggregate);
    }

    public RecordedAdSendStarted() {
        super();
    }
}
//>>> DDD / Domain Event
