// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device Configuration Request Builder.
 */
public interface IBaseDeviceConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceConfigurationRequest instance
     */
    IDeviceConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceConfigurationRequest instance
     */
    IDeviceConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDeviceConfigurationAssignmentCollectionRequestBuilder assignments();

    IDeviceConfigurationAssignmentRequestBuilder assignments(final String id);

    IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses();

    IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id);

    IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses();

    IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview();

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview();

    ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    IDeviceConfigurationAssignCollectionRequestBuilder assign(final java.util.List<DeviceConfigurationAssignment> assignments);

}