# Interactions

Owner or admin management of users interactions.

```java
InteractionsController interactionsController = client.getInteractionsController();
```

## Class Name

`InteractionsController`

## Methods

* [Interactions Get-Restrictions-for-Org](../../doc/controllers/interactions.md#interactions-get-restrictions-for-org)
* [Interactions Set-Restrictions-for-Org](../../doc/controllers/interactions.md#interactions-set-restrictions-for-org)
* [Interactions Remove-Restrictions-for-Org](../../doc/controllers/interactions.md#interactions-remove-restrictions-for-org)
* [Interactions Get-Restrictions-for-Repo](../../doc/controllers/interactions.md#interactions-get-restrictions-for-repo)
* [Interactions Set-Restrictions-for-Repo](../../doc/controllers/interactions.md#interactions-set-restrictions-for-repo)
* [Interactions Remove-Restrictions-for-Repo](../../doc/controllers/interactions.md#interactions-remove-restrictions-for-repo)
* [Interactions Get-Restrictions-for-Authenticated-User](../../doc/controllers/interactions.md#interactions-get-restrictions-for-authenticated-user)
* [Interactions Set-Restrictions-for-Authenticated-User](../../doc/controllers/interactions.md#interactions-set-restrictions-for-authenticated-user)
* [Interactions Remove-Restrictions-for-Authenticated-User](../../doc/controllers/interactions.md#interactions-remove-restrictions-for-authenticated-user)


# Interactions Get-Restrictions-for-Org

Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is no restrictions, you will see an empty response.

API method documentation: [https://docs.github.com/rest/reference/interactions#get-interaction-restrictions-for-an-organization](https://docs.github.com/rest/reference/interactions#get-interaction-restrictions-for-an-organization)

```java
CompletableFuture<OrgsInteractionLimitsResponse> interactionsGetRestrictionsForOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsInteractionLimitsResponse`](../../doc/models/orgs-interaction-limits-response.md)

## Example Usage

```java
String org = "org6";

interactionsController.interactionsGetRestrictionsForOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "limit": "collaborators_only",
  "origin": "organization",
  "expires_at": "2018-08-17T04:18:39Z"
}
```


# Interactions Set-Restrictions-for-Org

Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the organization level will overwrite any interaction limits that are set for individual repositories owned by the organization.

API method documentation: [https://docs.github.com/rest/reference/interactions#set-interaction-restrictions-for-an-organization](https://docs.github.com/rest/reference/interactions#set-interaction-restrictions-for-an-organization)

```java
CompletableFuture<OrgsInteractionLimitsResponse2> interactionsSetRestrictionsForOrgAsync(
    final String org,
    final OrgsInteractionLimitsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsInteractionLimitsRequest`](../../doc/models/orgs-interaction-limits-request.md) | Body, Required | - |

## Response Type

[`OrgsInteractionLimitsResponse2`](../../doc/models/orgs-interaction-limits-response-2.md)

## Example Usage

```java
String org = "org6";
OrgsInteractionLimitsRequest body = new OrgsInteractionLimitsRequest();
body.setLimit(InteractionGroupEnum.COLLABORATORS_ONLY);
body.setExpiry(InteractionExpiryEnum.ONE_MONTH);

interactionsController.interactionsSetRestrictionsForOrgAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "limit": "collaborators_only",
  "origin": "organization",
  "expires_at": "2018-08-17T04:18:39Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsInteractionLimits422ErrorException`](../../doc/models/orgs-interaction-limits-422-error-exception.md) |


# Interactions Remove-Restrictions-for-Org

Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.

API method documentation: [https://docs.github.com/rest/reference/interactions#remove-interaction-restrictions-for-an-organization](https://docs.github.com/rest/reference/interactions#remove-interaction-restrictions-for-an-organization)

```java
CompletableFuture<Void> interactionsRemoveRestrictionsForOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";

interactionsController.interactionsRemoveRestrictionsForOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Interactions Get-Restrictions-for-Repo

Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.

API method documentation: [https://docs.github.com/rest/reference/interactions#get-interaction-restrictions-for-a-repository](https://docs.github.com/rest/reference/interactions#get-interaction-restrictions-for-a-repository)

```java
CompletableFuture<OrgsInteractionLimitsResponse> interactionsGetRestrictionsForRepoAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`OrgsInteractionLimitsResponse`](../../doc/models/orgs-interaction-limits-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

interactionsController.interactionsGetRestrictionsForRepoAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "limit": "collaborators_only",
  "origin": "repository",
  "expires_at": "2018-08-17T04:18:39Z"
}
```


# Interactions Set-Restrictions-for-Repo

Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.

API method documentation: [https://docs.github.com/rest/reference/interactions#set-interaction-restrictions-for-a-repository](https://docs.github.com/rest/reference/interactions#set-interaction-restrictions-for-a-repository)

```java
CompletableFuture<ReposInteractionLimitsResponse2> interactionsSetRestrictionsForRepoAsync(
    final String owner,
    final String repo,
    final ReposInteractionLimitsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposInteractionLimitsRequest`](../../doc/models/repos-interaction-limits-request.md) | Body, Required | - |

## Response Type

[`ReposInteractionLimitsResponse2`](../../doc/models/repos-interaction-limits-response-2.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposInteractionLimitsRequest body = new ReposInteractionLimitsRequest();
body.setLimit(InteractionGroupEnum.COLLABORATORS_ONLY);
body.setExpiry(InteractionExpiryEnum.ONE_DAY);

interactionsController.interactionsSetRestrictionsForRepoAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "limit": "collaborators_only",
  "origin": "repository",
  "expires_at": "2018-08-17T04:18:39Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Response | `ApiException` |


# Interactions Remove-Restrictions-for-Repo

Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions. If the interaction limit is set for the user or organization that owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a single repository.

API method documentation: [https://docs.github.com/rest/reference/interactions#remove-interaction-restrictions-for-a-repository](https://docs.github.com/rest/reference/interactions#remove-interaction-restrictions-for-a-repository)

```java
CompletableFuture<Void> interactionsRemoveRestrictionsForRepoAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

interactionsController.interactionsRemoveRestrictionsForRepoAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Response | `ApiException` |


# Interactions Get-Restrictions-for-Authenticated-User

Shows which type of GitHub user can interact with your public repositories and when the restriction expires.

API method documentation: [https://docs.github.com/rest/reference/interactions#get-interaction-restrictions-for-your-public-repositories](https://docs.github.com/rest/reference/interactions#get-interaction-restrictions-for-your-public-repositories)

```java
CompletableFuture<OrgsInteractionLimitsResponse> interactionsGetRestrictionsForAuthenticatedUserAsync()
```

## Response Type

[`OrgsInteractionLimitsResponse`](../../doc/models/orgs-interaction-limits-response.md)

## Example Usage

```java
interactionsController.interactionsGetRestrictionsForAuthenticatedUserAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "limit": "collaborators_only",
  "origin": "organization",
  "expires_at": "2018-08-17T04:18:39Z"
}
```


# Interactions Set-Restrictions-for-Authenticated-User

Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the user.

API method documentation: [https://docs.github.com/rest/reference/interactions#set-interaction-restrictions-for-your-public-repositories](https://docs.github.com/rest/reference/interactions#set-interaction-restrictions-for-your-public-repositories)

```java
CompletableFuture<UserInteractionLimitsResponse2> interactionsSetRestrictionsForAuthenticatedUserAsync(
    final UserInteractionLimitsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserInteractionLimitsRequest`](../../doc/models/user-interaction-limits-request.md) | Body, Required | - |

## Response Type

[`UserInteractionLimitsResponse2`](../../doc/models/user-interaction-limits-response-2.md)

## Example Usage

```java
UserInteractionLimitsRequest body = new UserInteractionLimitsRequest();
body.setLimit(InteractionGroupEnum.COLLABORATORS_ONLY);
body.setExpiry(InteractionExpiryEnum.ONE_MONTH);

interactionsController.interactionsSetRestrictionsForAuthenticatedUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "limit": "collaborators_only",
  "origin": "user",
  "expires_at": "2018-08-17T04:18:39Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserInteractionLimits422ErrorException`](../../doc/models/user-interaction-limits-422-error-exception.md) |


# Interactions Remove-Restrictions-for-Authenticated-User

Removes any interaction restrictions from your public repositories.

API method documentation: [https://docs.github.com/rest/reference/interactions#remove-interaction-restrictions-from-your-public-repositories](https://docs.github.com/rest/reference/interactions#remove-interaction-restrictions-from-your-public-repositories)

```java
CompletableFuture<Void> interactionsRemoveRestrictionsForAuthenticatedUserAsync()
```

## Response Type

`void`

## Example Usage

```java
interactionsController.interactionsRemoveRestrictionsForAuthenticatedUserAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

