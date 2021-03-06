// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat Collection Request.
 */
public class ItemActivityStatCollectionRequest extends BaseCollectionRequest<ItemActivityStatCollectionResponse, IItemActivityStatCollectionPage> implements IItemActivityStatCollectionRequest {

    /**
     * The request builder for this collection of ItemActivityStat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityStatCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemActivityStatCollectionResponse.class, IItemActivityStatCollectionPage.class);
    }

    public void get(final ICallback<IItemActivityStatCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IItemActivityStatCollectionPage get() throws ClientException {
        final ItemActivityStatCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ItemActivityStat newItemActivityStat, final ICallback<ItemActivityStat> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ItemActivityStatRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newItemActivityStat, callback);
    }

    public ItemActivityStat post(final ItemActivityStat newItemActivityStat) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ItemActivityStatRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newItemActivityStat);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemActivityStatCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ItemActivityStatCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemActivityStatCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ItemActivityStatCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IItemActivityStatCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ItemActivityStatCollectionRequest)this;
    }

    public IItemActivityStatCollectionPage buildFromResponse(final ItemActivityStatCollectionResponse response) {
        final IItemActivityStatCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ItemActivityStatCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ItemActivityStatCollectionPage page = new ItemActivityStatCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
