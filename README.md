# app.cybrid.cybrid_api_organization.client - Kotlin client library for Cybrid Organization API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://organization.demo.cybrid.app*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrganizationsApi* | [**getOrganization**](docs/OrganizationsApi.md#getorganization) | **GET** api/organizations/{organization_guid} | Get organization
*OrganizationsApi* | [**updateOrganization**](docs/OrganizationsApi.md#updateorganization) | **PATCH** api/organizations/{organization_guid} | Patch organization


<a name="documentation-for-models"></a>
## Documentation for Models

 - [app.cybrid.cybrid_api_organization.client.models.OrganizationOrganizationModel](docs/OrganizationOrganizationModel.md)
 - [app.cybrid.cybrid_api_organization.client.models.PatchOrganizationOrganizationModel](docs/PatchOrganizationOrganizationModel.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerAuth"></a>
### BearerAuth

- **Type**: HTTP basic authentication

<a name="oauth2"></a>
### oauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - organizations:write: organizations write
  - organizations:read: organizations read

