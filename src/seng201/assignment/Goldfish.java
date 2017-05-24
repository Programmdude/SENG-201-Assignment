package seng201.assignment;

/**
 * Pet goldfish.
 */
final class Goldfish extends Pet {
    private static float[] weightRange = new float[] {0.1f, 1.1f};
    private static int[]  playfulnessRange = new int[] {2, 4};
    private static int[] roughnessRange = new int[] {1, 3};
    private static int[] hungerRateRange = new int[] {1, 2};
    private static int[] tiredRateRange = new int[] {1, 2};

    Goldfish(final String name, final PetType type) {
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
