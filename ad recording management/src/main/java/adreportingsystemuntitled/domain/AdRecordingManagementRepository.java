package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "adRecordingManagements",
    path = "adRecordingManagements"
)
public interface AdRecordingManagementRepository
    extends PagingAndSortingRepository<AdRecordingManagement, Long> {}
