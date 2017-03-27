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
 * A representation of the literals of the enumeration '<em><b>Event Timing List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getEventTimingList()
 * @model extendedMetaData="name='EventTiming-list'"
 * @generated
 */
public enum EventTimingList implements Enumerator {
	/**
	 * The '<em><b>MORN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORN_VALUE
	 * @generated
	 * @ordered
	 */
	MORN(0, "MORN", "MORN"),

	/**
	 * The '<em><b>AFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFT_VALUE
	 * @generated
	 * @ordered
	 */
	AFT(1, "AFT", "AFT"),

	/**
	 * The '<em><b>EVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVE_VALUE
	 * @generated
	 * @ordered
	 */
	EVE(2, "EVE", "EVE"),

	/**
	 * The '<em><b>NIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT(3, "NIGHT", "NIGHT"),

	/**
	 * The '<em><b>PHS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHS_VALUE
	 * @generated
	 * @ordered
	 */
	PHS(4, "PHS", "PHS"),

	/**
	 * The '<em><b>HS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HS_VALUE
	 * @generated
	 * @ordered
	 */
	HS(5, "HS", "HS"),

	/**
	 * The '<em><b>WAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAKE_VALUE
	 * @generated
	 * @ordered
	 */
	WAKE(6, "WAKE", "WAKE"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(7, "C", "C"),

	/**
	 * The '<em><b>CM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CM_VALUE
	 * @generated
	 * @ordered
	 */
	CM(8, "CM", "CM"),

	/**
	 * The '<em><b>CD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(9, "CD", "CD"),

	/**
	 * The '<em><b>CV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CV_VALUE
	 * @generated
	 * @ordered
	 */
	CV(10, "CV", "CV"),

	/**
	 * The '<em><b>AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AC_VALUE
	 * @generated
	 * @ordered
	 */
	AC(11, "AC", "AC"),

	/**
	 * The '<em><b>ACM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACM_VALUE
	 * @generated
	 * @ordered
	 */
	ACM(12, "ACM", "ACM"),

	/**
	 * The '<em><b>ACD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACD_VALUE
	 * @generated
	 * @ordered
	 */
	ACD(13, "ACD", "ACD"),

	/**
	 * The '<em><b>ACV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACV_VALUE
	 * @generated
	 * @ordered
	 */
	ACV(14, "ACV", "ACV"),

	/**
	 * The '<em><b>PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PC_VALUE
	 * @generated
	 * @ordered
	 */
	PC(15, "PC", "PC"),

	/**
	 * The '<em><b>PCM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCM_VALUE
	 * @generated
	 * @ordered
	 */
	PCM(16, "PCM", "PCM"),

	/**
	 * The '<em><b>PCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCD_VALUE
	 * @generated
	 * @ordered
	 */
	PCD(17, "PCD", "PCD"),

	/**
	 * The '<em><b>PCV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCV_VALUE
	 * @generated
	 * @ordered
	 */
	PCV(18, "PCV", "PCV");

	/**
	 * The '<em><b>MORN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Morning
	 * <!-- end-model-doc -->
	 * @see #MORN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MORN_VALUE = 0;

	/**
	 * The '<em><b>AFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Afternoon
	 * <!-- end-model-doc -->
	 * @see #AFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFT_VALUE = 1;

	/**
	 * The '<em><b>EVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evening
	 * <!-- end-model-doc -->
	 * @see #EVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVE_VALUE = 2;

	/**
	 * The '<em><b>NIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Night
	 * <!-- end-model-doc -->
	 * @see #NIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_VALUE = 3;

	/**
	 * The '<em><b>PHS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After Sleep
	 * <!-- end-model-doc -->
	 * @see #PHS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHS_VALUE = 4;

	/**
	 * The '<em><b>HS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HS
	 * <!-- end-model-doc -->
	 * @see #HS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HS_VALUE = 5;

	/**
	 * The '<em><b>WAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WAKE
	 * <!-- end-model-doc -->
	 * @see #WAKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAKE_VALUE = 6;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * C
	 * <!-- end-model-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 7;

	/**
	 * The '<em><b>CM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CM
	 * <!-- end-model-doc -->
	 * @see #CM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CM_VALUE = 8;

	/**
	 * The '<em><b>CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CD
	 * <!-- end-model-doc -->
	 * @see #CD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 9;

	/**
	 * The '<em><b>CV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CV
	 * <!-- end-model-doc -->
	 * @see #CV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CV_VALUE = 10;

	/**
	 * The '<em><b>AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AC
	 * <!-- end-model-doc -->
	 * @see #AC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AC_VALUE = 11;

	/**
	 * The '<em><b>ACM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACM
	 * <!-- end-model-doc -->
	 * @see #ACM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACM_VALUE = 12;

	/**
	 * The '<em><b>ACD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACD
	 * <!-- end-model-doc -->
	 * @see #ACD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACD_VALUE = 13;

	/**
	 * The '<em><b>ACV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ACV
	 * <!-- end-model-doc -->
	 * @see #ACV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACV_VALUE = 14;

	/**
	 * The '<em><b>PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PC
	 * <!-- end-model-doc -->
	 * @see #PC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PC_VALUE = 15;

	/**
	 * The '<em><b>PCM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCM
	 * <!-- end-model-doc -->
	 * @see #PCM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCM_VALUE = 16;

	/**
	 * The '<em><b>PCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCD
	 * <!-- end-model-doc -->
	 * @see #PCD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCD_VALUE = 17;

	/**
	 * The '<em><b>PCV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PCV
	 * <!-- end-model-doc -->
	 * @see #PCV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCV_VALUE = 18;

	/**
	 * An array of all the '<em><b>Event Timing List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventTimingList[] VALUES_ARRAY =
		new EventTimingList[] {
			MORN,
			AFT,
			EVE,
			NIGHT,
			PHS,
			HS,
			WAKE,
			C,
			CM,
			CD,
			CV,
			AC,
			ACM,
			ACD,
			ACV,
			PC,
			PCM,
			PCD,
			PCV,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Timing List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventTimingList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTimingList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventTimingList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Timing List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventTimingList get(int value) {
		switch (value) {
			case MORN_VALUE: return MORN;
			case AFT_VALUE: return AFT;
			case EVE_VALUE: return EVE;
			case NIGHT_VALUE: return NIGHT;
			case PHS_VALUE: return PHS;
			case HS_VALUE: return HS;
			case WAKE_VALUE: return WAKE;
			case C_VALUE: return C;
			case CM_VALUE: return CM;
			case CD_VALUE: return CD;
			case CV_VALUE: return CV;
			case AC_VALUE: return AC;
			case ACM_VALUE: return ACM;
			case ACD_VALUE: return ACD;
			case ACV_VALUE: return ACV;
			case PC_VALUE: return PC;
			case PCM_VALUE: return PCM;
			case PCD_VALUE: return PCD;
			case PCV_VALUE: return PCV;
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
	private EventTimingList(int value, String name, String literal) {
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
	
} //EventTimingList
