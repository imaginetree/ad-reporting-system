package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import adreportingsystemuntitled.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AdRecordingCompleted extends AbstractEvent {

    private Long id;

    public AdRecordingCompleted(AdRecordingManagement aggregate) {
        super(aggregate);
    }

    public AdRecordingCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
