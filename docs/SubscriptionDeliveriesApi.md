# SubscriptionDeliveriesApi

All URIs are relative to *https://organization.sandbox.cybrid.app*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubscriptionDelivery**](SubscriptionDeliveriesApi.md#createSubscriptionDelivery) | **POST** api/subscription_deliveries/ | Create SubscriptionDelivery
[**getSubscriptionDelivery**](SubscriptionDeliveriesApi.md#getSubscriptionDelivery) | **GET** api/subscription_deliveries/{subscription_delivery_guid} | Get Subscription Delivery 
[**listSubscriptionDeliveries**](SubscriptionDeliveriesApi.md#listSubscriptionDeliveries) | **GET** api/subscription_deliveries | Get subscription deliveries list



Create SubscriptionDelivery

Creates a SubscriptionDelivery.  ## Subscription Delivery  Create a SubscriptionDelivery to retry the delivery of a SubscriptionEvent to a Subscription.  ## State  | State | Description | |-------|-------------| | storing | The Platform is storing the SubscriptionDelivery details in our private store | | completed | The Platform has successfully delivered the SubscriptionEvent to specified Subscription | | failing | The Platform is failing to deliver the SubscriptionDelivery,  a new attempt will be made (see &#x60;next_attempt_at&#x60;) | | failed | The Platform has failed to deliver the SubscriptionDelivery, no more attempts will be made |    Required scope: **subscription_events:execute

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionDeliveriesApi::class.java)
val postSubscriptionDeliveryOrganizationModel : PostSubscriptionDeliveryOrganizationModel =  // PostSubscriptionDeliveryOrganizationModel | 

launch(Dispatchers.IO) {
    val result : SubscriptionDeliveryOrganizationModel = webService.createSubscriptionDelivery(postSubscriptionDeliveryOrganizationModel)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSubscriptionDeliveryOrganizationModel** | [**PostSubscriptionDeliveryOrganizationModel**](PostSubscriptionDeliveryOrganizationModel.md)|  |

### Return type

[**SubscriptionDeliveryOrganizationModel**](SubscriptionDeliveryOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Get Subscription Delivery 

Retrieves a subscription delivery.  Required scope: **subscription_events:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionDeliveriesApi::class.java)
val subscriptionDeliveryGuid : kotlin.String = subscriptionDeliveryGuid_example // kotlin.String | Identifier for the subscription delivery.

launch(Dispatchers.IO) {
    val result : SubscriptionDeliveryOrganizationModel = webService.getSubscriptionDelivery(subscriptionDeliveryGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionDeliveryGuid** | **kotlin.String**| Identifier for the subscription delivery. |

### Return type

[**SubscriptionDeliveryOrganizationModel**](SubscriptionDeliveryOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get subscription deliveries list

Retrieves a listing of subscription deliveries s.  Required scope: **subscription_events:read**

### Example
```kotlin
// Import classes:
//import app.cybrid.cybrid_api_organization.client.*
//import app.cybrid.cybrid_api_organization.client.infrastructure.*
//import app.cybrid.cybrid_api_organization.client.models.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(SubscriptionDeliveriesApi::class.java)
val page : java.math.BigDecimal = 56 // java.math.BigDecimal | The page index to retrieve.
val perPage : java.math.BigDecimal = 56 // java.math.BigDecimal | The number of entities per page to return.
val guid : kotlin.String = guid_example // kotlin.String | Comma separated subscription_delivery_guids to list subscription deliveries for.
val subscriptionEventGuid : kotlin.String = subscriptionEventGuid_example // kotlin.String | Comma separated subscription_event_guids to list subscription deliveries for.
val subscriptionGuid : kotlin.String = subscriptionGuid_example // kotlin.String | Comma separated subscription_guids to list subscription deliveries for.

launch(Dispatchers.IO) {
    val result : SubscriptionDeliveryListOrganizationModel = webService.listSubscriptionDeliveries(page, perPage, guid, subscriptionEventGuid, subscriptionGuid)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **java.math.BigDecimal**| The page index to retrieve. | [optional]
 **perPage** | **java.math.BigDecimal**| The number of entities per page to return. | [optional]
 **guid** | **kotlin.String**| Comma separated subscription_delivery_guids to list subscription deliveries for. | [optional]
 **subscriptionEventGuid** | **kotlin.String**| Comma separated subscription_event_guids to list subscription deliveries for. | [optional]
 **subscriptionGuid** | **kotlin.String**| Comma separated subscription_guids to list subscription deliveries for. | [optional]

### Return type

[**SubscriptionDeliveryListOrganizationModel**](SubscriptionDeliveryListOrganizationModel.md)

### Authorization


Configure BearerAuth:
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

