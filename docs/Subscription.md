
# SubscriptionOrganizationModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the subscription. | 
**name** | **kotlin.String** | Name provided for the subscription. | 
**type** | [**inline**](#Type) | The type of subscription. | 
**url** | **kotlin.String** | The url for the subscription. | 
**environment** | **kotlin.String** | The environment that the subscription is configured for; one of sandbox or production. | 
**state** | **kotlin.String** | The state of the subscription; one of storing, completed, failed, deleting, or deleted. | 
**failureCode** | **kotlin.String** | The failure code of a subscription (if any) |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]


<a name="Type"></a>
## Enum: type
Name | Value
---- | -----
type | webhook



