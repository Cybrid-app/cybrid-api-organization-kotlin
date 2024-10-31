# SubscriptionsApi

All URIs are relative to *https://organization.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscription**](SubscriptionsApi.md#createSubscription) | **POST** api/subscriptions/ | Create Subscription
[**deleteSubscription**](SubscriptionsApi.md#deleteSubscription) | **DELETE** api/subscriptions/{subscription_guid} | Delete Subscription
[**getSubscription**](SubscriptionsApi.md#getSubscription) | **GET** api/subscriptions/{subscription_guid} | Get Subscription 
[**listSubscriptions**](SubscriptionsApi.md#listSubscriptions) | **GET** api/subscriptions | Get subscriptions list



Create Subscription

Creates a Subscription.  ## Subscription creation  Subscriptions can be created for webhook endpoints.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the subscription details in our private store | | completed | The Platform has created the subscription | | failed | The Platform was not able to successfully create the subscription |    Required scope: **subscriptions:execute

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionsApi::class.java)
val postSubscriptionOrganizationModel : PostSubscriptionOrganizationModel =  // PostSubscriptionOrganizationModel | 

launch(Dispatchers.IO) {
    val result : SubscriptionOrganizationModel = webService.createSubscription(postSubscriptionOrganizationModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSubscriptionOrganizationModel** | [**PostSubscriptionOrganizationModel**](PostSubscriptionOrganizationModel.md)|  |

### Return type

[**SubscriptionOrganizationModel**](SubscriptionOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete Subscription

Deletes a subscription.  Required scope: **subscriptions:execute**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionsApi::class.java)
val subscriptionGuid : kotlin.String = subscriptionGuid_example // kotlin.String | Identifier for the subscription.

launch(Dispatchers.IO) {
    webService.deleteSubscription(subscriptionGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionGuid** | **kotlin.String**| Identifier for the subscription. |

### Return type

null (empty response body)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Subscription 

Retrieves a subscription.  Required scope: **subscriptions:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionsApi::class.java)
val subscriptionGuid : kotlin.String = subscriptionGuid_example // kotlin.String | Identifier for the subscription.

launch(Dispatchers.IO) {
    val result : SubscriptionOrganizationModel = webService.getSubscription(subscriptionGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionGuid** | **kotlin.String**| Identifier for the subscription. |

### Return type

[**SubscriptionOrganizationModel**](SubscriptionOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get subscriptions list

Retrieves a listing of subscriptions.  Required scope: **subscriptions:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated subscription_guids to list subscriptions for.
val environment : kotlin.String = environment_example // kotlin.String | Environment to list subscriptions for.
val state : kotlin.String = state_example // kotlin.String | State to list subscriptions for.

launch(Dispatchers.IO) {
    val result : SubscriptionListOrganizationModel = webService.listSubscriptions(page, perPage, guid, environment, state)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated subscription_guids to list subscriptions for. | [optional]
 **environment** | **kotlin.String**| Environment to list subscriptions for. | [optional]
 **state** | **kotlin.String**| State to list subscriptions for. | [optional]

### Return type

[**SubscriptionListOrganizationModel**](SubscriptionListOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

