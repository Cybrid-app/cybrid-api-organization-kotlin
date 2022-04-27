# OrganizationsApi

All URIs are relative to *https://organization.demo.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrganization**](OrganizationsApi.md#getOrganization) | **GET** /api/organizations/{organization_guid} | Get organization
[**updateOrganization**](OrganizationsApi.md#updateOrganization) | **PATCH** /api/organizations/{organization_guid} | Patch organization


<a name="getOrganization"></a>
# **getOrganization**
> OrganizationOrganizationModel getOrganization(organizationGuid)

Get organization

Retrieve an organization.  Required scope: **organizations:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiInstance = OrganizationsApi()
val organizationGuid : kotlin.String = organizationGuid_example // kotlin.String | Identifier for the organization.
try {
    val result : OrganizationOrganizationModel = apiInstance.getOrganization(organizationGuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#getOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#getOrganization")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOrganization"></a>
# **updateOrganization**
> OrganizationOrganizationModel updateOrganization(organizationGuid, patchOrganizationOrganizationModel)

Patch organization

Update an organization.  Required scope: **organizations:write**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiInstance = OrganizationsApi()
val organizationGuid : kotlin.String = organizationGuid_example // kotlin.String | Identifier for the organization.
val patchOrganizationOrganizationModel : PatchOrganizationOrganizationModel =  // PatchOrganizationOrganizationModel | 
try {
    val result : OrganizationOrganizationModel = apiInstance.updateOrganization(organizationGuid, patchOrganizationOrganizationModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#updateOrganization")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#updateOrganization")
    e.printStackTrace()
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
    ApiClient.accessToken = ""
Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

