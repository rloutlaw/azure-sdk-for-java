/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.network.implementation.ApplicationGatewaysInner;
import com.microsoft.azure.management.network.implementation.NetworkManager;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;


/**
 * Entry point to application gateway management API in Azure.
 */
@Fluent()
public interface ApplicationGateways extends
    SupportsCreating<ApplicationGateway.DefinitionStages.Blank>,
    SupportsListing<ApplicationGateway>,
    SupportsListingByGroup<ApplicationGateway>,
    SupportsGettingByGroup<ApplicationGateway>,
    SupportsGettingById<ApplicationGateway>,
    SupportsDeletingById,
    SupportsDeletingByGroup,
    SupportsBatchCreation<ApplicationGateway>,
    HasManager<NetworkManager>,
    HasInner<ApplicationGatewaysInner> {
}
