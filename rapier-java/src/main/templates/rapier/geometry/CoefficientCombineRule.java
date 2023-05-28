package rapier.geometry;

/**
 * Rules used to combine two coefficients.
 * This is used to determine the effective restitution and
 * friction coefficients for a contact between two colliders.
 * Each collider has its combination rule of type
 * {@code CoefficientCombineRule}. And the rule
 * actually used is given by {@code max(first_combine_rule as usize, second_combine_rule as usize)}.
 */
public enum CoefficientCombineRule {
    AVERAGE,
    MIN,
    MULTIPLY,
    MAX,
}
