/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.graphrbac.UserGetMemberGroupsParameters;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in Users.
 */
public final class UsersInner {
    /** The Retrofit service to perform REST calls. */
    private UsersService service;
    /** The service client containing this operation class. */
    private GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of UsersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UsersInner(Retrofit retrofit, GraphRbacManagementClientImpl client) {
        this.service = retrofit.create(UsersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Users to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsersService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("{tenantID}/users")
        Call<ResponseBody> create(@Path("tenantID") String tenantID, @Body UserCreateParametersInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{tenantID}/users")
        Call<ResponseBody> list(@Path("tenantID") String tenantID, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{tenantID}/users/{upnOrObjectId}")
        Call<ResponseBody> get(@Path(value = "upnOrObjectId", encoded = true) String upnOrObjectId, @Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("{tenantID}/users/{upnOrObjectId}")
        Call<ResponseBody> update(@Path(value = "upnOrObjectId", encoded = true) String upnOrObjectId, @Path("tenantID") String tenantID, @Body UserUpdateParametersInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "{tenantID}/users/{upnOrObjectId}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path(value = "upnOrObjectId", encoded = true) String upnOrObjectId, @Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("{tenantID}/users/{objectId}/getMemberGroups")
        Call<ResponseBody> getMemberGroups(@Path(value = "objectId", encoded = true) String objectId, @Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body UserGetMemberGroupsParameters parameters, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{tenantID}/{nextLink}")
        Call<ResponseBody> listNext(@Path(value = "nextLink", encoded = true) String nextLink, @Path("tenantID") String tenantID, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create a new user. Reference: https://msdn.microsoft.com/library/azure/ad/graph/api/users-operations#CreateUser.
     *
     * @param parameters Parameters to create a user.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the UserInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<UserInner> create(UserCreateParametersInner parameters) throws CloudException, IOException, IllegalArgumentException {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        Call<ResponseBody> call = service.create(this.client.tenantID(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return createDelegate(call.execute());
    }

    /**
     * Create a new user. Reference: https://msdn.microsoft.com/library/azure/ad/graph/api/users-operations#CreateUser.
     *
     * @param parameters Parameters to create a user.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createAsync(UserCreateParametersInner parameters, final ServiceCallback<UserInner> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (parameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(parameters, serviceCallback);
        Call<ResponseBody> call = service.create(this.client.tenantID(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<UserInner>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<UserInner> createDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<UserInner, CloudException>(this.client.mapperAdapter())
                .register(201, new TypeToken<UserInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets list of users for the current tenant. Reference https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#GetUsers.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;UserInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<UserInner>> list() throws CloudException, IOException, IllegalArgumentException {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        Call<ResponseBody> call = service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        ServiceResponse<PageImpl1<UserInner>> response = listDelegate(call.execute());
        PagedList<UserInner> result = new PagedList<UserInner>(response.getBody()) {
            @Override
            public Page<UserInner> nextPage(String nextLink) throws CloudException, IOException {
                return listNext(nextLink).getBody();
            }
        };
        return new ServiceResponse<>(result, response.getResponse());
    }

    /**
     * Gets list of users for the current tenant. Reference https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#GetUsers.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final ListOperationCallback<UserInner> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        final String filter = null;
        Call<ResponseBody> call = service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<UserInner>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl1<UserInner>> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), result.getResponse()));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Gets list of users for the current tenant. Reference https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#GetUsers.
     *
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;UserInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<UserInner>> list(final String filter) throws CloudException, IOException, IllegalArgumentException {
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        ServiceResponse<PageImpl1<UserInner>> response = listDelegate(call.execute());
        PagedList<UserInner> result = new PagedList<UserInner>(response.getBody()) {
            @Override
            public Page<UserInner> nextPage(String nextLink) throws CloudException, IOException {
                return listNext(nextLink).getBody();
            }
        };
        return new ServiceResponse<>(result, response.getResponse());
    }

    /**
     * Gets list of users for the current tenant. Reference https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#GetUsers.
     *
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final String filter, final ListOperationCallback<UserInner> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.list(this.client.tenantID(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<UserInner>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl1<UserInner>> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), result.getResponse()));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PageImpl1<UserInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<UserInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<UserInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets user information from the directory. Reference: https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#GetAUser.
     *
     * @param upnOrObjectId User object Id or user principal name to get user information.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the UserInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<UserInner> get(String upnOrObjectId) throws CloudException, IOException, IllegalArgumentException {
        if (upnOrObjectId == null) {
            throw new IllegalArgumentException("Parameter upnOrObjectId is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(upnOrObjectId, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return getDelegate(call.execute());
    }

    /**
     * Gets user information from the directory. Reference: https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#GetAUser.
     *
     * @param upnOrObjectId User object Id or user principal name to get user information.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String upnOrObjectId, final ServiceCallback<UserInner> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (upnOrObjectId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter upnOrObjectId is required and cannot be null."));
            return null;
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(upnOrObjectId, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<UserInner>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<UserInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<UserInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<UserInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates an exisitng user. Reference: https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#UpdateUser.
     *
     * @param upnOrObjectId User object Id or user principal name to get user information.
     * @param parameters Parameters to update an exisitng user.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> update(String upnOrObjectId, UserUpdateParametersInner parameters) throws CloudException, IOException, IllegalArgumentException {
        if (upnOrObjectId == null) {
            throw new IllegalArgumentException("Parameter upnOrObjectId is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        Call<ResponseBody> call = service.update(upnOrObjectId, this.client.tenantID(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return updateDelegate(call.execute());
    }

    /**
     * Updates an exisitng user. Reference: https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#UpdateUser.
     *
     * @param upnOrObjectId User object Id or user principal name to get user information.
     * @param parameters Parameters to update an exisitng user.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateAsync(String upnOrObjectId, UserUpdateParametersInner parameters, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (upnOrObjectId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter upnOrObjectId is required and cannot be null."));
            return null;
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (parameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(parameters, serviceCallback);
        Call<ResponseBody> call = service.update(upnOrObjectId, this.client.tenantID(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Delete a user. Reference: https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#DeleteUser.
     *
     * @param upnOrObjectId user object id or user principal name (upn)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> delete(String upnOrObjectId) throws CloudException, IOException, IllegalArgumentException {
        if (upnOrObjectId == null) {
            throw new IllegalArgumentException("Parameter upnOrObjectId is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.delete(upnOrObjectId, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return deleteDelegate(call.execute());
    }

    /**
     * Delete a user. Reference: https://msdn.microsoft.com/en-us/library/azure/ad/graph/api/users-operations#DeleteUser.
     *
     * @param upnOrObjectId user object id or user principal name (upn)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteAsync(String upnOrObjectId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (upnOrObjectId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter upnOrObjectId is required and cannot be null."));
            return null;
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.delete(upnOrObjectId, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Gets a collection that contains the Object IDs of the groups of which the user is a member.
     *
     * @param objectId User filtering parameters.
     * @param securityEnabledOnly If true only membership in security enabled groups should be checked. Otherwise membership in all groups should be checked
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;String&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<List<String>> getMemberGroups(String objectId, boolean securityEnabledOnly) throws CloudException, IOException, IllegalArgumentException {
        if (objectId == null) {
            throw new IllegalArgumentException("Parameter objectId is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        UserGetMemberGroupsParameters parameters = new UserGetMemberGroupsParameters();
        parameters.withSecurityEnabledOnly(securityEnabledOnly);
        Call<ResponseBody> call = service.getMemberGroups(objectId, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        ServiceResponse<PageImpl<String>> response = getMemberGroupsDelegate(call.execute());
        List<String> result = response.getBody().getItems();
        return new ServiceResponse<>(result, response.getResponse());
    }

    /**
     * Gets a collection that contains the Object IDs of the groups of which the user is a member.
     *
     * @param objectId User filtering parameters.
     * @param securityEnabledOnly If true only membership in security enabled groups should be checked. Otherwise membership in all groups should be checked
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getMemberGroupsAsync(String objectId, boolean securityEnabledOnly, final ServiceCallback<List<String>> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (objectId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter objectId is required and cannot be null."));
            return null;
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        UserGetMemberGroupsParameters parameters = new UserGetMemberGroupsParameters();
        parameters.withSecurityEnabledOnly(securityEnabledOnly);
        Call<ResponseBody> call = service.getMemberGroups(objectId, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<String>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl<String>> result = getMemberGroupsDelegate(response);
                    serviceCallback.success(new ServiceResponse<>(result.getBody().getItems(), result.getResponse()));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PageImpl<String>> getMemberGroupsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<String>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<String>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets list of users for the current tenant.
     *
     * @param nextLink Next link for list operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;UserInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl1<UserInner>> listNext(final String nextLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextLink == null) {
            throw new IllegalArgumentException("Parameter nextLink is required and cannot be null.");
        }
        if (this.client.tenantID() == null) {
            throw new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextLink, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return listNextDelegate(call.execute());
    }

    /**
     * Gets list of users for the current tenant.
     *
     * @param nextLink Next link for list operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listNextAsync(final String nextLink, final ServiceCall serviceCall, final ListOperationCallback<UserInner> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (nextLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
            return null;
        }
        if (this.client.tenantID() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.tenantID() is required and cannot be null."));
            return null;
        }
        if (this.client.apiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextLink, this.client.tenantID(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        serviceCall.newCall(call);
        call.enqueue(new ServiceResponseCallback<List<UserInner>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl1<UserInner>> result = listNextDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), result.getResponse()));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PageImpl1<UserInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl1<UserInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl1<UserInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}