package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.AdReportingApplication;
import adreportingsystemuntitled.domain.RecordedAdReceived;
import adreportingsystemuntitled.domain.ReportingDataGenerated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ReportListManagement_table")
@Data
//<<< DDD / Aggregate Root
public class ReportListManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        ReportingDataGenerated reportingDataGenerated = new ReportingDataGenerated(
            this
        );
        reportingDataGenerated.publishAfterCommit();

        RecordedAdReceived recordedAdReceived = new RecordedAdReceived(this);
        recordedAdReceived.publishAfterCommit();
    }

    public static ReportListManagementRepository repository() {
        ReportListManagementRepository reportListManagementRepository = AdReportingApplication.applicationContext.getBean(
            ReportListManagementRepository.class
        );
        return reportListManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void changeAdvertisingInformation(
        AdRecordingStarted adRecordingStarted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ReportListManagement reportListManagement = new ReportListManagement();
        repository().save(reportListManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(adRecordingStarted.get???()).ifPresent(reportListManagement->{
            
            reportListManagement // do something
            repository().save(reportListManagement);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeAdvertisingInformation(
        AdRecordingCompleted adRecordingCompleted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ReportListManagement reportListManagement = new ReportListManagement();
        repository().save(reportListManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(adRecordingCompleted.get???()).ifPresent(reportListManagement->{
            
            reportListManagement // do something
            repository().save(reportListManagement);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void receiveRecordedAd(
        RecordedAdSendStarted recordedAdSendStarted
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        ReportListManagement reportListManagement = new ReportListManagement();
        repository().save(reportListManagement);

        RecordedAdReceived recordedAdReceived = new RecordedAdReceived(reportListManagement);
        recordedAdReceived.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(recordedAdSendStarted.get???()).ifPresent(reportListManagement->{
            
            reportListManagement // do something
            repository().save(reportListManagement);

            RecordedAdReceived recordedAdReceived = new RecordedAdReceived(reportListManagement);
            recordedAdReceived.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
