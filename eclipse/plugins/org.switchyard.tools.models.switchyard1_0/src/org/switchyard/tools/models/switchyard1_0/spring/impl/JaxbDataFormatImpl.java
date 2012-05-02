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

import org.switchyard.tools.models.switchyard1_0.spring.JaxbDataFormat;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jaxb Data Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#isFilterNonXmlChars <em>Filter Non Xml Chars</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#isFragment <em>Fragment</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#isIgnoreJAXBElement <em>Ignore JAXB Element</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#getPartClass <em>Part Class</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#getPartNamespace <em>Part Namespace</em>}</li>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.JaxbDataFormatImpl#isPrettyPrint <em>Pretty Print</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JaxbDataFormatImpl extends DataFormatImpl implements JaxbDataFormat {
	/**
	 * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextPath()
	 * @generated
	 * @ordered
	 */
	protected String contextPath = CONTEXT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #isFilterNonXmlChars() <em>Filter Non Xml Chars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterNonXmlChars()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTER_NON_XML_CHARS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilterNonXmlChars() <em>Filter Non Xml Chars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterNonXmlChars()
	 * @generated
	 * @ordered
	 */
	protected boolean filterNonXmlChars = FILTER_NON_XML_CHARS_EDEFAULT;

	/**
	 * This is true if the Filter Non Xml Chars attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterNonXmlCharsESet;

	/**
	 * The default value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAGMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragment()
	 * @generated
	 * @ordered
	 */
	protected boolean fragment = FRAGMENT_EDEFAULT;

	/**
	 * This is true if the Fragment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fragmentESet;

	/**
	 * The default value of the '{@link #isIgnoreJAXBElement() <em>Ignore JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreJAXBElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_JAXB_ELEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreJAXBElement() <em>Ignore JAXB Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreJAXBElement()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreJAXBElement = IGNORE_JAXB_ELEMENT_EDEFAULT;

	/**
	 * This is true if the Ignore JAXB Element attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreJAXBElementESet;

	/**
	 * The default value of the '{@link #getPartClass() <em>Part Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartClass() <em>Part Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartClass()
	 * @generated
	 * @ordered
	 */
	protected String partClass = PART_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNamespace() <em>Part Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNamespace() <em>Part Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNamespace()
	 * @generated
	 * @ordered
	 */
	protected String partNamespace = PART_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrettyPrint() <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRETTY_PRINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrettyPrint() <em>Pretty Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrettyPrint()
	 * @generated
	 * @ordered
	 */
	protected boolean prettyPrint = PRETTY_PRINT_EDEFAULT;

	/**
	 * This is true if the Pretty Print attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prettyPrintESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JaxbDataFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.eINSTANCE.getJaxbDataFormat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextPath() {
		return contextPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextPath(String newContextPath) {
		String oldContextPath = contextPath;
		contextPath = newContextPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH, oldContextPath, contextPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilterNonXmlChars() {
		return filterNonXmlChars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterNonXmlChars(boolean newFilterNonXmlChars) {
		boolean oldFilterNonXmlChars = filterNonXmlChars;
		filterNonXmlChars = newFilterNonXmlChars;
		boolean oldFilterNonXmlCharsESet = filterNonXmlCharsESet;
		filterNonXmlCharsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS, oldFilterNonXmlChars, filterNonXmlChars, !oldFilterNonXmlCharsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterNonXmlChars() {
		boolean oldFilterNonXmlChars = filterNonXmlChars;
		boolean oldFilterNonXmlCharsESet = filterNonXmlCharsESet;
		filterNonXmlChars = FILTER_NON_XML_CHARS_EDEFAULT;
		filterNonXmlCharsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS, oldFilterNonXmlChars, FILTER_NON_XML_CHARS_EDEFAULT, oldFilterNonXmlCharsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterNonXmlChars() {
		return filterNonXmlCharsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFragment() {
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragment(boolean newFragment) {
		boolean oldFragment = fragment;
		fragment = newFragment;
		boolean oldFragmentESet = fragmentESet;
		fragmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__FRAGMENT, oldFragment, fragment, !oldFragmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFragment() {
		boolean oldFragment = fragment;
		boolean oldFragmentESet = fragmentESet;
		fragment = FRAGMENT_EDEFAULT;
		fragmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.JAXB_DATA_FORMAT__FRAGMENT, oldFragment, FRAGMENT_EDEFAULT, oldFragmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFragment() {
		return fragmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreJAXBElement() {
		return ignoreJAXBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreJAXBElement(boolean newIgnoreJAXBElement) {
		boolean oldIgnoreJAXBElement = ignoreJAXBElement;
		ignoreJAXBElement = newIgnoreJAXBElement;
		boolean oldIgnoreJAXBElementESet = ignoreJAXBElementESet;
		ignoreJAXBElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT, oldIgnoreJAXBElement, ignoreJAXBElement, !oldIgnoreJAXBElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreJAXBElement() {
		boolean oldIgnoreJAXBElement = ignoreJAXBElement;
		boolean oldIgnoreJAXBElementESet = ignoreJAXBElementESet;
		ignoreJAXBElement = IGNORE_JAXB_ELEMENT_EDEFAULT;
		ignoreJAXBElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT, oldIgnoreJAXBElement, IGNORE_JAXB_ELEMENT_EDEFAULT, oldIgnoreJAXBElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreJAXBElement() {
		return ignoreJAXBElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartClass() {
		return partClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartClass(String newPartClass) {
		String oldPartClass = partClass;
		partClass = newPartClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__PART_CLASS, oldPartClass, partClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartNamespace() {
		return partNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNamespace(String newPartNamespace) {
		String oldPartNamespace = partNamespace;
		partNamespace = newPartNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE, oldPartNamespace, partNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrettyPrint() {
		return prettyPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrettyPrint(boolean newPrettyPrint) {
		boolean oldPrettyPrint = prettyPrint;
		prettyPrint = newPrettyPrint;
		boolean oldPrettyPrintESet = prettyPrintESet;
		prettyPrintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, prettyPrint, !oldPrettyPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrettyPrint() {
		boolean oldPrettyPrint = prettyPrint;
		boolean oldPrettyPrintESet = prettyPrintESet;
		prettyPrint = PRETTY_PRINT_EDEFAULT;
		prettyPrintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT, oldPrettyPrint, PRETTY_PRINT_EDEFAULT, oldPrettyPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrettyPrint() {
		return prettyPrintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				return getContextPath();
			case SpringPackage.JAXB_DATA_FORMAT__ENCODING:
				return getEncoding();
			case SpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				return isFilterNonXmlChars();
			case SpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				return isFragment();
			case SpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				return isIgnoreJAXBElement();
			case SpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				return getPartClass();
			case SpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				return getPartNamespace();
			case SpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				return isPrettyPrint();
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
			case SpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				setContextPath((String)newValue);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__ENCODING:
				setEncoding((String)newValue);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				setFilterNonXmlChars((Boolean)newValue);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				setFragment((Boolean)newValue);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				setIgnoreJAXBElement((Boolean)newValue);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				setPartClass((String)newValue);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				setPartNamespace((String)newValue);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				setPrettyPrint((Boolean)newValue);
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
			case SpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				setContextPath(CONTEXT_PATH_EDEFAULT);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				unsetFilterNonXmlChars();
				return;
			case SpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				unsetFragment();
				return;
			case SpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				unsetIgnoreJAXBElement();
				return;
			case SpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				setPartClass(PART_CLASS_EDEFAULT);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				setPartNamespace(PART_NAMESPACE_EDEFAULT);
				return;
			case SpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				unsetPrettyPrint();
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
			case SpringPackage.JAXB_DATA_FORMAT__CONTEXT_PATH:
				return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
			case SpringPackage.JAXB_DATA_FORMAT__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case SpringPackage.JAXB_DATA_FORMAT__FILTER_NON_XML_CHARS:
				return isSetFilterNonXmlChars();
			case SpringPackage.JAXB_DATA_FORMAT__FRAGMENT:
				return isSetFragment();
			case SpringPackage.JAXB_DATA_FORMAT__IGNORE_JAXB_ELEMENT:
				return isSetIgnoreJAXBElement();
			case SpringPackage.JAXB_DATA_FORMAT__PART_CLASS:
				return PART_CLASS_EDEFAULT == null ? partClass != null : !PART_CLASS_EDEFAULT.equals(partClass);
			case SpringPackage.JAXB_DATA_FORMAT__PART_NAMESPACE:
				return PART_NAMESPACE_EDEFAULT == null ? partNamespace != null : !PART_NAMESPACE_EDEFAULT.equals(partNamespace);
			case SpringPackage.JAXB_DATA_FORMAT__PRETTY_PRINT:
				return isSetPrettyPrint();
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
		result.append(" (contextPath: ");
		result.append(contextPath);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", filterNonXmlChars: ");
		if (filterNonXmlCharsESet) result.append(filterNonXmlChars); else result.append("<unset>");
		result.append(", fragment: ");
		if (fragmentESet) result.append(fragment); else result.append("<unset>");
		result.append(", ignoreJAXBElement: ");
		if (ignoreJAXBElementESet) result.append(ignoreJAXBElement); else result.append("<unset>");
		result.append(", partClass: ");
		result.append(partClass);
		result.append(", partNamespace: ");
		result.append(partNamespace);
		result.append(", prettyPrint: ");
		if (prettyPrintESet) result.append(prettyPrint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //JaxbDataFormatImpl
