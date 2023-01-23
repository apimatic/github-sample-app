# Gists

View, modify your gists.

```java
GistsController gistsController = client.getGistsController();
```

## Class Name

`GistsController`

## Methods

* [Gists List](../../doc/controllers/gists.md#gists-list)
* [Gists Create](../../doc/controllers/gists.md#gists-create)
* [Gists List-Public](../../doc/controllers/gists.md#gists-list-public)
* [Gists List-Starred](../../doc/controllers/gists.md#gists-list-starred)
* [Gists Get](../../doc/controllers/gists.md#gists-get)
* [Gists Update](../../doc/controllers/gists.md#gists-update)
* [Gists Delete](../../doc/controllers/gists.md#gists-delete)
* [Gists List-Comments](../../doc/controllers/gists.md#gists-list-comments)
* [Gists Create-Comment](../../doc/controllers/gists.md#gists-create-comment)
* [Gists Get-Comment](../../doc/controllers/gists.md#gists-get-comment)
* [Gists Update-Comment](../../doc/controllers/gists.md#gists-update-comment)
* [Gists Delete-Comment](../../doc/controllers/gists.md#gists-delete-comment)
* [Gists List-Commits](../../doc/controllers/gists.md#gists-list-commits)
* [Gists List-Forks](../../doc/controllers/gists.md#gists-list-forks)
* [Gists Fork](../../doc/controllers/gists.md#gists-fork)
* [Gists Check-Is-Starred](../../doc/controllers/gists.md#gists-check-is-starred)
* [Gists Star](../../doc/controllers/gists.md#gists-star)
* [Gists Unstar](../../doc/controllers/gists.md#gists-unstar)
* [Gists Get-Revision](../../doc/controllers/gists.md#gists-get-revision)
* [Gists List-for-User](../../doc/controllers/gists.md#gists-list-for-user)


# Gists List

Lists the authenticated user's gists or if called anonymously, this endpoint returns all public gists:

API method documentation: [https://docs.github.com/rest/reference/gists#list-gists-for-the-authenticated-user](https://docs.github.com/rest/reference/gists#list-gists-for-the-authenticated-user)

```java
CompletableFuture<List<BaseGist>> gistsListAsync(
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<BaseGist>`](../../doc/models/base-gist.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

gistsController.gistsListAsync(null, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/gists/aa5a315d61ae9438b18d",
    "forks_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/forks",
    "commits_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/commits",
    "id": "aa5a315d61ae9438b18d",
    "node_id": "MDQ6R2lzdGFhNWEzMTVkNjFhZTk0MzhiMThk",
    "git_pull_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "git_push_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "html_url": "https://gist.github.com/aa5a315d61ae9438b18d",
    "files": {
      "hello_world.rb": {
        "filename": "hello_world.rb",
        "type": "application/x-ruby",
        "language": "Ruby",
        "raw_url": "https://gist.githubusercontent.com/octocat/6cad326836d38bd3a7ae/raw/db9c55113504e46fa076e7df3a04ce592e2e86d8/hello_world.rb",
        "size": 167
      }
    },
    "public": true,
    "created_at": "2010-04-14T02:15:15Z",
    "updated_at": "2011-06-20T11:34:15Z",
    "description": "Hello World Examples",
    "comments": 0,
    "user": null,
    "comments_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/comments/",
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
    "truncated": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Gists403ErrorException`](../../doc/models/gists-403-error-exception.md) |


# Gists Create

Allows you to add a new gist with one or more files.

**Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.

API method documentation: [https://docs.github.com/rest/reference/gists#create-a-gist](https://docs.github.com/rest/reference/gists#create-a-gist)

```java
CompletableFuture<GistsResponse> gistsCreateAsync(
    final GistsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GistsRequest`](../../doc/models/gists-request.md) | Body, Required | - |

## Response Type

[`GistsResponse`](../../doc/models/gists-response.md)

## Example Usage

```java
GistsRequest body = new GistsRequest();
Map<String, Files4> files = new LinkedHashMap<>();
Files4 files0 = new Files4();
files0.setContent("Hello World");

files.put("README.md", files0);

body.setFiles(files);
body.setDescription("Example of a gist");
boolean mPublic = false;

GistsRequestPublic mPublicContainer = GistsRequestPublic.fromMBoolean(mPublic);

body.setPublic(mPublicContainer);

gistsController.gistsCreateAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/gists/2decf6c462d9b4418f2",
  "forks_url": "https://api.github.com/gists/2decf6c462d9b4418f2/forks",
  "commits_url": "https://api.github.com/gists/2decf6c462d9b4418f2/commits",
  "id": "2decf6c462d9b4418f2",
  "node_id": "G_kwDOBhHyLdZDliNDQxOGYy",
  "git_pull_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "git_push_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "html_url": "https://gist.github.com/2decf6c462d9b4418f2",
  "files": {
    "README.md": {
      "filename": "README.md",
      "type": "text/markdown",
      "language": "Markdown",
      "raw_url": "https://gist.githubusercontent.com/monalisa/2decf6c462d9b4418f2/raw/ac3e6daf176fafe73609fd000cd188e4472010fb/README.md",
      "size": 23,
      "truncated": false,
      "content": "Hello world from GitHub"
    }
  },
  "public": true,
  "created_at": "2022-09-20T12:11:58Z",
  "updated_at": "2022-09-21T10:28:06Z",
  "description": "An updated gist description.",
  "comments": 0,
  "user": null,
  "comments_url": "https://api.github.com/gists/2decf6c462d9b4418f2/comments",
  "owner": {
    "login": "monalisa",
    "id": 104456405,
    "node_id": "U_kgDOBhHyLQ",
    "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
  "forks": [],
  "history": [
    {
      "user": {
        "login": "monalisa",
        "id": 104456405,
        "node_id": "U_kgyLQ",
        "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
      "version": "468aac8caed5f0c3b859b8286968",
      "committed_at": "2022-09-21T10:28:06Z",
      "change_status": {
        "total": 2,
        "additions": 1,
        "deletions": 1
      },
      "url": "https://api.github.com/gists/8481a81af6b7a2d418f2/468aac8caed5f0c3b859b8286968"
    }
  ],
  "truncated": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Gists403ErrorException`](../../doc/models/gists-403-error-exception.md) |
| 404 | Resource not found | [`Gists404ErrorException`](../../doc/models/gists-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Gists422ErrorException`](../../doc/models/gists-422-error-exception.md) |


# Gists List-Public

List public gists sorted by most recently updated to least recently updated.

Note: With [pagination](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.

API method documentation: [https://docs.github.com/rest/reference/gists#list-public-gists](https://docs.github.com/rest/reference/gists#list-public-gists)

```java
CompletableFuture<List<BaseGist>> gistsListPublicAsync(
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<BaseGist>`](../../doc/models/base-gist.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

gistsController.gistsListPublicAsync(null, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/gists/aa5a315d61ae9438b18d",
    "forks_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/forks",
    "commits_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/commits",
    "id": "aa5a315d61ae9438b18d",
    "node_id": "MDQ6R2lzdGFhNWEzMTVkNjFhZTk0MzhiMThk",
    "git_pull_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "git_push_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "html_url": "https://gist.github.com/aa5a315d61ae9438b18d",
    "files": {
      "hello_world.rb": {
        "filename": "hello_world.rb",
        "type": "application/x-ruby",
        "language": "Ruby",
        "raw_url": "https://gist.githubusercontent.com/octocat/6cad326836d38bd3a7ae/raw/db9c55113504e46fa076e7df3a04ce592e2e86d8/hello_world.rb",
        "size": 167
      }
    },
    "public": true,
    "created_at": "2010-04-14T02:15:15Z",
    "updated_at": "2011-06-20T11:34:15Z",
    "description": "Hello World Examples",
    "comments": 0,
    "user": null,
    "comments_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/comments/",
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
    "truncated": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsPublic403ErrorException`](../../doc/models/gists-public-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`GistsPublic422ErrorException`](../../doc/models/gists-public-422-error-exception.md) |


# Gists List-Starred

List the authenticated user's starred gists:

API method documentation: [https://docs.github.com/rest/reference/gists#list-starred-gists](https://docs.github.com/rest/reference/gists#list-starred-gists)

```java
CompletableFuture<List<BaseGist>> gistsListStarredAsync(
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<BaseGist>`](../../doc/models/base-gist.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

gistsController.gistsListStarredAsync(null, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/gists/aa5a315d61ae9438b18d",
    "forks_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/forks",
    "commits_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/commits",
    "id": "aa5a315d61ae9438b18d",
    "node_id": "MDQ6R2lzdGFhNWEzMTVkNjFhZTk0MzhiMThk",
    "git_pull_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "git_push_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "html_url": "https://gist.github.com/aa5a315d61ae9438b18d",
    "files": {
      "hello_world.rb": {
        "filename": "hello_world.rb",
        "type": "application/x-ruby",
        "language": "Ruby",
        "raw_url": "https://gist.githubusercontent.com/octocat/6cad326836d38bd3a7ae/raw/db9c55113504e46fa076e7df3a04ce592e2e86d8/hello_world.rb",
        "size": 167
      }
    },
    "public": true,
    "created_at": "2010-04-14T02:15:15Z",
    "updated_at": "2011-06-20T11:34:15Z",
    "description": "Hello World Examples",
    "comments": 0,
    "user": null,
    "comments_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/comments/",
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
    "truncated": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`GistsStarred401ErrorException`](../../doc/models/gists-starred-401-error-exception.md) |
| 403 | Forbidden | [`GistsStarred403ErrorException`](../../doc/models/gists-starred-403-error-exception.md) |


# Gists Get

Get a gist

API method documentation: [https://docs.github.com/rest/reference/gists#get-a-gist](https://docs.github.com/rest/reference/gists#get-a-gist)

```java
CompletableFuture<GistsResponse> gistsGetAsync(
    final String gistId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |

## Response Type

[`GistsResponse`](../../doc/models/gists-response.md)

## Example Usage

```java
String gistId = "gist_id2";

gistsController.gistsGetAsync(gistId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/gists/2decf6c462d9b4418f2",
  "forks_url": "https://api.github.com/gists/2decf6c462d9b4418f2/forks",
  "commits_url": "https://api.github.com/gists/2decf6c462d9b4418f2/commits",
  "id": "2decf6c462d9b4418f2",
  "node_id": "G_kwDOBhHyLdZDliNDQxOGYy",
  "git_pull_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "git_push_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "html_url": "https://gist.github.com/2decf6c462d9b4418f2",
  "files": {
    "README.md": {
      "filename": "README.md",
      "type": "text/markdown",
      "language": "Markdown",
      "raw_url": "https://gist.githubusercontent.com/monalisa/2decf6c462d9b4418f2/raw/ac3e6daf176fafe73609fd000cd188e4472010fb/README.md",
      "size": 23,
      "truncated": false,
      "content": "Hello world from GitHub"
    }
  },
  "public": true,
  "created_at": "2022-09-20T12:11:58Z",
  "updated_at": "2022-09-21T10:28:06Z",
  "description": "An updated gist description.",
  "comments": 0,
  "user": null,
  "comments_url": "https://api.github.com/gists/2decf6c462d9b4418f2/comments",
  "owner": {
    "login": "monalisa",
    "id": 104456405,
    "node_id": "U_kgDOBhHyLQ",
    "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
  "forks": [],
  "history": [
    {
      "user": {
        "login": "monalisa",
        "id": 104456405,
        "node_id": "U_kgyLQ",
        "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
      "version": "468aac8caed5f0c3b859b8286968",
      "committed_at": "2022-09-21T10:28:06Z",
      "change_status": {
        "total": 2,
        "additions": 1,
        "deletions": 1
      },
      "url": "https://api.github.com/gists/8481a81af6b7a2d418f2/468aac8caed5f0c3b859b8286968"
    }
  ],
  "truncated": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden Gist | [`ForbiddenGist1Exception`](../../doc/models/forbidden-gist-1-exception.md) |
| 404 | Resource not found | [`Gists404ErrorException`](../../doc/models/gists-404-error-exception.md) |


# Gists Update

Allows you to update a gist's description and to update, delete, or rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.

API method documentation: [https://docs.github.com/rest/reference/gists/#update-a-gist](https://docs.github.com/rest/reference/gists/#update-a-gist)

```java
CompletableFuture<GistsResponse> gistsUpdateAsync(
    final String gistId,
    final GistsRequest3 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `body` | [`GistsRequest3`]($m/GistsUpdateBody) | Body, Required | - |

## Response Type

[`GistsResponse`](../../doc/models/gists-response.md)

## Example Usage

```java
String gistId = "gist_id2";
gistsController.gistsUpdateAsync(gistId, bodyContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/gists/2decf6c462d9b4418f2",
  "forks_url": "https://api.github.com/gists/2decf6c462d9b4418f2/forks",
  "commits_url": "https://api.github.com/gists/2decf6c462d9b4418f2/commits",
  "id": "2decf6c462d9b4418f2",
  "node_id": "G_kwDOBhHyLdZDliNDQxOGYy",
  "git_pull_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "git_push_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "html_url": "https://gist.github.com/2decf6c462d9b4418f2",
  "files": {
    "README.md": {
      "filename": "README.md",
      "type": "text/markdown",
      "language": "Markdown",
      "raw_url": "https://gist.githubusercontent.com/monalisa/2decf6c462d9b4418f2/raw/ac3e6daf176fafe73609fd000cd188e4472010fb/README.md",
      "size": 23,
      "truncated": false,
      "content": "Hello world from GitHub"
    }
  },
  "public": true,
  "created_at": "2022-09-20T12:11:58Z",
  "updated_at": "2022-09-21T10:28:06Z",
  "description": "An updated gist description.",
  "comments": 0,
  "user": null,
  "comments_url": "https://api.github.com/gists/2decf6c462d9b4418f2/comments",
  "owner": {
    "login": "monalisa",
    "id": 104456405,
    "node_id": "U_kgDOBhHyLQ",
    "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
  "forks": [],
  "history": [
    {
      "user": {
        "login": "monalisa",
        "id": 104456405,
        "node_id": "U_kgyLQ",
        "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
      "version": "468aac8caed5f0c3b859b8286968",
      "committed_at": "2022-09-21T10:28:06Z",
      "change_status": {
        "total": 2,
        "additions": 1,
        "deletions": 1
      },
      "url": "https://api.github.com/gists/8481a81af6b7a2d418f2/468aac8caed5f0c3b859b8286968"
    }
  ],
  "truncated": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`Gists404ErrorException`](../../doc/models/gists-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Gists422ErrorException`](../../doc/models/gists-422-error-exception.md) |


# Gists Delete

Delete a gist

API method documentation: [https://docs.github.com/rest/reference/gists#delete-a-gist](https://docs.github.com/rest/reference/gists#delete-a-gist)

```java
CompletableFuture<Void> gistsDeleteAsync(
    final String gistId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |

## Response Type

`void`

## Example Usage

```java
String gistId = "gist_id2";

gistsController.gistsDeleteAsync(gistId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Gists403ErrorException`](../../doc/models/gists-403-error-exception.md) |
| 404 | Resource not found | [`Gists404ErrorException`](../../doc/models/gists-404-error-exception.md) |


# Gists List-Comments

List gist comments

API method documentation: [https://docs.github.com/rest/reference/gists#list-gist-comments](https://docs.github.com/rest/reference/gists#list-gist-comments)

```java
CompletableFuture<List<GistComment>> gistsListCommentsAsync(
    final String gistId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<GistComment>`](../../doc/models/gist-comment.md)

## Example Usage

```java
String gistId = "gist_id2";
Integer perPage = 30;
Integer page = 1;

gistsController.gistsListCommentsAsync(gistId, perPage, page).thenAccept(result -> {
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
    "node_id": "MDExOkdpc3RDb21tZW50MQ==",
    "url": "https://api.github.com/gists/a6db0bec360bb87e9418/comments/1",
    "body": "Just commenting for the sake of commenting",
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
    },
    "created_at": "2011-04-18T23:23:56Z",
    "updated_at": "2011-04-18T23:23:56Z",
    "author_association": "COLLABORATOR"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsComments403ErrorException`](../../doc/models/gists-comments-403-error-exception.md) |
| 404 | Resource not found | [`GistsComments404ErrorException`](../../doc/models/gists-comments-404-error-exception.md) |


# Gists Create-Comment

Create a gist comment

API method documentation: [https://docs.github.com/rest/reference/gists#create-a-gist-comment](https://docs.github.com/rest/reference/gists#create-a-gist-comment)

```java
CompletableFuture<GistsCommentsResponse> gistsCreateCommentAsync(
    final String gistId,
    final GistsCommentsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `body` | [`GistsCommentsRequest`](../../doc/models/gists-comments-request.md) | Body, Required | - |

## Response Type

[`GistsCommentsResponse`](../../doc/models/gists-comments-response.md)

## Example Usage

```java
String gistId = "gist_id2";
GistsCommentsRequest body = new GistsCommentsRequest();
body.setBody("This is a comment to a gist");

gistsController.gistsCreateCommentAsync(gistId, body).thenAccept(result -> {
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
  "node_id": "MDExOkdpc3RDb21tZW50MQ==",
  "url": "https://api.github.com/gists/a6db0bec360bb87e9418/comments/1",
  "body": "Just commenting for the sake of commenting",
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
  },
  "created_at": "2011-04-18T23:23:56Z",
  "updated_at": "2011-04-18T23:23:56Z",
  "author_association": "COLLABORATOR"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsComments403ErrorException`](../../doc/models/gists-comments-403-error-exception.md) |
| 404 | Resource not found | [`GistsComments404ErrorException`](../../doc/models/gists-comments-404-error-exception.md) |


# Gists Get-Comment

Get a gist comment

API method documentation: [https://docs.github.com/rest/reference/gists#get-a-gist-comment](https://docs.github.com/rest/reference/gists#get-a-gist-comment)

```java
CompletableFuture<GistsCommentsResponse> gistsGetCommentAsync(
    final String gistId,
    final int commentId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |

## Response Type

[`GistsCommentsResponse`](../../doc/models/gists-comments-response.md)

## Example Usage

```java
String gistId = "gist_id2";
int commentId = 46;

gistsController.gistsGetCommentAsync(gistId, commentId).thenAccept(result -> {
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
  "node_id": "MDExOkdpc3RDb21tZW50MQ==",
  "url": "https://api.github.com/gists/a6db0bec360bb87e9418/comments/1",
  "body": "Just commenting for the sake of commenting",
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
  },
  "created_at": "2011-04-18T23:23:56Z",
  "updated_at": "2011-04-18T23:23:56Z",
  "author_association": "COLLABORATOR"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden Gist | [`ForbiddenGist1Exception`](../../doc/models/forbidden-gist-1-exception.md) |
| 404 | Resource not found | [`GistsComments404ErrorException`](../../doc/models/gists-comments-404-error-exception.md) |


# Gists Update-Comment

Update a gist comment

API method documentation: [https://docs.github.com/rest/reference/gists#update-a-gist-comment](https://docs.github.com/rest/reference/gists#update-a-gist-comment)

```java
CompletableFuture<GistsCommentsResponse> gistsUpdateCommentAsync(
    final String gistId,
    final int commentId,
    final GistsCommentsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `body` | [`GistsCommentsRequest`](../../doc/models/gists-comments-request.md) | Body, Required | - |

## Response Type

[`GistsCommentsResponse`](../../doc/models/gists-comments-response.md)

## Example Usage

```java
String gistId = "gist_id2";
int commentId = 46;
GistsCommentsRequest body = new GistsCommentsRequest();
body.setBody("This is an update to a comment in a gist");

gistsController.gistsUpdateCommentAsync(gistId, commentId, body).thenAccept(result -> {
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
  "node_id": "MDExOkdpc3RDb21tZW50MQ==",
  "url": "https://api.github.com/gists/a6db0bec360bb87e9418/comments/1",
  "body": "Just commenting for the sake of commenting",
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
  },
  "created_at": "2011-04-18T23:23:56Z",
  "updated_at": "2011-04-18T23:23:56Z",
  "author_association": "COLLABORATOR"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`GistsComments404ErrorException`](../../doc/models/gists-comments-404-error-exception.md) |


# Gists Delete-Comment

Delete a gist comment

API method documentation: [https://docs.github.com/rest/reference/gists#delete-a-gist-comment](https://docs.github.com/rest/reference/gists#delete-a-gist-comment)

```java
CompletableFuture<Void> gistsDeleteCommentAsync(
    final String gistId,
    final int commentId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |

## Response Type

`void`

## Example Usage

```java
String gistId = "gist_id2";
int commentId = 46;

gistsController.gistsDeleteCommentAsync(gistId, commentId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsComments403ErrorException`](../../doc/models/gists-comments-403-error-exception.md) |
| 404 | Resource not found | [`GistsComments404ErrorException`](../../doc/models/gists-comments-404-error-exception.md) |


# Gists List-Commits

List gist commits

API method documentation: [https://docs.github.com/rest/reference/gists#list-gist-commits](https://docs.github.com/rest/reference/gists#list-gist-commits)

```java
CompletableFuture<List<GistCommit>> gistsListCommitsAsync(
    final String gistId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<GistCommit>`](../../doc/models/gist-commit.md)

## Example Usage

```java
String gistId = "gist_id2";
Integer perPage = 30;
Integer page = 1;

gistsController.gistsListCommitsAsync(gistId, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/gists/aa5a315d61ae9438b18d/57a7f021a713b1c5a6a199b54cc514735d2d462f",
    "version": "57a7f021a713b1c5a6a199b54cc514735d2d462f",
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
    },
    "change_status": {
      "deletions": 0,
      "additions": 180,
      "total": 180
    },
    "committed_at": "2010-04-14T02:15:15Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsCommits403ErrorException`](../../doc/models/gists-commits-403-error-exception.md) |
| 404 | Resource not found | [`GistsCommits404ErrorException`](../../doc/models/gists-commits-404-error-exception.md) |


# Gists List-Forks

List gist forks

API method documentation: [https://docs.github.com/rest/reference/gists#list-gist-forks](https://docs.github.com/rest/reference/gists#list-gist-forks)

```java
CompletableFuture<List<GistSimple>> gistsListForksAsync(
    final String gistId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<GistSimple>`](../../doc/models/gist-simple.md)

## Example Usage

```java
String gistId = "gist_id2";
Integer perPage = 30;
Integer page = 1;

gistsController.gistsListForksAsync(gistId, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/gists/aa5a315d61ae9438b18d",
    "forks_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/forks",
    "commits_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/commits",
    "id": "aa5a315d61ae9438b18d",
    "node_id": "MDQ6R2lzdGFhNWEzMTVkNjFhZTk0MzhiMThk",
    "git_pull_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "git_push_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "html_url": "https://gist.github.com/aa5a315d61ae9438b18d",
    "files": {
      "hello_world.rb": {
        "filename": "hello_world.rb",
        "type": "application/x-ruby",
        "language": "Ruby",
        "raw_url": "https://gist.githubusercontent.com/octocat/6cad326836d38bd3a7ae/raw/db9c55113504e46fa076e7df3a04ce592e2e86d8/hello_world.rb",
        "size": 167
      }
    },
    "public": true,
    "created_at": "2010-04-14T02:15:15Z",
    "updated_at": "2011-06-20T11:34:15Z",
    "description": "Hello World Examples",
    "comments": 1,
    "user": null,
    "comments_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/comments/",
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
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsForks403ErrorException`](../../doc/models/gists-forks-403-error-exception.md) |
| 404 | Resource not found | [`GistsForks404ErrorException`](../../doc/models/gists-forks-404-error-exception.md) |


# Gists Fork

Fork a gist

API method documentation: [https://docs.github.com/rest/reference/gists#fork-a-gist](https://docs.github.com/rest/reference/gists#fork-a-gist)

```java
CompletableFuture<GistsForksResponse> gistsForkAsync(
    final String gistId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |

## Response Type

[`GistsForksResponse`](../../doc/models/gists-forks-response.md)

## Example Usage

```java
String gistId = "gist_id2";

gistsController.gistsForkAsync(gistId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/gists/aa5a315d61ae9438b18d",
  "forks_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/forks",
  "commits_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/commits",
  "id": "aa5a315d61ae9438b18d",
  "node_id": "MDQ6R2lzdGFhNWEzMTVkNjFhZTk0MzhiMThk",
  "git_pull_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
  "git_push_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
  "html_url": "https://gist.github.com/aa5a315d61ae9438b18d",
  "files": {
    "hello_world.rb": {
      "filename": "hello_world.rb",
      "type": "application/x-ruby",
      "language": "Ruby",
      "raw_url": "https://gist.githubusercontent.com/octocat/6cad326836d38bd3a7ae/raw/db9c55113504e46fa076e7df3a04ce592e2e86d8/hello_world.rb",
      "size": 167
    }
  },
  "public": true,
  "created_at": "2010-04-14T02:15:15Z",
  "updated_at": "2011-06-20T11:34:15Z",
  "description": "Hello World Examples",
  "comments": 0,
  "user": null,
  "comments_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/comments/",
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
  "truncated": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsForks403ErrorException`](../../doc/models/gists-forks-403-error-exception.md) |
| 404 | Resource not found | [`GistsForks404ErrorException`](../../doc/models/gists-forks-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`GistsForks422ErrorException`](../../doc/models/gists-forks-422-error-exception.md) |


# Gists Check-Is-Starred

Check if a gist is starred

API method documentation: [https://docs.github.com/rest/reference/gists#check-if-a-gist-is-starred](https://docs.github.com/rest/reference/gists#check-if-a-gist-is-starred)

```java
CompletableFuture<Void> gistsCheckIsStarredAsync(
    final String gistId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |

## Response Type

`void`

## Example Usage

```java
String gistId = "gist_id2";

gistsController.gistsCheckIsStarredAsync(gistId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsStar403ErrorException`](../../doc/models/gists-star-403-error-exception.md) |
| 404 | Not Found if gist is not starred | `ApiException` |


# Gists Star

Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

API method documentation: [https://docs.github.com/rest/reference/gists#star-a-gist](https://docs.github.com/rest/reference/gists#star-a-gist)

```java
CompletableFuture<Void> gistsStarAsync(
    final String gistId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |

## Response Type

`void`

## Example Usage

```java
String gistId = "gist_id2";

gistsController.gistsStarAsync(gistId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsStar403ErrorException`](../../doc/models/gists-star-403-error-exception.md) |
| 404 | Resource not found | [`GistsStar404ErrorException`](../../doc/models/gists-star-404-error-exception.md) |


# Gists Unstar

Unstar a gist

API method documentation: [https://docs.github.com/rest/reference/gists#unstar-a-gist](https://docs.github.com/rest/reference/gists#unstar-a-gist)

```java
CompletableFuture<Void> gistsUnstarAsync(
    final String gistId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |

## Response Type

`void`

## Example Usage

```java
String gistId = "gist_id2";

gistsController.gistsUnstarAsync(gistId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`GistsStar403ErrorException`](../../doc/models/gists-star-403-error-exception.md) |
| 404 | Resource not found | [`GistsStar404ErrorException`](../../doc/models/gists-star-404-error-exception.md) |


# Gists Get-Revision

Get a gist revision

API method documentation: [https://docs.github.com/rest/reference/gists#get-a-gist-revision](https://docs.github.com/rest/reference/gists#get-a-gist-revision)

```java
CompletableFuture<GistsResponse> gistsGetRevisionAsync(
    final String gistId,
    final String sha)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gistId` | `String` | Template, Required | The unique identifier of the gist. |
| `sha` | `String` | Template, Required | - |

## Response Type

[`GistsResponse`](../../doc/models/gists-response.md)

## Example Usage

```java
String gistId = "gist_id2";
String sha = "sha6";

gistsController.gistsGetRevisionAsync(gistId, sha).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/gists/2decf6c462d9b4418f2",
  "forks_url": "https://api.github.com/gists/2decf6c462d9b4418f2/forks",
  "commits_url": "https://api.github.com/gists/2decf6c462d9b4418f2/commits",
  "id": "2decf6c462d9b4418f2",
  "node_id": "G_kwDOBhHyLdZDliNDQxOGYy",
  "git_pull_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "git_push_url": "https://gist.github.com/2decf6c462d9b4418f2.git",
  "html_url": "https://gist.github.com/2decf6c462d9b4418f2",
  "files": {
    "README.md": {
      "filename": "README.md",
      "type": "text/markdown",
      "language": "Markdown",
      "raw_url": "https://gist.githubusercontent.com/monalisa/2decf6c462d9b4418f2/raw/ac3e6daf176fafe73609fd000cd188e4472010fb/README.md",
      "size": 23,
      "truncated": false,
      "content": "Hello world from GitHub"
    }
  },
  "public": true,
  "created_at": "2022-09-20T12:11:58Z",
  "updated_at": "2022-09-21T10:28:06Z",
  "description": "An updated gist description.",
  "comments": 0,
  "user": null,
  "comments_url": "https://api.github.com/gists/2decf6c462d9b4418f2/comments",
  "owner": {
    "login": "monalisa",
    "id": 104456405,
    "node_id": "U_kgDOBhHyLQ",
    "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
  "forks": [],
  "history": [
    {
      "user": {
        "login": "monalisa",
        "id": 104456405,
        "node_id": "U_kgyLQ",
        "avatar_url": "https://avatars.githubusercontent.com/u/104456405?v=4",
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
      "version": "468aac8caed5f0c3b859b8286968",
      "committed_at": "2022-09-21T10:28:06Z",
      "change_status": {
        "total": 2,
        "additions": 1,
        "deletions": 1
      },
      "url": "https://api.github.com/gists/8481a81af6b7a2d418f2/468aac8caed5f0c3b859b8286968"
    }
  ],
  "truncated": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Gists403ErrorException`](../../doc/models/gists-403-error-exception.md) |
| 404 | Resource not found | [`Gists404ErrorException`](../../doc/models/gists-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Gists422ErrorException`](../../doc/models/gists-422-error-exception.md) |


# Gists List-for-User

Lists public gists for the specified user:

API method documentation: [https://docs.github.com/rest/reference/gists#list-gists-for-a-user](https://docs.github.com/rest/reference/gists#list-gists-for-a-user)

```java
CompletableFuture<List<BaseGist>> gistsListForUserAsync(
    final String username,
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<BaseGist>`](../../doc/models/base-gist.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

gistsController.gistsListForUserAsync(username, null, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/gists/aa5a315d61ae9438b18d",
    "forks_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/forks",
    "commits_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/commits",
    "id": "aa5a315d61ae9438b18d",
    "node_id": "MDQ6R2lzdGFhNWEzMTVkNjFhZTk0MzhiMThk",
    "git_pull_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "git_push_url": "https://gist.github.com/aa5a315d61ae9438b18d.git",
    "html_url": "https://gist.github.com/aa5a315d61ae9438b18d",
    "files": {
      "hello_world.rb": {
        "filename": "hello_world.rb",
        "type": "application/x-ruby",
        "language": "Ruby",
        "raw_url": "https://gist.githubusercontent.com/octocat/6cad326836d38bd3a7ae/raw/db9c55113504e46fa076e7df3a04ce592e2e86d8/hello_world.rb",
        "size": 167
      }
    },
    "public": true,
    "created_at": "2010-04-14T02:15:15Z",
    "updated_at": "2011-06-20T11:34:15Z",
    "description": "Hello World Examples",
    "comments": 0,
    "user": null,
    "comments_url": "https://api.github.com/gists/aa5a315d61ae9438b18d/comments/",
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
    "truncated": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`UsersGists422ErrorException`](../../doc/models/users-gists-422-error-exception.md) |

