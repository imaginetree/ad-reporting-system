package adreportingsystemuntitled.domain;

import adreportingsystemuntitled.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "reportListManagements",
    path = "reportListManagements"
)
public interface ReportListManagementRepository
    extends PagingAndSortingRepository<ReportListManagement, Long> {}
