# Oidc

```java
OidcController oidcController = client.getOidcController();
```

## Class Name

`OidcController`

## Methods

* [Oidc Get-Oidc-Custom-Sub-Template-for-Org](../../doc/controllers/oidc.md#oidc-get-oidc-custom-sub-template-for-org)
* [Oidc Update-Oidc-Custom-Sub-Template-for-Org](../../doc/controllers/oidc.md#oidc-update-oidc-custom-sub-template-for-org)


# Oidc Get-Oidc-Custom-Sub-Template-for-Org

Gets the customization template for an OpenID Connect (OIDC) subject claim.
You must authenticate using an access token with the `read:org` scope to use this endpoint.
GitHub Apps must have the `organization_administration:write` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/oidc#get-the-customization-template-for-an-oidc-subject-claim-for-an-organization](https://docs.github.com/rest/actions/oidc#get-the-customization-template-for-an-oidc-subject-claim-for-an-organization)

```java
CompletableFuture<OrgsActionsOidcCustomizationSubResponse> oidcGetOidcCustomSubTemplateForOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsActionsOidcCustomizationSubResponse`](../../doc/models/orgs-actions-oidc-customization-sub-response.md)

## Example Usage

```java
String org = "org6";

oidcController.oidcGetOidcCustomSubTemplateForOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "include_claim_keys": [
    "repo",
    "context"
  ]
}
```


# Oidc Update-Oidc-Custom-Sub-Template-for-Org

Creates or updates the customization template for an OpenID Connect (OIDC) subject claim.
You must authenticate using an access token with the `write:org` scope to use this endpoint.
GitHub Apps must have the `admin:org` permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/actions/oidc#set-the-customization-template-for-an-oidc-subject-claim-for-an-organization](https://docs.github.com/rest/actions/oidc#set-the-customization-template-for-an-oidc-subject-claim-for-an-organization)

```java
CompletableFuture<Object> oidcUpdateOidcCustomSubTemplateForOrgAsync(
    final String org,
    final OrgsActionsOidcCustomizationSubRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsActionsOidcCustomizationSubRequest`](../../doc/models/orgs-actions-oidc-customization-sub-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
OrgsActionsOidcCustomizationSubRequest body = new OrgsActionsOidcCustomizationSubRequest();
List<String> includeClaimKeys = new LinkedList<>();
includeClaimKeys.add("repo");
includeClaimKeys.add("context");

body.setIncludeClaimKeys(includeClaimKeys);

oidcController.oidcUpdateOidcCustomSubTemplateForOrgAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsActionsOidcCustomizationSub403ErrorException`](../../doc/models/orgs-actions-oidc-customization-sub-403-error-exception.md) |
| 404 | Resource not found | [`OrgsActionsOidcCustomizationSub404ErrorException`](../../doc/models/orgs-actions-oidc-customization-sub-404-error-exception.md) |

