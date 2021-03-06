// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.PolicyPlatformType;
import com.microsoft.graph.models.extensions.DeviceComplianceSettingState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceComplianceSettingStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Setting State Summary.
 */
public class DeviceCompliancePolicySettingStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Setting.
     * The setting class name and property name.
     */
    @SerializedName("setting")
    @Expose
    public String setting;

    /**
     * The Setting Name.
     * Name of the setting.
     */
    @SerializedName("settingName")
    @Expose
    public String settingName;

    /**
     * The Platform Type.
     * Setting platform. Possible values are: android, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, all.
     */
    @SerializedName("platformType")
    @Expose
    public PolicyPlatformType platformType;

    /**
     * The Unknown Device Count.
     * Number of unknown devices
     */
    @SerializedName("unknownDeviceCount")
    @Expose
    public Integer unknownDeviceCount;

    /**
     * The Not Applicable Device Count.
     * Number of not applicable devices
     */
    @SerializedName("notApplicableDeviceCount")
    @Expose
    public Integer notApplicableDeviceCount;

    /**
     * The Compliant Device Count.
     * Number of compliant devices
     */
    @SerializedName("compliantDeviceCount")
    @Expose
    public Integer compliantDeviceCount;

    /**
     * The Remediated Device Count.
     * Number of remediated devices
     */
    @SerializedName("remediatedDeviceCount")
    @Expose
    public Integer remediatedDeviceCount;

    /**
     * The Non Compliant Device Count.
     * Number of NonCompliant devices
     */
    @SerializedName("nonCompliantDeviceCount")
    @Expose
    public Integer nonCompliantDeviceCount;

    /**
     * The Error Device Count.
     * Number of error devices
     */
    @SerializedName("errorDeviceCount")
    @Expose
    public Integer errorDeviceCount;

    /**
     * The Conflict Device Count.
     * Number of conflict devices
     */
    @SerializedName("conflictDeviceCount")
    @Expose
    public Integer conflictDeviceCount;

    /**
     * The Device Compliance Setting States.
     * Not yet documented
     */
    public DeviceComplianceSettingStateCollectionPage deviceComplianceSettingStates;


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


        if (json.has("deviceComplianceSettingStates")) {
            final DeviceComplianceSettingStateCollectionResponse response = new DeviceComplianceSettingStateCollectionResponse();
            if (json.has("deviceComplianceSettingStates@odata.nextLink")) {
                response.nextLink = json.get("deviceComplianceSettingStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceComplianceSettingStates").toString(), JsonObject[].class);
            final DeviceComplianceSettingState[] array = new DeviceComplianceSettingState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceComplianceSettingState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceComplianceSettingStates = new DeviceComplianceSettingStateCollectionPage(response, null);
        }
    }
}
