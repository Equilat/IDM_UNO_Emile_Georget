/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.unoDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nb Cartes Talon</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.unoDsl.UnoDslPackage#getNbCartesTalon()
 * @model
 * @generated
 */
public enum NbCartesTalon implements Enumerator
{
  /**
   * The '<em><b>Une Carte Talon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNE_CARTE_TALON_VALUE
   * @generated
   * @ordered
   */
  UNE_CARTE_TALON(0, "uneCarteTalon", "1"),

  /**
   * The '<em><b>Quatre Cartes Talon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUATRE_CARTES_TALON_VALUE
   * @generated
   * @ordered
   */
  QUATRE_CARTES_TALON(1, "quatreCartesTalon", "4");

  /**
   * The '<em><b>Une Carte Talon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNE_CARTE_TALON
   * @model name="uneCarteTalon" literal="1"
   * @generated
   * @ordered
   */
  public static final int UNE_CARTE_TALON_VALUE = 0;

  /**
   * The '<em><b>Quatre Cartes Talon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUATRE_CARTES_TALON
   * @model name="quatreCartesTalon" literal="4"
   * @generated
   * @ordered
   */
  public static final int QUATRE_CARTES_TALON_VALUE = 1;

  /**
   * An array of all the '<em><b>Nb Cartes Talon</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NbCartesTalon[] VALUES_ARRAY =
    new NbCartesTalon[]
    {
      UNE_CARTE_TALON,
      QUATRE_CARTES_TALON,
    };

  /**
   * A public read-only list of all the '<em><b>Nb Cartes Talon</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NbCartesTalon> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Nb Cartes Talon</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static NbCartesTalon get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NbCartesTalon result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Nb Cartes Talon</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static NbCartesTalon getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NbCartesTalon result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Nb Cartes Talon</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static NbCartesTalon get(int value)
  {
    switch (value)
    {
      case UNE_CARTE_TALON_VALUE: return UNE_CARTE_TALON;
      case QUATRE_CARTES_TALON_VALUE: return QUATRE_CARTES_TALON;
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
  private NbCartesTalon(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //NbCartesTalon
