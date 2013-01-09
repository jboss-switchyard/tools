/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.ftp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.FtpPackage;

import org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.ftp.RemoteFileConsumerType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteFileConsumerTypeItemProvider
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
    public RemoteFileConsumerTypeItemProvider(AdapterFactory adapterFactory) {
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

            addDeletePropertyDescriptor(object);
            addRecursivePropertyDescriptor(object);
            addNoopPropertyDescriptor(object);
            addPreMovePropertyDescriptor(object);
            addMovePropertyDescriptor(object);
            addMoveFailedPropertyDescriptor(object);
            addIncludePropertyDescriptor(object);
            addExcludePropertyDescriptor(object);
            addIdempotentPropertyDescriptor(object);
            addIdempotentRepositoryPropertyDescriptor(object);
            addInProgressRepositoryPropertyDescriptor(object);
            addFilterPropertyDescriptor(object);
            addSorterPropertyDescriptor(object);
            addSortByPropertyDescriptor(object);
            addReadLockPropertyDescriptor(object);
            addReadLockTimeoutPropertyDescriptor(object);
            addReadLockCheckIntervalPropertyDescriptor(object);
            addExclusiveReadLockStrategyPropertyDescriptor(object);
            addProcessStrategyPropertyDescriptor(object);
            addStartingDirectoryMustExistPropertyDescriptor(object);
            addDirectoryMustExistPropertyDescriptor(object);
            addDoneFileNamePropertyDescriptor(object);
            addMaxMessagesPerPollPropertyDescriptor(object);
            addInitialDelayPropertyDescriptor(object);
            addDelayPropertyDescriptor(object);
            addUseFixedDelayPropertyDescriptor(object);
            addSendEmptyMessageWhenIdlePropertyDescriptor(object);
            addTimeUnitPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Delete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeletePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_delete_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_delete_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__DELETE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Recursive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRecursivePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_recursive_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_recursive_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Noop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNoopPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_noop_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_noop_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__NOOP,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Pre Move feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPreMovePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_preMove_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_preMove_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Move feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMovePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_move_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_move_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__MOVE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Move Failed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMoveFailedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_moveFailed_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_moveFailed_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Include feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncludePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_include_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_include_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__INCLUDE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exclude feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExcludePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_exclude_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_exclude_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Idempotent feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdempotentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_idempotent_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_idempotent_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Idempotent Repository feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdempotentRepositoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_idempotentRepository_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_idempotentRepository_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the In Progress Repository feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInProgressRepositoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_inProgressRepository_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_inProgressRepository_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Filter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFilterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_filter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_filter_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__FILTER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sorter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSorterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_sorter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_sorter_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__SORTER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Sort By feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSortByPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_sortBy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_sortBy_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__SORT_BY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Read Lock feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadLockPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_readLock_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_readLock_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Read Lock Timeout feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadLockTimeoutPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_readLockTimeout_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_readLockTimeout_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Read Lock Check Interval feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadLockCheckIntervalPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_readLockCheckInterval_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_readLockCheckInterval_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Exclusive Read Lock Strategy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExclusiveReadLockStrategyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_exclusiveReadLockStrategy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_exclusiveReadLockStrategy_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Process Strategy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessStrategyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_processStrategy_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_processStrategy_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Starting Directory Must Exist feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartingDirectoryMustExistPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_startingDirectoryMustExist_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_startingDirectoryMustExist_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Directory Must Exist feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDirectoryMustExistPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_directoryMustExist_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_directoryMustExist_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Done File Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDoneFileNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_doneFileName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_doneFileName_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Messages Per Poll feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxMessagesPerPollPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_maxMessagesPerPoll_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_maxMessagesPerPoll_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Initial Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInitialDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_initialDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_initialDelay_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_delay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_delay_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Use Fixed Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUseFixedDelayPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_useFixedDelay_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_useFixedDelay_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Send Empty Message When Idle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSendEmptyMessageWhenIdlePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_sendEmptyMessageWhenIdle_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_sendEmptyMessageWhenIdle_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Time Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeUnitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_RemoteFileConsumerType_timeUnit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_RemoteFileConsumerType_timeUnit_feature", "_UI_RemoteFileConsumerType_type"),
                 FtpPackage.Literals.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns RemoteFileConsumerType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RemoteFileConsumerType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RemoteFileConsumerType)object).getDoneFileName();
        return label == null || label.length() == 0 ?
            getString("_UI_RemoteFileConsumerType_type") :
            getString("_UI_RemoteFileConsumerType_type") + " " + label;
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

        switch (notification.getFeatureID(RemoteFileConsumerType.class)) {
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELETE:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__RECURSIVE:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__NOOP:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PRE_MOVE:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MOVE_FAILED:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INCLUDE:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUDE:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IDEMPOTENT_REPOSITORY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__IN_PROGRESS_REPOSITORY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__FILTER:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORTER:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SORT_BY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_TIMEOUT:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__READ_LOCK_CHECK_INTERVAL:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__EXCLUSIVE_READ_LOCK_STRATEGY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__PROCESS_STRATEGY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__STARTING_DIRECTORY_MUST_EXIST:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DIRECTORY_MUST_EXIST:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DONE_FILE_NAME:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__MAX_MESSAGES_PER_POLL:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__INITIAL_DELAY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__DELAY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__USE_FIXED_DELAY:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__SEND_EMPTY_MESSAGE_WHEN_IDLE:
            case FtpPackage.REMOTE_FILE_CONSUMER_TYPE__TIME_UNIT:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}
