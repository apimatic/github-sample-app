# Checks

Rich interactions with checks run by your integrations.

```java
ChecksController checksController = client.getChecksController();
```

## Class Name

`ChecksController`

## Methods

* [Checks Create](../../doc/controllers/checks.md#checks-create)
* [Checks Get](../../doc/controllers/checks.md#checks-get)
* [Checks Update](../../doc/controllers/checks.md#checks-update)
* [Checks List-Annotations](../../doc/controllers/checks.md#checks-list-annotations)
* [Checks Rerequest-Run](../../doc/controllers/checks.md#checks-rerequest-run)
* [Checks Create-Suite](../../doc/controllers/checks.md#checks-create-suite)
* [Checks Set-Suites-Preferences](../../doc/controllers/checks.md#checks-set-suites-preferences)
* [Checks Get-Suite](../../doc/controllers/checks.md#checks-get-suite)
* [Checks List-for-Suite](../../doc/controllers/checks.md#checks-list-for-suite)
* [Checks Rerequest-Suite](../../doc/controllers/checks.md#checks-rerequest-suite)
* [Checks List-for-Ref](../../doc/controllers/checks.md#checks-list-for-ref)
* [Checks List-Suites-for-Ref](../../doc/controllers/checks.md#checks-list-suites-for-ref)


# Checks Create

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.

Creates a new check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to create check runs.

In a check suite, GitHub limits the number of check runs with the same name to 1000. Once these check runs exceed 1000, GitHub will start to automatically delete older check runs.

API method documentation: [https://docs.github.com/rest/reference/checks#create-a-check-run](https://docs.github.com/rest/reference/checks#create-a-check-run)

```java
CompletableFuture<ReposCheckRunsResponse> checksCreateAsync(
    final String owner,
    final String repo,
    final ChecksCreateBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ChecksCreateBody`]($m/ChecksCreateBody) | Body, Required | - |

## Response Type

[`ReposCheckRunsResponse`](../../doc/models/repos-check-runs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposCheckRunsRequest1 body = new ReposCheckRunsRequest1();
body.setStatus(Status33Enum.IN_PROGRESS);


ChecksCreateBody bodyContainer = ChecksCreateBody.fromReposCheckRunsRequest1(body);

checksController.checksCreateAsync(owner, repo, bodyContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 4,
  "head_sha": "ce587453ced02b1526dfb4cb910479d431683101",
  "node_id": "MDg6Q2hlY2tSdW40",
  "external_id": "42",
  "url": "https://api.github.com/repos/github/hello-world/check-runs/4",
  "html_url": "https://github.com/github/hello-world/runs/4",
  "details_url": "https://example.com",
  "status": "completed",
  "conclusion": "neutral",
  "started_at": "2018-05-04T01:14:52Z",
  "completed_at": "2018-05-04T01:14:52Z",
  "output": {
    "title": "Mighty Readme report",
    "summary": "There are 0 failures, 2 warnings, and 1 notice.",
    "text": "You may have some misspelled words on lines 2 and 4. You also may want to add a section in your README about how to install your app.",
    "annotations_count": 2,
    "annotations_url": "https://api.github.com/repos/github/hello-world/check-runs/4/annotations"
  },
  "name": "mighty_readme",
  "check_suite": {
    "id": 5
  },
  "app": {
    "id": 1,
    "slug": "octoapp",
    "node_id": "MDExOkludGVncmF0aW9uMQ==",
    "owner": {
      "login": "github",
      "id": 1,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "repos_url": "https://api.github.com/orgs/github/repos",
      "events_url": "https://api.github.com/orgs/github/events",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": true
    },
    "name": "Octocat App",
    "description": "",
    "external_url": "https://example.com",
    "html_url": "https://github.com/apps/octoapp",
    "created_at": "2017-07-08T16:18:44-04:00",
    "updated_at": "2017-07-08T16:18:44-04:00",
    "permissions": {
      "metadata": "read",
      "contents": "read",
      "issues": "write",
      "single_file": "write"
    },
    "events": [
      "push",
      "pull_request"
    ]
  },
  "pull_requests": [
    {
      "url": "https://api.github.com/repos/github/hello-world/pulls/1",
      "id": 1934,
      "number": 3956,
      "head": {
        "ref": "say-hello",
        "sha": "3dca65fa3e8d4b3da3f3d056c59aee1c50f41390",
        "repo": {
          "id": 526,
          "url": "https://api.github.com/repos/github/hello-world",
          "name": "hello-world"
        }
      },
      "base": {
        "ref": "master",
        "sha": "e7fdf7640066d71ad16a86fbcbb9c6a10a18af4f",
        "repo": {
          "id": 526,
          "url": "https://api.github.com/repos/github/hello-world",
          "name": "hello-world"
        }
      }
    }
  ]
}
```


# Checks Get

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.

Gets a single check run using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.

API method documentation: [https://docs.github.com/rest/reference/checks#get-a-check-run](https://docs.github.com/rest/reference/checks#get-a-check-run)

```java
CompletableFuture<ReposCheckRunsCheckRunIdResponse> checksGetAsync(
    final String owner,
    final String repo,
    final int checkRunId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `checkRunId` | `int` | Template, Required | The unique identifier of the check run. |

## Response Type

[`ReposCheckRunsCheckRunIdResponse`](../../doc/models/repos-check-runs-check-run-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int checkRunId = 130;

checksController.checksGetAsync(owner, repo, checkRunId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 4,
  "head_sha": "ce587453ced02b1526dfb4cb910479d431683101",
  "node_id": "MDg6Q2hlY2tSdW40",
  "external_id": "",
  "url": "https://api.github.com/repos/github/hello-world/check-runs/4",
  "html_url": "https://github.com/github/hello-world/runs/4",
  "details_url": "https://example.com",
  "status": "completed",
  "conclusion": "neutral",
  "started_at": "2018-05-04T01:14:52Z",
  "completed_at": "2018-05-04T01:14:52Z",
  "output": {
    "title": "Mighty Readme report",
    "summary": "There are 0 failures, 2 warnings, and 1 notice.",
    "text": "You may have some misspelled words on lines 2 and 4. You also may want to add a section in your README about how to install your app.",
    "annotations_count": 2,
    "annotations_url": "https://api.github.com/repos/github/hello-world/check-runs/4/annotations"
  },
  "name": "mighty_readme",
  "check_suite": {
    "id": 5
  },
  "app": {
    "id": 1,
    "slug": "octoapp",
    "node_id": "MDExOkludGVncmF0aW9uMQ==",
    "owner": {
      "login": "github",
      "id": 1,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "repos_url": "https://api.github.com/orgs/github/repos",
      "events_url": "https://api.github.com/orgs/github/events",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": true
    },
    "name": "Octocat App",
    "description": "",
    "external_url": "https://example.com",
    "html_url": "https://github.com/apps/octoapp",
    "created_at": "2017-07-08T16:18:44-04:00",
    "updated_at": "2017-07-08T16:18:44-04:00",
    "permissions": {
      "metadata": "read",
      "contents": "read",
      "issues": "write",
      "single_file": "write"
    },
    "events": [
      "push",
      "pull_request"
    ]
  },
  "pull_requests": [
    {
      "url": "https://api.github.com/repos/github/hello-world/pulls/1",
      "id": 1934,
      "number": 3956,
      "head": {
        "ref": "say-hello",
        "sha": "3dca65fa3e8d4b3da3f3d056c59aee1c50f41390",
        "repo": {
          "id": 526,
          "url": "https://api.github.com/repos/github/hello-world",
          "name": "hello-world"
        }
      },
      "base": {
        "ref": "master",
        "sha": "e7fdf7640066d71ad16a86fbcbb9c6a10a18af4f",
        "repo": {
          "id": 526,
          "url": "https://api.github.com/repos/github/hello-world",
          "name": "hello-world"
        }
      }
    }
  ]
}
```


# Checks Update

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.

Updates a check run for a specific commit in a repository. Your GitHub App must have the `checks:write` permission to edit check runs.

API method documentation: [https://docs.github.com/rest/reference/checks#update-a-check-run](https://docs.github.com/rest/reference/checks#update-a-check-run)

```java
CompletableFuture<ReposCheckRunsCheckRunIdResponse> checksUpdateAsync(
    final String owner,
    final String repo,
    final int checkRunId,
    final ReposCheckRunsCheckRunIdRequest3 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `checkRunId` | `int` | Template, Required | The unique identifier of the check run. |
| `body` | [`ReposCheckRunsCheckRunIdRequest3`]($m/ChecksUpdateBody) | Body, Required | - |

## Response Type

[`ReposCheckRunsCheckRunIdResponse`](../../doc/models/repos-check-runs-check-run-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int checkRunId = 130;
checksController.checksUpdateAsync(owner, repo, checkRunId, bodyContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 4,
  "head_sha": "ce587453ced02b1526dfb4cb910479d431683101",
  "node_id": "MDg6Q2hlY2tSdW40",
  "external_id": "",
  "url": "https://api.github.com/repos/github/hello-world/check-runs/4",
  "html_url": "https://github.com/github/hello-world/runs/4",
  "details_url": "https://example.com",
  "status": "completed",
  "conclusion": "neutral",
  "started_at": "2018-05-04T01:14:52Z",
  "completed_at": "2018-05-04T01:14:52Z",
  "output": {
    "title": "Mighty Readme report",
    "summary": "There are 0 failures, 2 warnings, and 1 notice.",
    "text": "You may have some misspelled words on lines 2 and 4. You also may want to add a section in your README about how to install your app.",
    "annotations_count": 2,
    "annotations_url": "https://api.github.com/repos/github/hello-world/check-runs/4/annotations"
  },
  "name": "mighty_readme",
  "check_suite": {
    "id": 5
  },
  "app": {
    "id": 1,
    "slug": "octoapp",
    "node_id": "MDExOkludGVncmF0aW9uMQ==",
    "owner": {
      "login": "github",
      "id": 1,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "repos_url": "https://api.github.com/orgs/github/repos",
      "events_url": "https://api.github.com/orgs/github/events",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": true
    },
    "name": "Octocat App",
    "description": "",
    "external_url": "https://example.com",
    "html_url": "https://github.com/apps/octoapp",
    "created_at": "2017-07-08T16:18:44-04:00",
    "updated_at": "2017-07-08T16:18:44-04:00",
    "permissions": {
      "metadata": "read",
      "contents": "read",
      "issues": "write",
      "single_file": "write"
    },
    "events": [
      "push",
      "pull_request"
    ]
  },
  "pull_requests": [
    {
      "url": "https://api.github.com/repos/github/hello-world/pulls/1",
      "id": 1934,
      "number": 3956,
      "head": {
        "ref": "say-hello",
        "sha": "3dca65fa3e8d4b3da3f3d056c59aee1c50f41390",
        "repo": {
          "id": 526,
          "url": "https://api.github.com/repos/github/hello-world",
          "name": "hello-world"
        }
      },
      "base": {
        "ref": "master",
        "sha": "e7fdf7640066d71ad16a86fbcbb9c6a10a18af4f",
        "repo": {
          "id": 526,
          "url": "https://api.github.com/repos/github/hello-world",
          "name": "hello-world"
        }
      }
    }
  ]
}
```


# Checks List-Annotations

Lists annotations for a check run using the annotation `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get annotations for a check run. OAuth Apps and authenticated users must have the `repo` scope to get annotations for a check run in a private repository.

API method documentation: [https://docs.github.com/rest/reference/checks#list-check-run-annotations](https://docs.github.com/rest/reference/checks#list-check-run-annotations)

```java
CompletableFuture<List<CheckAnnotation>> checksListAnnotationsAsync(
    final String owner,
    final String repo,
    final int checkRunId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `checkRunId` | `int` | Template, Required | The unique identifier of the check run. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<CheckAnnotation>`](../../doc/models/check-annotation.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int checkRunId = 130;
Integer perPage = 30;
Integer page = 1;

checksController.checksListAnnotationsAsync(owner, repo, checkRunId, perPage, page).thenAccept(result -> {
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
    "path": "README.md",
    "start_line": 2,
    "end_line": 2,
    "start_column": 5,
    "end_column": 10,
    "annotation_level": "warning",
    "title": "Spell Checker",
    "message": "Check your spelling for 'banaas'.",
    "raw_details": "Do you mean 'bananas' or 'banana'?",
    "blob_href": "https://api.github.com/repos/github/rest-api-description/git/blobs/abc"
  }
]
```


# Checks Rerequest-Run

Triggers GitHub to rerequest an existing check run, without pushing new code to a repository. This endpoint will trigger the [`check_run` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) event with the action `rerequested`. When a check run is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.

To rerequest a check run, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.

API method documentation: [https://docs.github.com/rest/reference/checks#rerequest-a-check-run](https://docs.github.com/rest/reference/checks#rerequest-a-check-run)

```java
CompletableFuture<Object> checksRerequestRunAsync(
    final String owner,
    final String repo,
    final int checkRunId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `checkRunId` | `int` | Template, Required | The unique identifier of the check run. |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int checkRunId = 130;

checksController.checksRerequestRunAsync(owner, repo, checkRunId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden if the check run is not rerequestable or doesn't belong to the authenticated GitHub App | [`ReposCheckRunsCheckRunIdRerequest403ErrorException`](../../doc/models/repos-check-runs-check-run-id-rerequest-403-error-exception.md) |
| 404 | Resource not found | [`ReposCheckRunsCheckRunIdRerequest404ErrorException`](../../doc/models/repos-check-runs-check-run-id-rerequest-404-error-exception.md) |
| 422 | Validation error if the check run is not rerequestable | [`ReposCheckRunsCheckRunIdRerequest422ErrorException`](../../doc/models/repos-check-runs-check-run-id-rerequest-422-error-exception.md) |


# Checks Create-Suite

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.

By default, check suites are automatically created when you create a [check run](https://docs.github.com/rest/reference/checks#check-runs). You only need to use this endpoint for manually creating check suites when you've disabled automatic creation using "[Update repository preferences for check suites](https://docs.github.com/rest/reference/checks#update-repository-preferences-for-check-suites)". Your GitHub App must have the `checks:write` permission to create check suites.

API method documentation: [https://docs.github.com/rest/reference/checks#create-a-check-suite](https://docs.github.com/rest/reference/checks#create-a-check-suite)

```java
CompletableFuture<ReposCheckSuitesResponse> checksCreateSuiteAsync(
    final String owner,
    final String repo,
    final ReposCheckSuitesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposCheckSuitesRequest`](../../doc/models/repos-check-suites-request.md) | Body, Required | - |

## Response Type

[`ReposCheckSuitesResponse`](../../doc/models/repos-check-suites-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposCheckSuitesRequest body = new ReposCheckSuitesRequest();
body.setHeadSha("d6fde92930d4715a2b49857d24b940956b26d2d3");

checksController.checksCreateSuiteAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 5,
  "node_id": "MDEwOkNoZWNrU3VpdGU1",
  "head_branch": "master",
  "head_sha": "d6fde92930d4715a2b49857d24b940956b26d2d3",
  "status": "completed",
  "conclusion": "neutral",
  "url": "https://api.github.com/repos/github/hello-world/check-suites/5",
  "before": "146e867f55c26428e5f9fade55a9bbf5e95a7912",
  "after": "d6fde92930d4715a2b49857d24b940956b26d2d3",
  "pull_requests": [],
  "created_at": "2017-07-08T16:18:44-04:00",
  "updated_at": "2017-07-08T16:18:44-04:00",
  "app": {
    "id": 1,
    "slug": "octoapp",
    "node_id": "MDExOkludGVncmF0aW9uMQ==",
    "owner": {
      "login": "github",
      "id": 1,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "repos_url": "https://api.github.com/orgs/github/repos",
      "events_url": "https://api.github.com/orgs/github/events",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": true
    },
    "name": "Octocat App",
    "description": "",
    "external_url": "https://example.com",
    "html_url": "https://github.com/apps/octoapp",
    "created_at": "2017-07-08T16:18:44-04:00",
    "updated_at": "2017-07-08T16:18:44-04:00",
    "permissions": {
      "metadata": "read",
      "contents": "read",
      "issues": "write",
      "single_file": "write"
    },
    "events": [
      "push",
      "pull_request"
    ]
  },
  "repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octocat/Hello-World",
    "template_repository": {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World-Template",
      "full_name": "octocat/Hello-World-Template",
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
      "html_url": "https://github.com/octocat/Hello-World-Template",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World-Template",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World-Template/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World-Template/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World-Template/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World-Template/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World-Template/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World-Template/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World-Template/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World-Template/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World-Template/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World-Template/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World-Template/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World-Template/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World-Template/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World-Template.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World-Template/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World-Template/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World-Template/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World-Template/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World-Template/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World-Template/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World-Template/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World-Template/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World-Template.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World-Template/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World-Template/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World-Template/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World-Template/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World-Template/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World-Template/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World-Template.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World-Template",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World-Template/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World-Template",
      "homepage": "https://github.com",
      "language": null,
      "forks": 9,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "watchers": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues": 0,
      "open_issues_count": 0,
      "is_template": true,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://api.github.com/licenses/mit"
      },
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "allow_rebase_merge": true,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0
    },
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
    "git_url": "git:github.com/octocat/Hello-World.git",
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
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "clone_url": "https://github.com/octocat/Hello-World.git",
    "mirror_url": "git:git.example.com/octocat/Hello-World",
    "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
    "svn_url": "https://svn.github.com/octocat/Hello-World",
    "homepage": "https://github.com",
    "language": null,
    "forks_count": 9,
    "stargazers_count": 80,
    "watchers_count": 80,
    "size": 108,
    "default_branch": "master",
    "open_issues_count": 0,
    "is_template": false,
    "topics": [
      "octocat",
      "atom",
      "electron",
      "api"
    ],
    "has_issues": true,
    "has_projects": true,
    "has_wiki": true,
    "has_pages": false,
    "has_downloads": true,
    "archived": false,
    "disabled": false,
    "visibility": "public",
    "pushed_at": "2011-01-26T19:06:43Z",
    "created_at": "2011-01-26T19:01:12Z",
    "updated_at": "2011-01-26T19:14:43Z",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    },
    "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
    "delete_branch_on_merge": true,
    "subscribers_count": 42,
    "network_count": 0
  },
  "head_commit": {
    "id": "7fd1a60b01f91b314f59955a4e4d4e80d8edf11d",
    "tree_id": "7fd1a60b01f91b314f59955a4e4d4e80d8edf11d",
    "message": "Merge pull request #6 from Spaceghost/patch-1\n\nNew line at end of file.",
    "timestamp": "2016-10-10T00:00:00Z",
    "author": {
      "name": "The Octocat",
      "email": "octocat@nowhere.com"
    },
    "committer": {
      "name": "The Octocat",
      "email": "octocat@nowhere.com"
    }
  },
  "latest_check_runs_count": 1,
  "check_runs_url": "https://api.github.com/repos/octocat/Hello-World/check-suites/5/check-runs"
}
```


# Checks Set-Suites-Preferences

Changes the default automatic flow when creating check suites. By default, a check suite is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://docs.github.com/rest/reference/checks#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites.

API method documentation: [https://docs.github.com/rest/reference/checks#update-repository-preferences-for-check-suites](https://docs.github.com/rest/reference/checks#update-repository-preferences-for-check-suites)

```java
CompletableFuture<ReposCheckSuitesPreferencesResponse> checksSetSuitesPreferencesAsync(
    final String owner,
    final String repo,
    final ReposCheckSuitesPreferencesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposCheckSuitesPreferencesRequest`](../../doc/models/repos-check-suites-preferences-request.md) | Body, Required | - |

## Response Type

[`ReposCheckSuitesPreferencesResponse`](../../doc/models/repos-check-suites-preferences-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposCheckSuitesPreferencesRequest body = new ReposCheckSuitesPreferencesRequest();
List<AutoTriggerCheck1> autoTriggerChecks = new LinkedList<>();
AutoTriggerCheck1 autoTriggerChecks0 = new AutoTriggerCheck1();
autoTriggerChecks0.setAppId(4);
autoTriggerChecks0.setSetting(false);

autoTriggerChecks.add(autoTriggerChecks0);

body.setAutoTriggerChecks(autoTriggerChecks);

checksController.checksSetSuitesPreferencesAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "preferences": {
    "auto_trigger_checks": [
      {
        "app_id": 2,
        "setting": true
      },
      {
        "app_id": 4,
        "setting": false
      }
    ]
  },
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
    "git_url": "git:github.com/octocat/Hello-World.git",
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
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "clone_url": "https://github.com/octocat/Hello-World.git",
    "mirror_url": "git:git.example.com/octocat/Hello-World",
    "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
    "svn_url": "https://svn.github.com/octocat/Hello-World",
    "homepage": "https://github.com",
    "language": null,
    "forks_count": 9,
    "stargazers_count": 80,
    "watchers_count": 80,
    "size": 108,
    "default_branch": "master",
    "open_issues_count": 0,
    "is_template": false,
    "topics": [
      "octocat",
      "atom",
      "electron",
      "api"
    ],
    "has_issues": true,
    "has_projects": true,
    "has_wiki": true,
    "has_pages": false,
    "has_downloads": true,
    "archived": false,
    "disabled": false,
    "visibility": "public",
    "pushed_at": "2011-01-26T19:06:43Z",
    "created_at": "2011-01-26T19:01:12Z",
    "updated_at": "2011-01-26T19:14:43Z",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    },
    "template_repository": {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World-Template",
      "full_name": "octocat/Hello-World-Template",
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
      "html_url": "https://github.com/octocat/Hello-World-Template",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World-Template",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World-Template/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World-Template/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World-Template/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World-Template/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World-Template/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World-Template/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World-Template/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World-Template/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World-Template/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World-Template/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World-Template/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World-Template/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World-Template/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World-Template.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World-Template/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World-Template/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World-Template/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World-Template/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World-Template/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World-Template/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World-Template/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World-Template/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World-Template.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World-Template/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World-Template/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World-Template/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World-Template/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World-Template/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World-Template/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World-Template.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World-Template",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World-Template/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World-Template",
      "homepage": "https://github.com",
      "language": null,
      "forks": 9,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "watchers": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues": 0,
      "open_issues_count": 0,
      "is_template": true,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://api.github.com/licenses/mit"
      },
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "allow_rebase_merge": true,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0
    }
  }
}
```


# Checks Get-Suite

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.

Gets a single check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.

API method documentation: [https://docs.github.com/rest/reference/checks#get-a-check-suite](https://docs.github.com/rest/reference/checks#get-a-check-suite)

```java
CompletableFuture<ReposCheckSuitesCheckSuiteIdResponse> checksGetSuiteAsync(
    final String owner,
    final String repo,
    final int checkSuiteId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `checkSuiteId` | `int` | Template, Required | The unique identifier of the check suite. |

## Response Type

[`ReposCheckSuitesCheckSuiteIdResponse`](../../doc/models/repos-check-suites-check-suite-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int checkSuiteId = 84;

checksController.checksGetSuiteAsync(owner, repo, checkSuiteId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 5,
  "node_id": "MDEwOkNoZWNrU3VpdGU1",
  "head_branch": "master",
  "head_sha": "d6fde92930d4715a2b49857d24b940956b26d2d3",
  "status": "completed",
  "conclusion": "neutral",
  "url": "https://api.github.com/repos/github/hello-world/check-suites/5",
  "before": "146e867f55c26428e5f9fade55a9bbf5e95a7912",
  "after": "d6fde92930d4715a2b49857d24b940956b26d2d3",
  "pull_requests": [],
  "created_at": "2017-07-08T16:18:44-04:00",
  "updated_at": "2017-07-08T16:18:44-04:00",
  "app": {
    "id": 1,
    "slug": "octoapp",
    "node_id": "MDExOkludGVncmF0aW9uMQ==",
    "owner": {
      "login": "github",
      "id": 1,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
      "url": "https://api.github.com/orgs/github",
      "repos_url": "https://api.github.com/orgs/github/repos",
      "events_url": "https://api.github.com/orgs/github/events",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": true
    },
    "name": "Octocat App",
    "description": "",
    "external_url": "https://example.com",
    "html_url": "https://github.com/apps/octoapp",
    "created_at": "2017-07-08T16:18:44-04:00",
    "updated_at": "2017-07-08T16:18:44-04:00",
    "permissions": {
      "metadata": "read",
      "contents": "read",
      "issues": "write",
      "single_file": "write"
    },
    "events": [
      "push",
      "pull_request"
    ]
  },
  "repository": {
    "id": 1296269,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Hello-World",
    "full_name": "octocat/Hello-World",
    "template_repository": {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World-Template",
      "full_name": "octocat/Hello-World-Template",
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
      "html_url": "https://github.com/octocat/Hello-World-Template",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World-Template",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World-Template/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World-Template/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World-Template/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World-Template/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World-Template/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World-Template/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World-Template/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World-Template/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World-Template/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World-Template/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World-Template/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World-Template/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World-Template/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World-Template.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World-Template/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World-Template/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World-Template/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World-Template/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World-Template/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World-Template/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World-Template/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World-Template/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World-Template/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World-Template.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World-Template/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World-Template/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World-Template/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World-Template/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World-Template/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World-Template/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World-Template/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World-Template.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World-Template",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World-Template/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World-Template",
      "homepage": "https://github.com",
      "language": null,
      "forks": 9,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "watchers": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues": 0,
      "open_issues_count": 0,
      "is_template": true,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA==",
        "html_url": "https://api.github.com/licenses/mit"
      },
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "allow_rebase_merge": true,
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "allow_squash_merge": true,
      "allow_auto_merge": false,
      "delete_branch_on_merge": true,
      "allow_merge_commit": true,
      "subscribers_count": 42,
      "network_count": 0
    },
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
    "git_url": "git:github.com/octocat/Hello-World.git",
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
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "clone_url": "https://github.com/octocat/Hello-World.git",
    "mirror_url": "git:git.example.com/octocat/Hello-World",
    "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
    "svn_url": "https://svn.github.com/octocat/Hello-World",
    "homepage": "https://github.com",
    "language": null,
    "forks_count": 9,
    "stargazers_count": 80,
    "watchers_count": 80,
    "size": 108,
    "default_branch": "master",
    "open_issues_count": 0,
    "is_template": false,
    "topics": [
      "octocat",
      "atom",
      "electron",
      "api"
    ],
    "has_issues": true,
    "has_projects": true,
    "has_wiki": true,
    "has_pages": false,
    "has_downloads": true,
    "archived": false,
    "disabled": false,
    "visibility": "public",
    "pushed_at": "2011-01-26T19:06:43Z",
    "created_at": "2011-01-26T19:01:12Z",
    "updated_at": "2011-01-26T19:14:43Z",
    "permissions": {
      "admin": false,
      "push": false,
      "pull": true
    },
    "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
    "delete_branch_on_merge": true,
    "subscribers_count": 42,
    "network_count": 0
  },
  "head_commit": {
    "id": "7fd1a60b01f91b314f59955a4e4d4e80d8edf11d",
    "tree_id": "7fd1a60b01f91b314f59955a4e4d4e80d8edf11d",
    "message": "Merge pull request #6 from Spaceghost/patch-1\n\nNew line at end of file.",
    "timestamp": "2016-10-10T00:00:00Z",
    "author": {
      "name": "The Octocat",
      "email": "octocat@nowhere.com"
    },
    "committer": {
      "name": "The Octocat",
      "email": "octocat@nowhere.com"
    }
  },
  "latest_check_runs_count": 1,
  "check_runs_url": "https://api.github.com/repos/octocat/Hello-World/check-suites/5/check-runs"
}
```


# Checks List-for-Suite

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.

Lists check runs for a check suite using its `id`. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.

API method documentation: [https://docs.github.com/rest/reference/checks#list-check-runs-in-a-check-suite](https://docs.github.com/rest/reference/checks#list-check-runs-in-a-check-suite)

```java
CompletableFuture<ReposCheckSuitesCheckSuiteIdCheckRunsResponse> checksListForSuiteAsync(
    final String owner,
    final String repo,
    final int checkSuiteId,
    final String checkName,
    final Status71Enum status,
    final Filter42Enum filter,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `checkSuiteId` | `int` | Template, Required | The unique identifier of the check suite. |
| `checkName` | `String` | Query, Optional | Returns check runs with the specified `name`. |
| `status` | [`Status71Enum`](../../doc/models/status-71-enum.md) | Query, Optional | Returns check runs with the specified `status`. |
| `filter` | [`Filter42Enum`](../../doc/models/filter-42-enum.md) | Query, Optional | Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposCheckSuitesCheckSuiteIdCheckRunsResponse`](../../doc/models/repos-check-suites-check-suite-id-check-runs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int checkSuiteId = 84;
Integer perPage = 30;
Integer page = 1;

checksController.checksListForSuiteAsync(owner, repo, checkSuiteId, null, null, null, perPage, page).thenAccept(result -> {
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
  "check_runs": [
    {
      "id": 4,
      "head_sha": "ce587453ced02b1526dfb4cb910479d431683101",
      "node_id": "MDg6Q2hlY2tSdW40",
      "external_id": "",
      "url": "https://api.github.com/repos/github/hello-world/check-runs/4",
      "html_url": "https://github.com/github/hello-world/runs/4",
      "details_url": "https://example.com",
      "status": "completed",
      "conclusion": "neutral",
      "started_at": "2018-05-04T01:14:52Z",
      "completed_at": "2018-05-04T01:14:52Z",
      "output": {
        "title": "Mighty Readme report",
        "summary": "There are 0 failures, 2 warnings, and 1 notice.",
        "text": "You may have some misspelled words on lines 2 and 4. You also may want to add a section in your README about how to install your app.",
        "annotations_count": 2,
        "annotations_url": "https://api.github.com/repos/github/hello-world/check-runs/4/annotations"
      },
      "name": "mighty_readme",
      "check_suite": {
        "id": 5
      },
      "app": {
        "id": 1,
        "slug": "octoapp",
        "node_id": "MDExOkludGVncmF0aW9uMQ==",
        "owner": {
          "login": "github",
          "id": 1,
          "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
          "url": "https://api.github.com/orgs/github",
          "repos_url": "https://api.github.com/orgs/github/repos",
          "events_url": "https://api.github.com/orgs/github/events",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": true
        },
        "name": "Octocat App",
        "description": "",
        "external_url": "https://example.com",
        "html_url": "https://github.com/apps/octoapp",
        "created_at": "2017-07-08T16:18:44-04:00",
        "updated_at": "2017-07-08T16:18:44-04:00",
        "permissions": {
          "metadata": "read",
          "contents": "read",
          "issues": "write",
          "single_file": "write"
        },
        "events": [
          "push",
          "pull_request"
        ]
      },
      "pull_requests": [
        {
          "url": "https://api.github.com/repos/github/hello-world/pulls/1",
          "id": 1934,
          "number": 3956,
          "head": {
            "ref": "say-hello",
            "sha": "3dca65fa3e8d4b3da3f3d056c59aee1c50f41390",
            "repo": {
              "id": 526,
              "url": "https://api.github.com/repos/github/hello-world",
              "name": "hello-world"
            }
          },
          "base": {
            "ref": "master",
            "sha": "e7fdf7640066d71ad16a86fbcbb9c6a10a18af4f",
            "repo": {
              "id": 526,
              "url": "https://api.github.com/repos/github/hello-world",
              "name": "hello-world"
            }
          }
        }
      ]
    }
  ]
}
```


# Checks Rerequest-Suite

Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will trigger the [`check_suite` webhook](https://docs.github.com/webhooks/event-payloads/#check_suite) event with the action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion` is cleared.

To rerequest a check suite, your GitHub App must have the `checks:read` permission on a private repository or pull access to a public repository.

API method documentation: [https://docs.github.com/rest/reference/checks#rerequest-a-check-suite](https://docs.github.com/rest/reference/checks#rerequest-a-check-suite)

```java
CompletableFuture<Object> checksRerequestSuiteAsync(
    final String owner,
    final String repo,
    final int checkSuiteId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `checkSuiteId` | `int` | Template, Required | The unique identifier of the check suite. |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int checkSuiteId = 84;

checksController.checksRerequestSuiteAsync(owner, repo, checkSuiteId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Checks List-for-Ref

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.

Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to get check runs. OAuth Apps and authenticated users must have the `repo` scope to get check runs in a private repository.

API method documentation: [https://docs.github.com/rest/reference/checks#list-check-runs-for-a-git-reference](https://docs.github.com/rest/reference/checks#list-check-runs-for-a-git-reference)

```java
CompletableFuture<ReposCheckSuitesCheckSuiteIdCheckRunsResponse> checksListForRefAsync(
    final String owner,
    final String repo,
    final String ref,
    final String checkName,
    final Status71Enum status,
    final Filter42Enum filter,
    final Integer perPage,
    final Integer page,
    final Integer appId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `ref` | `String` | Template, Required | ref parameter |
| `checkName` | `String` | Query, Optional | Returns check runs with the specified `name`. |
| `status` | [`Status71Enum`](../../doc/models/status-71-enum.md) | Query, Optional | Returns check runs with the specified `status`. |
| `filter` | [`Filter42Enum`](../../doc/models/filter-42-enum.md) | Query, Optional | Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `appId` | `Integer` | Query, Optional | - |

## Response Type

[`ReposCheckSuitesCheckSuiteIdCheckRunsResponse`](../../doc/models/repos-check-suites-check-suite-id-check-runs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String ref = "ref0";
Integer perPage = 30;
Integer page = 1;

checksController.checksListForRefAsync(owner, repo, ref, null, null, null, perPage, page, null).thenAccept(result -> {
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
  "check_runs": [
    {
      "id": 4,
      "head_sha": "ce587453ced02b1526dfb4cb910479d431683101",
      "node_id": "MDg6Q2hlY2tSdW40",
      "external_id": "",
      "url": "https://api.github.com/repos/github/hello-world/check-runs/4",
      "html_url": "https://github.com/github/hello-world/runs/4",
      "details_url": "https://example.com",
      "status": "completed",
      "conclusion": "neutral",
      "started_at": "2018-05-04T01:14:52Z",
      "completed_at": "2018-05-04T01:14:52Z",
      "output": {
        "title": "Mighty Readme report",
        "summary": "There are 0 failures, 2 warnings, and 1 notice.",
        "text": "You may have some misspelled words on lines 2 and 4. You also may want to add a section in your README about how to install your app.",
        "annotations_count": 2,
        "annotations_url": "https://api.github.com/repos/github/hello-world/check-runs/4/annotations"
      },
      "name": "mighty_readme",
      "check_suite": {
        "id": 5
      },
      "app": {
        "id": 1,
        "slug": "octoapp",
        "node_id": "MDExOkludGVncmF0aW9uMQ==",
        "owner": {
          "login": "github",
          "id": 1,
          "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
          "url": "https://api.github.com/orgs/github",
          "repos_url": "https://api.github.com/orgs/github/repos",
          "events_url": "https://api.github.com/orgs/github/events",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": true
        },
        "name": "Octocat App",
        "description": "",
        "external_url": "https://example.com",
        "html_url": "https://github.com/apps/octoapp",
        "created_at": "2017-07-08T16:18:44-04:00",
        "updated_at": "2017-07-08T16:18:44-04:00",
        "permissions": {
          "metadata": "read",
          "contents": "read",
          "issues": "write",
          "single_file": "write"
        },
        "events": [
          "push",
          "pull_request"
        ]
      },
      "pull_requests": [
        {
          "url": "https://api.github.com/repos/github/hello-world/pulls/1",
          "id": 1934,
          "number": 3956,
          "head": {
            "ref": "say-hello",
            "sha": "3dca65fa3e8d4b3da3f3d056c59aee1c50f41390",
            "repo": {
              "id": 526,
              "url": "https://api.github.com/repos/github/hello-world",
              "name": "hello-world"
            }
          },
          "base": {
            "ref": "master",
            "sha": "e7fdf7640066d71ad16a86fbcbb9c6a10a18af4f",
            "repo": {
              "id": 526,
              "url": "https://api.github.com/repos/github/hello-world",
              "name": "hello-world"
            }
          }
        }
      ]
    }
  ]
}
```


# Checks List-Suites-for-Ref

**Note:** The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for `head_branch`.

Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name. GitHub Apps must have the `checks:read` permission on a private repository or pull access to a public repository to list check suites. OAuth Apps and authenticated users must have the `repo` scope to get check suites in a private repository.

API method documentation: [https://docs.github.com/rest/reference/checks#list-check-suites-for-a-git-reference](https://docs.github.com/rest/reference/checks#list-check-suites-for-a-git-reference)

```java
CompletableFuture<ReposCommitsRefCheckSuitesResponse> checksListSuitesForRefAsync(
    final String owner,
    final String repo,
    final String ref,
    final Integer appId,
    final String checkName,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `ref` | `String` | Template, Required | ref parameter |
| `appId` | `Integer` | Query, Optional | Filters check suites by GitHub App `id`. |
| `checkName` | `String` | Query, Optional | Returns check runs with the specified `name`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposCommitsRefCheckSuitesResponse`](../../doc/models/repos-commits-ref-check-suites-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String ref = "ref0";
Integer appId = 1;
Integer perPage = 30;
Integer page = 1;

checksController.checksListSuitesForRefAsync(owner, repo, ref, appId, null, perPage, page).thenAccept(result -> {
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
  "check_suites": [
    {
      "id": 5,
      "node_id": "MDEwOkNoZWNrU3VpdGU1",
      "head_branch": "master",
      "head_sha": "d6fde92930d4715a2b49857d24b940956b26d2d3",
      "status": "completed",
      "conclusion": "neutral",
      "url": "https://api.github.com/repos/github/hello-world/check-suites/5",
      "before": "146e867f55c26428e5f9fade55a9bbf5e95a7912",
      "after": "d6fde92930d4715a2b49857d24b940956b26d2d3",
      "pull_requests": [],
      "app": {
        "id": 1,
        "slug": "octoapp",
        "node_id": "MDExOkludGVncmF0aW9uMQ==",
        "owner": {
          "login": "github",
          "id": 1,
          "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
          "url": "https://api.github.com/orgs/github",
          "repos_url": "https://api.github.com/orgs/github/repos",
          "events_url": "https://api.github.com/orgs/github/events",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": true
        },
        "name": "Octocat App",
        "description": "",
        "external_url": "https://example.com",
        "html_url": "https://github.com/apps/octoapp",
        "created_at": "2017-07-08T16:18:44-04:00",
        "updated_at": "2017-07-08T16:18:44-04:00",
        "permissions": {
          "metadata": "read",
          "contents": "read",
          "issues": "write",
          "single_file": "write"
        },
        "events": [
          "push",
          "pull_request"
        ]
      },
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
        "git_url": "git:github.com/octocat/Hello-World.git",
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
        "ssh_url": "git@github.com:octocat/Hello-World.git",
        "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
        "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
        "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
        "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
        "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
        "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
        "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
        "clone_url": "https://github.com/octocat/Hello-World.git",
        "mirror_url": "git:git.example.com/octocat/Hello-World",
        "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
        "svn_url": "https://svn.github.com/octocat/Hello-World",
        "homepage": "https://github.com",
        "language": null,
        "forks_count": 9,
        "stargazers_count": 80,
        "watchers_count": 80,
        "size": 108,
        "default_branch": "master",
        "open_issues_count": 0,
        "is_template": true,
        "topics": [
          "octocat",
          "atom",
          "electron",
          "api"
        ],
        "has_issues": true,
        "has_projects": true,
        "has_wiki": true,
        "has_pages": false,
        "has_downloads": true,
        "archived": false,
        "disabled": false,
        "visibility": "public",
        "pushed_at": "2011-01-26T19:06:43Z",
        "created_at": "2011-01-26T19:01:12Z",
        "updated_at": "2011-01-26T19:14:43Z",
        "permissions": {
          "admin": false,
          "push": false,
          "pull": true
        },
        "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
        "delete_branch_on_merge": true,
        "subscribers_count": 42,
        "network_count": 0
      },
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "head_commit": {
        "id": "7fd1a60b01f91b314f59955a4e4d4e80d8edf11d",
        "tree_id": "7fd1a60b01f91b314f59955a4e4d4e80d8edf11d",
        "message": "Merge pull request #6 from Spaceghost/patch-1\n\nNew line at end of file.",
        "timestamp": "2016-10-10T00:00:00Z",
        "author": {
          "name": "The Octocat",
          "email": "octocat@nowhere.com"
        },
        "committer": {
          "name": "The Octocat",
          "email": "octocat@nowhere.com"
        }
      },
      "latest_check_runs_count": 1,
      "check_runs_url": "https://api.github.com/repos/octocat/Hello-World/check-suites/5/check-runs"
    }
  ]
}
```

