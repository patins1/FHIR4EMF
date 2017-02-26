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
 * A representation of the literals of the enumeration '<em><b>Adverse Event Causality List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAdverseEventCausalityList()
 * @model extendedMetaData="name='AdverseEventCausality-list'"
 * @generated
 */
public enum AdverseEventCausalityList implements Enumerator {
	/**
	 * The '<em><b>Causality1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUSALITY1_VALUE
	 * @generated
	 * @ordered
	 */
	CAUSALITY1(0, "causality1", "causality1"),

	/**
	 * The '<em><b>Causality2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAUSALITY2_VALUE
	 * @generated
	 * @ordered
	 */
	CAUSALITY2(1, "causality2", "causality2");

	/**
	 * The '<em><b>Causality1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * causality1 placeholder
	 * <!-- end-model-doc -->
	 * @see #CAUSALITY1
	 * @model name="causality1"
	 * @generated
	 * @ordered
	 */
	public static final int CAUSALITY1_VALUE = 0;

	/**
	 * The '<em><b>Causality2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * causality2 placeholder
	 * <!-- end-model-doc -->
	 * @see #CAUSALITY2
	 * @model name="causality2"
	 * @generated
	 * @ordered
	 */
	public static final int CAUSALITY2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Adverse Event Causality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdverseEventCausalityList[] VALUES_ARRAY =
		new AdverseEventCausalityList[] {
			CAUSALITY1,
			CAUSALITY2,
		};

	/**
	 * A public read-only list of all the '<em><b>Adverse Event Causality List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdverseEventCausalityList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adverse Event Causality List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdverseEventCausalityList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdverseEventCausalityList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adverse Event Causality List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdverseEventCausalityList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdverseEventCausalityList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adverse Event Causality List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AdverseEventCausalityList get(int value) {
		switch (value) {
			case CAUSALITY1_VALUE: return CAUSALITY1;
			case CAUSALITY2_VALUE: return CAUSALITY2;
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
	private AdverseEventCausalityList(int value, String name, String literal) {
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
	
} //AdverseEventCausalityList
