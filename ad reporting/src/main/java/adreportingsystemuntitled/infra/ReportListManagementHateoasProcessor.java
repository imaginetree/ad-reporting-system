package adreportingsystemuntitled.infra;

import adreportingsystemuntitled.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReportListManagementHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ReportListManagement>> {

    @Override
    public EntityModel<ReportListManagement> process(
        EntityModel<ReportListManagement> model
    ) {
        return model;
    }
}
