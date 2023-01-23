# Projects

Interact with GitHub Projects.

```java
ProjectsController projectsController = client.getProjectsController();
```

## Class Name

`ProjectsController`

## Methods

* [Projects List-for-Org](../../doc/controllers/projects.md#projects-list-for-org)
* [Projects Create-for-Org](../../doc/controllers/projects.md#projects-create-for-org)
* [Projects Get-Card](../../doc/controllers/projects.md#projects-get-card)
* [Projects Update-Card](../../doc/controllers/projects.md#projects-update-card)
* [Projects Delete-Card](../../doc/controllers/projects.md#projects-delete-card)
* [Projects Move-Card](../../doc/controllers/projects.md#projects-move-card)
* [Projects Get-Column](../../doc/controllers/projects.md#projects-get-column)
* [Projects Update-Column](../../doc/controllers/projects.md#projects-update-column)
* [Projects Delete-Column](../../doc/controllers/projects.md#projects-delete-column)
* [Projects List-Cards](../../doc/controllers/projects.md#projects-list-cards)
* [Projects Create-Card](../../doc/controllers/projects.md#projects-create-card)
* [Projects Move-Column](../../doc/controllers/projects.md#projects-move-column)
* [Projects Get](../../doc/controllers/projects.md#projects-get)
* [Projects Update](../../doc/controllers/projects.md#projects-update)
* [Projects Delete](../../doc/controllers/projects.md#projects-delete)
* [Projects List-Collaborators](../../doc/controllers/projects.md#projects-list-collaborators)
* [Projects Add-Collaborator](../../doc/controllers/projects.md#projects-add-collaborator)
* [Projects Remove-Collaborator](../../doc/controllers/projects.md#projects-remove-collaborator)
* [Projects Get-Permission-for-User](../../doc/controllers/projects.md#projects-get-permission-for-user)
* [Projects List-Columns](../../doc/controllers/projects.md#projects-list-columns)
* [Projects Create-Column](../../doc/controllers/projects.md#projects-create-column)
* [Projects List-for-Repo](../../doc/controllers/projects.md#projects-list-for-repo)
* [Projects Create-for-Repo](../../doc/controllers/projects.md#projects-create-for-repo)
* [Projects Create-for-Authenticated-User](../../doc/controllers/projects.md#projects-create-for-authenticated-user)
* [Projects List-for-User](../../doc/controllers/projects.md#projects-list-for-user)


# Projects List-for-Org

Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.

API method documentation: [https://docs.github.com/rest/reference/projects#list-organization-projects](https://docs.github.com/rest/reference/projects#list-organization-projects)

```java
CompletableFuture<List<Project>> projectsListForOrgAsync(
    final String org,
    final State1676Enum state,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `state` | [`State1676Enum`](../../doc/models/state-1676-enum.md) | Query, Optional | Indicates the state of the projects to return. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Project>`](../../doc/models/project.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

projectsController.projectsListForOrgAsync(org, null, perPage, page).thenAccept(result -> {
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
    "owner_url": "https://api.github.com/orgs/octocat",
    "url": "https://api.github.com/projects/1002605",
    "html_url": "https://github.com/orgs/api-playground/projects/1",
    "columns_url": "https://api.github.com/projects/1002605/columns",
    "id": 1002605,
    "node_id": "MDc6UHJvamVjdDEwMDI2MDU=",
    "name": "Organization Roadmap",
    "body": "High-level roadmap for the upcoming year.",
    "number": 1,
    "state": "open",
    "creator": {
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
    "created_at": "2011-04-11T20:09:31Z",
    "updated_at": "2014-03-04T18:58:10Z",
    "organization_permission": "write",
    "private": true
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsProjects422ErrorException`](../../doc/models/orgs-projects-422-error-exception.md) |


# Projects Create-for-Org

Creates an organization project board. Returns a `410 Gone` status if projects are disabled in the organization or if the organization does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.

API method documentation: [https://docs.github.com/rest/reference/projects#create-an-organization-project](https://docs.github.com/rest/reference/projects#create-an-organization-project)

```java
CompletableFuture<OrgsProjectsResponse> projectsCreateForOrgAsync(
    final String org,
    final OrgsProjectsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsProjectsRequest`](../../doc/models/orgs-projects-request.md) | Body, Required | - |

## Response Type

[`OrgsProjectsResponse`](../../doc/models/orgs-projects-response.md)

## Example Usage

```java
String org = "org6";
OrgsProjectsRequest body = new OrgsProjectsRequest();
body.setName("Organization Roadmap");
body.setBody("High-level roadmap for the upcoming year.");

projectsController.projectsCreateForOrgAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "owner_url": "https://api.github.com/orgs/octocat",
  "url": "https://api.github.com/projects/1002605",
  "html_url": "https://github.com/orgs/api-playground/projects/1",
  "columns_url": "https://api.github.com/projects/1002605/columns",
  "id": 1002605,
  "node_id": "MDc6UHJvamVjdDEwMDI2MDU=",
  "name": "Organization Roadmap",
  "body": "High-level roadmap for the upcoming year.",
  "number": 1,
  "state": "open",
  "creator": {
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
  "created_at": "2011-04-11T20:09:31Z",
  "updated_at": "2014-03-04T18:58:10Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsProjects401ErrorException`](../../doc/models/orgs-projects-401-error-exception.md) |
| 403 | Forbidden | [`OrgsProjects403ErrorException`](../../doc/models/orgs-projects-403-error-exception.md) |
| 404 | Resource not found | [`OrgsProjects404ErrorException`](../../doc/models/orgs-projects-404-error-exception.md) |
| 410 | Gone | [`OrgsProjects410ErrorException`](../../doc/models/orgs-projects-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsProjects422ErrorException`](../../doc/models/orgs-projects-422-error-exception.md) |


# Projects Get-Card

Get a project card

API method documentation: [https://docs.github.com/rest/reference/projects#get-a-project-card](https://docs.github.com/rest/reference/projects#get-a-project-card)

```java
CompletableFuture<ProjectsColumnsCardsResponse> projectsGetCardAsync(
    final int cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `int` | Template, Required | The unique identifier of the card. |

## Response Type

[`ProjectsColumnsCardsResponse`](../../doc/models/projects-columns-cards-response.md)

## Example Usage

```java
int cardId = 72;

projectsController.projectsGetCardAsync(cardId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/projects/columns/cards/1478",
  "id": 1478,
  "node_id": "MDExOlByb2plY3RDYXJkMTQ3OA==",
  "note": "Add payload for delete Project column",
  "creator": {
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
  "created_at": "2016-09-05T14:21:06Z",
  "updated_at": "2016-09-05T14:20:22Z",
  "archived": false,
  "column_url": "https://api.github.com/projects/columns/367",
  "content_url": "https://api.github.com/repos/api-playground/projects-test/issues/3",
  "project_url": "https://api.github.com/projects/120"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumnsCards401ErrorException`](../../doc/models/projects-columns-cards-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumnsCards403ErrorException`](../../doc/models/projects-columns-cards-403-error-exception.md) |
| 404 | Resource not found | [`ProjectsColumnsCards404ErrorException`](../../doc/models/projects-columns-cards-404-error-exception.md) |


# Projects Update-Card

Update an existing project card

API method documentation: [https://docs.github.com/rest/reference/projects#update-a-project-card](https://docs.github.com/rest/reference/projects#update-a-project-card)

```java
CompletableFuture<ProjectsColumnsCardsResponse> projectsUpdateCardAsync(
    final int cardId,
    final ProjectsColumnsCardsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `int` | Template, Required | The unique identifier of the card. |
| `body` | [`ProjectsColumnsCardsRequest`](../../doc/models/projects-columns-cards-request.md) | Body, Optional | - |

## Response Type

[`ProjectsColumnsCardsResponse`](../../doc/models/projects-columns-cards-response.md)

## Example Usage

```java
int cardId = 72;
ProjectsColumnsCardsRequest body = new ProjectsColumnsCardsRequest();
body.setNote("Add payload for delete Project column");

projectsController.projectsUpdateCardAsync(cardId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/projects/columns/cards/1478",
  "id": 1478,
  "node_id": "MDExOlByb2plY3RDYXJkMTQ3OA==",
  "note": "Add payload for delete Project column",
  "creator": {
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
  "created_at": "2016-09-05T14:21:06Z",
  "updated_at": "2016-09-05T14:20:22Z",
  "archived": false,
  "column_url": "https://api.github.com/projects/columns/367",
  "content_url": "https://api.github.com/repos/api-playground/projects-test/issues/3",
  "project_url": "https://api.github.com/projects/120"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumnsCards401ErrorException`](../../doc/models/projects-columns-cards-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumnsCards403ErrorException`](../../doc/models/projects-columns-cards-403-error-exception.md) |
| 404 | Resource not found | [`ProjectsColumnsCards404ErrorException`](../../doc/models/projects-columns-cards-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsColumnsCards422ErrorException`](../../doc/models/projects-columns-cards-422-error-exception.md) |


# Projects Delete-Card

Delete a project card

API method documentation: [https://docs.github.com/rest/reference/projects#delete-a-project-card](https://docs.github.com/rest/reference/projects#delete-a-project-card)

```java
CompletableFuture<Void> projectsDeleteCardAsync(
    final int cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `int` | Template, Required | The unique identifier of the card. |

## Response Type

`void`

## Example Usage

```java
int cardId = 72;

projectsController.projectsDeleteCardAsync(cardId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumnsCards401ErrorException`](../../doc/models/projects-columns-cards-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumnsCards403Error1Exception`](../../doc/models/projects-columns-cards-403-error-1-exception.md) |
| 404 | Resource not found | [`ProjectsColumnsCards404ErrorException`](../../doc/models/projects-columns-cards-404-error-exception.md) |


# Projects Move-Card

Move a project card

API method documentation: [https://docs.github.com/rest/reference/projects#move-a-project-card](https://docs.github.com/rest/reference/projects#move-a-project-card)

```java
CompletableFuture<Object> projectsMoveCardAsync(
    final int cardId,
    final ProjectsColumnsCardsMovesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `int` | Template, Required | The unique identifier of the card. |
| `body` | [`ProjectsColumnsCardsMovesRequest`](../../doc/models/projects-columns-cards-moves-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
int cardId = 72;
ProjectsColumnsCardsMovesRequest body = new ProjectsColumnsCardsMovesRequest();
body.setPosition("bottom");
body.setColumnId(42);

projectsController.projectsMoveCardAsync(cardId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumnsCardsMoves401ErrorException`](../../doc/models/projects-columns-cards-moves-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumnsCardsMoves403Error1Exception`](../../doc/models/projects-columns-cards-moves-403-error-1-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsColumnsCardsMoves422ErrorException`](../../doc/models/projects-columns-cards-moves-422-error-exception.md) |
| 503 | Response | [`ProjectsColumnsCardsMoves503Error1Exception`](../../doc/models/projects-columns-cards-moves-503-error-1-exception.md) |


# Projects Get-Column

Get a project column

API method documentation: [https://docs.github.com/rest/reference/projects#get-a-project-column](https://docs.github.com/rest/reference/projects#get-a-project-column)

```java
CompletableFuture<ProjectsColumnsResponse> projectsGetColumnAsync(
    final int columnId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `columnId` | `int` | Template, Required | The unique identifier of the column. |

## Response Type

[`ProjectsColumnsResponse`](../../doc/models/projects-columns-response.md)

## Example Usage

```java
int columnId = 154;

projectsController.projectsGetColumnAsync(columnId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/projects/columns/367",
  "project_url": "https://api.github.com/projects/120",
  "cards_url": "https://api.github.com/projects/columns/367/cards",
  "id": 367,
  "node_id": "MDEzOlByb2plY3RDb2x1bW4zNjc=",
  "name": "To Do",
  "created_at": "2016-09-05T14:18:44Z",
  "updated_at": "2016-09-05T14:22:28Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumns401ErrorException`](../../doc/models/projects-columns-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumns403ErrorException`](../../doc/models/projects-columns-403-error-exception.md) |
| 404 | Resource not found | [`ProjectsColumns404ErrorException`](../../doc/models/projects-columns-404-error-exception.md) |


# Projects Update-Column

Update an existing project column

API method documentation: [https://docs.github.com/rest/reference/projects#update-a-project-column](https://docs.github.com/rest/reference/projects#update-a-project-column)

```java
CompletableFuture<ProjectsColumnsResponse> projectsUpdateColumnAsync(
    final int columnId,
    final ProjectsColumnsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `columnId` | `int` | Template, Required | The unique identifier of the column. |
| `body` | [`ProjectsColumnsRequest`](../../doc/models/projects-columns-request.md) | Body, Required | - |

## Response Type

[`ProjectsColumnsResponse`](../../doc/models/projects-columns-response.md)

## Example Usage

```java
int columnId = 154;
ProjectsColumnsRequest body = new ProjectsColumnsRequest();
body.setName("To Do");

projectsController.projectsUpdateColumnAsync(columnId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/projects/columns/367",
  "project_url": "https://api.github.com/projects/120",
  "cards_url": "https://api.github.com/projects/columns/367/cards",
  "id": 367,
  "node_id": "MDEzOlByb2plY3RDb2x1bW4zNjc=",
  "name": "To Do",
  "created_at": "2016-09-05T14:18:44Z",
  "updated_at": "2016-09-05T14:22:28Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumns401ErrorException`](../../doc/models/projects-columns-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumns403ErrorException`](../../doc/models/projects-columns-403-error-exception.md) |


# Projects Delete-Column

Delete a project column

API method documentation: [https://docs.github.com/rest/reference/projects#delete-a-project-column](https://docs.github.com/rest/reference/projects#delete-a-project-column)

```java
CompletableFuture<Void> projectsDeleteColumnAsync(
    final int columnId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `columnId` | `int` | Template, Required | The unique identifier of the column. |

## Response Type

`void`

## Example Usage

```java
int columnId = 154;

projectsController.projectsDeleteColumnAsync(columnId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumns401ErrorException`](../../doc/models/projects-columns-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumns403ErrorException`](../../doc/models/projects-columns-403-error-exception.md) |


# Projects List-Cards

List project cards

API method documentation: [https://docs.github.com/rest/reference/projects#list-project-cards](https://docs.github.com/rest/reference/projects#list-project-cards)

```java
CompletableFuture<List<ProjectCard>> projectsListCardsAsync(
    final int columnId,
    final ArchivedState1Enum archivedState,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `columnId` | `int` | Template, Required | The unique identifier of the column. |
| `archivedState` | [`ArchivedState1Enum`](../../doc/models/archived-state-1-enum.md) | Query, Optional | Filters the project cards that are returned by the card's state. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<ProjectCard>`](../../doc/models/project-card.md)

## Example Usage

```java
int columnId = 154;
Integer perPage = 30;
Integer page = 1;

projectsController.projectsListCardsAsync(columnId, null, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/projects/columns/cards/1478",
    "id": 1478,
    "node_id": "MDExOlByb2plY3RDYXJkMTQ3OA==",
    "note": "Add payload for delete Project column",
    "creator": {
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
    "created_at": "2016-09-05T14:21:06Z",
    "updated_at": "2016-09-05T14:20:22Z",
    "archived": false,
    "column_url": "https://api.github.com/projects/columns/367",
    "content_url": "https://api.github.com/repos/api-playground/projects-test/issues/3",
    "project_url": "https://api.github.com/projects/120"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumnsCards401ErrorException`](../../doc/models/projects-columns-cards-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumnsCards403ErrorException`](../../doc/models/projects-columns-cards-403-error-exception.md) |


# Projects Create-Card

Create a project card

API method documentation: [https://docs.github.com/rest/reference/projects#create-a-project-card](https://docs.github.com/rest/reference/projects#create-a-project-card)

```java
CompletableFuture<ProjectsColumnsCardsResponse> projectsCreateCardAsync(
    final int columnId,
    final ProjectsCreateCardBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `columnId` | `int` | Template, Required | The unique identifier of the column. |
| `body` | [`ProjectsCreateCardBody`]($m/ProjectsCreateCardBody) | Body, Required | - |

## Response Type

[`ProjectsColumnsCardsResponse`](../../doc/models/projects-columns-cards-response.md)

## Example Usage

```java
int columnId = 154;
ProjectsColumnsCardsRequest1 body = new ProjectsColumnsCardsRequest1();
body.setNote("Add payload for delete Project column");


ProjectsCreateCardBody bodyContainer = ProjectsCreateCardBody.fromProjectsColumnsCardsRequest1(body);

projectsController.projectsCreateCardAsync(columnId, bodyContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/projects/columns/cards/1478",
  "id": 1478,
  "node_id": "MDExOlByb2plY3RDYXJkMTQ3OA==",
  "note": "Add payload for delete Project column",
  "creator": {
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
  "created_at": "2016-09-05T14:21:06Z",
  "updated_at": "2016-09-05T14:20:22Z",
  "archived": false,
  "column_url": "https://api.github.com/projects/columns/367",
  "content_url": "https://api.github.com/repos/api-playground/projects-test/issues/3",
  "project_url": "https://api.github.com/projects/120"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumnsCards401ErrorException`](../../doc/models/projects-columns-cards-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumnsCards403ErrorException`](../../doc/models/projects-columns-cards-403-error-exception.md) |
| 422 | Validation failed | `ApiException` |
| 503 | Response | [`ProjectsColumnsCards503Error1Exception`](../../doc/models/projects-columns-cards-503-error-1-exception.md) |


# Projects Move-Column

Move a project column

API method documentation: [https://docs.github.com/rest/reference/projects#move-a-project-column](https://docs.github.com/rest/reference/projects#move-a-project-column)

```java
CompletableFuture<Object> projectsMoveColumnAsync(
    final int columnId,
    final ProjectsColumnsMovesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `columnId` | `int` | Template, Required | The unique identifier of the column. |
| `body` | [`ProjectsColumnsMovesRequest`](../../doc/models/projects-columns-moves-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
int columnId = 154;
ProjectsColumnsMovesRequest body = new ProjectsColumnsMovesRequest();
body.setPosition("last");

projectsController.projectsMoveColumnAsync(columnId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumnsMoves401ErrorException`](../../doc/models/projects-columns-moves-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumnsMoves403ErrorException`](../../doc/models/projects-columns-moves-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsColumnsMoves422ErrorException`](../../doc/models/projects-columns-moves-422-error-exception.md) |


# Projects Get

Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.

API method documentation: [https://docs.github.com/rest/reference/projects#get-a-project](https://docs.github.com/rest/reference/projects#get-a-project)

```java
CompletableFuture<ProjectsResponse> projectsGetAsync(
    final int projectId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |

## Response Type

[`ProjectsResponse`](../../doc/models/projects-response.md)

## Example Usage

```java
int projectId = 160;

projectsController.projectsGetAsync(projectId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "owner_url": "https://api.github.com/repos/api-playground/projects-test",
  "url": "https://api.github.com/projects/1002604",
  "html_url": "https://github.com/api-playground/projects-test/projects/1",
  "columns_url": "https://api.github.com/projects/1002604/columns",
  "id": 1002604,
  "node_id": "MDc6UHJvamVjdDEwMDI2MDQ=",
  "name": "Projects Documentation",
  "body": "Developer documentation project for the developer site.",
  "number": 1,
  "state": "open",
  "creator": {
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
  "created_at": "2011-04-10T20:09:31Z",
  "updated_at": "2014-03-03T18:58:10Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`Projects401ErrorException`](../../doc/models/projects-401-error-exception.md) |
| 403 | Forbidden | [`Projects403ErrorException`](../../doc/models/projects-403-error-exception.md) |


# Projects Update

Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.

API method documentation: [https://docs.github.com/rest/reference/projects#update-a-project](https://docs.github.com/rest/reference/projects#update-a-project)

```java
CompletableFuture<ProjectsResponse> projectsUpdateAsync(
    final int projectId,
    final ProjectsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `body` | [`ProjectsRequest`](../../doc/models/projects-request.md) | Body, Optional | - |

## Response Type

[`ProjectsResponse`](../../doc/models/projects-response.md)

## Example Usage

```java
int projectId = 160;
ProjectsRequest body = new ProjectsRequest();
body.setName("Week One Sprint");
body.setState("open");
body.setOrganizationPermission(OrganizationPermission1Enum.WRITE);

projectsController.projectsUpdateAsync(projectId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "owner_url": "https://api.github.com/repos/api-playground/projects-test",
  "url": "https://api.github.com/projects/1002604",
  "html_url": "https://github.com/api-playground/projects-test/projects/1",
  "columns_url": "https://api.github.com/projects/1002604/columns",
  "id": 1002604,
  "node_id": "MDc6UHJvamVjdDEwMDI2MDQ=",
  "name": "Projects Documentation",
  "body": "Developer documentation project for the developer site.",
  "number": 1,
  "state": "open",
  "creator": {
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
  "created_at": "2011-04-10T20:09:31Z",
  "updated_at": "2014-03-03T18:58:10Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`Projects401ErrorException`](../../doc/models/projects-401-error-exception.md) |
| 403 | Forbidden | [`Projects403Error1Exception`](../../doc/models/projects-403-error-1-exception.md) |
| 404 | Not Found if the authenticated user does not have access to the project | `ApiException` |
| 410 | Gone | [`Projects410ErrorException`](../../doc/models/projects-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Projects422ErrorException`](../../doc/models/projects-422-error-exception.md) |


# Projects Delete

Deletes a project board. Returns a `404 Not Found` status if projects are disabled.

API method documentation: [https://docs.github.com/rest/reference/projects#delete-a-project](https://docs.github.com/rest/reference/projects#delete-a-project)

```java
CompletableFuture<Void> projectsDeleteAsync(
    final int projectId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |

## Response Type

`void`

## Example Usage

```java
int projectId = 160;

projectsController.projectsDeleteAsync(projectId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`Projects401ErrorException`](../../doc/models/projects-401-error-exception.md) |
| 403 | Forbidden | [`Projects403Error1Exception`](../../doc/models/projects-403-error-1-exception.md) |
| 404 | Resource not found | [`Projects404ErrorException`](../../doc/models/projects-404-error-exception.md) |
| 410 | Gone | [`Projects410ErrorException`](../../doc/models/projects-410-error-exception.md) |


# Projects List-Collaborators

Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.

API method documentation: [https://docs.github.com/rest/reference/projects#list-project-collaborators](https://docs.github.com/rest/reference/projects#list-project-collaborators)

```java
CompletableFuture<List<SimpleUser>> projectsListCollaboratorsAsync(
    final int projectId,
    final Affiliation1Enum affiliation,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `affiliation` | [`Affiliation1Enum`](../../doc/models/affiliation-1-enum.md) | Query, Optional | Filters the collaborators by their affiliation. `outside` means outside collaborators of a project that are not a member of the project's organization. `direct` means collaborators with permissions to a project, regardless of organization membership status. `all` means all collaborators the authenticated user can see. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
int projectId = 160;
Integer perPage = 30;
Integer page = 1;

projectsController.projectsListCollaboratorsAsync(projectId, null, perPage, page).thenAccept(result -> {
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
| 401 | Requires authentication | [`ProjectsCollaborators401ErrorException`](../../doc/models/projects-collaborators-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsCollaborators403ErrorException`](../../doc/models/projects-collaborators-403-error-exception.md) |
| 404 | Resource not found | [`ProjectsCollaborators404ErrorException`](../../doc/models/projects-collaborators-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsCollaborators422ErrorException`](../../doc/models/projects-collaborators-422-error-exception.md) |


# Projects Add-Collaborator

Adds a collaborator to an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.

API method documentation: [https://docs.github.com/rest/reference/projects#add-project-collaborator](https://docs.github.com/rest/reference/projects#add-project-collaborator)

```java
CompletableFuture<Void> projectsAddCollaboratorAsync(
    final int projectId,
    final String username,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `body` | `Object` | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
int projectId = 160;
String username = "username0";
Object body = com.github.api.ApiHelper.deserialize("{\"permission\":\"write\"}");

projectsController.projectsAddCollaboratorAsync(projectId, username, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsCollaborators401ErrorException`](../../doc/models/projects-collaborators-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsCollaborators403ErrorException`](../../doc/models/projects-collaborators-403-error-exception.md) |
| 404 | Resource not found | [`ProjectsCollaborators404ErrorException`](../../doc/models/projects-collaborators-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsCollaborators422ErrorException`](../../doc/models/projects-collaborators-422-error-exception.md) |


# Projects Remove-Collaborator

Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.

API method documentation: [https://docs.github.com/rest/reference/projects#remove-project-collaborator](https://docs.github.com/rest/reference/projects#remove-project-collaborator)

```java
CompletableFuture<Void> projectsRemoveCollaboratorAsync(
    final int projectId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
int projectId = 160;
String username = "username0";

projectsController.projectsRemoveCollaboratorAsync(projectId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsCollaborators401ErrorException`](../../doc/models/projects-collaborators-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsCollaborators403ErrorException`](../../doc/models/projects-collaborators-403-error-exception.md) |
| 404 | Resource not found | [`ProjectsCollaborators404ErrorException`](../../doc/models/projects-collaborators-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsCollaborators422ErrorException`](../../doc/models/projects-collaborators-422-error-exception.md) |


# Projects Get-Permission-for-User

Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.

API method documentation: [https://docs.github.com/rest/reference/projects#get-project-permission-for-a-user](https://docs.github.com/rest/reference/projects#get-project-permission-for-a-user)

```java
CompletableFuture<ProjectsCollaboratorsPermissionResponse> projectsGetPermissionForUserAsync(
    final int projectId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`ProjectsCollaboratorsPermissionResponse`](../../doc/models/projects-collaborators-permission-response.md)

## Example Usage

```java
int projectId = 160;
String username = "username0";

projectsController.projectsGetPermissionForUserAsync(projectId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "permission": "admin",
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
| 401 | Requires authentication | [`ProjectsCollaboratorsPermission401ErrorException`](../../doc/models/projects-collaborators-permission-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsCollaboratorsPermission403ErrorException`](../../doc/models/projects-collaborators-permission-403-error-exception.md) |
| 404 | Resource not found | [`ProjectsCollaboratorsPermission404ErrorException`](../../doc/models/projects-collaborators-permission-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsCollaboratorsPermission422ErrorException`](../../doc/models/projects-collaborators-permission-422-error-exception.md) |


# Projects List-Columns

List project columns

API method documentation: [https://docs.github.com/rest/reference/projects#list-project-columns](https://docs.github.com/rest/reference/projects#list-project-columns)

```java
CompletableFuture<List<ProjectColumn>> projectsListColumnsAsync(
    final int projectId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<ProjectColumn>`](../../doc/models/project-column.md)

## Example Usage

```java
int projectId = 160;
Integer perPage = 30;
Integer page = 1;

projectsController.projectsListColumnsAsync(projectId, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/projects/columns/367",
    "project_url": "https://api.github.com/projects/120",
    "cards_url": "https://api.github.com/projects/columns/367/cards",
    "id": 367,
    "node_id": "MDEzOlByb2plY3RDb2x1bW4zNjc=",
    "name": "To Do",
    "created_at": "2016-09-05T14:18:44Z",
    "updated_at": "2016-09-05T14:22:28Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumns401ErrorException`](../../doc/models/projects-columns-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumns403ErrorException`](../../doc/models/projects-columns-403-error-exception.md) |


# Projects Create-Column

Create a project column

API method documentation: [https://docs.github.com/rest/reference/projects#create-a-project-column](https://docs.github.com/rest/reference/projects#create-a-project-column)

```java
CompletableFuture<ProjectsColumnsResponse> projectsCreateColumnAsync(
    final int projectId,
    final ProjectsColumnsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `body` | [`ProjectsColumnsRequest`](../../doc/models/projects-columns-request.md) | Body, Required | - |

## Response Type

[`ProjectsColumnsResponse`](../../doc/models/projects-columns-response.md)

## Example Usage

```java
int projectId = 160;
ProjectsColumnsRequest body = new ProjectsColumnsRequest();
body.setName("Remaining tasks");

projectsController.projectsCreateColumnAsync(projectId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/projects/columns/367",
  "project_url": "https://api.github.com/projects/120",
  "cards_url": "https://api.github.com/projects/columns/367/cards",
  "id": 367,
  "node_id": "MDEzOlByb2plY3RDb2x1bW4zNjc=",
  "name": "To Do",
  "created_at": "2016-09-05T14:18:44Z",
  "updated_at": "2016-09-05T14:22:28Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ProjectsColumns401ErrorException`](../../doc/models/projects-columns-401-error-exception.md) |
| 403 | Forbidden | [`ProjectsColumns403ErrorException`](../../doc/models/projects-columns-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ProjectsColumns422ErrorException`](../../doc/models/projects-columns-422-error-exception.md) |


# Projects List-for-Repo

Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.

API method documentation: [https://docs.github.com/rest/reference/projects#list-repository-projects](https://docs.github.com/rest/reference/projects#list-repository-projects)

```java
CompletableFuture<List<Project>> projectsListForRepoAsync(
    final String owner,
    final String repo,
    final State1676Enum state,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `state` | [`State1676Enum`](../../doc/models/state-1676-enum.md) | Query, Optional | Indicates the state of the projects to return. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Project>`](../../doc/models/project.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

projectsController.projectsListForRepoAsync(owner, repo, null, perPage, page).thenAccept(result -> {
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
    "owner_url": "https://api.github.com/repos/api-playground/projects-test",
    "url": "https://api.github.com/projects/1002604",
    "html_url": "https://github.com/api-playground/projects-test/projects/1",
    "columns_url": "https://api.github.com/projects/1002604/columns",
    "id": 1002604,
    "node_id": "MDc6UHJvamVjdDEwMDI2MDQ=",
    "name": "Projects Documentation",
    "body": "Developer documentation project for the developer site.",
    "number": 1,
    "state": "open",
    "creator": {
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
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ReposProjects401ErrorException`](../../doc/models/repos-projects-401-error-exception.md) |
| 403 | Forbidden | [`ReposProjects403ErrorException`](../../doc/models/repos-projects-403-error-exception.md) |
| 404 | Resource not found | [`ReposProjects404ErrorException`](../../doc/models/repos-projects-404-error-exception.md) |
| 410 | Gone | [`ReposProjects410ErrorException`](../../doc/models/repos-projects-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposProjects422ErrorException`](../../doc/models/repos-projects-422-error-exception.md) |


# Projects Create-for-Repo

Creates a repository project board. Returns a `410 Gone` status if projects are disabled in the repository or if the repository does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.

API method documentation: [https://docs.github.com/rest/reference/projects#create-a-repository-project](https://docs.github.com/rest/reference/projects#create-a-repository-project)

```java
CompletableFuture<ReposProjectsResponse> projectsCreateForRepoAsync(
    final String owner,
    final String repo,
    final OrgsProjectsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`OrgsProjectsRequest`](../../doc/models/orgs-projects-request.md) | Body, Required | - |

## Response Type

[`ReposProjectsResponse`](../../doc/models/repos-projects-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
OrgsProjectsRequest body = new OrgsProjectsRequest();
body.setName("Projects Documentation");
body.setBody("Developer documentation project for the developer site.");

projectsController.projectsCreateForRepoAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "owner_url": "https://api.github.com/repos/api-playground/projects-test",
  "url": "https://api.github.com/projects/1002604",
  "html_url": "https://github.com/api-playground/projects-test/projects/1",
  "columns_url": "https://api.github.com/projects/1002604/columns",
  "id": 1002604,
  "node_id": "MDc6UHJvamVjdDEwMDI2MDQ=",
  "name": "Projects Documentation",
  "body": "Developer documentation project for the developer site.",
  "number": 1,
  "state": "open",
  "creator": {
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
  "created_at": "2011-04-10T20:09:31Z",
  "updated_at": "2014-03-03T18:58:10Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ReposProjects401ErrorException`](../../doc/models/repos-projects-401-error-exception.md) |
| 403 | Forbidden | [`ReposProjects403ErrorException`](../../doc/models/repos-projects-403-error-exception.md) |
| 404 | Resource not found | [`ReposProjects404ErrorException`](../../doc/models/repos-projects-404-error-exception.md) |
| 410 | Gone | [`ReposProjects410ErrorException`](../../doc/models/repos-projects-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposProjects422ErrorException`](../../doc/models/repos-projects-422-error-exception.md) |


# Projects Create-for-Authenticated-User

Creates a user project board. Returns a `410 Gone` status if the user does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.

API method documentation: [https://docs.github.com/rest/reference/projects#create-a-user-project](https://docs.github.com/rest/reference/projects#create-a-user-project)

```java
CompletableFuture<UserProjectsResponse> projectsCreateForAuthenticatedUserAsync(
    final UserProjectsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserProjectsRequest`](../../doc/models/user-projects-request.md) | Body, Required | - |

## Response Type

[`UserProjectsResponse`](../../doc/models/user-projects-response.md)

## Example Usage

```java
UserProjectsRequest body = new UserProjectsRequest();
body.setName("My Projects");
body.setBody("A board to manage my personal projects.");

projectsController.projectsCreateForAuthenticatedUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "owner_url": "https://api.github.com/users/octocat",
  "url": "https://api.github.com/projects/1002603",
  "html_url": "https://github.com/users/octocat/projects/1",
  "columns_url": "https://api.github.com/projects/1002603/columns",
  "id": 1002603,
  "node_id": "MDc6UHJvamVjdDEwMDI2MDM=",
  "name": "My Projects",
  "body": "A board to manage my personal projects.",
  "number": 1,
  "state": "open",
  "creator": {
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
  "created_at": "2011-04-10T20:09:31Z",
  "updated_at": "2014-03-03T18:58:10Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserProjects401ErrorException`](../../doc/models/user-projects-401-error-exception.md) |
| 403 | Forbidden | [`UserProjects403ErrorException`](../../doc/models/user-projects-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserProjects422ErrorException`](../../doc/models/user-projects-422-error-exception.md) |


# Projects List-for-User

List user projects

API method documentation: [https://docs.github.com/rest/reference/projects#list-user-projects](https://docs.github.com/rest/reference/projects#list-user-projects)

```java
CompletableFuture<List<Project>> projectsListForUserAsync(
    final String username,
    final State1676Enum state,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `state` | [`State1676Enum`](../../doc/models/state-1676-enum.md) | Query, Optional | Indicates the state of the projects to return. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Project>`](../../doc/models/project.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

projectsController.projectsListForUserAsync(username, null, perPage, page).thenAccept(result -> {
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
    "owner_url": "https://api.github.com/users/octocat",
    "url": "https://api.github.com/projects/1002603",
    "html_url": "https://github.com/users/octocat/projects/1",
    "columns_url": "https://api.github.com/projects/1002603/columns",
    "id": 1002603,
    "node_id": "MDc6UHJvamVjdDEwMDI2MDM=",
    "name": "My Projects",
    "body": "A board to manage my personal projects.",
    "number": 1,
    "state": "open",
    "creator": {
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
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`UsersProjects422ErrorException`](../../doc/models/users-projects-422-error-exception.md) |

