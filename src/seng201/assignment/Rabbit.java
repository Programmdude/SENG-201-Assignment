package seng201.assignment;

/**
 * Implements rabbit as a possible pet with distinct weight, playfulness,
 * roughness, hunger rate and tiredness rate attributes.
 */
final class Rabbit extends Pet {
    private static float[] weightRange = new float[] {1.5f, 2.5f};
    private static int[] playfulnessRange = new int[] {2, 5};
    private static int[] roughnessRange = new int[] {3, 6};
    private static int[] hungerRateRange = new int[] {1, 3};
    private static int[] tiredRateRange = new int[] {1, 2};

    
    /**
     * Creates a pet rabbit.
     * @param name - name of the pet rabbit.
     * @param type - which type of pet it is.
     */
    Rabbit(final String name, final PetType type) {
        super(name, type);
    }

    @Override
    public float[] getSpeciesWeightRange() {
        return weightRange;
    }

    @Override
    public int[] getSpeciesPlayfulnessRange() {
        return playfulnessRange;
    }

    @Override
    public int[] getSpeciesRoughnessRange() {
        return roughnessRange;
    }

    @Override
    public int[] getSpeciesHungerRateRange() {
        return hungerRateRange;
    }
    
    @Override
    public int[] getSpeciesTiredRateRange() {
        return tiredRateRange;
    }

}
