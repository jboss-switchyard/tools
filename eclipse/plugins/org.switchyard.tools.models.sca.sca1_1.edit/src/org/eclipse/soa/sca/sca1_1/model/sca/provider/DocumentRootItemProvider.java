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
import org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaFactory;
import org.eclipse.soa.sca.sca1_1.model.sca.ScaPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.soa.sca.sca1_1.model.sca.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

            addCallback1PropertyDescriptor(object);
            addRequiresPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Callback1 feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addCallback1PropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DocumentRoot_callback1_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_callback1_feature", "_UI_DocumentRoot_type"),
                 ScaPackage.eINSTANCE.getDocumentRoot_Callback1(),
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
                 getString("_UI_DocumentRoot_requires_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_requires_feature", "_UI_DocumentRoot_type"),
                 ScaPackage.eINSTANCE.getDocumentRoot_Requires(),
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
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Binding());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_BindingEjb());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_BindingJca());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_BindingJms());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_BindingSca());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_BindingWs());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_BindingType());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Callback());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ComponentType());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Composite());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ConstrainingType());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Contribution());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Definitions());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Documentation());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Export());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ExportBase());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ExportC());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ExportCpp());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ExportJava());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Implementation());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationBpel());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationC());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationComposite());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationCpp());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationEjb());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJava());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJee());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationSpring());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationWeb());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImplementationType());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Import());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImportBase());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImportC());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImportCpp());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_ImportJava());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Include());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Intent());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Interface());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceC());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceCpp());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_OperationSelector());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_OperationSelectorJmsDefault());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_PolicySet());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_PolicySetAttachment());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_Value());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_WireFormat());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_WireFormatJmsDefault());
            childrenFeatures.add(ScaPackage.eINSTANCE.getDocumentRoot_WSCallback());
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
     * This returns DocumentRoot.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        String label = ((DocumentRoot)object).getCallback1();
        return label == null || label.length() == 0 ?
            getString("_UI_DocumentRoot_type") :
            getString("_UI_DocumentRoot_type") + " " + label;
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

        switch (notification.getFeatureID(DocumentRoot.class)) {
            case ScaPackage.DOCUMENT_ROOT__CALLBACK1:
            case ScaPackage.DOCUMENT_ROOT__REQUIRES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case ScaPackage.DOCUMENT_ROOT__BINDING:
            case ScaPackage.DOCUMENT_ROOT__BINDING_EJB:
            case ScaPackage.DOCUMENT_ROOT__BINDING_JCA:
            case ScaPackage.DOCUMENT_ROOT__BINDING_JMS:
            case ScaPackage.DOCUMENT_ROOT__BINDING_SCA:
            case ScaPackage.DOCUMENT_ROOT__BINDING_WS:
            case ScaPackage.DOCUMENT_ROOT__BINDING_TYPE:
            case ScaPackage.DOCUMENT_ROOT__CALLBACK:
            case ScaPackage.DOCUMENT_ROOT__COMPONENT_TYPE:
            case ScaPackage.DOCUMENT_ROOT__COMPOSITE:
            case ScaPackage.DOCUMENT_ROOT__CONSTRAINING_TYPE:
            case ScaPackage.DOCUMENT_ROOT__CONTRIBUTION:
            case ScaPackage.DOCUMENT_ROOT__DEFINITIONS:
            case ScaPackage.DOCUMENT_ROOT__DOCUMENTATION:
            case ScaPackage.DOCUMENT_ROOT__EXPORT:
            case ScaPackage.DOCUMENT_ROOT__EXPORT_BASE:
            case ScaPackage.DOCUMENT_ROOT__EXPORT_C:
            case ScaPackage.DOCUMENT_ROOT__EXPORT_CPP:
            case ScaPackage.DOCUMENT_ROOT__EXPORT_JAVA:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_BPEL:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_C:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_CPP:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_EJB:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JAVA:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_JEE:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_SPRING:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_WEB:
            case ScaPackage.DOCUMENT_ROOT__IMPLEMENTATION_TYPE:
            case ScaPackage.DOCUMENT_ROOT__IMPORT:
            case ScaPackage.DOCUMENT_ROOT__IMPORT_BASE:
            case ScaPackage.DOCUMENT_ROOT__IMPORT_C:
            case ScaPackage.DOCUMENT_ROOT__IMPORT_CPP:
            case ScaPackage.DOCUMENT_ROOT__IMPORT_JAVA:
            case ScaPackage.DOCUMENT_ROOT__INCLUDE:
            case ScaPackage.DOCUMENT_ROOT__INTENT:
            case ScaPackage.DOCUMENT_ROOT__INTERFACE:
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_C:
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_CPP:
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_JAVA:
            case ScaPackage.DOCUMENT_ROOT__INTERFACE_WSDL:
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR:
            case ScaPackage.DOCUMENT_ROOT__OPERATION_SELECTOR_JMS_DEFAULT:
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET:
            case ScaPackage.DOCUMENT_ROOT__POLICY_SET_ATTACHMENT:
            case ScaPackage.DOCUMENT_ROOT__VALUE:
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT:
            case ScaPackage.DOCUMENT_ROOT__WIRE_FORMAT_JMS_DEFAULT:
            case ScaPackage.DOCUMENT_ROOT__WS_CALLBACK:
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
                (ScaPackage.eINSTANCE.getDocumentRoot_BindingEjb(),
                 ScaFactory.eINSTANCE.createEJBSessionBeanBinding()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_BindingJca(),
                 ScaFactory.eINSTANCE.createJCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_BindingJms(),
                 ScaFactory.eINSTANCE.createJMSBinding()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_BindingSca(),
                 ScaFactory.eINSTANCE.createSCABinding()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_BindingWs(),
                 ScaFactory.eINSTANCE.createWebServiceBinding()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_BindingType(),
                 ScaFactory.eINSTANCE.createBindingType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Callback(),
                 ScaFactory.eINSTANCE.createCallback()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ComponentType(),
                 ScaFactory.eINSTANCE.createComponentType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Composite(),
                 ScaFactory.eINSTANCE.createComposite()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ConstrainingType(),
                 ScaFactory.eINSTANCE.createConstrainingType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Contribution(),
                 ScaFactory.eINSTANCE.createContributionType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Definitions(),
                 ScaFactory.eINSTANCE.createTDefinitions()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Documentation(),
                 ScaFactory.eINSTANCE.createDocumentation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Export(),
                 ScaFactory.eINSTANCE.createExportType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ExportC(),
                 ScaFactory.eINSTANCE.createCExport()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ExportCpp(),
                 ScaFactory.eINSTANCE.createCPPExport()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ExportJava(),
                 ScaFactory.eINSTANCE.createJavaExportType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationBpel(),
                 ScaFactory.eINSTANCE.createBPELImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationC(),
                 ScaFactory.eINSTANCE.createCImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationComposite(),
                 ScaFactory.eINSTANCE.createSCAImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationCpp(),
                 ScaFactory.eINSTANCE.createCPPImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationEjb(),
                 ScaFactory.eINSTANCE.createEJBImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJava(),
                 ScaFactory.eINSTANCE.createJavaImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationJee(),
                 ScaFactory.eINSTANCE.createJEEImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationSpring(),
                 ScaFactory.eINSTANCE.createSpringImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationWeb(),
                 ScaFactory.eINSTANCE.createWebImplementation()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImplementationType(),
                 ScaFactory.eINSTANCE.createImplementationType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Import(),
                 ScaFactory.eINSTANCE.createImportType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImportC(),
                 ScaFactory.eINSTANCE.createCImport()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImportCpp(),
                 ScaFactory.eINSTANCE.createCPPImport()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_ImportJava(),
                 ScaFactory.eINSTANCE.createJavaImportType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Include(),
                 ScaFactory.eINSTANCE.createInclude()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Intent(),
                 ScaFactory.eINSTANCE.createIntent()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_InterfaceC(),
                 ScaFactory.eINSTANCE.createCInterface()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_InterfaceCpp(),
                 ScaFactory.eINSTANCE.createCPPInterface()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_InterfaceJava(),
                 ScaFactory.eINSTANCE.createJavaInterface()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_InterfaceWsdl(),
                 ScaFactory.eINSTANCE.createWSDLPortType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_PolicySet(),
                 ScaFactory.eINSTANCE.createPolicySet()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_PolicySetAttachment(),
                 ScaFactory.eINSTANCE.createPolicySetAttachment()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_Value(),
                 ScaFactory.eINSTANCE.createValueType()));

        newChildDescriptors.add
            (createChildParameter
                (ScaPackage.eINSTANCE.getDocumentRoot_WSCallback(),
                 ScaFactory.eINSTANCE.createWSCallbackType()));
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
