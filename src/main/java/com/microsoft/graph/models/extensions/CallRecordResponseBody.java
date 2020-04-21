// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Response Body.
 */
public class CallRecordResponseBody {

    /**
     * The prompts.
     * 
     */
    @SerializedName("prompts")
    @Expose
    public java.util.List<Prompt> prompts;

    /**
     * The barge In Allowed.
     * 
     */
    @SerializedName("bargeInAllowed")
    @Expose
    public Boolean bargeInAllowed;

    /**
     * The initial Silence Timeout In Seconds.
     * 
     */
    @SerializedName("initialSilenceTimeoutInSeconds")
    @Expose
    public Integer initialSilenceTimeoutInSeconds;

    /**
     * The max Silence Timeout In Seconds.
     * 
     */
    @SerializedName("maxSilenceTimeoutInSeconds")
    @Expose
    public Integer maxSilenceTimeoutInSeconds;

    /**
     * The max Record Duration In Seconds.
     * 
     */
    @SerializedName("maxRecordDurationInSeconds")
    @Expose
    public Integer maxRecordDurationInSeconds;

    /**
     * The play Beep.
     * 
     */
    @SerializedName("playBeep")
    @Expose
    public Boolean playBeep;

    /**
     * The stop Tones.
     * 
     */
    @SerializedName("stopTones")
    @Expose
    public java.util.List<String> stopTones;

    /**
     * The client Context.
     * 
     */
    @SerializedName("clientContext")
    @Expose
    public String clientContext;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
