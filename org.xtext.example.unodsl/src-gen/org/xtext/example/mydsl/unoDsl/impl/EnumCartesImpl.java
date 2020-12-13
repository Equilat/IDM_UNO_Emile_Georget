/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.unoDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.unoDsl.EnumCartes;
import org.xtext.example.mydsl.unoDsl.UnoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Cartes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.EnumCartesImpl#getCarteUno <em>Carte Uno</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.EnumCartesImpl#getPlusQuatreNonContestable <em>Plus Quatre Non Contestable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.EnumCartesImpl#getCarteZero <em>Carte Zero</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.EnumCartesImpl#getCarteSept <em>Carte Sept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumCartesImpl extends MinimalEObjectImpl.Container implements EnumCartes
{
  /**
   * The default value of the '{@link #getCarteUno() <em>Carte Uno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteUno()
   * @generated
   * @ordered
   */
  protected static final String CARTE_UNO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarteUno() <em>Carte Uno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteUno()
   * @generated
   * @ordered
   */
  protected String carteUno = CARTE_UNO_EDEFAULT;

  /**
   * The default value of the '{@link #getPlusQuatreNonContestable() <em>Plus Quatre Non Contestable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlusQuatreNonContestable()
   * @generated
   * @ordered
   */
  protected static final String PLUS_QUATRE_NON_CONTESTABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlusQuatreNonContestable() <em>Plus Quatre Non Contestable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlusQuatreNonContestable()
   * @generated
   * @ordered
   */
  protected String plusQuatreNonContestable = PLUS_QUATRE_NON_CONTESTABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getCarteZero() <em>Carte Zero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteZero()
   * @generated
   * @ordered
   */
  protected static final String CARTE_ZERO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarteZero() <em>Carte Zero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteZero()
   * @generated
   * @ordered
   */
  protected String carteZero = CARTE_ZERO_EDEFAULT;

  /**
   * The default value of the '{@link #getCarteSept() <em>Carte Sept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteSept()
   * @generated
   * @ordered
   */
  protected static final String CARTE_SEPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCarteSept() <em>Carte Sept</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCarteSept()
   * @generated
   * @ordered
   */
  protected String carteSept = CARTE_SEPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumCartesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnoDslPackage.Literals.ENUM_CARTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCarteUno()
  {
    return carteUno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCarteUno(String newCarteUno)
  {
    String oldCarteUno = carteUno;
    carteUno = newCarteUno;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.ENUM_CARTES__CARTE_UNO, oldCarteUno, carteUno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPlusQuatreNonContestable()
  {
    return plusQuatreNonContestable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPlusQuatreNonContestable(String newPlusQuatreNonContestable)
  {
    String oldPlusQuatreNonContestable = plusQuatreNonContestable;
    plusQuatreNonContestable = newPlusQuatreNonContestable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.ENUM_CARTES__PLUS_QUATRE_NON_CONTESTABLE, oldPlusQuatreNonContestable, plusQuatreNonContestable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCarteZero()
  {
    return carteZero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCarteZero(String newCarteZero)
  {
    String oldCarteZero = carteZero;
    carteZero = newCarteZero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.ENUM_CARTES__CARTE_ZERO, oldCarteZero, carteZero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCarteSept()
  {
    return carteSept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCarteSept(String newCarteSept)
  {
    String oldCarteSept = carteSept;
    carteSept = newCarteSept;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.ENUM_CARTES__CARTE_SEPT, oldCarteSept, carteSept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnoDslPackage.ENUM_CARTES__CARTE_UNO:
        return getCarteUno();
      case UnoDslPackage.ENUM_CARTES__PLUS_QUATRE_NON_CONTESTABLE:
        return getPlusQuatreNonContestable();
      case UnoDslPackage.ENUM_CARTES__CARTE_ZERO:
        return getCarteZero();
      case UnoDslPackage.ENUM_CARTES__CARTE_SEPT:
        return getCarteSept();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnoDslPackage.ENUM_CARTES__CARTE_UNO:
        setCarteUno((String)newValue);
        return;
      case UnoDslPackage.ENUM_CARTES__PLUS_QUATRE_NON_CONTESTABLE:
        setPlusQuatreNonContestable((String)newValue);
        return;
      case UnoDslPackage.ENUM_CARTES__CARTE_ZERO:
        setCarteZero((String)newValue);
        return;
      case UnoDslPackage.ENUM_CARTES__CARTE_SEPT:
        setCarteSept((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnoDslPackage.ENUM_CARTES__CARTE_UNO:
        setCarteUno(CARTE_UNO_EDEFAULT);
        return;
      case UnoDslPackage.ENUM_CARTES__PLUS_QUATRE_NON_CONTESTABLE:
        setPlusQuatreNonContestable(PLUS_QUATRE_NON_CONTESTABLE_EDEFAULT);
        return;
      case UnoDslPackage.ENUM_CARTES__CARTE_ZERO:
        setCarteZero(CARTE_ZERO_EDEFAULT);
        return;
      case UnoDslPackage.ENUM_CARTES__CARTE_SEPT:
        setCarteSept(CARTE_SEPT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnoDslPackage.ENUM_CARTES__CARTE_UNO:
        return CARTE_UNO_EDEFAULT == null ? carteUno != null : !CARTE_UNO_EDEFAULT.equals(carteUno);
      case UnoDslPackage.ENUM_CARTES__PLUS_QUATRE_NON_CONTESTABLE:
        return PLUS_QUATRE_NON_CONTESTABLE_EDEFAULT == null ? plusQuatreNonContestable != null : !PLUS_QUATRE_NON_CONTESTABLE_EDEFAULT.equals(plusQuatreNonContestable);
      case UnoDslPackage.ENUM_CARTES__CARTE_ZERO:
        return CARTE_ZERO_EDEFAULT == null ? carteZero != null : !CARTE_ZERO_EDEFAULT.equals(carteZero);
      case UnoDslPackage.ENUM_CARTES__CARTE_SEPT:
        return CARTE_SEPT_EDEFAULT == null ? carteSept != null : !CARTE_SEPT_EDEFAULT.equals(carteSept);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (carteUno: ");
    result.append(carteUno);
    result.append(", plusQuatreNonContestable: ");
    result.append(plusQuatreNonContestable);
    result.append(", carteZero: ");
    result.append(carteZero);
    result.append(", carteSept: ");
    result.append(carteSept);
    result.append(')');
    return result.toString();
  }

} //EnumCartesImpl