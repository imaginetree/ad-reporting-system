package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.AdRecordingManagementApplication;
import adreportingsystemuntitled.domain.AdRecordingCompleted;
import adreportingsystemuntitled.domain.AdRecordingStarted;
import adreportingsystemuntitled.domain.RecordedAdSendStarted;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "AdRecordingManagement_table")
@Data
//<<< DDD / Aggregate Root
public class AdRecordingManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        AdRecordingStarted adRecordingStarted = new AdRecordingStarted(this);
        adRecordingStarted.publishAfterCommit();

        AdRecordingCompleted adRecordingCompleted = new AdRecordingCompleted(
            this
        );
        adRecordingCompleted.publishAfterCommit();

        RecordedAdSendStarted recordedAdSendStarted = new RecordedAdSendStarted(
            this
        );
        recordedAdSendStarted.publishAfterCommit();
    }

    public static AdRecordingManagementRepository repository() {
        AdRecordingManagementRepository adRecordingManagementRepository = AdRecordingManagementApplication.applicationContext.getBean(
            AdRecordingManagementRepository.class
        );
        return adRecordingManagementRepository;
    }
}
//>>> DDD / Aggregate Root
