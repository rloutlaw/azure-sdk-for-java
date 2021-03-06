/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datalake.analytics.models.AddDataLakeStoreParameters;
import com.microsoft.azure.management.datalake.analytics.models.DataLakeStoreAccountInfo;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DataLakeStoreAccounts.
 */
public interface DataLakeStoreAccounts {
    /**
     * Gets the specified Data Lake Store account details in the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to retrieve the Data Lake Store account details.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to retrieve
     * @return the DataLakeStoreAccountInfo object if successful.
     */
    DataLakeStoreAccountInfo get(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Gets the specified Data Lake Store account details in the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to retrieve the Data Lake Store account details.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to retrieve
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DataLakeStoreAccountInfo> getAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, final ServiceCallback<DataLakeStoreAccountInfo> serviceCallback);

    /**
     * Gets the specified Data Lake Store account details in the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to retrieve the Data Lake Store account details.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to retrieve
     * @return the observable to the DataLakeStoreAccountInfo object
     */
    Observable<DataLakeStoreAccountInfo> getAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Gets the specified Data Lake Store account details in the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to retrieve the Data Lake Store account details.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to retrieve
     * @return the observable to the DataLakeStoreAccountInfo object
     */
    Observable<ServiceResponse<DataLakeStoreAccountInfo>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the Data Lake Analytics account specified to remove the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to remove the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to remove
     */
    void delete(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the Data Lake Analytics account specified to remove the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to remove the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to remove
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, final ServiceCallback<Void> serviceCallback);

    /**
     * Updates the Data Lake Analytics account specified to remove the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to remove the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to remove
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the Data Lake Analytics account specified to remove the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account from which to remove the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to remove
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     */
    void add(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> addAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, final ServiceCallback<Void> serviceCallback);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> addAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> addWithServiceResponseAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName);
    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @param parameters The details of the Data Lake Store account.
     */
    void add(String resourceGroupName, String accountName, String dataLakeStoreAccountName, AddDataLakeStoreParameters parameters);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @param parameters The details of the Data Lake Store account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> addAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, AddDataLakeStoreParameters parameters, final ServiceCallback<Void> serviceCallback);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @param parameters The details of the Data Lake Store account.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> addAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, AddDataLakeStoreParameters parameters);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account to which to add the Data Lake Store account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @param parameters The details of the Data Lake Store account.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> addWithServiceResponseAsync(String resourceGroupName, String accountName, String dataLakeStoreAccountName, AddDataLakeStoreParameters parameters);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @return the PagedList&lt;DataLakeStoreAccountInfo&gt; object if successful.
     */
    PagedList<DataLakeStoreAccountInfo> listByAccount(final String resourceGroupName, final String accountName);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DataLakeStoreAccountInfo>> listByAccountAsync(final String resourceGroupName, final String accountName, final ListOperationCallback<DataLakeStoreAccountInfo> serviceCallback);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @return the observable to the PagedList&lt;DataLakeStoreAccountInfo&gt; object
     */
    Observable<Page<DataLakeStoreAccountInfo>> listByAccountAsync(final String resourceGroupName, final String accountName);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @return the observable to the PagedList&lt;DataLakeStoreAccountInfo&gt; object
     */
    Observable<ServiceResponse<Page<DataLakeStoreAccountInfo>>> listByAccountWithServiceResponseAsync(final String resourceGroupName, final String accountName);
    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @return the PagedList&lt;DataLakeStoreAccountInfo&gt; object if successful.
     */
    PagedList<DataLakeStoreAccountInfo> listByAccount(final String resourceGroupName, final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DataLakeStoreAccountInfo>> listByAccountAsync(final String resourceGroupName, final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count, final ListOperationCallback<DataLakeStoreAccountInfo> serviceCallback);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @return the observable to the PagedList&lt;DataLakeStoreAccountInfo&gt; object
     */
    Observable<Page<DataLakeStoreAccountInfo>> listByAccountAsync(final String resourceGroupName, final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Analytics account.
     * @param accountName The name of the Data Lake Analytics account for which to list Data Lake Store accounts.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g. Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the resources in the response, e.g. Categories?$count=true. Optional.
     * @return the observable to the PagedList&lt;DataLakeStoreAccountInfo&gt; object
     */
    Observable<ServiceResponse<Page<DataLakeStoreAccountInfo>>> listByAccountWithServiceResponseAsync(final String resourceGroupName, final String accountName, final String filter, final Integer top, final Integer skip, final String select, final String orderby, final Boolean count);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PagedList&lt;DataLakeStoreAccountInfo&gt; object if successful.
     */
    PagedList<DataLakeStoreAccountInfo> listByAccountNext(final String nextPageLink);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DataLakeStoreAccountInfo>> listByAccountNextAsync(final String nextPageLink, final ServiceFuture<List<DataLakeStoreAccountInfo>> serviceFuture, final ListOperationCallback<DataLakeStoreAccountInfo> serviceCallback);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;DataLakeStoreAccountInfo&gt; object
     */
    Observable<Page<DataLakeStoreAccountInfo>> listByAccountNextAsync(final String nextPageLink);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response includes a link to the next page, if any.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;DataLakeStoreAccountInfo&gt; object
     */
    Observable<ServiceResponse<Page<DataLakeStoreAccountInfo>>> listByAccountNextWithServiceResponseAsync(final String nextPageLink);

}
