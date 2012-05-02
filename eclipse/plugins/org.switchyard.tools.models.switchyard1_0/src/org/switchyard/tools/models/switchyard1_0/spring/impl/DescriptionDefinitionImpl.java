/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.switchyard.tools.models.switchyard1_0.spring.DescriptionDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DescriptionDefinitionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DescriptionDefinitionImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DescriptionDefinitionImpl#getLayoutHeight <em>Layout Height</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DescriptionDefinitionImpl#getLayoutWidth <em>Layout Width</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DescriptionDefinitionImpl#getLayoutX <em>Layout X</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.DescriptionDefinitionImpl#getLayoutY <em>Layout Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionDefinitionImpl extends EObjectImpl implements DescriptionDefinition {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutHeight() <em>Layout Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutHeight() <em>Layout Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutHeight()
	 * @generated
	 * @ordered
	 */
	protected double layoutHeight = LAYOUT_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Layout Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutHeightESet;

	/**
	 * The default value of the '{@link #getLayoutWidth() <em>Layout Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutWidth() <em>Layout Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutWidth()
	 * @generated
	 * @ordered
	 */
	protected double layoutWidth = LAYOUT_WIDTH_EDEFAULT;

	/**
	 * This is true if the Layout Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutWidthESet;

	/**
	 * The default value of the '{@link #getLayoutX() <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutX()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutX() <em>Layout X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutX()
	 * @generated
	 * @ordered
	 */
	protected double layoutX = LAYOUT_X_EDEFAULT;

	/**
	 * This is true if the Layout X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutXESet;

	/**
	 * The default value of the '{@link #getLayoutY() <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutY()
	 * @generated
	 * @ordered
	 */
	protected static final double LAYOUT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLayoutY() <em>Layout Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutY()
	 * @generated
	 * @ordered
	 */
	protected double layoutY = LAYOUT_Y_EDEFAULT;

	/**
	 * This is true if the Layout Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean layoutYESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getDescriptionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DESCRIPTION_DEFINITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DESCRIPTION_DEFINITION__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLayoutHeight() {
		return layoutHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutHeight(double newLayoutHeight) {
		double oldLayoutHeight = layoutHeight;
		layoutHeight = newLayoutHeight;
		boolean oldLayoutHeightESet = layoutHeightESet;
		layoutHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_HEIGHT, oldLayoutHeight, layoutHeight, !oldLayoutHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutHeight() {
		double oldLayoutHeight = layoutHeight;
		boolean oldLayoutHeightESet = layoutHeightESet;
		layoutHeight = LAYOUT_HEIGHT_EDEFAULT;
		layoutHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_HEIGHT, oldLayoutHeight, LAYOUT_HEIGHT_EDEFAULT, oldLayoutHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutHeight() {
		return layoutHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLayoutWidth() {
		return layoutWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutWidth(double newLayoutWidth) {
		double oldLayoutWidth = layoutWidth;
		layoutWidth = newLayoutWidth;
		boolean oldLayoutWidthESet = layoutWidthESet;
		layoutWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_WIDTH, oldLayoutWidth, layoutWidth, !oldLayoutWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutWidth() {
		double oldLayoutWidth = layoutWidth;
		boolean oldLayoutWidthESet = layoutWidthESet;
		layoutWidth = LAYOUT_WIDTH_EDEFAULT;
		layoutWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_WIDTH, oldLayoutWidth, LAYOUT_WIDTH_EDEFAULT, oldLayoutWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutWidth() {
		return layoutWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLayoutX() {
		return layoutX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutX(double newLayoutX) {
		double oldLayoutX = layoutX;
		layoutX = newLayoutX;
		boolean oldLayoutXESet = layoutXESet;
		layoutXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_X, oldLayoutX, layoutX, !oldLayoutXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutX() {
		double oldLayoutX = layoutX;
		boolean oldLayoutXESet = layoutXESet;
		layoutX = LAYOUT_X_EDEFAULT;
		layoutXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_X, oldLayoutX, LAYOUT_X_EDEFAULT, oldLayoutXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutX() {
		return layoutXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLayoutY() {
		return layoutY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutY(double newLayoutY) {
		double oldLayoutY = layoutY;
		layoutY = newLayoutY;
		boolean oldLayoutYESet = layoutYESet;
		layoutYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_Y, oldLayoutY, layoutY, !oldLayoutYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayoutY() {
		double oldLayoutY = layoutY;
		boolean oldLayoutYESet = layoutYESet;
		layoutY = LAYOUT_Y_EDEFAULT;
		layoutYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_Y, oldLayoutY, LAYOUT_Y_EDEFAULT, oldLayoutYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayoutY() {
		return layoutYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.DESCRIPTION_DEFINITION__VALUE:
				return getValue();
			case SpringPackage.DESCRIPTION_DEFINITION__LANG:
				return getLang();
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_HEIGHT:
				return getLayoutHeight();
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_WIDTH:
				return getLayoutWidth();
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_X:
				return getLayoutX();
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_Y:
				return getLayoutY();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpringPackage.DESCRIPTION_DEFINITION__VALUE:
				setValue((String)newValue);
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LANG:
				setLang((String)newValue);
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_HEIGHT:
				setLayoutHeight((Double)newValue);
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_WIDTH:
				setLayoutWidth((Double)newValue);
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_X:
				setLayoutX((Double)newValue);
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_Y:
				setLayoutY((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpringPackage.DESCRIPTION_DEFINITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_HEIGHT:
				unsetLayoutHeight();
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_WIDTH:
				unsetLayoutWidth();
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_X:
				unsetLayoutX();
				return;
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_Y:
				unsetLayoutY();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpringPackage.DESCRIPTION_DEFINITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SpringPackage.DESCRIPTION_DEFINITION__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_HEIGHT:
				return isSetLayoutHeight();
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_WIDTH:
				return isSetLayoutWidth();
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_X:
				return isSetLayoutX();
			case SpringPackage.DESCRIPTION_DEFINITION__LAYOUT_Y:
				return isSetLayoutY();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", lang: ");
		result.append(lang);
		result.append(", layoutHeight: ");
		if (layoutHeightESet) result.append(layoutHeight); else result.append("<unset>");
		result.append(", layoutWidth: ");
		if (layoutWidthESet) result.append(layoutWidth); else result.append("<unset>");
		result.append(", layoutX: ");
		if (layoutXESet) result.append(layoutX); else result.append("<unset>");
		result.append(", layoutY: ");
		if (layoutYESet) result.append(layoutY); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DescriptionDefinitionImpl
