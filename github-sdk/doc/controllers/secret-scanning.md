# Secret-Scanning

Retrieve secret scanning alerts from a repository.

```java
SecretScanningController secretScanningController = client.getSecretScanningController();
```

## Class Name

`SecretScanningController`

## Methods

* [Secret-Scanning List-Alerts-for-Enterprise](../../doc/controllers/secret-scanning.md#secret-scanning-list-alerts-for-enterprise)
* [Secret-Scanning List-Alerts-for-Org](../../doc/controllers/secret-scanning.md#secret-scanning-list-alerts-for-org)
* [Secret-Scanning List-Alerts-for-Repo](../../doc/controllers/secret-scanning.md#secret-scanning-list-alerts-for-repo)
* [Secret-Scanning Get-Alert](../../doc/controllers/secret-scanning.md#secret-scanning-get-alert)
* [Secret-Scanning Update-Alert](../../doc/controllers/secret-scanning.md#secret-scanning-update-alert)
* [Secret-Scanning List-Locations-for-Alert](../../doc/controllers/secret-scanning.md#secret-scanning-list-locations-for-alert)


# Secret-Scanning List-Alerts-for-Enterprise

Lists secret scanning alerts for eligible repositories in an enterprise, from newest to oldest.
To use this endpoint, you must be a member of the enterprise, and you must use an access token with the `repo` scope or `security_events` scope. Alerts are only returned for organizations in the enterprise for which you are an organization owner or a [security manager](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization).

API method documentation: [https://docs.github.com/rest/reference/secret-scanning#list-secret-scanning-alerts-for-an-enterprise](https://docs.github.com/rest/reference/secret-scanning#list-secret-scanning-alerts-for-an-enterprise)

```java
CompletableFuture<List<OrganizationSecretScanningAlert>> secretScanningListAlertsForEnterpriseAsync(
    final String enterprise,
    final State1661Enum state,
    final String secretType,
    final String resolution,
    final Sort30Enum sort,
    final Direction1Enum direction,
    final Integer perPage,
    final String before,
    final String after)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `state` | [`State1661Enum`](../../doc/models/state-1661-enum.md) | Query, Optional | Set to `open` or `resolved` to only list secret scanning alerts in a specific state. |
| `secretType` | `String` | Query, Optional | A comma-separated list of secret types to return. By default all secret types are returned.<br>See "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)"<br>for a complete list of secret types. |
| `resolution` | `String` | Query, Optional | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. |
| `sort` | [`Sort30Enum`](../../doc/models/sort-30-enum.md) | Query, Optional | The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `before` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results before this cursor. |
| `after` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results after this cursor. |

## Response Type

[`List<OrganizationSecretScanningAlert>`](../../doc/models/organization-secret-scanning-alert.md)

## Example Usage

```java
String enterprise = "enterprise4";
Integer perPage = 30;

secretScanningController.secretScanningListAlertsForEnterpriseAsync(enterprise, null, null, null, null, null, perPage, null, null).thenAccept(result -> {
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
    "number": 2,
    "created_at": "2020-11-06T18:48:51Z",
    "url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/2",
    "html_url": "https://github.com/owner/private-repo/security/secret-scanning/2",
    "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/2/locations",
    "state": "resolved",
    "resolution": "false_positive",
    "resolved_at": "2020-11-07T02:47:13Z",
    "resolved_by": {
      "login": "monalisa",
      "id": 2,
      "node_id": "MDQ6VXNlcjI=",
      "avatar_url": "https://alambic.github.com/avatars/u/2?",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/monalisa",
      "followers_url": "https://api.github.com/users/monalisa/followers",
      "following_url": "https://api.github.com/users/monalisa/following{/other_user}",
      "gists_url": "https://api.github.com/users/monalisa/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/monalisa/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/monalisa/subscriptions",
      "organizations_url": "https://api.github.com/users/monalisa/orgs",
      "repos_url": "https://api.github.com/users/monalisa/repos",
      "events_url": "https://api.github.com/users/monalisa/events{/privacy}",
      "received_events_url": "https://api.github.com/users/monalisa/received_events",
      "type": "User",
      "site_admin": true
    },
    "secret_type": "adafruit_io_key",
    "secret_type_display_name": "Adafruit IO Key",
    "secret": "aio_XXXXXXXXXXXXXXXXXXXXXXXXXXXX",
    "repository": {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
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
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks"
    },
    "push_protection_bypassed_by": {
      "login": "monalisa",
      "id": 2,
      "node_id": "MDQ6VXNlcjI=",
      "avatar_url": "https://alambic.github.com/avatars/u/2?",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/monalisa",
      "followers_url": "https://api.github.com/users/monalisa/followers",
      "following_url": "https://api.github.com/users/monalisa/following{/other_user}",
      "gists_url": "https://api.github.com/users/monalisa/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/monalisa/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/monalisa/subscriptions",
      "organizations_url": "https://api.github.com/users/monalisa/orgs",
      "repos_url": "https://api.github.com/users/monalisa/repos",
      "events_url": "https://api.github.com/users/monalisa/events{/privacy}",
      "received_events_url": "https://api.github.com/users/monalisa/received_events",
      "type": "User",
      "site_admin": true
    },
    "push_protection_bypassed": true,
    "push_protection_bypassed_at": "2020-11-06T21:48:51Z",
    "resolution_comment": "Example comment"
  },
  {
    "number": 1,
    "created_at": "2020-11-06T18:18:30Z",
    "url": "https://api.github.com/repos/owner/repo/secret-scanning/alerts/1",
    "html_url": "https://github.com/owner/repo/security/secret-scanning/1",
    "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/1/locations",
    "state": "open",
    "resolution": null,
    "resolved_at": null,
    "resolved_by": null,
    "secret_type": "mailchimp_api_key",
    "secret_type_display_name": "Mailchimp API Key",
    "secret": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-us2",
    "repository": {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
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
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks"
    },
    "push_protection_bypassed_by": null,
    "push_protection_bypassed": false,
    "push_protection_bypassed_at": null,
    "resolution_comment": null
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`EnterprisesSecretScanningAlerts404ErrorException`](../../doc/models/enterprises-secret-scanning-alerts-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Secret-Scanning List-Alerts-for-Org

Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
For public repositories, you may instead use the `public_repo` scope.

GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/secret-scanning#list-secret-scanning-alerts-for-an-organization](https://docs.github.com/rest/reference/secret-scanning#list-secret-scanning-alerts-for-an-organization)

```java
CompletableFuture<List<OrganizationSecretScanningAlert>> secretScanningListAlertsForOrgAsync(
    final String org,
    final State1661Enum state,
    final String secretType,
    final String resolution,
    final Sort30Enum sort,
    final Direction1Enum direction,
    final Integer page,
    final Integer perPage,
    final String before,
    final String after)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `state` | [`State1661Enum`](../../doc/models/state-1661-enum.md) | Query, Optional | Set to `open` or `resolved` to only list secret scanning alerts in a specific state. |
| `secretType` | `String` | Query, Optional | A comma-separated list of secret types to return. By default all secret types are returned.<br>See "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)"<br>for a complete list of secret types. |
| `resolution` | `String` | Query, Optional | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. |
| `sort` | [`Sort30Enum`](../../doc/models/sort-30-enum.md) | Query, Optional | The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `before` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty "before" query string. |
| `after` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty "after" query string. |

## Response Type

[`List<OrganizationSecretScanningAlert>`](../../doc/models/organization-secret-scanning-alert.md)

## Example Usage

```java
String org = "org6";
Integer page = 1;
Integer perPage = 30;

secretScanningController.secretScanningListAlertsForOrgAsync(org, null, null, null, null, null, page, perPage, null, null).thenAccept(result -> {
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
    "number": 2,
    "created_at": "2020-11-06T18:48:51Z",
    "url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/2",
    "html_url": "https://github.com/owner/private-repo/security/secret-scanning/2",
    "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/2/locations",
    "state": "resolved",
    "resolution": "false_positive",
    "resolved_at": "2020-11-07T02:47:13Z",
    "resolved_by": {
      "login": "monalisa",
      "id": 2,
      "node_id": "MDQ6VXNlcjI=",
      "avatar_url": "https://alambic.github.com/avatars/u/2?",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/monalisa",
      "followers_url": "https://api.github.com/users/monalisa/followers",
      "following_url": "https://api.github.com/users/monalisa/following{/other_user}",
      "gists_url": "https://api.github.com/users/monalisa/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/monalisa/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/monalisa/subscriptions",
      "organizations_url": "https://api.github.com/users/monalisa/orgs",
      "repos_url": "https://api.github.com/users/monalisa/repos",
      "events_url": "https://api.github.com/users/monalisa/events{/privacy}",
      "received_events_url": "https://api.github.com/users/monalisa/received_events",
      "type": "User",
      "site_admin": true
    },
    "secret_type": "adafruit_io_key",
    "secret_type_display_name": "Adafruit IO Key",
    "secret": "aio_XXXXXXXXXXXXXXXXXXXXXXXXXXXX",
    "repository": {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
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
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks"
    },
    "push_protection_bypassed_by": {
      "login": "monalisa",
      "id": 2,
      "node_id": "MDQ6VXNlcjI=",
      "avatar_url": "https://alambic.github.com/avatars/u/2?",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/monalisa",
      "followers_url": "https://api.github.com/users/monalisa/followers",
      "following_url": "https://api.github.com/users/monalisa/following{/other_user}",
      "gists_url": "https://api.github.com/users/monalisa/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/monalisa/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/monalisa/subscriptions",
      "organizations_url": "https://api.github.com/users/monalisa/orgs",
      "repos_url": "https://api.github.com/users/monalisa/repos",
      "events_url": "https://api.github.com/users/monalisa/events{/privacy}",
      "received_events_url": "https://api.github.com/users/monalisa/received_events",
      "type": "User",
      "site_admin": true
    },
    "push_protection_bypassed": true,
    "push_protection_bypassed_at": "2020-11-06T21:48:51Z",
    "resolution_comment": "Example comment"
  },
  {
    "number": 1,
    "created_at": "2020-11-06T18:18:30Z",
    "url": "https://api.github.com/repos/owner/repo/secret-scanning/alerts/1",
    "html_url": "https://github.com/owner/repo/security/secret-scanning/1",
    "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/1/locations",
    "state": "open",
    "resolution": null,
    "resolved_at": null,
    "resolved_by": null,
    "secret_type": "mailchimp_api_key",
    "secret_type_display_name": "Mailchimp API Key",
    "secret": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-us2",
    "repository": {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
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
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks"
    },
    "push_protection_bypassed_by": null,
    "push_protection_bypassed": false,
    "push_protection_bypassed_at": null,
    "resolution_comment": null
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsSecretScanningAlerts404ErrorException`](../../doc/models/orgs-secret-scanning-alerts-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Secret-Scanning List-Alerts-for-Repo

Lists secret scanning alerts for an eligible repository, from newest to oldest.
To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
For public repositories, you may instead use the `public_repo` scope.

GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/secret-scanning#list-secret-scanning-alerts-for-a-repository](https://docs.github.com/rest/reference/secret-scanning#list-secret-scanning-alerts-for-a-repository)

```java
CompletableFuture<List<SecretScanningAlert>> secretScanningListAlertsForRepoAsync(
    final String owner,
    final String repo,
    final State1661Enum state,
    final String secretType,
    final String resolution,
    final Sort30Enum sort,
    final Direction1Enum direction,
    final Integer page,
    final Integer perPage,
    final String before,
    final String after)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `state` | [`State1661Enum`](../../doc/models/state-1661-enum.md) | Query, Optional | Set to `open` or `resolved` to only list secret scanning alerts in a specific state. |
| `secretType` | `String` | Query, Optional | A comma-separated list of secret types to return. By default all secret types are returned.<br>See "[Secret scanning patterns](https://docs.github.com/code-security/secret-scanning/secret-scanning-patterns#supported-secrets-for-advanced-security)"<br>for a complete list of secret types. |
| `resolution` | `String` | Query, Optional | A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or `used_in_tests`. |
| `sort` | [`Sort30Enum`](../../doc/models/sort-30-enum.md) | Query, Optional | The property to sort the results by. `created` means when the alert was created. `updated` means when the alert was updated or resolved. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `before` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. To receive an initial cursor on your first request, include an empty "before" query string. |
| `after` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor.  To receive an initial cursor on your first request, include an empty "after" query string. |

## Response Type

[`List<SecretScanningAlert>`](../../doc/models/secret-scanning-alert.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer page = 1;
Integer perPage = 30;

secretScanningController.secretScanningListAlertsForRepoAsync(owner, repo, null, null, null, null, null, page, perPage, null, null).thenAccept(result -> {
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
    "number": 2,
    "created_at": "2020-11-06T18:48:51Z",
    "url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/2",
    "html_url": "https://github.com/owner/private-repo/security/secret-scanning/2",
    "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/2/locations",
    "state": "resolved",
    "resolution": "false_positive",
    "resolved_at": "2020-11-07T02:47:13Z",
    "resolved_by": {
      "login": "monalisa",
      "id": 2,
      "node_id": "MDQ6VXNlcjI=",
      "avatar_url": "https://alambic.github.com/avatars/u/2?",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/monalisa",
      "followers_url": "https://api.github.com/users/monalisa/followers",
      "following_url": "https://api.github.com/users/monalisa/following{/other_user}",
      "gists_url": "https://api.github.com/users/monalisa/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/monalisa/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/monalisa/subscriptions",
      "organizations_url": "https://api.github.com/users/monalisa/orgs",
      "repos_url": "https://api.github.com/users/monalisa/repos",
      "events_url": "https://api.github.com/users/monalisa/events{/privacy}",
      "received_events_url": "https://api.github.com/users/monalisa/received_events",
      "type": "User",
      "site_admin": true
    },
    "secret_type": "adafruit_io_key",
    "secret_type_display_name": "Adafruit IO Key",
    "secret": "aio_XXXXXXXXXXXXXXXXXXXXXXXXXXXX",
    "push_protection_bypassed_by": {
      "login": "monalisa",
      "id": 2,
      "node_id": "MDQ6VXNlcjI=",
      "avatar_url": "https://alambic.github.com/avatars/u/2?",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/monalisa",
      "followers_url": "https://api.github.com/users/monalisa/followers",
      "following_url": "https://api.github.com/users/monalisa/following{/other_user}",
      "gists_url": "https://api.github.com/users/monalisa/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/monalisa/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/monalisa/subscriptions",
      "organizations_url": "https://api.github.com/users/monalisa/orgs",
      "repos_url": "https://api.github.com/users/monalisa/repos",
      "events_url": "https://api.github.com/users/monalisa/events{/privacy}",
      "received_events_url": "https://api.github.com/users/monalisa/received_events",
      "type": "User",
      "site_admin": true
    },
    "push_protection_bypassed": true,
    "push_protection_bypassed_at": "2020-11-06T21:48:51Z",
    "resolution_comment": "Example comment"
  },
  {
    "number": 1,
    "created_at": "2020-11-06T18:18:30Z",
    "url": "https://api.github.com/repos/owner/repo/secret-scanning/alerts/1",
    "html_url": "https://github.com/owner/repo/security/secret-scanning/1",
    "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/1/locations",
    "state": "open",
    "resolution": null,
    "resolved_at": null,
    "resolved_by": null,
    "secret_type": "mailchimp_api_key",
    "secret_type_display_name": "Mailchimp API Key",
    "secret": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-us2",
    "push_protection_bypassed_by": null,
    "push_protection_bypassed": false,
    "push_protection_bypassed_at": null,
    "resolution_comment": null
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Repository is public or secret scanning is disabled for the repository | `ApiException` |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Secret-Scanning Get-Alert

Gets a single secret scanning alert detected in an eligible repository.
To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
For public repositories, you may instead use the `public_repo` scope.

GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/secret-scanning#get-a-secret-scanning-alert](https://docs.github.com/rest/reference/secret-scanning#get-a-secret-scanning-alert)

```java
CompletableFuture<SecretScanningAlert> secretScanningGetAlertAsync(
    final String owner,
    final String repo,
    final int alertNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `alertNumber` | `int` | Template, Required | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation. |

## Response Type

[`SecretScanningAlert`](../../doc/models/secret-scanning-alert.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;

secretScanningController.secretScanningGetAlertAsync(owner, repo, alertNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "number": 42,
  "created_at": "2020-11-06T18:18:30Z",
  "url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/42",
  "html_url": "https://github.com/owner/private-repo/security/secret-scanning/42",
  "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/42/locations",
  "state": "open",
  "resolution": null,
  "resolved_at": null,
  "resolved_by": null,
  "secret_type": "mailchimp_api_key",
  "secret_type_display_name": "Mailchimp API Key",
  "secret": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-us2",
  "push_protection_bypassed_by": null,
  "push_protection_bypassed": false,
  "push_protection_bypassed_at": null,
  "resolution_comment": null
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Repository is public, or secret scanning is disabled for the repository, or the resource is not found | `ApiException` |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Secret-Scanning Update-Alert

Updates the status of a secret scanning alert in an eligible repository.
To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
For public repositories, you may instead use the `public_repo` scope.

GitHub Apps must have the `secret_scanning_alerts` write permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/secret-scanning#update-a-secret-scanning-alert](https://docs.github.com/rest/reference/secret-scanning#update-a-secret-scanning-alert)

```java
CompletableFuture<SecretScanningAlert> secretScanningUpdateAlertAsync(
    final String owner,
    final String repo,
    final int alertNumber,
    final ReposSecretScanningAlertsAlertNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `alertNumber` | `int` | Template, Required | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation. |
| `body` | [`ReposSecretScanningAlertsAlertNumberRequest`](../../doc/models/repos-secret-scanning-alerts-alert-number-request.md) | Body, Required | - |

## Response Type

[`SecretScanningAlert`](../../doc/models/secret-scanning-alert.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;
ReposSecretScanningAlertsAlertNumberRequest body = new ReposSecretScanningAlertsAlertNumberRequest();
body.setState(SecretScanningAlertStateEnum.RESOLVED);
body.setResolution(com.github.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));

secretScanningController.secretScanningUpdateAlertAsync(owner, repo, alertNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "number": 42,
  "created_at": "2020-11-06T18:18:30Z",
  "url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/42",
  "html_url": "https://github.com/owner/private-repo/security/secret-scanning/42",
  "locations_url": "https://api.github.com/repos/owner/private-repo/secret-scanning/alerts/42/locations",
  "state": "resolved",
  "resolution": "used_in_tests",
  "resolved_at": "2020-11-16T22:42:07Z",
  "resolved_by": {
    "login": "monalisa",
    "id": 2,
    "node_id": "MDQ6VXNlcjI=",
    "avatar_url": "https://alambic.github.com/avatars/u/2?",
    "gravatar_id": "",
    "url": "https://api.github.com/users/monalisa",
    "html_url": "https://github.com/monalisa",
    "followers_url": "https://api.github.com/users/monalisa/followers",
    "following_url": "https://api.github.com/users/monalisa/following{/other_user}",
    "gists_url": "https://api.github.com/users/monalisa/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/monalisa/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/monalisa/subscriptions",
    "organizations_url": "https://api.github.com/users/monalisa/orgs",
    "repos_url": "https://api.github.com/users/monalisa/repos",
    "events_url": "https://api.github.com/users/monalisa/events{/privacy}",
    "received_events_url": "https://api.github.com/users/monalisa/received_events",
    "type": "User",
    "site_admin": true
  },
  "secret_type": "mailchimp_api_key",
  "secret_type_display_name": "Mailchimp API Key",
  "secret": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-us2",
  "push_protection_bypassed": false,
  "push_protection_bypassed_by": null,
  "push_protection_bypassed_at": null,
  "resolution_comment": "Example comment"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request, resolution comment is invalid or the resolution was not changed. | `ApiException` |
| 404 | Repository is public, or secret scanning is disabled for the repository, or the resource is not found | `ApiException` |
| 422 | State does not match the resolution or resolution comment | `ApiException` |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Secret-Scanning List-Locations-for-Alert

Lists all locations for a given secret scanning alert for an eligible repository.
To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
For public repositories, you may instead use the `public_repo` scope.

GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/secret-scanning#list-locations-for-a-secret-scanning-alert](https://docs.github.com/rest/reference/secret-scanning#list-locations-for-a-secret-scanning-alert)

```java
CompletableFuture<List<SecretScanningLocation>> secretScanningListLocationsForAlertAsync(
    final String owner,
    final String repo,
    final int alertNumber,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `alertNumber` | `int` | Template, Required | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`List<SecretScanningLocation>`](../../doc/models/secret-scanning-location.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;
Integer page = 1;
Integer perPage = 30;

secretScanningController.secretScanningListLocationsForAlertAsync(owner, repo, alertNumber, page, perPage).thenAccept(result -> {
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
    "type": "commit",
    "details": {
      "path": "/example/secrets.txt",
      "start_line": 1,
      "end_line": 1,
      "start_column": 1,
      "end_column": 64,
      "blob_sha": "af5626b4a114abcb82d63db7c8082c3c4756e51b",
      "blob_url": "https://api.github.com/repos/octocat/hello-world/git/blobs/af5626b4a114abcb82d63db7c8082c3c4756e51b",
      "commit_sha": "f14d7debf9775f957cf4f1e8176da0786431f72b",
      "commit_url": "https://api.github.com/repos/octocat/hello-world/git/commits/f14d7debf9775f957cf4f1e8176da0786431f72b"
    }
  },
  {
    "type": "issue_title",
    "details": {
      "issue_title_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347"
    }
  },
  {
    "type": "issue_body",
    "details": {
      "issue_body_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347"
    }
  },
  {
    "type": "issue_comment",
    "details": {
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Repository is public, or secret scanning is disabled for the repository, or the resource is not found | `ApiException` |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |

