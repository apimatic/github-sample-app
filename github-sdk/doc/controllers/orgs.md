# Orgs

Interact with GitHub Orgs.

```java
OrgsController orgsController = client.getOrgsController();
```

## Class Name

`OrgsController`

## Methods

* [Orgs List](../../doc/controllers/orgs.md#orgs-list)
* [Orgs Get](../../doc/controllers/orgs.md#orgs-get)
* [Orgs Update](../../doc/controllers/orgs.md#orgs-update)
* [Orgs List-Blocked-Users](../../doc/controllers/orgs.md#orgs-list-blocked-users)
* [Orgs Check-Blocked-User](../../doc/controllers/orgs.md#orgs-check-blocked-user)
* [Orgs Block-User](../../doc/controllers/orgs.md#orgs-block-user)
* [Orgs Unblock-User](../../doc/controllers/orgs.md#orgs-unblock-user)
* [Orgs List-Failed-Invitations](../../doc/controllers/orgs.md#orgs-list-failed-invitations)
* [Orgs List-Webhooks](../../doc/controllers/orgs.md#orgs-list-webhooks)
* [Orgs Create-Webhook](../../doc/controllers/orgs.md#orgs-create-webhook)
* [Orgs Get-Webhook](../../doc/controllers/orgs.md#orgs-get-webhook)
* [Orgs Update-Webhook](../../doc/controllers/orgs.md#orgs-update-webhook)
* [Orgs Delete-Webhook](../../doc/controllers/orgs.md#orgs-delete-webhook)
* [Orgs Get-Webhook-Config-for-Org](../../doc/controllers/orgs.md#orgs-get-webhook-config-for-org)
* [Orgs Update-Webhook-Config-for-Org](../../doc/controllers/orgs.md#orgs-update-webhook-config-for-org)
* [Orgs List-Webhook-Deliveries](../../doc/controllers/orgs.md#orgs-list-webhook-deliveries)
* [Orgs Get-Webhook-Delivery](../../doc/controllers/orgs.md#orgs-get-webhook-delivery)
* [Orgs Redeliver-Webhook-Delivery](../../doc/controllers/orgs.md#orgs-redeliver-webhook-delivery)
* [Orgs Ping-Webhook](../../doc/controllers/orgs.md#orgs-ping-webhook)
* [Orgs List-App-Installations](../../doc/controllers/orgs.md#orgs-list-app-installations)
* [Orgs List-Pending-Invitations](../../doc/controllers/orgs.md#orgs-list-pending-invitations)
* [Orgs Create-Invitation](../../doc/controllers/orgs.md#orgs-create-invitation)
* [Orgs Cancel-Invitation](../../doc/controllers/orgs.md#orgs-cancel-invitation)
* [Orgs List-Invitation-Teams](../../doc/controllers/orgs.md#orgs-list-invitation-teams)
* [Orgs List-Members](../../doc/controllers/orgs.md#orgs-list-members)
* [Orgs Check-Membership-for-User](../../doc/controllers/orgs.md#orgs-check-membership-for-user)
* [Orgs Remove-Member](../../doc/controllers/orgs.md#orgs-remove-member)
* [Orgs Get-Membership-for-User](../../doc/controllers/orgs.md#orgs-get-membership-for-user)
* [Orgs Set-Membership-for-User](../../doc/controllers/orgs.md#orgs-set-membership-for-user)
* [Orgs Remove-Membership-for-User](../../doc/controllers/orgs.md#orgs-remove-membership-for-user)
* [Orgs List-Outside-Collaborators](../../doc/controllers/orgs.md#orgs-list-outside-collaborators)
* [Orgs Convert-Member-to-Outside-Collaborator](../../doc/controllers/orgs.md#orgs-convert-member-to-outside-collaborator)
* [Orgs Remove-Outside-Collaborator](../../doc/controllers/orgs.md#orgs-remove-outside-collaborator)
* [Orgs List-Public-Members](../../doc/controllers/orgs.md#orgs-list-public-members)
* [Orgs Check-Public-Membership-for-User](../../doc/controllers/orgs.md#orgs-check-public-membership-for-user)
* [Orgs Set-Public-Membership-for-Authenticated-User](../../doc/controllers/orgs.md#orgs-set-public-membership-for-authenticated-user)
* [Orgs Remove-Public-Membership-for-Authenticated-User](../../doc/controllers/orgs.md#orgs-remove-public-membership-for-authenticated-user)
* [Orgs List-Security-Manager-Teams](../../doc/controllers/orgs.md#orgs-list-security-manager-teams)
* [Orgs Add-Security-Manager-Team](../../doc/controllers/orgs.md#orgs-add-security-manager-team)
* [Orgs Remove-Security-Manager-Team](../../doc/controllers/orgs.md#orgs-remove-security-manager-team)
* [Orgs Enable-or-Disable-Security-Product-on-All-Org-Repos](../../doc/controllers/orgs.md#orgs-enable-or-disable-security-product-on-all-org-repos)
* [Orgs List-Memberships-for-Authenticated-User](../../doc/controllers/orgs.md#orgs-list-memberships-for-authenticated-user)
* [Orgs Get-Membership-for-Authenticated-User](../../doc/controllers/orgs.md#orgs-get-membership-for-authenticated-user)
* [Orgs Update-Membership-for-Authenticated-User](../../doc/controllers/orgs.md#orgs-update-membership-for-authenticated-user)
* [Orgs List-for-Authenticated-User](../../doc/controllers/orgs.md#orgs-list-for-authenticated-user)
* [Orgs List-for-User](../../doc/controllers/orgs.md#orgs-list-for-user)


# Orgs List

Lists all organizations, in the order that they were created on GitHub.

**Note:** Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of organizations.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-organizations](https://docs.github.com/rest/reference/orgs#list-organizations)

```java
CompletableFuture<List<OrganizationSimple>> orgsListAsync(
    final Integer since,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `since` | `Integer` | Query, Optional | An organization ID. Only return organizations with an ID greater than this ID. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`List<OrganizationSimple>`](../../doc/models/organization-simple.md)

## Example Usage

```java
Integer perPage = 30;

orgsController.orgsListAsync(null, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  }
]
```


# Orgs Get

To see many of the organization response values, you need to be an authenticated organization owner with the `admin:org` scope. When the value of `two_factor_requirement_enabled` is `true`, the organization requires all members, billing managers, and outside collaborators to enable [two-factor authentication](https://docs.github.com/articles/securing-your-account-with-two-factor-authentication-2fa/).

GitHub Apps with the `Organization plan` permission can use this endpoint to retrieve information about an organization's GitHub plan. See "[Authenticating with GitHub Apps](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/)" for details. For an example response, see 'Response with GitHub plan information' below."

API method documentation: [https://docs.github.com/rest/reference/orgs#get-an-organization](https://docs.github.com/rest/reference/orgs#get-an-organization)

```java
CompletableFuture<OrgsResponse> orgsGetAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```java
String org = "org6";

orgsController.orgsGetAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "login": "github",
  "id": 1,
  "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
  "url": "https://api.github.com/orgs/github",
  "repos_url": "https://api.github.com/orgs/github/repos",
  "events_url": "https://api.github.com/orgs/github/events",
  "hooks_url": "https://api.github.com/orgs/github/hooks",
  "issues_url": "https://api.github.com/orgs/github/issues",
  "members_url": "https://api.github.com/orgs/github/members{/member}",
  "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
  "avatar_url": "https://github.com/images/error/octocat_happy.gif",
  "description": "A great organization",
  "name": "github",
  "company": "GitHub",
  "blog": "https://github.com/blog",
  "location": "San Francisco",
  "email": "octocat@github.com",
  "twitter_username": "github",
  "is_verified": true,
  "has_organization_projects": true,
  "has_repository_projects": true,
  "public_repos": 2,
  "public_gists": 1,
  "followers": 20,
  "following": 0,
  "html_url": "https://github.com/octocat",
  "created_at": "2008-01-14T04:33:35Z",
  "updated_at": "2014-03-03T18:58:10Z",
  "type": "Organization",
  "total_private_repos": 100,
  "owned_private_repos": 100,
  "private_gists": 81,
  "disk_usage": 10000,
  "collaborators": 8,
  "billing_email": "mona@github.com",
  "plan": {
    "name": "Medium",
    "space": 400,
    "private_repos": 20,
    "filled_seats": 4,
    "seats": 5
  },
  "default_repository_permission": "read",
  "members_can_create_repositories": true,
  "two_factor_requirement_enabled": true,
  "members_allowed_repository_creation_type": "all",
  "members_can_create_public_repositories": false,
  "members_can_create_private_repositories": false,
  "members_can_create_internal_repositories": false,
  "members_can_create_pages": true,
  "members_can_fork_private_repositories": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`Orgs404ErrorException`](../../doc/models/orgs-404-error-exception.md) |


# Orgs Update

**Parameter Deprecation Notice:** GitHub will replace and discontinue `members_allowed_repository_creation_type` in favor of more granular permissions. The new input parameters are `members_can_create_public_repositories`, `members_can_create_private_repositories` for all organizations and `members_can_create_internal_repositories` for organizations associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see the [blog post](https://developer.github.com/changes/2019-12-03-internal-visibility-changes).

Enables an authenticated organization owner with the `admin:org` scope to update the organization's profile and member privileges.

API method documentation: [https://docs.github.com/rest/reference/orgs#update-an-organization](https://docs.github.com/rest/reference/orgs#update-an-organization)

```java
CompletableFuture<OrgsResponse> orgsUpdateAsync(
    final String org,
    final OrgsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsRequest`](../../doc/models/orgs-request.md) | Body, Optional | - |

## Response Type

[`OrgsResponse`](../../doc/models/orgs-response.md)

## Example Usage

```java
String org = "org6";
OrgsRequest body = new OrgsRequest();
body.setBillingEmail("mona@github.com");
body.setCompany("GitHub");
body.setEmail("mona@github.com");
body.setTwitterUsername("github");
body.setLocation("San Francisco");
body.setName("github");
body.setDescription("GitHub, the company.");
body.setDefaultRepositoryPermission(DefaultRepositoryPermissionEnum.READ);
body.setMembersCanCreateRepositories(true);
body.setMembersAllowedRepositoryCreationType(MembersAllowedRepositoryCreationTypeEnum.ALL);

orgsController.orgsUpdateAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "login": "github",
  "id": 1,
  "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
  "url": "https://api.github.com/orgs/github",
  "repos_url": "https://api.github.com/orgs/github/repos",
  "events_url": "https://api.github.com/orgs/github/events",
  "hooks_url": "https://api.github.com/orgs/github/hooks",
  "issues_url": "https://api.github.com/orgs/github/issues",
  "members_url": "https://api.github.com/orgs/github/members{/member}",
  "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
  "avatar_url": "https://github.com/images/error/octocat_happy.gif",
  "description": "A great organization",
  "name": "github",
  "company": "GitHub",
  "blog": "https://github.com/blog",
  "location": "San Francisco",
  "email": "octocat@github.com",
  "twitter_username": "github",
  "is_verified": true,
  "has_organization_projects": true,
  "has_repository_projects": true,
  "public_repos": 2,
  "public_gists": 1,
  "followers": 20,
  "following": 0,
  "html_url": "https://github.com/octocat",
  "created_at": "2008-01-14T04:33:35Z",
  "type": "Organization",
  "total_private_repos": 100,
  "owned_private_repos": 100,
  "private_gists": 81,
  "disk_usage": 10000,
  "collaborators": 8,
  "billing_email": "mona@github.com",
  "plan": {
    "name": "Medium",
    "space": 400,
    "private_repos": 20
  },
  "default_repository_permission": "read",
  "members_can_create_repositories": true,
  "two_factor_requirement_enabled": true,
  "members_allowed_repository_creation_type": "all",
  "members_can_create_public_repositories": false,
  "members_can_create_private_repositories": false,
  "members_can_create_internal_repositories": false,
  "members_can_create_pages": true,
  "members_can_create_public_pages": true,
  "members_can_create_private_pages": true,
  "members_can_fork_private_repositories": false,
  "web_commit_signoff_required": false,
  "updated_at": "2014-03-03T18:58:10Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict | [`Orgs409ErrorException`](../../doc/models/orgs-409-error-exception.md) |
| 422 | Validation failed | `ApiException` |


# Orgs List-Blocked-Users

List the users blocked by an organization.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-users-blocked-by-an-organization](https://docs.github.com/rest/reference/orgs#list-users-blocked-by-an-organization)

```java
CompletableFuture<List<SimpleUser>> orgsListBlockedUsersAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListBlockedUsersAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
]
```


# Orgs Check-Blocked-User

Check if a user is blocked by an organization

API method documentation: [https://docs.github.com/rest/reference/orgs#check-if-a-user-is-blocked-by-an-organization](https://docs.github.com/rest/reference/orgs#check-if-a-user-is-blocked-by-an-organization)

```java
CompletableFuture<Void> orgsCheckBlockedUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsCheckBlockedUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | If the user is not blocked | [`OrgsBlocks404ErrorException`](../../doc/models/orgs-blocks-404-error-exception.md) |


# Orgs Block-User

Block a user from an organization

API method documentation: [https://docs.github.com/rest/reference/orgs#block-a-user-from-an-organization](https://docs.github.com/rest/reference/orgs#block-a-user-from-an-organization)

```java
CompletableFuture<Void> orgsBlockUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsBlockUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsBlocks422ErrorException`](../../doc/models/orgs-blocks-422-error-exception.md) |


# Orgs Unblock-User

Unblock a user from an organization

API method documentation: [https://docs.github.com/rest/reference/orgs#unblock-a-user-from-an-organization](https://docs.github.com/rest/reference/orgs#unblock-a-user-from-an-organization)

```java
CompletableFuture<Void> orgsUnblockUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsUnblockUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Orgs List-Failed-Invitations

The return hash contains `failed_at` and `failed_reason` fields which represent the time at which the invitation failed and the reason for the failure.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-failed-organization-invitations](https://docs.github.com/rest/reference/orgs#list-failed-organization-invitations)

```java
CompletableFuture<List<OrganizationInvitation>> orgsListFailedInvitationsAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrganizationInvitation>`](../../doc/models/organization-invitation.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListFailedInvitationsAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 1,
    "login": "monalisa",
    "node_id": "MDQ6VXNlcjE=",
    "email": "octocat@github.com",
    "role": "direct_member",
    "created_at": "2016-11-30T06:46:10-08:00",
    "failed_at": "",
    "failed_reason": "",
    "inviter": {
      "login": "other_user",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/other_user_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/other_user",
      "html_url": "https://github.com/other_user",
      "followers_url": "https://api.github.com/users/other_user/followers",
      "following_url": "https://api.github.com/users/other_user/following{/other_user}",
      "gists_url": "https://api.github.com/users/other_user/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/other_user/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/other_user/subscriptions",
      "organizations_url": "https://api.github.com/users/other_user/orgs",
      "repos_url": "https://api.github.com/users/other_user/repos",
      "events_url": "https://api.github.com/users/other_user/events{/privacy}",
      "received_events_url": "https://api.github.com/users/other_user/received_events",
      "type": "User",
      "site_admin": false
    },
    "team_count": 2,
    "invitation_teams_url": "https://api.github.com/organizations/2/invitations/1/teams",
    "invitation_source": "member"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsFailedInvitations404ErrorException`](../../doc/models/orgs-failed-invitations-404-error-exception.md) |


# Orgs List-Webhooks

List organization webhooks

API method documentation: [https://docs.github.com/rest/reference/orgs#list-organization-webhooks](https://docs.github.com/rest/reference/orgs#list-organization-webhooks)

```java
CompletableFuture<List<OrgHook>> orgsListWebhooksAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrgHook>`](../../doc/models/org-hook.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListWebhooksAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 1,
    "url": "https://api.github.com/orgs/octocat/hooks/1",
    "ping_url": "https://api.github.com/orgs/octocat/hooks/1/pings",
    "deliveries_url": "https://api.github.com/orgs/octocat/hooks/1/deliveries",
    "name": "web",
    "events": [
      "push",
      "pull_request"
    ],
    "active": true,
    "config": {
      "url": "http://example.com",
      "content_type": "json"
    },
    "updated_at": "2011-09-06T20:39:23Z",
    "created_at": "2011-09-06T17:26:27Z",
    "type": "Organization"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsHooks404ErrorException`](../../doc/models/orgs-hooks-404-error-exception.md) |


# Orgs Create-Webhook

Here's how you can create a hook that posts payloads in JSON format:

API method documentation: [https://docs.github.com/rest/reference/orgs#create-an-organization-webhook](https://docs.github.com/rest/reference/orgs#create-an-organization-webhook)

```java
CompletableFuture<OrgsHooksResponse> orgsCreateWebhookAsync(
    final String org,
    final OrgsHooksRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsHooksRequest`](../../doc/models/orgs-hooks-request.md) | Body, Required | - |

## Response Type

[`OrgsHooksResponse`](../../doc/models/orgs-hooks-response.md)

## Example Usage

```java
String org = "org6";
OrgsHooksRequest body = new OrgsHooksRequest();
body.setName("web");
Config8 config = new Config8();
config.setUrl("http://example.com/webhook");
config.setContentType("json");

body.setConfig(config);
List<String> events = new LinkedList<>();
events.add("push");
events.add("pull_request");

body.setEvents(events);
body.setActive(true);

orgsController.orgsCreateWebhookAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "url": "https://api.github.com/orgs/octocat/hooks/1",
  "ping_url": "https://api.github.com/orgs/octocat/hooks/1/pings",
  "deliveries_url": "https://api.github.com/orgs/octocat/hooks/1/deliveries",
  "name": "web",
  "events": [
    "push",
    "pull_request"
  ],
  "active": true,
  "config": {
    "url": "http://example.com",
    "content_type": "json"
  },
  "updated_at": "2011-09-06T20:39:23Z",
  "created_at": "2011-09-06T17:26:27Z",
  "type": "Organization"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsHooks404ErrorException`](../../doc/models/orgs-hooks-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsHooks422ErrorException`](../../doc/models/orgs-hooks-422-error-exception.md) |


# Orgs Get-Webhook

Returns a webhook configured in an organization. To get only the webhook `config` properties, see "[Get a webhook configuration for an organization](/rest/reference/orgs#get-a-webhook-configuration-for-an-organization)."

API method documentation: [https://docs.github.com/rest/reference/orgs#get-an-organization-webhook](https://docs.github.com/rest/reference/orgs#get-an-organization-webhook)

```java
CompletableFuture<OrgsHooksResponse> orgsGetWebhookAsync(
    final String org,
    final int hookId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |

## Response Type

[`OrgsHooksResponse`](../../doc/models/orgs-hooks-response.md)

## Example Usage

```java
String org = "org6";
int hookId = 110;

orgsController.orgsGetWebhookAsync(org, hookId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "url": "https://api.github.com/orgs/octocat/hooks/1",
  "ping_url": "https://api.github.com/orgs/octocat/hooks/1/pings",
  "deliveries_url": "https://api.github.com/orgs/octocat/hooks/1/deliveries",
  "name": "web",
  "events": [
    "push",
    "pull_request"
  ],
  "active": true,
  "config": {
    "url": "http://example.com",
    "content_type": "json"
  },
  "updated_at": "2011-09-06T20:39:23Z",
  "created_at": "2011-09-06T17:26:27Z",
  "type": "Organization"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsHooks404ErrorException`](../../doc/models/orgs-hooks-404-error-exception.md) |


# Orgs Update-Webhook

Updates a webhook configured in an organization. When you update a webhook, the `secret` will be overwritten. If you previously had a `secret` set, you must provide the same `secret` or set a new `secret` or the secret will be removed. If you are only updating individual webhook `config` properties, use "[Update a webhook configuration for an organization](/rest/reference/orgs#update-a-webhook-configuration-for-an-organization)."

API method documentation: [https://docs.github.com/rest/reference/orgs#update-an-organization-webhook](https://docs.github.com/rest/reference/orgs#update-an-organization-webhook)

```java
CompletableFuture<OrgsHooksResponse> orgsUpdateWebhookAsync(
    final String org,
    final int hookId,
    final OrgsHooksRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |
| `body` | [`OrgsHooksRequest1`](../../doc/models/orgs-hooks-request-1.md) | Body, Optional | - |

## Response Type

[`OrgsHooksResponse`](../../doc/models/orgs-hooks-response.md)

## Example Usage

```java
String org = "org6";
int hookId = 110;
OrgsHooksRequest1 body = new OrgsHooksRequest1();
List<String> events = new LinkedList<>();
events.add("pull_request");

body.setEvents(events);
body.setActive(true);

orgsController.orgsUpdateWebhookAsync(org, hookId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "url": "https://api.github.com/orgs/octocat/hooks/1",
  "ping_url": "https://api.github.com/orgs/octocat/hooks/1/pings",
  "deliveries_url": "https://api.github.com/repos/octocat/Hello-World/hooks/12345678/deliveries",
  "name": "web",
  "events": [
    "pull_request"
  ],
  "active": true,
  "config": {
    "url": "http://example.com",
    "content_type": "json"
  },
  "updated_at": "2011-09-06T20:39:23Z",
  "created_at": "2011-09-06T17:26:27Z",
  "type": "Organization"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsHooks404ErrorException`](../../doc/models/orgs-hooks-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsHooks422ErrorException`](../../doc/models/orgs-hooks-422-error-exception.md) |


# Orgs Delete-Webhook

Delete an organization webhook

API method documentation: [https://docs.github.com/rest/reference/orgs#delete-an-organization-webhook](https://docs.github.com/rest/reference/orgs#delete-an-organization-webhook)

```java
CompletableFuture<Void> orgsDeleteWebhookAsync(
    final String org,
    final int hookId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int hookId = 110;

orgsController.orgsDeleteWebhookAsync(org, hookId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsHooks404ErrorException`](../../doc/models/orgs-hooks-404-error-exception.md) |


# Orgs Get-Webhook-Config-for-Org

Returns the webhook configuration for an organization. To get more information about the webhook, including the `active` state and `events`, use "[Get an organization webhook ](/rest/reference/orgs#get-an-organization-webhook)."

Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:read` permission.

API method documentation: [https://docs.github.com/rest/reference/orgs#get-a-webhook-configuration-for-an-organization](https://docs.github.com/rest/reference/orgs#get-a-webhook-configuration-for-an-organization)

```java
CompletableFuture<AppHookConfigRequest> orgsGetWebhookConfigForOrgAsync(
    final String org,
    final int hookId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |

## Response Type

[`AppHookConfigRequest`](../../doc/models/app-hook-config-request.md)

## Example Usage

```java
String org = "org6";
int hookId = 110;

orgsController.orgsGetWebhookConfigForOrgAsync(org, hookId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "content_type": "json",
  "insecure_ssl": "0",
  "secret": "********",
  "url": "https://example.com/webhook"
}
```


# Orgs Update-Webhook-Config-for-Org

Updates the webhook configuration for an organization. To update more information about the webhook, including the `active` state and `events`, use "[Update an organization webhook ](/rest/reference/orgs#update-an-organization-webhook)."

Access tokens must have the `admin:org_hook` scope, and GitHub Apps must have the `organization_hooks:write` permission.

API method documentation: [https://docs.github.com/rest/reference/orgs#update-a-webhook-configuration-for-an-organization](https://docs.github.com/rest/reference/orgs#update-a-webhook-configuration-for-an-organization)

```java
CompletableFuture<AppHookConfigRequest> orgsUpdateWebhookConfigForOrgAsync(
    final String org,
    final int hookId,
    final AppHookConfigRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |
| `body` | [`AppHookConfigRequest`](../../doc/models/app-hook-config-request.md) | Body, Optional | - |

## Response Type

[`AppHookConfigRequest`](../../doc/models/app-hook-config-request.md)

## Example Usage

```java
String org = "org6";
int hookId = 110;
AppHookConfigRequest body = new AppHookConfigRequest();
body.setUrl("http://example.com/webhook");
body.setContentType("json");
body.setSecret("********");
body.setInsecureSsl(com.github.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));

orgsController.orgsUpdateWebhookConfigForOrgAsync(org, hookId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "content_type": "json",
  "insecure_ssl": "0",
  "secret": "********",
  "url": "https://example.com/webhook"
}
```


# Orgs List-Webhook-Deliveries

Returns a list of webhook deliveries for a webhook configured in an organization.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-deliveries-for-an-organization-webhook](https://docs.github.com/rest/reference/orgs#list-deliveries-for-an-organization-webhook)

```java
CompletableFuture<List<Simplewebhookdelivery>> orgsListWebhookDeliveriesAsync(
    final String org,
    final int hookId,
    final Integer perPage,
    final String cursor,
    final Boolean redelivery)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `cursor` | `String` | Query, Optional | Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the `link` header for the next and previous page cursors. |
| `redelivery` | `Boolean` | Query, Optional | - |

## Response Type

[`List<Simplewebhookdelivery>`](../../doc/models/simplewebhookdelivery.md)

## Example Usage

```java
String org = "org6";
int hookId = 110;
Integer perPage = 30;

orgsController.orgsListWebhookDeliveriesAsync(org, hookId, perPage, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 12345678,
    "guid": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
    "delivered_at": "2019-06-03T00:57:16Z",
    "redelivery": false,
    "duration": 0.27,
    "status": "OK",
    "status_code": 200,
    "event": "issues",
    "action": "opened",
    "installation_id": 123,
    "repository_id": 456
  },
  {
    "id": 123456789,
    "guid": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
    "delivered_at": "2019-06-04T00:57:16Z",
    "redelivery": true,
    "duration": 0.28,
    "status": "OK",
    "status_code": 200,
    "event": "issues",
    "action": "opened",
    "installation_id": 123,
    "repository_id": 456
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`OrgsHooksDeliveries400ErrorException`](../../doc/models/orgs-hooks-deliveries-400-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsHooksDeliveries422ErrorException`](../../doc/models/orgs-hooks-deliveries-422-error-exception.md) |


# Orgs Get-Webhook-Delivery

Returns a delivery for a webhook configured in an organization.

API method documentation: [https://docs.github.com/rest/reference/orgs#get-a-webhook-delivery-for-an-organization-webhook](https://docs.github.com/rest/reference/orgs#get-a-webhook-delivery-for-an-organization-webhook)

```java
CompletableFuture<OrgsHooksDeliveriesDeliveryIdResponse> orgsGetWebhookDeliveryAsync(
    final String org,
    final int hookId,
    final int deliveryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |
| `deliveryId` | `int` | Template, Required | - |

## Response Type

[`OrgsHooksDeliveriesDeliveryIdResponse`](../../doc/models/orgs-hooks-deliveries-delivery-id-response.md)

## Example Usage

```java
String org = "org6";
int hookId = 110;
int deliveryId = 248;

orgsController.orgsGetWebhookDeliveryAsync(org, hookId, deliveryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 12345678,
  "guid": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
  "delivered_at": "2019-06-03T00:57:16Z",
  "redelivery": false,
  "duration": 0.27,
  "status": "OK",
  "status_code": 200,
  "event": "issues",
  "action": "opened",
  "installation_id": 123,
  "repository_id": 456,
  "url": "https://www.example.com",
  "request": {
    "headers": {
      "X-GitHub-Delivery": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
      "X-Hub-Signature-256": "sha256=6dcb09b5b57875f334f61aebed695e2e4193db5e",
      "Accept": "*/*",
      "X-GitHub-Hook-ID": "42",
      "User-Agent": "GitHub-Hookshot/b8c71d8",
      "X-GitHub-Event": "issues",
      "X-GitHub-Hook-Installation-Target-ID": "123",
      "X-GitHub-Hook-Installation-Target-Type": "repository",
      "content-type": "application/json",
      "X-Hub-Signature": "sha1=a84d88e7554fc1fa21bcbc4efae3c782a70d2b9d"
    },
    "payload": {
      "action": "opened",
      "issue": {
        "body": "foo"
      },
      "repository": {
        "id": 123
      }
    }
  },
  "response": {
    "headers": {
      "Content-Type": "text/html;charset=utf-8"
    },
    "payload": "ok"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`OrgsHooksDeliveriesDeliveryId400ErrorException`](../../doc/models/orgs-hooks-deliveries-delivery-id-400-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsHooksDeliveriesDeliveryId422ErrorException`](../../doc/models/orgs-hooks-deliveries-delivery-id-422-error-exception.md) |


# Orgs Redeliver-Webhook-Delivery

Redeliver a delivery for a webhook configured in an organization.

API method documentation: [https://docs.github.com/rest/reference/orgs#redeliver-a-delivery-for-an-organization-webhook](https://docs.github.com/rest/reference/orgs#redeliver-a-delivery-for-an-organization-webhook)

```java
CompletableFuture<Object> orgsRedeliverWebhookDeliveryAsync(
    final String org,
    final int hookId,
    final int deliveryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |
| `deliveryId` | `int` | Template, Required | - |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
int hookId = 110;
int deliveryId = 248;

orgsController.orgsRedeliverWebhookDeliveryAsync(org, hookId, deliveryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`OrgsHooksDeliveriesDeliveryIdAttempts400ErrorException`](../../doc/models/orgs-hooks-deliveries-delivery-id-attempts-400-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsHooksDeliveriesDeliveryIdAttempts422ErrorException`](../../doc/models/orgs-hooks-deliveries-delivery-id-attempts-422-error-exception.md) |


# Orgs Ping-Webhook

This will trigger a [ping event](https://docs.github.com/webhooks/#ping-event) to be sent to the hook.

API method documentation: [https://docs.github.com/rest/reference/orgs#ping-an-organization-webhook](https://docs.github.com/rest/reference/orgs#ping-an-organization-webhook)

```java
CompletableFuture<Void> orgsPingWebhookAsync(
    final String org,
    final int hookId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `hookId` | `int` | Template, Required | The unique identifier of the hook. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int hookId = 110;

orgsController.orgsPingWebhookAsync(org, hookId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsHooksPings404ErrorException`](../../doc/models/orgs-hooks-pings-404-error-exception.md) |


# Orgs List-App-Installations

Lists all GitHub Apps in an organization. The installation count includes all GitHub Apps installed on repositories in the organization. You must be an organization owner with `admin:read` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-app-installations-for-an-organization](https://docs.github.com/rest/reference/orgs#list-app-installations-for-an-organization)

```java
CompletableFuture<OrgsInstallationsResponse> orgsListAppInstallationsAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsInstallationsResponse`](../../doc/models/orgs-installations-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListAppInstallationsAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "installations": [
    {
      "id": 25381,
      "account": {
        "login": "octo-org",
        "id": 6811672,
        "node_id": "MDEyOk9yZ2FuaXphdGlvbjY4MTE2NzI=",
        "avatar_url": "https://avatars3.githubusercontent.com/u/6811672?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octo-org",
        "html_url": "https://github.com/octo-org",
        "followers_url": "https://api.github.com/users/octo-org/followers",
        "following_url": "https://api.github.com/users/octo-org/following{/other_user}",
        "gists_url": "https://api.github.com/users/octo-org/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octo-org/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octo-org/subscriptions",
        "organizations_url": "https://api.github.com/users/octo-org/orgs",
        "repos_url": "https://api.github.com/users/octo-org/repos",
        "events_url": "https://api.github.com/users/octo-org/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octo-org/received_events",
        "type": "Organization",
        "site_admin": false
      },
      "repository_selection": "selected",
      "access_tokens_url": "https://api.github.com/app/installations/25381/access_tokens",
      "repositories_url": "https://api.github.com/installation/repositories",
      "html_url": "https://github.com/organizations/octo-org/settings/installations/25381",
      "app_id": 2218,
      "target_id": 6811672,
      "target_type": "Organization",
      "permissions": {
        "deployments": "write",
        "metadata": "read",
        "pull_requests": "read",
        "statuses": "read"
      },
      "events": [
        "deployment",
        "deployment_status"
      ],
      "created_at": "2017-05-16T08:47:09.000-07:00",
      "updated_at": "2017-06-06T11:23:23.000-07:00",
      "single_file_name": "config.yml",
      "has_multiple_single_files": true,
      "single_file_paths": [
        "config.yml",
        ".github/issue_TEMPLATE.md"
      ],
      "app_slug": "github-actions",
      "suspended_at": null,
      "suspended_by": null
    }
  ]
}
```


# Orgs List-Pending-Invitations

The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-pending-organization-invitations](https://docs.github.com/rest/reference/orgs#list-pending-organization-invitations)

```java
CompletableFuture<List<OrganizationInvitation>> orgsListPendingInvitationsAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrganizationInvitation>`](../../doc/models/organization-invitation.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListPendingInvitationsAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 1,
    "login": "monalisa",
    "node_id": "MDQ6VXNlcjE=",
    "email": "octocat@github.com",
    "role": "direct_member",
    "created_at": "2016-11-30T06:46:10-08:00",
    "failed_at": "",
    "failed_reason": "",
    "inviter": {
      "login": "other_user",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/other_user_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/other_user",
      "html_url": "https://github.com/other_user",
      "followers_url": "https://api.github.com/users/other_user/followers",
      "following_url": "https://api.github.com/users/other_user/following{/other_user}",
      "gists_url": "https://api.github.com/users/other_user/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/other_user/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/other_user/subscriptions",
      "organizations_url": "https://api.github.com/users/other_user/orgs",
      "repos_url": "https://api.github.com/users/other_user/repos",
      "events_url": "https://api.github.com/users/other_user/events{/privacy}",
      "received_events_url": "https://api.github.com/users/other_user/received_events",
      "type": "User",
      "site_admin": false
    },
    "team_count": 2,
    "invitation_teams_url": "https://api.github.com/organizations/2/invitations/1/teams",
    "invitation_source": "member"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsInvitations404ErrorException`](../../doc/models/orgs-invitations-404-error-exception.md) |


# Orgs Create-Invitation

Invite people to an organization by using their GitHub user ID or their email address. In order to create invitations in an organization, the authenticated user must be an organization owner.

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.

API method documentation: [https://docs.github.com/rest/reference/orgs#create-an-organization-invitation](https://docs.github.com/rest/reference/orgs#create-an-organization-invitation)

```java
CompletableFuture<OrgsInvitationsResponse> orgsCreateInvitationAsync(
    final String org,
    final OrgsInvitationsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsInvitationsRequest`](../../doc/models/orgs-invitations-request.md) | Body, Optional | - |

## Response Type

[`OrgsInvitationsResponse`](../../doc/models/orgs-invitations-response.md)

## Example Usage

```java
String org = "org6";
OrgsInvitationsRequest body = new OrgsInvitationsRequest();
body.setEmail("octocat@github.com");
body.setRole(Role2Enum.DIRECT_MEMBER);
List<Integer> teamIds = new LinkedList<>();
teamIds.add(12);
teamIds.add(26);

body.setTeamIds(teamIds);

orgsController.orgsCreateInvitationAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 1,
  "login": "monalisa",
  "node_id": "MDQ6VXNlcjE=",
  "email": "octocat@github.com",
  "role": "direct_member",
  "created_at": "2016-11-30T06:46:10-08:00",
  "inviter": {
    "login": "other_user",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/other_user_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/other_user",
    "html_url": "https://github.com/other_user",
    "followers_url": "https://api.github.com/users/other_user/followers",
    "following_url": "https://api.github.com/users/other_user/following{/other_user}",
    "gists_url": "https://api.github.com/users/other_user/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/other_user/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/other_user/subscriptions",
    "organizations_url": "https://api.github.com/users/other_user/orgs",
    "repos_url": "https://api.github.com/users/other_user/repos",
    "events_url": "https://api.github.com/users/other_user/events{/privacy}",
    "received_events_url": "https://api.github.com/users/other_user/received_events",
    "type": "User",
    "site_admin": false
  },
  "team_count": 2,
  "invitation_teams_url": "https://api.github.com/organizations/2/invitations/1/teams",
  "invitation_source": "member"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsInvitations404ErrorException`](../../doc/models/orgs-invitations-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsInvitations422ErrorException`](../../doc/models/orgs-invitations-422-error-exception.md) |


# Orgs Cancel-Invitation

Cancel an organization invitation. In order to cancel an organization invitation, the authenticated user must be an organization owner.

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications).

API method documentation: [https://docs.github.com/rest/reference/orgs#cancel-an-organization-invitation](https://docs.github.com/rest/reference/orgs#cancel-an-organization-invitation)

```java
CompletableFuture<Void> orgsCancelInvitationAsync(
    final String org,
    final int invitationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `invitationId` | `int` | Template, Required | The unique identifier of the invitation. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int invitationId = 244;

orgsController.orgsCancelInvitationAsync(org, invitationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsInvitations404ErrorException`](../../doc/models/orgs-invitations-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsInvitations422ErrorException`](../../doc/models/orgs-invitations-422-error-exception.md) |


# Orgs List-Invitation-Teams

List all teams associated with an invitation. In order to see invitations in an organization, the authenticated user must be an organization owner.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-organization-invitation-teams](https://docs.github.com/rest/reference/orgs#list-organization-invitation-teams)

```java
CompletableFuture<List<Team>> orgsListInvitationTeamsAsync(
    final String org,
    final int invitationId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `invitationId` | `int` | Template, Required | The unique identifier of the invitation. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Team>`](../../doc/models/team.md)

## Example Usage

```java
String org = "org6";
int invitationId = 244;
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListInvitationTeamsAsync(org, invitationId, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 1,
    "node_id": "MDQ6VGVhbTE=",
    "url": "https://api.github.com/teams/1",
    "html_url": "https://github.com/orgs/github/teams/justice-league",
    "name": "Justice League",
    "slug": "justice-league",
    "description": "A great team.",
    "privacy": "closed",
    "permission": "admin",
    "members_url": "https://api.github.com/teams/1/members{/member}",
    "repositories_url": "https://api.github.com/teams/1/repos",
    "parent": null
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsInvitationsTeams404ErrorException`](../../doc/models/orgs-invitations-teams-404-error-exception.md) |


# Orgs List-Members

List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-organization-members](https://docs.github.com/rest/reference/orgs#list-organization-members)

```java
CompletableFuture<List<SimpleUser>> orgsListMembersAsync(
    final String org,
    final Filter21Enum filter,
    final Role31Enum role,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `filter` | [`Filter21Enum`](../../doc/models/filter-21-enum.md) | Query, Optional | Filter members returned in the list. `2fa_disabled` means that only members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. This options is only available for organization owners. |
| `role` | [`Role31Enum`](../../doc/models/role-31-enum.md) | Query, Optional | Filter members returned by their role. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListMembersAsync(org, null, null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsMembers422ErrorException`](../../doc/models/orgs-members-422-error-exception.md) |


# Orgs Check-Membership-for-User

Check if a user is, publicly or privately, a member of the organization.

API method documentation: [https://docs.github.com/rest/reference/orgs#check-organization-membership-for-a-user](https://docs.github.com/rest/reference/orgs#check-organization-membership-for-a-user)

```java
CompletableFuture<Void> orgsCheckMembershipForUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsCheckMembershipForUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found if requester is an organization member and user is not a member | `ApiException` |


# Orgs Remove-Member

Removing a user from this list will remove them from all teams and they will no longer have any access to the organization's repositories.

API method documentation: [https://docs.github.com/rest/reference/orgs#remove-an-organization-member](https://docs.github.com/rest/reference/orgs#remove-an-organization-member)

```java
CompletableFuture<Void> orgsRemoveMemberAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsRemoveMemberAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsMembers403ErrorException`](../../doc/models/orgs-members-403-error-exception.md) |


# Orgs Get-Membership-for-User

In order to get a user's membership with an organization, the authenticated user must be an organization member. The `state` parameter in the response can be used to identify the user's membership status.

API method documentation: [https://docs.github.com/rest/reference/orgs#get-organization-membership-for-a-user](https://docs.github.com/rest/reference/orgs#get-organization-membership-for-a-user)

```java
CompletableFuture<OrgsMembershipsResponse> orgsGetMembershipForUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`OrgsMembershipsResponse`](../../doc/models/orgs-memberships-response.md)

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsGetMembershipForUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/orgs/octocat/memberships/defunkt",
  "state": "active",
  "role": "admin",
  "organization_url": "https://api.github.com/orgs/octocat",
  "organization": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  },
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsMemberships403ErrorException`](../../doc/models/orgs-memberships-403-error-exception.md) |
| 404 | Resource not found | [`OrgsMemberships404ErrorException`](../../doc/models/orgs-memberships-404-error-exception.md) |


# Orgs Set-Membership-for-User

Only authenticated organization owners can add a member to the organization or update the member's role.

* If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://docs.github.com/rest/reference/orgs#get-organization-membership-for-a-user) will be `pending` until they accept the invitation.

* Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.

**Rate limits**

To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.

API method documentation: [https://docs.github.com/rest/reference/orgs#set-organization-membership-for-a-user](https://docs.github.com/rest/reference/orgs#set-organization-membership-for-a-user)

```java
CompletableFuture<OrgsMembershipsResponse> orgsSetMembershipForUserAsync(
    final String org,
    final String username,
    final OrgsMembershipsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `body` | [`OrgsMembershipsRequest`](../../doc/models/orgs-memberships-request.md) | Body, Optional | - |

## Response Type

[`OrgsMembershipsResponse`](../../doc/models/orgs-memberships-response.md)

## Example Usage

```java
String org = "org6";
String username = "username0";
OrgsMembershipsRequest body = new OrgsMembershipsRequest();
body.setRole(Role4Enum.MEMBER);

orgsController.orgsSetMembershipForUserAsync(org, username, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/orgs/octocat/memberships/defunkt",
  "state": "active",
  "role": "admin",
  "organization_url": "https://api.github.com/orgs/octocat",
  "organization": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  },
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsMemberships403ErrorException`](../../doc/models/orgs-memberships-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsMemberships422ErrorException`](../../doc/models/orgs-memberships-422-error-exception.md) |


# Orgs Remove-Membership-for-User

In order to remove a user's membership with an organization, the authenticated user must be an organization owner.

If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.

API method documentation: [https://docs.github.com/rest/reference/orgs#remove-organization-membership-for-a-user](https://docs.github.com/rest/reference/orgs#remove-organization-membership-for-a-user)

```java
CompletableFuture<Void> orgsRemoveMembershipForUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsRemoveMembershipForUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsMemberships403ErrorException`](../../doc/models/orgs-memberships-403-error-exception.md) |
| 404 | Resource not found | [`OrgsMemberships404ErrorException`](../../doc/models/orgs-memberships-404-error-exception.md) |


# Orgs List-Outside-Collaborators

List all users who are outside collaborators of an organization.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-outside-collaborators-for-an-organization](https://docs.github.com/rest/reference/orgs#list-outside-collaborators-for-an-organization)

```java
CompletableFuture<List<SimpleUser>> orgsListOutsideCollaboratorsAsync(
    final String org,
    final Filter22Enum filter,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `filter` | [`Filter22Enum`](../../doc/models/filter-22-enum.md) | Query, Optional | Filter the list of outside collaborators. `2fa_disabled` means that only outside collaborators without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled will be returned. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListOutsideCollaboratorsAsync(org, null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
]
```


# Orgs Convert-Member-to-Outside-Collaborator

When an organization member is converted to an outside collaborator, they'll only have access to the repositories that their current team membership allows. The user will no longer be a member of the organization. For more information, see "[Converting an organization member to an outside collaborator](https://docs.github.com/articles/converting-an-organization-member-to-an-outside-collaborator/)". Converting an organization member to an outside collaborator may be restricted by enterprise administrators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)."

API method documentation: [https://docs.github.com/rest/reference/orgs#convert-an-organization-member-to-outside-collaborator](https://docs.github.com/rest/reference/orgs#convert-an-organization-member-to-outside-collaborator)

```java
CompletableFuture<Object> orgsConvertMemberToOutsideCollaboratorAsync(
    final String org,
    final String username,
    final OrgsOutsideCollaboratorsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `body` | [`OrgsOutsideCollaboratorsRequest`](../../doc/models/orgs-outside-collaborators-request.md) | Body, Optional | - |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
String username = "username0";
OrgsOutsideCollaboratorsRequest body = new OrgsOutsideCollaboratorsRequest();
body.setAsync(true);

orgsController.orgsConvertMemberToOutsideCollaboratorAsync(org, username, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden if user is the last owner of the organization, not a member of the organization, or if the enterprise enforces a policy for inviting outside collaborators. For more information, see "[Enforcing repository management policies in your enterprise](https://docs.github.com/admin/policies/enforcing-policies-for-your-enterprise/enforcing-repository-management-policies-in-your-enterprise#enforcing-a-policy-for-inviting-outside-collaborators-to-repositories)." | `ApiException` |
| 404 | Resource not found | [`OrgsOutsideCollaborators404ErrorException`](../../doc/models/orgs-outside-collaborators-404-error-exception.md) |


# Orgs Remove-Outside-Collaborator

Removing a user from this list will remove them from all the organization's repositories.

API method documentation: [https://docs.github.com/rest/reference/orgs#remove-outside-collaborator-from-an-organization](https://docs.github.com/rest/reference/orgs#remove-outside-collaborator-from-an-organization)

```java
CompletableFuture<Void> orgsRemoveOutsideCollaboratorAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsRemoveOutsideCollaboratorAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Unprocessable Entity if user is a member of the organization | [`OrgsOutsideCollaborators422ErrorException`](../../doc/models/orgs-outside-collaborators-422-error-exception.md) |


# Orgs List-Public-Members

Members of an organization can choose to have their membership publicized or not.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-public-organization-members](https://docs.github.com/rest/reference/orgs#list-public-organization-members)

```java
CompletableFuture<List<SimpleUser>> orgsListPublicMembersAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListPublicMembersAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
]
```


# Orgs Check-Public-Membership-for-User

Check public organization membership for a user

API method documentation: [https://docs.github.com/rest/reference/orgs#check-public-organization-membership-for-a-user](https://docs.github.com/rest/reference/orgs#check-public-organization-membership-for-a-user)

```java
CompletableFuture<Void> orgsCheckPublicMembershipForUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsCheckPublicMembershipForUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found if user is not a public member | `ApiException` |


# Orgs Set-Public-Membership-for-Authenticated-User

The user can publicize their own membership. (A user cannot publicize the membership for another user.)

Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

API method documentation: [https://docs.github.com/rest/reference/orgs#set-public-organization-membership-for-the-authenticated-user](https://docs.github.com/rest/reference/orgs#set-public-organization-membership-for-the-authenticated-user)

```java
CompletableFuture<Void> orgsSetPublicMembershipForAuthenticatedUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsSetPublicMembershipForAuthenticatedUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsPublicMembers403ErrorException`](../../doc/models/orgs-public-members-403-error-exception.md) |


# Orgs Remove-Public-Membership-for-Authenticated-User

Remove public organization membership for the authenticated user

API method documentation: [https://docs.github.com/rest/reference/orgs#remove-public-organization-membership-for-the-authenticated-user](https://docs.github.com/rest/reference/orgs#remove-public-organization-membership-for-the-authenticated-user)

```java
CompletableFuture<Void> orgsRemovePublicMembershipForAuthenticatedUserAsync(
    final String org,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String username = "username0";

orgsController.orgsRemovePublicMembershipForAuthenticatedUserAsync(org, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Orgs List-Security-Manager-Teams

Lists teams that are security managers for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."

To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `read:org` scope.

GitHub Apps must have the `administration` organization read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-security-manager-teams](https://docs.github.com/rest/reference/orgs#list-security-manager-teams)

```java
CompletableFuture<List<TeamSimple>> orgsListSecurityManagerTeamsAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`List<TeamSimple>`](../../doc/models/team-simple.md)

## Example Usage

```java
String org = "org6";

orgsController.orgsListSecurityManagerTeamsAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 1,
    "node_id": "MDQ6VGVhbTE=",
    "url": "https://api.github.com/teams/1",
    "html_url": "https://github.com/orgs/github/teams/justice-league",
    "name": "Justice League",
    "slug": "justice-league",
    "description": "A great team.",
    "privacy": "closed",
    "permission": "admin",
    "members_url": "https://api.github.com/teams/1/members{/member}",
    "repositories_url": "https://api.github.com/teams/1/repos",
    "parent": null
  }
]
```


# Orgs Add-Security-Manager-Team

Adds a team as a security manager for an organization. For more information, see "[Managing security for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) for an organization."

To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `write:org` scope.

GitHub Apps must have the `administration` organization read-write permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/orgs#add-a-security-manager-team](https://docs.github.com/rest/reference/orgs#add-a-security-manager-team)

```java
CompletableFuture<Void> orgsAddSecurityManagerTeamAsync(
    final String org,
    final String teamSlug)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";

orgsController.orgsAddSecurityManagerTeamAsync(org, teamSlug).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | The organization has reached the maximum number of security manager teams. | `ApiException` |


# Orgs Remove-Security-Manager-Team

Removes the security manager role from a team for an organization. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization) team from an organization."

To use this endpoint, you must be an administrator for the organization, and you must use an access token with the `admin:org` scope.

GitHub Apps must have the `administration` organization read-write permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/orgs#remove-a-security-manager-team](https://docs.github.com/rest/reference/orgs#remove-a-security-manager-team)

```java
CompletableFuture<Void> orgsRemoveSecurityManagerTeamAsync(
    final String org,
    final String teamSlug)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";

orgsController.orgsRemoveSecurityManagerTeamAsync(org, teamSlug).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Orgs Enable-or-Disable-Security-Product-on-All-Org-Repos

Enables or disables the specified security feature for all repositories in an organization.

To use this endpoint, you must be an organization owner or be member of a team with the security manager role.
A token with the 'write:org' scope is also required.

GitHub Apps must have the `organization_administration:write` permission to use this endpoint.

For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."

API method documentation: [https://docs.github.com/rest/reference/orgs#enable-or-disable-security-product-on-all-org-repos](https://docs.github.com/rest/reference/orgs#enable-or-disable-security-product-on-all-org-repos)

```java
CompletableFuture<Void> orgsEnableOrDisableSecurityProductOnAllOrgReposAsync(
    final String org,
    final SecurityProduct11Enum securityProduct,
    final Enablement2Enum enablement)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `securityProduct` | [`SecurityProduct11Enum`](../../doc/models/security-product-11-enum.md) | Template, Required | The security feature to enable or disable. |
| `enablement` | [`Enablement2Enum`](../../doc/models/enablement-2-enum.md) | Template, Required | The action to take.<br><br>`enable_all` means to enable the specified security feature for all repositories in the organization.<br>`disable_all` means to disable the specified security feature for all repositories in the organization. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
SecurityProduct11Enum securityProduct = SecurityProduct11Enum.SECRET_SCANNING;
Enablement2Enum enablement = Enablement2Enum.ENABLE_ALL;

orgsController.orgsEnableOrDisableSecurityProductOnAllOrgReposAsync(org, securityProduct, enablement).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | The action could not be taken due to an in progress enablement, or a policy is preventing enablement | `ApiException` |


# Orgs List-Memberships-for-Authenticated-User

List organization memberships for the authenticated user

API method documentation: [https://docs.github.com/rest/reference/orgs#list-organization-memberships-for-the-authenticated-user](https://docs.github.com/rest/reference/orgs#list-organization-memberships-for-the-authenticated-user)

```java
CompletableFuture<List<OrgMembership>> orgsListMembershipsForAuthenticatedUserAsync(
    final State1841Enum state,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `state` | [`State1841Enum`](../../doc/models/state-1841-enum.md) | Query, Optional | Indicates the state of the memberships to return. If not specified, the API returns both active and pending memberships. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrgMembership>`](../../doc/models/org-membership.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListMembershipsForAuthenticatedUserAsync(null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "url": "https://api.github.com/orgs/octocat/memberships/defunkt",
    "state": "active",
    "role": "admin",
    "organization_url": "https://api.github.com/orgs/octocat",
    "organization": {
      "login": "github",
      "id": 1,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "repos_url": "https://api.github.com/orgs/github/repos",
      "events_url": "https://api.github.com/orgs/github/events",
      "hooks_url": "https://api.github.com/orgs/github/hooks",
      "issues_url": "https://api.github.com/orgs/github/issues",
      "members_url": "https://api.github.com/orgs/github/members{/member}",
      "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "description": "A great organization"
    },
    "user": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    }
  },
  {
    "url": "https://api.github.com/orgs/invitocat/memberships/defunkt",
    "state": "pending",
    "role": "admin",
    "organization_url": "https://api.github.com/orgs/invitocat",
    "organization": {
      "login": "github",
      "id": 1,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "repos_url": "https://api.github.com/orgs/github/repos",
      "events_url": "https://api.github.com/orgs/github/events",
      "hooks_url": "https://api.github.com/orgs/github/hooks",
      "issues_url": "https://api.github.com/orgs/github/issues",
      "members_url": "https://api.github.com/orgs/github/members{/member}",
      "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "description": "A great organization"
    },
    "user": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMembershipsOrgs401ErrorException`](../../doc/models/user-memberships-orgs-401-error-exception.md) |
| 403 | Forbidden | [`UserMembershipsOrgs403ErrorException`](../../doc/models/user-memberships-orgs-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserMembershipsOrgs422ErrorException`](../../doc/models/user-memberships-orgs-422-error-exception.md) |


# Orgs Get-Membership-for-Authenticated-User

Get an organization membership for the authenticated user

API method documentation: [https://docs.github.com/rest/reference/orgs#get-an-organization-membership-for-the-authenticated-user](https://docs.github.com/rest/reference/orgs#get-an-organization-membership-for-the-authenticated-user)

```java
CompletableFuture<UserMembershipsOrgsResponse> orgsGetMembershipForAuthenticatedUserAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`UserMembershipsOrgsResponse`](../../doc/models/user-memberships-orgs-response.md)

## Example Usage

```java
String org = "org6";

orgsController.orgsGetMembershipForAuthenticatedUserAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/orgs/invitocat/memberships/defunkt",
  "state": "pending",
  "role": "admin",
  "organization_url": "https://api.github.com/orgs/invitocat",
  "organization": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  },
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`UserMembershipsOrgs403ErrorException`](../../doc/models/user-memberships-orgs-403-error-exception.md) |
| 404 | Resource not found | [`UserMembershipsOrgs404ErrorException`](../../doc/models/user-memberships-orgs-404-error-exception.md) |


# Orgs Update-Membership-for-Authenticated-User

Update an organization membership for the authenticated user

API method documentation: [https://docs.github.com/rest/reference/orgs#update-an-organization-membership-for-the-authenticated-user](https://docs.github.com/rest/reference/orgs#update-an-organization-membership-for-the-authenticated-user)

```java
CompletableFuture<UserMembershipsOrgsResponse> orgsUpdateMembershipForAuthenticatedUserAsync(
    final String org,
    final UserMembershipsOrgsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`UserMembershipsOrgsRequest`](../../doc/models/user-memberships-orgs-request.md) | Body, Required | - |

## Response Type

[`UserMembershipsOrgsResponse`](../../doc/models/user-memberships-orgs-response.md)

## Example Usage

```java
String org = "org6";
UserMembershipsOrgsRequest body = new UserMembershipsOrgsRequest();
body.setState("active");

orgsController.orgsUpdateMembershipForAuthenticatedUserAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/orgs/octocat/memberships/defunkt",
  "state": "active",
  "role": "admin",
  "organization_url": "https://api.github.com/orgs/octocat",
  "organization": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  },
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`UserMembershipsOrgs403ErrorException`](../../doc/models/user-memberships-orgs-403-error-exception.md) |
| 404 | Resource not found | [`UserMembershipsOrgs404ErrorException`](../../doc/models/user-memberships-orgs-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserMembershipsOrgs422ErrorException`](../../doc/models/user-memberships-orgs-422-error-exception.md) |


# Orgs List-for-Authenticated-User

List organizations for the authenticated user.

**OAuth scope requirements**

This only lists organizations that your authorization allows you to operate on in some way (e.g., you can list teams with `read:org` scope, you can publicize your organization membership with `user` scope, etc.). Therefore, this API requires at least `user` or `read:org` scope. OAuth requests with insufficient scope receive a `403 Forbidden` response.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user](https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user)

```java
CompletableFuture<List<OrganizationSimple>> orgsListForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrganizationSimple>`](../../doc/models/organization-simple.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserOrgs401ErrorException`](../../doc/models/user-orgs-401-error-exception.md) |
| 403 | Forbidden | [`UserOrgs403ErrorException`](../../doc/models/user-orgs-403-error-exception.md) |


# Orgs List-for-User

List [public organization memberships](https://docs.github.com/articles/publicizing-or-concealing-organization-membership) for the specified user.

This method only lists _public_ memberships, regardless of authentication. If you need to fetch all of the organization memberships (public and private) for the authenticated user, use the [List organizations for the authenticated user](https://docs.github.com/rest/reference/orgs#list-organizations-for-the-authenticated-user) API instead.

API method documentation: [https://docs.github.com/rest/reference/orgs#list-organizations-for-a-user](https://docs.github.com/rest/reference/orgs#list-organizations-for-a-user)

```java
CompletableFuture<List<OrganizationSimple>> orgsListForUserAsync(
    final String username,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrganizationSimple>`](../../doc/models/organization-simple.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

orgsController.orgsListForUserAsync(username, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  }
]
```

