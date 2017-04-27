package seng201.assignment;

/**
 * The misbehaving event, sets the pet to misbehave. A greater chance the more unhappy the pet is.
 */
public class MisbehaveEvent extends Event {
    @Override
    protected boolean processPet(Pet pet) {
        if (pet.isMisbehaving())
            return false;

        float chance = lerp(0, 0.25f, (10 - pet.getHappiness()) / 10.0f);
        if (random.nextFloat() <= chance) {
            pet.startMisbehaving();

            return true;
        }

        return false;
    }
}