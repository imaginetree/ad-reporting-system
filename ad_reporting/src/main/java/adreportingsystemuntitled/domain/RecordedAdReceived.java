package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import adreportingsystemuntitled.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RecordedAdReceived extends AbstractEvent {

    private Long id;

    public RecordedAdReceived(ReportListManagement aggregate) {
        super(aggregate);
    }

    public RecordedAdReceived() {
        super();
    }
}
//>>> DDD / Domain Event
