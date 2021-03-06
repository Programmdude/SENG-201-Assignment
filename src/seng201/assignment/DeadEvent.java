package seng201.assignment;

/**
 * The death event, which kills the pet. 
 * A greater chance of death the more unhealthy a pet is.
 */
public final class DeadEvent extends Event {

    /**
     * Processes a pet at the end of the turn to check if it dies.
     * @param pet - the pet to be processed.
     * @return true - if pet dies in the turn, false - if pet is already dead or does not die.
     **/
    @Override
    protected boolean processPet(final Pet pet) {
        if (pet.isDead()) {
            return false;
        }

        final float chance = lerp(0, 0.4f, (10 - pet.getHealth()) / 10.0f);

        if (getRandom() <= chance) {
            pet.die();

            return true;
        }

        return false;
    }
}
