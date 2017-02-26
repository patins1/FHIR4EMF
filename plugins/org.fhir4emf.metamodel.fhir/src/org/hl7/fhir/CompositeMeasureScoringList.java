/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Composite Measure Scoring List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCompositeMeasureScoringList()
 * @model extendedMetaData="name='CompositeMeasureScoring-list'"
 * @generated
 */
public enum CompositeMeasureScoringList implements Enumerator {
	/**
	 * The '<em><b>Opportunity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPPORTUNITY_VALUE
	 * @generated
	 * @ordered
	 */
	OPPORTUNITY(0, "opportunity", "opportunity"),

	/**
	 * The '<em><b>All Or Nothing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_OR_NOTHING_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_OR_NOTHING(1, "allOrNothing", "all-or-nothing"),

	/**
	 * The '<em><b>Linear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR(2, "linear", "linear"),

	/**
	 * The '<em><b>Weighted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHTED_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHTED(3, "weighted", "weighted");

	/**
	 * The '<em><b>Opportunity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opportunity
	 * <!-- end-model-doc -->
	 * @see #OPPORTUNITY
	 * @model name="opportunity"
	 * @generated
	 * @ordered
	 */
	public static final int OPPORTUNITY_VALUE = 0;

	/**
	 * The '<em><b>All Or Nothing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All-or-nothing
	 * <!-- end-model-doc -->
	 * @see #ALL_OR_NOTHING
	 * @model name="allOrNothing" literal="all-or-nothing"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_OR_NOTHING_VALUE = 1;

	/**
	 * The '<em><b>Linear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linear
	 * <!-- end-model-doc -->
	 * @see #LINEAR
	 * @model name="linear"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_VALUE = 2;

	/**
	 * The '<em><b>Weighted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weighted
	 * <!-- end-model-doc -->
	 * @see #WEIGHTED
	 * @model name="weighted"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHTED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Composite Measure Scoring List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompositeMeasureScoringList[] VALUES_ARRAY =
		new CompositeMeasureScoringList[] {
			OPPORTUNITY,
			ALL_OR_NOTHING,
			LINEAR,
			WEIGHTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Composite Measure Scoring List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompositeMeasureScoringList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Composite Measure Scoring List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositeMeasureScoringList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositeMeasureScoringList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composite Measure Scoring List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositeMeasureScoringList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompositeMeasureScoringList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Composite Measure Scoring List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompositeMeasureScoringList get(int value) {
		switch (value) {
			case OPPORTUNITY_VALUE: return OPPORTUNITY;
			case ALL_OR_NOTHING_VALUE: return ALL_OR_NOTHING;
			case LINEAR_VALUE: return LINEAR;
			case WEIGHTED_VALUE: return WEIGHTED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CompositeMeasureScoringList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CompositeMeasureScoringList
