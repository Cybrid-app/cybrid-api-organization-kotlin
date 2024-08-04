# SubscriptionEventsApi

All URIs are relative to *https://organization.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubscriptionEvent**](SubscriptionEventsApi.md#getSubscriptionEvent) | **GET** api/subscription_events/{subscription_event_guid} | Get Subscription Event 
[**listSubscriptionEvents**](SubscriptionEventsApi.md#listSubscriptionEvents) | **GET** api/subscription_events | Get subscription events list



Get Subscription Event 

Retrieves a Subscription Event.  Required scope: **subscription_events:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionEventsApi::class.java)
val subscriptionEventGuid : kotlin.String = subscriptionEventGuid_example // kotlin.String | Identifier for the Subscription Event.

launch(Dispatchers.IO) {
    val result : SubscriptionEventOrganizationModel = webService.getSubscriptionEvent(subscriptionEventGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionEventGuid** | **kotlin.String**| Identifier for the Subscription Event. |

### Return type

[**SubscriptionEventOrganizationModel**](SubscriptionEventOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get subscription events list

Retrieves a listing of subscription events s.  Required scope: **subscription_events:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionEventsApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated subscription_event_guids to list subscription events for.

launch(Dispatchers.IO) {
    val result : SubscriptionEventListOrganizationModel = webService.listSubscriptionEvents(page, perPage, guid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated subscription_event_guids to list subscription events for. | [optional]

### Return type

[**SubscriptionEventListOrganizationModel**](SubscriptionEventListOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

