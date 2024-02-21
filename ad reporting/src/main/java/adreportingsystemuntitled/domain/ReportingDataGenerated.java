package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import adreportingsystemuntitled.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReportingDataGenerated extends AbstractEvent {

    private Long id;

    public ReportingDataGenerated(ReportListManagement aggregate) {
        super(aggregate);
    }

    public ReportingDataGenerated() {
        super();
    }
}
//>>> DDD / Domain Event
