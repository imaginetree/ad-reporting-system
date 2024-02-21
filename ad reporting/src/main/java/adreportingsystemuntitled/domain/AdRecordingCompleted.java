package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import adreportingsystemuntitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AdRecordingCompleted extends AbstractEvent {

    private Long id;
}
