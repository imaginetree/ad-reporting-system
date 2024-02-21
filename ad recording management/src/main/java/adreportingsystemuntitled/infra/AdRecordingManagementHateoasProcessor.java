package adreportingsystemuntitled.infra;

import adreportingsystemuntitled.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AdRecordingManagementHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<AdRecordingManagement>> {

    @Override
    public EntityModel<AdRecordingManagement> process(
        EntityModel<AdRecordingManagement> model
    ) {
        return model;
    }
}
