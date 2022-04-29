# OrganizationsApi

All URIs are relative to *https://organization.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrganization**](OrganizationsApi.md#getOrganization) | **GET** api/organizations/{organization_guid} | Get organization
[**updateOrganization**](OrganizationsApi.md#updateOrganization) | **PATCH** api/organizations/{organization_guid} | Patch organization



Get organization

Retrieve an organization.  Required scope: **organizations:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(OrganizationsApi::class.java)
val organizationGuid : kotlin.String = organizationGuid_example // kotlin.String | Identifier for the organization.

launch(Dispatchers.IO) {
    val result : OrganizationOrganizationModel = webService.getOrganization(organizationGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationGuid** | **kotlin.String**| Identifier for the organization. |

### Return type

[**OrganizationOrganizationModel**](OrganizationOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Patch organization

Update an organization.  Required scope: **organizations:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(OrganizationsApi::class.java)
val organizationGuid : kotlin.String = organizationGuid_example // kotlin.String | Identifier for the organization.
val patchOrganizationOrganizationModel : PatchOrganizationOrganizationModel =  // PatchOrganizationOrganizationModel | 

launch(Dispatchers.IO) {
    val result : OrganizationOrganizationModel = webService.updateOrganization(organizationGuid, patchOrganizationOrganizationModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationGuid** | **kotlin.String**| Identifier for the organization. |
 **patchOrganizationOrganizationModel** | [**PatchOrganizationOrganizationModel**](PatchOrganizationOrganizationModel.md)|  |

### Return type

[**OrganizationOrganizationModel**](OrganizationOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

