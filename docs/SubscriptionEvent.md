
# SubscriptionEventOrganizationModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the subscription event. | 
**eventType** | **kotlin.String** | The type of the subscription event. One of transfer.created or transfer.updated. | 
**objectGuid** | **kotlin.String** | The object guid for which the event is received. | 
**organizationGuid** | **kotlin.String** | The organization guid of the subscription event. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. | 
**environment** | **kotlin.String** | The environment that the subscription event is configured for; one of sandbox or production. |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]



