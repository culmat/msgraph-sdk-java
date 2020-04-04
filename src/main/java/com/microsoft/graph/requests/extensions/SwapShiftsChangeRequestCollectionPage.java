// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SwapShiftsChangeRequest;
import com.microsoft.graph.requests.extensions.ISwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Swap Shifts Change Request Collection Page.
 */
public class SwapShiftsChangeRequestCollectionPage extends BaseCollectionPage<SwapShiftsChangeRequest, ISwapShiftsChangeRequestCollectionRequestBuilder> implements ISwapShiftsChangeRequestCollectionPage {

    /**
     * A collection page for SwapShiftsChangeRequest
     *
     * @param response the serialized SwapShiftsChangeRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SwapShiftsChangeRequestCollectionPage(final SwapShiftsChangeRequestCollectionResponse response, final ISwapShiftsChangeRequestCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
