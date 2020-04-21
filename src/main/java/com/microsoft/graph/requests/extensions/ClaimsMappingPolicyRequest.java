// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IClaimsMappingPolicyRequest;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyRequest;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Claims Mapping Policy Request.
 */
public class ClaimsMappingPolicyRequest extends BaseRequest implements IClaimsMappingPolicyRequest {
	
    /**
     * The request for the ClaimsMappingPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ClaimsMappingPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ClaimsMappingPolicy.class);
    }

    /**
     * Gets the ClaimsMappingPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ClaimsMappingPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ClaimsMappingPolicy from the service
     *
     * @return the ClaimsMappingPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ClaimsMappingPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ClaimsMappingPolicy> callback) {
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
     * Patches this ClaimsMappingPolicy with a source
     *
     * @param sourceClaimsMappingPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ClaimsMappingPolicy sourceClaimsMappingPolicy, final ICallback<ClaimsMappingPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceClaimsMappingPolicy);
    }

    /**
     * Patches this ClaimsMappingPolicy with a source
     *
     * @param sourceClaimsMappingPolicy the source object with updates
     * @return the updated ClaimsMappingPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ClaimsMappingPolicy patch(final ClaimsMappingPolicy sourceClaimsMappingPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceClaimsMappingPolicy);
    }

    /**
     * Creates a ClaimsMappingPolicy with a new object
     *
     * @param newClaimsMappingPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ClaimsMappingPolicy newClaimsMappingPolicy, final ICallback<ClaimsMappingPolicy> callback) {
        send(HttpMethod.POST, callback, newClaimsMappingPolicy);
    }

    /**
     * Creates a ClaimsMappingPolicy with a new object
     *
     * @param newClaimsMappingPolicy the new object to create
     * @return the created ClaimsMappingPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ClaimsMappingPolicy post(final ClaimsMappingPolicy newClaimsMappingPolicy) throws ClientException {
        return send(HttpMethod.POST, newClaimsMappingPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IClaimsMappingPolicyRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ClaimsMappingPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IClaimsMappingPolicyRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ClaimsMappingPolicyRequest)this;
     }

}

