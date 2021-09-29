package co.simplon.api.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import co.simplon.api.models.Gymnase;
import co.simplon.api.services.SequenceGeneratorService;

@Component
public class GymnaseModelListener extends AbstractMongoEventListener<Gymnase> {
	private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public GymnaseModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Gymnase> event) {
        if (event.getSource().getIdGymnase() < 1) {
            event.getSource().setIdGymnase(sequenceGenerator.generateSequence(Gymnase.SEQUENCE_NAME));
        }
    }
}
