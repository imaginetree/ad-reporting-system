package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import adreportingsystemuntitled.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AdRecordingStarted extends AbstractEvent {

    private Long id;

    public AdRecordingStarted(AdRecordingManagement aggregate) {
        super(aggregate);
    }

    public AdRecordingStarted() {
        super();
    }
}
//>>> DDD / Domain Event
