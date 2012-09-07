/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.soa.sca.sca1_1.model.sca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.soa.sca.core.model.addressing.AddressingFactory;
import org.eclipse.soa.sca.core.model.addressing.AddressingPackage;
import org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.soa.sca.sca1_1.model.sca.SCAPropertyBase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SCAPropertyBaseItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCAPropertyBaseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPolicySetsPropertyDescriptor(object);
			addRequiresPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Policy Sets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolicySetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SCAPropertyBase_policySets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SCAPropertyBase_policySets_feature", "_UI_SCAPropertyBase_type"),
				 ScaPackage.eINSTANCE.getSCAPropertyBase_PolicySets(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requires feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SCAPropertyBase_requires_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SCAPropertyBase_requires_feature", "_UI_SCAPropertyBase_type"),
				 ScaPackage.eINSTANCE.getSCAPropertyBase_Requires(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SCAPropertyBase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SCAPropertyBase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		List labelValue = ((SCAPropertyBase)object).getPolicySets();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SCAPropertyBase_type") :
			getString("_UI_SCAPropertyBase_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SCAPropertyBase.class)) {
			case ScaPackage.SCA_PROPERTY_BASE__POLICY_SETS:
			case ScaPackage.SCA_PROPERTY_BASE__REQUIRES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ScaPackage.SCA_PROPERTY_BASE__MIXED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_BindingEjb(),
					 ScaFactory.eINSTANCE.createEJBSessionBeanBinding())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_BindingJca(),
					 ScaFactory.eINSTANCE.createJCABinding())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_BindingJms(),
					 ScaFactory.eINSTANCE.createJMSBinding())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_BindingSca(),
					 ScaFactory.eINSTANCE.createSCABinding())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_BindingWs(),
					 ScaFactory.eINSTANCE.createWebServiceBinding())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_BindingType(),
					 ScaFactory.eINSTANCE.createBindingType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Callback(),
					 ScaFactory.eINSTANCE.createCallback())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ComponentType(),
					 ScaFactory.eINSTANCE.createComponentType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Composite(),
					 ScaFactory.eINSTANCE.createComposite())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ConstrainingType(),
					 ScaFactory.eINSTANCE.createConstrainingType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Contribution(),
					 ScaFactory.eINSTANCE.createContributionType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Definitions(),
					 ScaFactory.eINSTANCE.createTDefinitions())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Documentation(),
					 ScaFactory.eINSTANCE.createDocumentation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Export(),
					 ScaFactory.eINSTANCE.createExportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ExportC(),
					 ScaFactory.eINSTANCE.createCExport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ExportCpp(),
					 ScaFactory.eINSTANCE.createCPPExport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ExportJava(),
					 ScaFactory.eINSTANCE.createJavaExportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationBpel(),
					 ScaFactory.eINSTANCE.createBPELImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationC(),
					 ScaFactory.eINSTANCE.createCImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationComposite(),
					 ScaFactory.eINSTANCE.createSCAImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationCpp(),
					 ScaFactory.eINSTANCE.createCPPImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationEjb(),
					 ScaFactory.eINSTANCE.createEJBImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJava(),
					 ScaFactory.eINSTANCE.createJavaImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJee(),
					 ScaFactory.eINSTANCE.createJEEImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationSpring(),
					 ScaFactory.eINSTANCE.createSpringImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationWeb(),
					 ScaFactory.eINSTANCE.createWebImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationType(),
					 ScaFactory.eINSTANCE.createImplementationType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Import(),
					 ScaFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImportC(),
					 ScaFactory.eINSTANCE.createCImport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImportCpp(),
					 ScaFactory.eINSTANCE.createCPPImport())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_ImportJava(),
					 ScaFactory.eINSTANCE.createJavaImportType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Include(),
					 ScaFactory.eINSTANCE.createInclude())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Intent(),
					 ScaFactory.eINSTANCE.createIntent())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceC(),
					 ScaFactory.eINSTANCE.createCInterface())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceCpp(),
					 ScaFactory.eINSTANCE.createCPPInterface())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
					 ScaFactory.eINSTANCE.createJavaInterface())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(),
					 ScaFactory.eINSTANCE.createWSDLPortType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_PolicySet(),
					 ScaFactory.eINSTANCE.createPolicySet())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_PolicySetAttachment(),
					 ScaFactory.eINSTANCE.createPolicySetAttachment())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_Value(),
					 ScaFactory.eINSTANCE.createValueType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(ScaPackage.eINSTANCE.getDocumentRoot_WSCallback(),
					 ScaFactory.eINSTANCE.createWSCallbackType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ACTION,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__FROM,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__METADATA,
					 AddressingFactory.eINSTANCE.createMetadataType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_ACTION,
					 AddressingFactory.eINSTANCE.createProblemActionType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_HEADER_QNAME,
					 AddressingFactory.eINSTANCE.createAttributedQNameType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REFERENCE_PARAMETERS,
					 AddressingFactory.eINSTANCE.createReferenceParametersType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RELATES_TO,
					 AddressingFactory.eINSTANCE.createRelatesToType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO,
					 AddressingFactory.eINSTANCE.createEndpointReferenceType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__RETRY_AFTER,
					 AddressingFactory.eINSTANCE.createAttributedUnsignedLongType())));

		newChildDescriptors.add
			(createChildParameter
				(ScaPackage.eINSTANCE.getSCAPropertyBase_Mixed(),
				 FeatureMapUtil.createEntry
					(AddressingPackage.Literals.DOCUMENT_ROOT__TO,
					 AddressingFactory.eINSTANCE.createAttributedURIType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ACTION ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__MESSAGE_ID ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__PROBLEM_IRI ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__ENDPOINT_REFERENCE ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FAULT_TO ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__FROM ||
			childFeature == AddressingPackage.Literals.DOCUMENT_ROOT__REPLY_TO;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
