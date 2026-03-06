package otm.v5_7.helper;

import otm.v5_7.model.Actor;
import otm.v5_7.model.Actor.EntityTypeEnum;
import otm.v5_7.model.Actor.TypeEnum;
import otm.v5_7.model.ActorCompany;
import otm.v5_7.model.ActorPerson;
import otm.v5_7.model.Stop;
import otm.v5_7.model.Stop.ActionTypeEnum;
import otm.v5_7.model.Trip;

/**
 * Helper class used create new OTM entities
 */
public class EntityFactory {

    private EntityFactory () {
        // static helper class
    }

    public static ActorCompany createActorCompany() {
        return ActorCompany.builder()
            .type(Actor.TypeEnum.COMPANY)
            .entityType(EntityTypeEnum.ACTOR)
            .build();
    }

    public static ActorPerson createActorPerson() {
        return ActorPerson.builder()
            .type(TypeEnum.PERSON)
            .entityType(EntityTypeEnum.ACTOR)
            .build();
    }

    public static Trip createTrip() {
        return Trip.builder()
            .entityType(Trip.EntityTypeEnum.TRIP)
            .build();
    }

    public static Stop createStop() {
        return Stop.builder()
            .actionType(ActionTypeEnum.STOP)
            .build();
    }

    // TODO: create more methods to create entities

}
