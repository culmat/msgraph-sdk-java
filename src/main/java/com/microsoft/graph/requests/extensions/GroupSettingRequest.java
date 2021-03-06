// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupSettingRequest;
import com.microsoft.graph.requests.extensions.GroupSettingRequest;
import com.microsoft.graph.models.extensions.GroupSetting;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Setting Request.
 */
public class GroupSettingRequest extends BaseRequest implements IGroupSettingRequest {
	
    /**
     * The request for the GroupSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupSettingRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupSetting.class);
    }

    /**
     * Gets the GroupSetting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupSetting> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupSetting from the service
     *
     * @return the GroupSetting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupSetting get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupSetting> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupSetting with a source
     *
     * @param sourceGroupSetting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupSetting sourceGroupSetting, final ICallback<GroupSetting> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupSetting);
    }

    /**
     * Patches this GroupSetting with a source
     *
     * @param sourceGroupSetting the source object with updates
     * @return the updated GroupSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupSetting patch(final GroupSetting sourceGroupSetting) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupSetting);
    }

    /**
     * Creates a GroupSetting with a new object
     *
     * @param newGroupSetting the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupSetting newGroupSetting, final ICallback<GroupSetting> callback) {
        send(HttpMethod.POST, callback, newGroupSetting);
    }

    /**
     * Creates a GroupSetting with a new object
     *
     * @param newGroupSetting the new object to create
     * @return the created GroupSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupSetting post(final GroupSetting newGroupSetting) throws ClientException {
        return send(HttpMethod.POST, newGroupSetting);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupSettingRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (GroupSettingRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupSettingRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (GroupSettingRequest)this;
     }

}

