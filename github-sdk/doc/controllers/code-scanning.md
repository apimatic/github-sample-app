# Code-Scanning

Retrieve code scanning alerts from a repository.

```java
CodeScanningController codeScanningController = client.getCodeScanningController();
```

## Class Name

`CodeScanningController`

## Methods

* [Code-Scanning List-Alerts-for-Org](../../doc/controllers/code-scanning.md#code-scanning-list-alerts-for-org)
* [Code-Scanning List-Alerts-for-Repo](../../doc/controllers/code-scanning.md#code-scanning-list-alerts-for-repo)
* [Code-Scanning Get-Alert](../../doc/controllers/code-scanning.md#code-scanning-get-alert)
* [Code-Scanning Update-Alert](../../doc/controllers/code-scanning.md#code-scanning-update-alert)
* [Code-Scanning List-Alert-Instances](../../doc/controllers/code-scanning.md#code-scanning-list-alert-instances)
* [Code-Scanning List-Recent-Analyses](../../doc/controllers/code-scanning.md#code-scanning-list-recent-analyses)
* [Code-Scanning Get-Analysis](../../doc/controllers/code-scanning.md#code-scanning-get-analysis)
* [Code-Scanning Delete-Analysis](../../doc/controllers/code-scanning.md#code-scanning-delete-analysis)
* [Code-Scanning List-Codeql-Databases](../../doc/controllers/code-scanning.md#code-scanning-list-codeql-databases)
* [Code-Scanning Get-Codeql-Database](../../doc/controllers/code-scanning.md#code-scanning-get-codeql-database)
* [Code-Scanning Upload-Sarif](../../doc/controllers/code-scanning.md#code-scanning-upload-sarif)
* [Code-Scanning Get-Sarif](../../doc/controllers/code-scanning.md#code-scanning-get-sarif)


# Code-Scanning List-Alerts-for-Org

Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible repositories are repositories that are owned by organizations that you own or for which you are a security manager. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."

To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.

For public repositories, you may instead use the `public_repo` scope.

GitHub Apps must have the `security_events` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#list-code-scanning-alerts-by-organization](https://docs.github.com/rest/reference/code-scanning#list-code-scanning-alerts-by-organization)

```java
CompletableFuture<List<CodeScanningOrganizationAlertItems>> codeScanningListAlertsForOrgAsync(
    final String org,
    final String toolName,
    final String toolGuid,
    final String before,
    final String after,
    final Integer page,
    final Integer perPage,
    final Direction1Enum direction,
    final CodeScanningAlertStateEnum state,
    final Sort8Enum sort,
    final CodeScanningAlertSeverityEnum severity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `toolName` | `String` | Query, Optional | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. |
| `toolGuid` | `String` | Query, Optional | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. |
| `before` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results before this cursor. |
| `after` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results after this cursor. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `state` | [`CodeScanningAlertStateEnum`](../../doc/models/code-scanning-alert-state-enum.md) | Query, Optional | If specified, only code scanning alerts with this state will be returned. |
| `sort` | [`Sort8Enum`](../../doc/models/sort-8-enum.md) | Query, Optional | The property by which to sort the results. |
| `severity` | [`CodeScanningAlertSeverityEnum`](../../doc/models/code-scanning-alert-severity-enum.md) | Query, Optional | If specified, only code scanning alerts with this severity will be returned. |

## Response Type

[`List<CodeScanningOrganizationAlertItems>`](../../doc/models/code-scanning-organization-alert-items.md)

## Example Usage

```java
String org = "org6";
Integer page = 1;
Integer perPage = 30;

codeScanningController.codeScanningListAlertsForOrgAsync(org, null, null, null, null, page, perPage, null, null, null, null).thenAccept(result -> {
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
    "number": 4,
    "created_at": "2020-02-13T12:29:18Z",
    "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/4",
    "html_url": "https://github.com/octocat/hello-world/code-scanning/4",
    "state": "open",
    "dismissed_by": null,
    "dismissed_at": null,
    "dismissed_reason": null,
    "dismissed_comment": null,
    "rule": {
      "id": "js/zipslip",
      "severity": "error",
      "tags": [
        "security",
        "external/cwe/cwe-022"
      ],
      "description": "Arbitrary file write during zip extraction",
      "name": "js/zipslip"
    },
    "tool": {
      "name": "CodeQL",
      "guid": null,
      "version": "2.4.0"
    },
    "most_recent_instance": {
      "ref": "refs/heads/main",
      "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
      "environment": "{}",
      "state": "open",
      "commit_sha": "39406e42cb832f683daa691dd652a8dc36ee8930",
      "message": {
        "text": "This path depends on a user-provided value."
      },
      "location": {
        "path": "spec-main/api-session-spec.ts",
        "start_line": 917,
        "end_line": 917,
        "start_column": 7,
        "end_column": 18
      },
      "classifications": [
        "test"
      ]
    },
    "instances_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/4/instances",
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
    }
  },
  {
    "number": 3,
    "created_at": "2020-02-13T12:29:18Z",
    "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/3",
    "html_url": "https://github.com/octocat/hello-world/code-scanning/3",
    "state": "dismissed",
    "dismissed_by": {
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
    "dismissed_at": "2020-02-14T12:29:18Z",
    "dismissed_reason": "false positive",
    "dismissed_comment": "This alert is not actually correct, because there's a sanitizer included in the library.",
    "rule": {
      "id": "js/zipslip",
      "severity": "error",
      "tags": [
        "security",
        "external/cwe/cwe-022"
      ],
      "description": "Arbitrary file write during zip extraction",
      "name": "js/zipslip"
    },
    "tool": {
      "name": "CodeQL",
      "guid": null,
      "version": "2.4.0"
    },
    "most_recent_instance": {
      "ref": "refs/heads/main",
      "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
      "environment": "{}",
      "state": "open",
      "commit_sha": "39406e42cb832f683daa691dd652a8dc36ee8930",
      "message": {
        "text": "This path depends on a user-provided value."
      },
      "location": {
        "path": "lib/ab12-gen.js",
        "start_line": 917,
        "end_line": 917,
        "start_column": 7,
        "end_column": 18
      },
      "classifications": []
    },
    "instances_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/3/instances",
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
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsCodeScanningAlerts404ErrorException`](../../doc/models/orgs-code-scanning-alerts-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning List-Alerts-for-Repo

Lists code scanning alerts.

To use this endpoint, you must use an access token with the `security_events` scope or, for alerts from public repositories only, an access token with the `public_repo` scope.

GitHub Apps must have the `security_events` read
permission to use this endpoint.

The response includes a `most_recent_instance` object.
This provides details of the most recent instance of this alert
for the default branch (or for the specified Git reference if you used `ref` in the request).

API method documentation: [https://docs.github.com/rest/reference/code-scanning#list-code-scanning-alerts-for-a-repository](https://docs.github.com/rest/reference/code-scanning#list-code-scanning-alerts-for-a-repository)

```java
CompletableFuture<List<CodeScanningAlertItems>> codeScanningListAlertsForRepoAsync(
    final String owner,
    final String repo,
    final String toolName,
    final String toolGuid,
    final Integer page,
    final Integer perPage,
    final String ref,
    final Direction1Enum direction,
    final Sort8Enum sort,
    final CodeScanningAlertStateEnum state,
    final CodeScanningAlertSeverityEnum severity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `toolName` | `String` | Query, Optional | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. |
| `toolGuid` | `String` | Query, Optional | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `ref` | `String` | Query, Optional | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `sort` | [`Sort8Enum`](../../doc/models/sort-8-enum.md) | Query, Optional | The property by which to sort the results. |
| `state` | [`CodeScanningAlertStateEnum`](../../doc/models/code-scanning-alert-state-enum.md) | Query, Optional | If specified, only code scanning alerts with this state will be returned. |
| `severity` | [`CodeScanningAlertSeverityEnum`](../../doc/models/code-scanning-alert-severity-enum.md) | Query, Optional | If specified, only code scanning alerts with this severity will be returned. |

## Response Type

[`List<CodeScanningAlertItems>`](../../doc/models/code-scanning-alert-items.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer page = 1;
Integer perPage = 30;

codeScanningController.codeScanningListAlertsForRepoAsync(owner, repo, null, null, page, perPage, null, null, null, null, null).thenAccept(result -> {
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
    "number": 4,
    "created_at": "2020-02-13T12:29:18Z",
    "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/4",
    "html_url": "https://github.com/octocat/hello-world/code-scanning/4",
    "state": "open",
    "fixed_at": null,
    "dismissed_by": null,
    "dismissed_at": null,
    "dismissed_reason": null,
    "dismissed_comment": null,
    "rule": {
      "id": "js/zipslip",
      "severity": "error",
      "tags": [
        "security",
        "external/cwe/cwe-022"
      ],
      "description": "Arbitrary file write during zip extraction",
      "name": "js/zipslip"
    },
    "tool": {
      "name": "CodeQL",
      "guid": null,
      "version": "2.4.0"
    },
    "most_recent_instance": {
      "ref": "refs/heads/main",
      "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
      "environment": "{}",
      "state": "open",
      "commit_sha": "39406e42cb832f683daa691dd652a8dc36ee8930",
      "message": {
        "text": "This path depends on a user-provided value."
      },
      "location": {
        "path": "spec-main/api-session-spec.ts",
        "start_line": 917,
        "end_line": 917,
        "start_column": 7,
        "end_column": 18
      },
      "classifications": [
        "test"
      ]
    },
    "instances_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/4/instances"
  },
  {
    "number": 3,
    "created_at": "2020-02-13T12:29:18Z",
    "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/3",
    "html_url": "https://github.com/octocat/hello-world/code-scanning/3",
    "state": "dismissed",
    "fixed_at": null,
    "dismissed_by": {
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
    "dismissed_at": "2020-02-14T12:29:18Z",
    "dismissed_reason": "false positive",
    "dismissed_comment": "This alert is not actually correct, because there's a sanitizer included in the library.",
    "rule": {
      "id": "js/zipslip",
      "severity": "error",
      "tags": [
        "security",
        "external/cwe/cwe-022"
      ],
      "description": "Arbitrary file write during zip extraction",
      "name": "js/zipslip"
    },
    "tool": {
      "name": "CodeQL",
      "guid": null,
      "version": "2.4.0"
    },
    "most_recent_instance": {
      "ref": "refs/heads/main",
      "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
      "environment": "{}",
      "state": "open",
      "commit_sha": "39406e42cb832f683daa691dd652a8dc36ee8930",
      "message": {
        "text": "This path depends on a user-provided value."
      },
      "location": {
        "path": "lib/ab12-gen.js",
        "start_line": 917,
        "end_line": 917,
        "start_column": 7,
        "end_column": 18
      },
      "classifications": []
    },
    "instances_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/3/instances"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningAlerts403ErrorException`](../../doc/models/repos-code-scanning-alerts-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningAlerts404ErrorException`](../../doc/models/repos-code-scanning-alerts-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning Get-Alert

Gets a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#get-a-code-scanning-alert](https://docs.github.com/rest/reference/code-scanning#get-a-code-scanning-alert)

```java
CompletableFuture<CodeScanningAlert> codeScanningGetAlertAsync(
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

[`CodeScanningAlert`](../../doc/models/code-scanning-alert.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;

codeScanningController.codeScanningGetAlertAsync(owner, repo, alertNumber).thenAccept(result -> {
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
  "created_at": "2020-06-19T11:21:34Z",
  "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/42",
  "html_url": "https://github.com/octocat/hello-world/code-scanning/42",
  "state": "dismissed",
  "fixed_at": null,
  "dismissed_by": {
    "login": "octocat",
    "id": 54933897,
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
  "dismissed_at": "2020-02-14T12:29:18Z",
  "dismissed_reason": "false positive",
  "dismissed_comment": "This alert is not actually correct, because there's a sanitizer included in the library.",
  "rule": {
    "id": "js/zipslip",
    "severity": "error",
    "security_severity_level": "high",
    "description": "Arbitrary file write during zip extraction (\"Zip Slip\")",
    "name": "js/zipslip",
    "full_description": "Extracting files from a malicious zip archive without validating that the destination file path is within the destination directory can cause files outside the destination directory to be overwritten.",
    "tags": [
      "security",
      "external/cwe/cwe-022"
    ],
    "help": "# Arbitrary file write during zip extraction (\"Zip Slip\")\\nExtracting files from a malicious zip archive without validating that the destination file path is within the destination directory can cause files outside the destination directory to be overwritten ...",
    "help_uri": "https://codeql.github.com/"
  },
  "tool": {
    "name": "CodeQL",
    "guid": null,
    "version": "2.4.0"
  },
  "most_recent_instance": {
    "ref": "refs/heads/main",
    "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
    "environment": "{}",
    "state": "dismissed",
    "commit_sha": "39406e42cb832f683daa691dd652a8dc36ee8930",
    "message": {
      "text": "This path depends on a user-provided value."
    },
    "location": {
      "path": "spec-main/api-session-spec.ts",
      "start_line": 917,
      "end_line": 917,
      "start_column": 7,
      "end_column": 18
    },
    "classifications": [
      "test"
    ]
  },
  "instances_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/42/instances"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningAlertsAlertNumber403ErrorException`](../../doc/models/repos-code-scanning-alerts-alert-number-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningAlertsAlertNumber404ErrorException`](../../doc/models/repos-code-scanning-alerts-alert-number-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning Update-Alert

Updates the status of a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#update-a-code-scanning-alert](https://docs.github.com/rest/reference/code-scanning#update-a-code-scanning-alert)

```java
CompletableFuture<CodeScanningAlert> codeScanningUpdateAlertAsync(
    final String owner,
    final String repo,
    final int alertNumber,
    final ReposCodeScanningAlertsAlertNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `alertNumber` | `int` | Template, Required | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation. |
| `body` | [`ReposCodeScanningAlertsAlertNumberRequest`](../../doc/models/repos-code-scanning-alerts-alert-number-request.md) | Body, Required | - |

## Response Type

[`CodeScanningAlert`](../../doc/models/code-scanning-alert.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;
ReposCodeScanningAlertsAlertNumberRequest body = new ReposCodeScanningAlertsAlertNumberRequest();
body.setState(CodeScanningAlertSetStateEnum.DISMISSED);
body.setDismissedReason(com.github.api.ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"));
body.setDismissedComment("This alert is not actually correct, because there's a sanitizer included in the library.");

codeScanningController.codeScanningUpdateAlertAsync(owner, repo, alertNumber, body).thenAccept(result -> {
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
  "created_at": "2020-08-25T21:28:36Z",
  "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/42",
  "html_url": "https://github.com/octocat/hello-world/code-scanning/42",
  "state": "dismissed",
  "fixed_at": null,
  "dismissed_by": {
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
  "dismissed_at": "2020-09-02T22:34:56Z",
  "dismissed_reason": "false positive",
  "dismissed_comment": "This alert is not actually correct, because there's a sanitizer included in the library.",
  "rule": {
    "id": "js/zipslip",
    "severity": "error",
    "security_severity_level": "high",
    "description": "Arbitrary file write during zip extraction (\"Zip Slip\")",
    "name": "js/zipslip",
    "full_description": "Extracting files from a malicious zip archive without validating that the destination file path is within the destination directory can cause files outside the destination directory to be overwritten.",
    "tags": [
      "security",
      "external/cwe/cwe-022"
    ],
    "help": "# Arbitrary file write during zip extraction (\"Zip Slip\")\\nExtracting files from a malicious zip archive without validating that the destination file path is within the destination directory can cause files outside the destination directory to be overwritten ...",
    "help_uri": "https://codeql.github.com/"
  },
  "tool": {
    "name": "CodeQL",
    "guid": null,
    "version": "2.4.0"
  },
  "most_recent_instance": {
    "ref": "refs/heads/main",
    "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
    "environment": "{}",
    "state": "dismissed",
    "commit_sha": "39406e42cb832f683daa691dd652a8dc36ee8930",
    "message": {
      "text": "This path depends on a user-provided value."
    },
    "location": {
      "path": "spec-main/api-session-spec.ts",
      "start_line": 917,
      "end_line": 917,
      "start_column": 7,
      "end_column": 18
    },
    "classifications": [
      "test"
    ]
  },
  "instances_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/alerts/42/instances"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningAlertsAlertNumber403ErrorException`](../../doc/models/repos-code-scanning-alerts-alert-number-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningAlertsAlertNumber404ErrorException`](../../doc/models/repos-code-scanning-alerts-alert-number-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning List-Alert-Instances

Lists all instances of the specified code scanning alert.
You must use an access token with the `security_events` scope to use this endpoint with private repos,
the `public_repo` scope also grants permission to read security events on public repos only.
GitHub Apps must have the `security_events` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#list-instances-of-a-code-scanning-alert](https://docs.github.com/rest/reference/code-scanning#list-instances-of-a-code-scanning-alert)

```java
CompletableFuture<List<CodeScanningAlertInstance>> codeScanningListAlertInstancesAsync(
    final String owner,
    final String repo,
    final int alertNumber,
    final Integer page,
    final Integer perPage,
    final String ref)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `alertNumber` | `int` | Template, Required | The number that identifies an alert. You can find this at the end of the URL for a code scanning alert within GitHub, and in the `number` field in the response from the `GET /repos/{owner}/{repo}/code-scanning/alerts` operation. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `ref` | `String` | Query, Optional | The Git reference for the results you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. |

## Response Type

[`List<CodeScanningAlertInstance>`](../../doc/models/code-scanning-alert-instance.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;
Integer page = 1;
Integer perPage = 30;

codeScanningController.codeScanningListAlertInstancesAsync(owner, repo, alertNumber, page, perPage, null).thenAccept(result -> {
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
    "ref": "refs/heads/main",
    "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
    "environment": "",
    "category": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
    "state": "open",
    "fixed_at": null,
    "commit_sha": "39406e42cb832f683daa691dd652a8dc36ee8930",
    "message": {
      "text": "This path depends on a user-provided value."
    },
    "location": {
      "path": "lib/ab12-gen.js",
      "start_line": 917,
      "end_line": 917,
      "start_column": 7,
      "end_column": 18
    },
    "classifications": [
      "library"
    ]
  },
  {
    "ref": "refs/pull/3740/merge",
    "analysis_key": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
    "environment": "",
    "category": ".github/workflows/codeql-analysis.yml:CodeQL-Build",
    "state": "fixed",
    "fixed_at": "2020-02-14T12:29:18Z",
    "commit_sha": "b09da05606e27f463a2b49287684b4ae777092f2",
    "message": {
      "text": "This suffix check is missing a length comparison to correctly handle lastIndexOf returning -1."
    },
    "location": {
      "path": "app/script.js",
      "start_line": 2,
      "end_line": 2,
      "start_column": 10,
      "end_column": 50
    },
    "classifications": [
      "source"
    ]
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningAlertsAlertNumberInstances403ErrorException`](../../doc/models/repos-code-scanning-alerts-alert-number-instances-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningAlertsAlertNumberInstances404ErrorException`](../../doc/models/repos-code-scanning-alerts-alert-number-instances-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning List-Recent-Analyses

Lists the details of all code scanning analyses for a repository,
starting with the most recent.
The response is paginated and you can use the `page` and `per_page` parameters
to list the analyses you're interested in.
By default 30 analyses are listed per page.

The `rules_count` field in the response give the number of rules
that were run in the analysis.
For very old analyses this data is not available,
and `0` is returned in this field.

You must use an access token with the `security_events` scope to use this endpoint with private repos,
the `public_repo` scope also grants permission to read security events on public repos only.
GitHub Apps must have the `security_events` read permission to use this endpoint.

**Deprecation notice**:
The `tool_name` field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The tool name can now be found inside the `tool` field.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#list-code-scanning-analyses-for-a-repository](https://docs.github.com/rest/reference/code-scanning#list-code-scanning-analyses-for-a-repository)

```java
CompletableFuture<List<CodeScanningAnalysis>> codeScanningListRecentAnalysesAsync(
    final String owner,
    final String repo,
    final String toolName,
    final String toolGuid,
    final Integer page,
    final Integer perPage,
    final String ref,
    final String sarifId,
    final Direction1Enum direction,
    final Sort91Enum sort)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `toolName` | `String` | Query, Optional | The name of a code scanning tool. Only results by this tool will be listed. You can specify the tool by using either `tool_name` or `tool_guid`, but not both. |
| `toolGuid` | `String` | Query, Optional | The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid` or `tool_name`, but not both. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `ref` | `String` | Query, Optional | The Git reference for the analyses you want to list. The `ref` for a branch can be formatted either as `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`. |
| `sarifId` | `String` | Query, Optional | Filter analyses belonging to the same SARIF upload. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `sort` | [`Sort91Enum`](../../doc/models/sort-91-enum.md) | Query, Optional | The property by which to sort the results. |

## Response Type

[`List<CodeScanningAnalysis>`](../../doc/models/code-scanning-analysis.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer page = 1;
Integer perPage = 30;
String sarifId = "6c81cd8e-b078-4ac3-a3be-1dad7dbd0b53";

codeScanningController.codeScanningListRecentAnalysesAsync(owner, repo, null, null, page, perPage, null, sarifId, null, null).thenAccept(result -> {
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
    "ref": "refs/heads/main",
    "commit_sha": "d99612c3e1f2970085cfbaeadf8f010ef69bad83",
    "analysis_key": ".github/workflows/codeql-analysis.yml:analyze",
    "environment": "{\"language\":\"python\"}",
    "error": "",
    "category": ".github/workflows/codeql-analysis.yml:analyze/language:python",
    "created_at": "2020-08-27T15:05:21Z",
    "results_count": 17,
    "rules_count": 49,
    "id": 201,
    "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/analyses/201",
    "sarif_id": "6c81cd8e-b078-4ac3-a3be-1dad7dbd0b53",
    "tool": {
      "name": "CodeQL",
      "guid": null,
      "version": "2.4.0"
    },
    "deletable": true,
    "warning": ""
  },
  {
    "ref": "refs/heads/my-branch",
    "commit_sha": "c8cff6510d4d084fb1b4aa13b64b97ca12b07321",
    "analysis_key": ".github/workflows/shiftleft.yml:build",
    "environment": "{}",
    "error": "",
    "category": ".github/workflows/shiftleft.yml:build/",
    "created_at": "2020-08-31T22:46:44Z",
    "results_count": 17,
    "rules_count": 32,
    "id": 200,
    "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/analyses/200",
    "sarif_id": "8981cd8e-b078-4ac3-a3be-1dad7dbd0b582",
    "tool": {
      "name": "Python Security Analysis",
      "guid": null,
      "version": "1.2.0"
    },
    "deletable": true,
    "warning": ""
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningAnalyses403ErrorException`](../../doc/models/repos-code-scanning-analyses-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningAnalyses404ErrorException`](../../doc/models/repos-code-scanning-analyses-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning Get-Analysis

Gets a specified code scanning analysis for a repository.
You must use an access token with the `security_events` scope to use this endpoint with private repos,
the `public_repo` scope also grants permission to read security events on public repos only.
GitHub Apps must have the `security_events` read permission to use this endpoint.

The default JSON response contains fields that describe the analysis.
This includes the Git reference and commit SHA to which the analysis relates,
the datetime of the analysis, the name of the code scanning tool,
and the number of alerts.

The `rules_count` field in the default response give the number of rules
that were run in the analysis.
For very old analyses this data is not available,
and `0` is returned in this field.

If you use the Accept header `application/sarif+json`,
the response contains the analysis data that was uploaded.
This is formatted as
[SARIF version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html).

API method documentation: [https://docs.github.com/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository](https://docs.github.com/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository)

```java
CompletableFuture<CodeScanningAnalysis> codeScanningGetAnalysisAsync(
    final String owner,
    final String repo,
    final int analysisId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `analysisId` | `int` | Template, Required | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation. |

## Response Type

[`CodeScanningAnalysis`](../../doc/models/code-scanning-analysis.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int analysisId = 138;

codeScanningController.codeScanningGetAnalysisAsync(owner, repo, analysisId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "ref": "refs/heads/main",
  "commit_sha": "c18c69115654ff0166991962832dc2bd7756e655",
  "analysis_key": ".github/workflows/codeql-analysis.yml:analyze",
  "environment": "{\"language\":\"javascript\"}",
  "error": "",
  "category": ".github/workflows/codeql-analysis.yml:analyze/language:javascript",
  "created_at": "2021-01-13T11:55:49Z",
  "results_count": 3,
  "rules_count": 67,
  "id": 3602840,
  "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/analyses/201",
  "sarif_id": "47177e22-5596-11eb-80a1-c1e54ef945c6",
  "tool": {
    "name": "CodeQL",
    "guid": null,
    "version": "2.4.0"
  },
  "deletable": true,
  "warning": ""
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningAnalysesAnalysisId403ErrorException`](../../doc/models/repos-code-scanning-analyses-analysis-id-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningAnalysesAnalysisId404ErrorException`](../../doc/models/repos-code-scanning-analyses-analysis-id-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning Delete-Analysis

Deletes a specified code scanning analysis from a repository. For
private repositories, you must use an access token with the `repo` scope. For public repositories,
you must use an access token with `public_repo` scope.
GitHub Apps must have the `security_events` write permission to use this endpoint.

You can delete one analysis at a time.
To delete a series of analyses, start with the most recent analysis and work backwards.
Conceptually, the process is similar to the undo function in a text editor.

When you list the analyses for a repository,
one or more will be identified as deletable in the response:

```
"deletable": true
```

An analysis is deletable when it's the most recent in a set of analyses.
Typically, a repository will have multiple sets of analyses
for each enabled code scanning tool,
where a set is determined by a unique combination of analysis values:

* `ref`
* `tool`
* `category`

If you attempt to delete an analysis that is not the most recent in a set,
you'll get a 400 response with the message:

```
Analysis specified is not deletable.
```

The response from a successful `DELETE` operation provides you with
two alternative URLs for deleting the next analysis in the set:
`next_analysis_url` and `confirm_delete_url`.
Use the `next_analysis_url` URL if you want to avoid accidentally deleting the final analysis
in a set. This is a useful option if you want to preserve at least one analysis
for the specified tool in your repository.
Use the `confirm_delete_url` URL if you are content to remove all analyses for a tool.
When you delete the last analysis in a set, the value of `next_analysis_url` and `confirm_delete_url`
in the 200 response is `null`.

As an example of the deletion process,
let's imagine that you added a workflow that configured a particular code scanning tool
to analyze the code in a repository. This tool has added 15 analyses:
10 on the default branch, and another 5 on a topic branch.
You therefore have two separate sets of analyses for this tool.
You've now decided that you want to remove all of the analyses for the tool.
To do this you must make 15 separate deletion requests.
To start, you must find an analysis that's identified as deletable.
Each set of analyses always has one that's identified as deletable.
Having found the deletable analysis for one of the two sets,
delete this analysis and then continue deleting the next analysis in the set until they're all deleted.
Then repeat the process for the second set.
The procedure therefore consists of a nested loop:

**Outer loop**:

* List the analyses for the repository, filtered by tool.

* Parse this list to find a deletable analysis. If found:
  
  **Inner loop**:
  
  * Delete the identified analysis.
  * Parse the response for the value of `confirm_delete_url` and, if found, use this in the next iteration.

The above process assumes that you want to remove all trace of the tool's analyses from the GitHub user interface, for the specified repository, and it therefore uses the `confirm_delete_url` value. Alternatively, you could use the `next_analysis_url` value, which would leave the last analysis in each set undeleted to avoid removing a tool's analysis entirely.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#delete-a-code-scanning-analysis-from-a-repository](https://docs.github.com/rest/reference/code-scanning#delete-a-code-scanning-analysis-from-a-repository)

```java
CompletableFuture<ReposCodeScanningAnalysesAnalysisIdResponse1> codeScanningDeleteAnalysisAsync(
    final String owner,
    final String repo,
    final int analysisId,
    final String confirmDelete)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `analysisId` | `int` | Template, Required | The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses` operation. |
| `confirmDelete` | `String` | Query, Optional | Allow deletion if the specified analysis is the last in a set. If you attempt to delete the final analysis in a set without setting this parameter to `true`, you'll get a 400 response with the message: `Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify confirm_delete.` |

## Response Type

[`ReposCodeScanningAnalysesAnalysisIdResponse1`](../../doc/models/repos-code-scanning-analyses-analysis-id-response-1.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int analysisId = 138;

codeScanningController.codeScanningDeleteAnalysisAsync(owner, repo, analysisId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "next_analysis_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/analyses/41",
  "confirm_delete_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/analyses/41?confirm_delete"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ReposCodeScanningAnalysesAnalysisId400ErrorException`](../../doc/models/repos-code-scanning-analyses-analysis-id-400-error-exception.md) |
| 403 | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningAnalysesAnalysisId403ErrorException`](../../doc/models/repos-code-scanning-analyses-analysis-id-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningAnalysesAnalysisId404ErrorException`](../../doc/models/repos-code-scanning-analyses-analysis-id-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning List-Codeql-Databases

Lists the CodeQL databases that are available in a repository.

For private repositories, you must use an access token with the `security_events` scope.
For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
GitHub Apps must have the `contents` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#list-codeql-databases](https://docs.github.com/rest/reference/code-scanning#list-codeql-databases)

```java
CompletableFuture<List<CodeQLDatabase>> codeScanningListCodeqlDatabasesAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`List<CodeQLDatabase>`](../../doc/models/code-ql-database.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

codeScanningController.codeScanningListCodeqlDatabasesAsync(owner, repo).thenAccept(result -> {
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
    "name": "database.zip",
    "language": "java",
    "uploader": {
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
    "content_type": "application/zip",
    "size": 1024,
    "created_at": "2022-09-12T12:14:32Z",
    "updated_at": "2022-09-12T12:14:32Z",
    "url": "https://api.github.com/repos/octocat/Hello-World/code-scanning/codeql/databases/java"
  },
  {
    "id": 2,
    "name": "database.zip",
    "language": "ruby",
    "uploader": {
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
    "content_type": "application/zip",
    "size": 1024,
    "created_at": "2022-09-12T12:14:32Z",
    "updated_at": "2022-09-12T12:14:32Z",
    "url": "https://api.github.com/repos/octocat/Hello-World/code-scanning/codeql/databases/ruby"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningCodeqlDatabases403ErrorException`](../../doc/models/repos-code-scanning-codeql-databases-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningCodeqlDatabases404ErrorException`](../../doc/models/repos-code-scanning-codeql-databases-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning Get-Codeql-Database

Gets a CodeQL database for a language in a repository.

By default this endpoint returns JSON metadata about the CodeQL database. To
download the CodeQL database binary content, set the `Accept` header of the request
to [`application/zip`](https://docs.github.com/rest/overview/media-types), and make sure
your HTTP client is configured to follow redirects or use the `Location` header
to make a second request to get the redirect URL.

For private repositories, you must use an access token with the `security_events` scope.
For public repositories, you can use tokens with the `security_events` or `public_repo` scope.
GitHub Apps must have the `contents` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#get-codeql-database](https://docs.github.com/rest/reference/code-scanning#get-codeql-database)

```java
CompletableFuture<ReposCodeScanningCodeqlDatabasesLanguageResponse> codeScanningGetCodeqlDatabaseAsync(
    final String owner,
    final String repo,
    final String language)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `language` | `String` | Template, Required | The language of the CodeQL database. |

## Response Type

[`ReposCodeScanningCodeqlDatabasesLanguageResponse`](../../doc/models/repos-code-scanning-codeql-databases-language-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String language = "language2";

codeScanningController.codeScanningGetCodeqlDatabaseAsync(owner, repo, language).thenAccept(result -> {
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
  "name": "database.zip",
  "language": "java",
  "uploader": {
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
  "content_type": "application/zip",
  "size": 1024,
  "created_at": "2022-09-12T12:14:32Z",
  "updated_at": "2022-09-12T12:14:32Z",
  "url": "https://api.github.com/repos/octocat/Hello-World/code-scanning/codeql/databases/java"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningCodeqlDatabasesLanguage403ErrorException`](../../doc/models/repos-code-scanning-codeql-databases-language-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningCodeqlDatabasesLanguage404ErrorException`](../../doc/models/repos-code-scanning-codeql-databases-language-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning Upload-Sarif

Uploads SARIF data containing the results of a code scanning analysis to make the results available in a repository. You must use an access token with the `security_events` scope to use this endpoint for private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint.

There are two places where you can upload code scanning results.

- If you upload to a pull request, for example `--ref refs/pull/42/merge` or `--ref refs/pull/42/head`, then the results appear as alerts in a pull request check. For more information, see "[Triaging code scanning alerts in pull requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests)."
- If you upload to a branch, for example `--ref refs/heads/my-branch`, then the results appear in the **Security** tab for your repository. For more information, see "[Managing code scanning alerts for your repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a-repository)."

You must compress the SARIF-formatted analysis data that you want to upload, using `gzip`, and then encode it as a Base64 format string. For example:

```
gzip -c analysis-data.sarif | base64 -w0
```

<br>
SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected if any of these objects is above its maximum value. For some objects, there are additional values over which the entries will be ignored while keeping the most important entries whenever applicable.
To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis configuration (For example, for the CodeQL tool, identify and remove the most noisy queries).
| **SARIF data**                   | **Maximum values** | **Additional limits**                                                            |
|----------------------------------|:------------------:|----------------------------------------------------------------------------------|
| Runs per file                    |         15         |                                                                                  |
| Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized by severity.            |
| Rules per run                    |       25,000       |                                                                                  |
| Tool extensions per run          |        100         |                                                                                  |
| Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be included, using prioritization. |
| Location per result	             |       1,000        | Only 100 locations will be included.                                             |
| Tags per rule	                   |         20         | Only 10 tags will be included.                                                   |

The `202 Accepted` response includes an `id` value.
You can use this ID to check the status of the upload by using it in the `/sarifs/{sarif_id}` endpoint.
For more information, see "[Get information about a SARIF upload](/rest/reference/code-scanning#get-information-about-a-sarif-upload)."

API method documentation: [https://docs.github.com/rest/reference/code-scanning#upload-a-sarif-file](https://docs.github.com/rest/reference/code-scanning#upload-a-sarif-file)

```java
CompletableFuture<CodeScanningSarifsReceipt> codeScanningUploadSarifAsync(
    final String owner,
    final String repo,
    final ReposCodeScanningSarifsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposCodeScanningSarifsRequest`](../../doc/models/repos-code-scanning-sarifs-request.md) | Body, Required | - |

## Response Type

[`CodeScanningSarifsReceipt`](../../doc/models/code-scanning-sarifs-receipt.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposCodeScanningSarifsRequest body = new ReposCodeScanningSarifsRequest();
body.setCommitSha("4b6472266afd7b471e86085a6659e8c7f2b119da");
body.setRef("refs/heads/master");
body.setSarif("H4sICMLGdF4AA2V4YW1wbGUuc2FyaWYAvVjdbts2FL7PUxDCijaA/CM7iRNfLkPXYgHSNstumlzQ0pHFVCI1korjFgH2ONtr7Ul2KFmy/mOn6QIkjsjDw0/nfN85NL8dEGL9pNwAImqRObECrWM1H40kXQ2XTAfJIlEgXcE1cD10RTQSVDE10K4aKSqZP1AxuKOIKg1ydJU60jSfSh8Hk6EzHA/vlOCWbfa7B6kYPpj90rlsWCZcmbHP5Bs+4oAWIjQD2SMOeJLh2vIQDnIaQerqXHjw8YIgxohybxAyDsS4cAPKsp03K4RcUs6+Up2D+JXpd8mibKIQN9fM/aMCdbyBujGSSQgVxJtx5qX2d2qUcIweQhEuDQf3GBO6CKHkogx/N3MVCKl/AeVKFuf4y5ubsMGDTj1ep+5I7sgmLIpxtU38hLtmMRGSuCFVyip5eKzs5ydh+LztVL6f2m6oih1BkYiuyQIIJWodxVpERPj4sEiWBNNH8EWT0DMG8EAjzKVHXCrB4FkPu/F64NMk1OeC+2yZSNoBOoR7CC0EzYWGbm+xFDFIzbI011+cLjfZtyJkmMZfumAh02uL3NpV2y+MZ6RAjxibyKrNxxJcVjANSb4eBGwZ1M0KsuyR2poLr5rMl8vaDSeVn6eTWEO2j2xIEcmhwlTKNOi4GMOI8gfuZYkvJ7b4v5Tiumyz7RnHeodFzpS8ASIZCH/AYdWi2z3sG8JtFxJ6fF9yR9CdifBr9Pd6d5V2+zbJKjjCFGGmsHuYFy2ytJq9tUxcLSRSQecppOGKrpUxYfxefMEFK+wOGa4hudQByBVT0L+EKtyACxnRsABhEx1QjVDs1KNI9MbpnhqfE45B6FJvu3hRu5VRU9MhZLmK7fqkKyQSTHNoyMqUFMqXCV3CwAeqEwmVokraK8IuBaGvHjQ0gMYrKjnjyw7uk9uD8tgmsBbFMPnU1bV2ZhkJNkuolUiWys3UPWzs5aaIUz9TBe8zMb+6+nT+6fLy91dlE3xzeDDT4zYszb0bW6NjJd0Rvn2EnLvWLFSdKPpBzInzfRgu8ETyMcH8nIfMnJCeC2PyfTA+UKngcnGH7Hw2hGkVQs5YlIRCtdWZYQ4/73es2JlxkfViOEIhoWJq5Oo6UBBfiKIqFBWhiE3jJGbFwVoxBHTRSuIS67sMeplei24X20shLjG+8gqbKC/bESiNMC+wd5q5id0yeS7CJEqXzmrTWNq3k05l84P6f4/bEmXFJjI0fIt1BGQssUnUDkBYeVhE5TqPnMH3jqogDcP0zKcTgLPTMSzOjhbjuVOmW23l1fYNStulfo6sXlFsGLhbDy5RECPRYGCTgOj2bd4nUQEivEd0H7KKYxqnEhFohuur3a3UPskbH/+Yg0+M5P2MHRJu3ziHh3Z2NCrWt3XF1rWTw8Ne/pfbWYXnDSE0SNZQQt1i18q7te2vOhu7ehWuvVyeu0wbLZi24mhoo6aOOTltzG/lgdVvVoXQq5V+pewkFIzL8fjEcadT55jOjpzFzHuOTtDNrMkJPMVQDd7F09RID72O/UPZ0tmctqZ7kWX6EmSZnDpP8GU67SXM8XE3YSrxbKsx6UReZ4y6n/FVZfJjs9Z7stma75W5yQtkzjk5eSJxk1lv4o7+j8TlhaJ2lsKWZO6lruDPBLib3x5ZN/KGWzZ+pn///evv7OOf4iIBv3oY9L/l1wiJ9p0Tc+F1zZnOE9NxXWEus6IQhr5pMfoqxi8WPsuu0azsns4UC6WzNzHIzbeEx4P/AJ3SefgcFAAA");

codeScanningController.codeScanningUploadSarifAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "47177e22-5596-11eb-80a1-c1e54ef945c6",
  "url": "https://api.github.com/repos/octocat/hello-world/code-scanning/sarifs/47177e22-5596-11eb-80a1-c1e54ef945c6"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request if the sarif field is invalid | `ApiException` |
| 403 | Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningSarifs403ErrorException`](../../doc/models/repos-code-scanning-sarifs-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodeScanningSarifs404ErrorException`](../../doc/models/repos-code-scanning-sarifs-404-error-exception.md) |
| 413 | Payload Too Large if the sarif field is too large | `ApiException` |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Code-Scanning Get-Sarif

Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that you can retrieve details of the analysis. For more information, see "[Get a code scanning analysis for a repository](/rest/reference/code-scanning#get-a-code-scanning-analysis-for-a-repository)." You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/code-scanning#list-recent-code-scanning-analyses-for-a-repository](https://docs.github.com/rest/reference/code-scanning#list-recent-code-scanning-analyses-for-a-repository)

```java
CompletableFuture<CodeScanningSarifsStatus> codeScanningGetSarifAsync(
    final String owner,
    final String repo,
    final String sarifId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `sarifId` | `String` | Template, Required | The SARIF ID obtained after uploading. |

## Response Type

[`CodeScanningSarifsStatus`](../../doc/models/code-scanning-sarifs-status.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String sarifId = "sarif_id4";

codeScanningController.codeScanningGetSarifAsync(owner, repo, sarifId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "processing_status": "complete",
  "analyses_url": "https://api.github.com/repos/octocat/hello-world/code-scanning/analyses?sarif_id=47177e22-5596-11eb-80a1-c1e54ef945c6"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Response if GitHub Advanced Security is not enabled for this repository | [`ReposCodeScanningSarifsSarifId403ErrorException`](../../doc/models/repos-code-scanning-sarifs-sarif-id-403-error-exception.md) |
| 404 | Not Found if the sarif id does not match any upload | `ApiException` |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |

