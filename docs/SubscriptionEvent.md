
# SubscriptionEventOrganizationModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guid** | **kotlin.String** | Auto-generated unique identifier for the subscription event. | 
**eventType** | **kotlin.String** | The type of the subscription event. One of trade.storing, trade.pending, trade.cancelled, trade.completed, trade.settling, trade.failed, transfer.storing, transfer.pending, transfer.holding, transfer.reviewing, transfer.completed, transfer.failed, identity_verification.storing, identity_verification.pending, identity_verification.reviewing, identity_verification.waiting, identity_verification.expired, or identity_verification.completed. | 
**objectGuid** | **kotlin.String** | The object guid for which the event is received. | 
**environment** | **kotlin.String** | The environment that the subscription event is configured for; one of sandbox or production. | 
**organizationGuid** | **kotlin.String** | The organization guid of the subscription event. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was created at. | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 datetime the record was last updated at. |  [optional]



