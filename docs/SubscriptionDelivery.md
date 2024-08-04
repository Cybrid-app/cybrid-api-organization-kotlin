
# SubscriptionDeliveryOrganizationModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the subscription delivery. | 
**subscriptionEventGuid** | **kotlin.String** | The subscription event guid of the subscription delivery. | 
**subscriptionGuid** | **kotlin.String** | The subscription guid of the subscription delivery. | 
**state** | [**inline**](#State) | The state of the subscription delivery. | 
**attemptCount** | **java.math.BigDecimal** | The number of attempts made to deliver the event. | 
**response** | **kotlin.String** | The response of the subscription delivery. |  [optional]
**nextAttemptAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the next attempt will be made. |  [optional]
**completedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the event was delivered. |  [optional]
**failedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the event delivery was marked as failed. |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | storing, completed, failing, failed



