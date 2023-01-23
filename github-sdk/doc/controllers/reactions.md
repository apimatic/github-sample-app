# Reactions

Interact with reactions to various GitHub entities.

```java
ReactionsController reactionsController = client.getReactionsController();
```

## Class Name

`ReactionsController`

## Methods

* [Reactions List-for-Team-Discussion-Comment-in-Org](../../doc/controllers/reactions.md#reactions-list-for-team-discussion-comment-in-org)
* [Reactions Create-for-Team-Discussion-Comment-in-Org](../../doc/controllers/reactions.md#reactions-create-for-team-discussion-comment-in-org)
* [Reactions Delete-for-Team-Discussion-Comment](../../doc/controllers/reactions.md#reactions-delete-for-team-discussion-comment)
* [Reactions List-for-Team-Discussion-in-Org](../../doc/controllers/reactions.md#reactions-list-for-team-discussion-in-org)
* [Reactions Create-for-Team-Discussion-in-Org](../../doc/controllers/reactions.md#reactions-create-for-team-discussion-in-org)
* [Reactions Delete-for-Team-Discussion](../../doc/controllers/reactions.md#reactions-delete-for-team-discussion)
* [Reactions List-for-Commit-Comment](../../doc/controllers/reactions.md#reactions-list-for-commit-comment)
* [Reactions Create-for-Commit-Comment](../../doc/controllers/reactions.md#reactions-create-for-commit-comment)
* [Reactions Delete-for-Commit-Comment](../../doc/controllers/reactions.md#reactions-delete-for-commit-comment)
* [Reactions List-for-Issue-Comment](../../doc/controllers/reactions.md#reactions-list-for-issue-comment)
* [Reactions Create-for-Issue-Comment](../../doc/controllers/reactions.md#reactions-create-for-issue-comment)
* [Reactions Delete-for-Issue-Comment](../../doc/controllers/reactions.md#reactions-delete-for-issue-comment)
* [Reactions List-for-Issue](../../doc/controllers/reactions.md#reactions-list-for-issue)
* [Reactions Create-for-Issue](../../doc/controllers/reactions.md#reactions-create-for-issue)
* [Reactions Delete-for-Issue](../../doc/controllers/reactions.md#reactions-delete-for-issue)
* [Reactions List-for-Pull-Request-Review-Comment](../../doc/controllers/reactions.md#reactions-list-for-pull-request-review-comment)
* [Reactions Create-for-Pull-Request-Review-Comment](../../doc/controllers/reactions.md#reactions-create-for-pull-request-review-comment)
* [Reactions Delete-for-Pull-Request-Comment](../../doc/controllers/reactions.md#reactions-delete-for-pull-request-comment)
* [Reactions List-for-Release](../../doc/controllers/reactions.md#reactions-list-for-release)
* [Reactions Create-for-Release](../../doc/controllers/reactions.md#reactions-create-for-release)
* [Reactions Delete-for-Release](../../doc/controllers/reactions.md#reactions-delete-for-release)
* [Reactions List-for-Team-Discussion-Comment-Legacy](../../doc/controllers/reactions.md#reactions-list-for-team-discussion-comment-legacy)
* [Reactions Create-for-Team-Discussion-Comment-Legacy](../../doc/controllers/reactions.md#reactions-create-for-team-discussion-comment-legacy)
* [Reactions List-for-Team-Discussion-Legacy](../../doc/controllers/reactions.md#reactions-list-for-team-discussion-legacy)
* [Reactions Create-for-Team-Discussion-Legacy](../../doc/controllers/reactions.md#reactions-create-for-team-discussion-legacy)


# Reactions List-for-Team-Discussion-Comment-in-Org

List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments/). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.

API method documentation: [https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion-comment](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion-comment)

```java
CompletableFuture<List<Reaction>> reactionsListForTeamDiscussionCommentInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final int commentNumber,
    final Content21Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |
| `content` | [`Content21Enum`](../../doc/models/content-21-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a team discussion comment. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
int commentNumber = 214;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForTeamDiscussionCommentInOrgAsync(org, teamSlug, discussionNumber, commentNumber, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```


# Reactions Create-for-Team-Discussion-Comment-in-Org

Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion comment.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions`.

API method documentation: [https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion-comment](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion-comment)

```java
CompletableFuture<OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsResponse> reactionsCreateForTeamDiscussionCommentInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final int commentNumber,
    final OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-reactions-request.md) | Body, Required | - |

## Response Type

[`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsResponse`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-reactions-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
int commentNumber = 214;
OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest body = new OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest();
body.setContent(Content3Enum.HEART);

reactionsController.reactionsCreateForTeamDiscussionCommentInOrgAsync(org, teamSlug, discussionNumber, commentNumber, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```


# Reactions Delete-for-Team-Discussion-Comment

**Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/comments/:comment_number/reactions/:reaction_id`.

Delete a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/reactions#delete-team-discussion-comment-reaction](https://docs.github.com/rest/reference/reactions#delete-team-discussion-comment-reaction)

```java
CompletableFuture<Void> reactionsDeleteForTeamDiscussionCommentAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final int commentNumber,
    final int reactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |
| `reactionId` | `int` | Template, Required | The unique identifier of the reaction. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
int commentNumber = 214;
int reactionId = 16;

reactionsController.reactionsDeleteForTeamDiscussionCommentAsync(org, teamSlug, discussionNumber, commentNumber, reactionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reactions List-for-Team-Discussion-in-Org

List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.

API method documentation: [https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion)

```java
CompletableFuture<List<Reaction>> reactionsListForTeamDiscussionInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final Content22Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `content` | [`Content22Enum`](../../doc/models/content-22-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a team discussion. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForTeamDiscussionInOrgAsync(org, teamSlug, discussionNumber, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```


# Reactions Create-for-Team-Discussion-in-Org

Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions`.

API method documentation: [https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion)

```java
CompletableFuture<OrgsTeamsDiscussionsDiscussionNumberReactionsResponse> reactionsCreateForTeamDiscussionInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final OrgsTeamsDiscussionsDiscussionNumberReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberReactionsRequest`](../../doc/models/orgs-teams-discussions-discussion-number-reactions-request.md) | Body, Required | - |

## Response Type

[`OrgsTeamsDiscussionsDiscussionNumberReactionsResponse`](../../doc/models/orgs-teams-discussions-discussion-number-reactions-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
OrgsTeamsDiscussionsDiscussionNumberReactionsRequest body = new OrgsTeamsDiscussionsDiscussionNumberReactionsRequest();
body.setContent(Content5Enum.HEART);

reactionsController.reactionsCreateForTeamDiscussionInOrgAsync(org, teamSlug, discussionNumber, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```


# Reactions Delete-for-Team-Discussion

**Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id`.

Delete a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/reactions#delete-team-discussion-reaction](https://docs.github.com/rest/reference/reactions#delete-team-discussion-reaction)

```java
CompletableFuture<Void> reactionsDeleteForTeamDiscussionAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final int reactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `reactionId` | `int` | Template, Required | The unique identifier of the reaction. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
int reactionId = 16;

reactionsController.reactionsDeleteForTeamDiscussionAsync(org, teamSlug, discussionNumber, reactionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reactions List-for-Commit-Comment

List the reactions to a [commit comment](https://docs.github.com/rest/reference/repos#comments).

API method documentation: [https://docs.github.com/rest/reference/reactions#list-reactions-for-a-commit-comment](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-commit-comment)

```java
CompletableFuture<List<Reaction>> reactionsListForCommitCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final Content23Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `content` | [`Content23Enum`](../../doc/models/content-23-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a commit comment. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForCommitCommentAsync(owner, repo, commentId, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposCommentsCommentIdReactions404ErrorException`](../../doc/models/repos-comments-comment-id-reactions-404-error-exception.md) |


# Reactions Create-for-Commit-Comment

Create a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments). A response with an HTTP `200` status means that you already added the reaction type to this commit comment.

API method documentation: [https://docs.github.com/rest/reference/reactions#create-reaction-for-a-commit-comment](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-commit-comment)

```java
CompletableFuture<ReposCommentsCommentIdReactionsResponse> reactionsCreateForCommitCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final ReposCommentsCommentIdReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `body` | [`ReposCommentsCommentIdReactionsRequest`](../../doc/models/repos-comments-comment-id-reactions-request.md) | Body, Required | - |

## Response Type

[`ReposCommentsCommentIdReactionsResponse`](../../doc/models/repos-comments-comment-id-reactions-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
ReposCommentsCommentIdReactionsRequest body = new ReposCommentsCommentIdReactionsRequest();
body.setContent(Content7Enum.HEART);

reactionsController.reactionsCreateForCommitCommentAsync(owner, repo, commentId, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposCommentsCommentIdReactions422ErrorException`](../../doc/models/repos-comments-comment-id-reactions-422-error-exception.md) |


# Reactions Delete-for-Commit-Comment

**Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/comments/:comment_id/reactions/:reaction_id`.

Delete a reaction to a [commit comment](https://docs.github.com/rest/reference/repos#comments).

API method documentation: [https://docs.github.com/rest/reference/reactions#delete-a-commit-comment-reaction](https://docs.github.com/rest/reference/reactions#delete-a-commit-comment-reaction)

```java
CompletableFuture<Void> reactionsDeleteForCommitCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final int reactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `reactionId` | `int` | Template, Required | The unique identifier of the reaction. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
int reactionId = 16;

reactionsController.reactionsDeleteForCommitCommentAsync(owner, repo, commentId, reactionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reactions List-for-Issue-Comment

List the reactions to an [issue comment](https://docs.github.com/rest/reference/issues#comments).

API method documentation: [https://docs.github.com/rest/reference/reactions#list-reactions-for-an-issue-comment](https://docs.github.com/rest/reference/reactions#list-reactions-for-an-issue-comment)

```java
CompletableFuture<List<Reaction>> reactionsListForIssueCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final Content24Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `content` | [`Content24Enum`](../../doc/models/content-24-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to an issue comment. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForIssueCommentAsync(owner, repo, commentId, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesCommentsCommentIdReactions404ErrorException`](../../doc/models/repos-issues-comments-comment-id-reactions-404-error-exception.md) |


# Reactions Create-for-Issue-Comment

Create a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments). A response with an HTTP `200` status means that you already added the reaction type to this issue comment.

API method documentation: [https://docs.github.com/rest/reference/reactions#create-reaction-for-an-issue-comment](https://docs.github.com/rest/reference/reactions#create-reaction-for-an-issue-comment)

```java
CompletableFuture<ReposIssuesCommentsCommentIdReactionsResponse> reactionsCreateForIssueCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final ReposIssuesCommentsCommentIdReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `body` | [`ReposIssuesCommentsCommentIdReactionsRequest`](../../doc/models/repos-issues-comments-comment-id-reactions-request.md) | Body, Required | - |

## Response Type

[`ReposIssuesCommentsCommentIdReactionsResponse`](../../doc/models/repos-issues-comments-comment-id-reactions-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
ReposIssuesCommentsCommentIdReactionsRequest body = new ReposIssuesCommentsCommentIdReactionsRequest();
body.setContent(Content9Enum.HEART);

reactionsController.reactionsCreateForIssueCommentAsync(owner, repo, commentId, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesCommentsCommentIdReactions422ErrorException`](../../doc/models/repos-issues-comments-comment-id-reactions-422-error-exception.md) |


# Reactions Delete-for-Issue-Comment

**Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/issues/comments/:comment_id/reactions/:reaction_id`.

Delete a reaction to an [issue comment](https://docs.github.com/rest/reference/issues#comments).

API method documentation: [https://docs.github.com/rest/reference/reactions#delete-an-issue-comment-reaction](https://docs.github.com/rest/reference/reactions#delete-an-issue-comment-reaction)

```java
CompletableFuture<Void> reactionsDeleteForIssueCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final int reactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `reactionId` | `int` | Template, Required | The unique identifier of the reaction. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
int reactionId = 16;

reactionsController.reactionsDeleteForIssueCommentAsync(owner, repo, commentId, reactionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reactions List-for-Issue

List the reactions to an [issue](https://docs.github.com/rest/reference/issues).

API method documentation: [https://docs.github.com/rest/reference/reactions#list-reactions-for-an-issue](https://docs.github.com/rest/reference/reactions#list-reactions-for-an-issue)

```java
CompletableFuture<List<Reaction>> reactionsListForIssueAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final Content25Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `content` | [`Content25Enum`](../../doc/models/content-25-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to an issue. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForIssueAsync(owner, repo, issueNumber, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberReactions404ErrorException`](../../doc/models/repos-issues-issue-number-reactions-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberReactions410ErrorException`](../../doc/models/repos-issues-issue-number-reactions-410-error-exception.md) |


# Reactions Create-for-Issue

Create a reaction to an [issue](https://docs.github.com/rest/reference/issues/). A response with an HTTP `200` status means that you already added the reaction type to this issue.

API method documentation: [https://docs.github.com/rest/reference/reactions#create-reaction-for-an-issue](https://docs.github.com/rest/reference/reactions#create-reaction-for-an-issue)

```java
CompletableFuture<ReposIssuesIssueNumberReactionsResponse> reactionsCreateForIssueAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final ReposIssuesIssueNumberReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `body` | [`ReposIssuesIssueNumberReactionsRequest`](../../doc/models/repos-issues-issue-number-reactions-request.md) | Body, Required | - |

## Response Type

[`ReposIssuesIssueNumberReactionsResponse`](../../doc/models/repos-issues-issue-number-reactions-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
ReposIssuesIssueNumberReactionsRequest body = new ReposIssuesIssueNumberReactionsRequest();
body.setContent(Content11Enum.HEART);

reactionsController.reactionsCreateForIssueAsync(owner, repo, issueNumber, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesIssueNumberReactions422ErrorException`](../../doc/models/repos-issues-issue-number-reactions-422-error-exception.md) |


# Reactions Delete-for-Issue

**Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/issues/:issue_number/reactions/:reaction_id`.

Delete a reaction to an [issue](https://docs.github.com/rest/reference/issues/).

API method documentation: [https://docs.github.com/rest/reference/reactions#delete-an-issue-reaction](https://docs.github.com/rest/reference/reactions#delete-an-issue-reaction)

```java
CompletableFuture<Void> reactionsDeleteForIssueAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final int reactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `reactionId` | `int` | Template, Required | The unique identifier of the reaction. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
int reactionId = 16;

reactionsController.reactionsDeleteForIssueAsync(owner, repo, issueNumber, reactionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reactions List-for-Pull-Request-Review-Comment

List the reactions to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).

API method documentation: [https://docs.github.com/rest/reference/reactions#list-reactions-for-a-pull-request-review-comment](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-pull-request-review-comment)

```java
CompletableFuture<List<Reaction>> reactionsListForPullRequestReviewCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final Content27Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `content` | [`Content27Enum`](../../doc/models/content-27-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a pull request review comment. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForPullRequestReviewCommentAsync(owner, repo, commentId, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposPullsCommentsCommentIdReactions404ErrorException`](../../doc/models/repos-pulls-comments-comment-id-reactions-404-error-exception.md) |


# Reactions Create-for-Pull-Request-Review-Comment

Create a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#comments). A response with an HTTP `200` status means that you already added the reaction type to this pull request review comment.

API method documentation: [https://docs.github.com/rest/reference/reactions#create-reaction-for-a-pull-request-review-comment](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-pull-request-review-comment)

```java
CompletableFuture<ReposPullsCommentsCommentIdReactionsResponse> reactionsCreateForPullRequestReviewCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final ReposPullsCommentsCommentIdReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `body` | [`ReposPullsCommentsCommentIdReactionsRequest`](../../doc/models/repos-pulls-comments-comment-id-reactions-request.md) | Body, Required | - |

## Response Type

[`ReposPullsCommentsCommentIdReactionsResponse`](../../doc/models/repos-pulls-comments-comment-id-reactions-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
ReposPullsCommentsCommentIdReactionsRequest body = new ReposPullsCommentsCommentIdReactionsRequest();
body.setContent(Content13Enum.HEART);

reactionsController.reactionsCreateForPullRequestReviewCommentAsync(owner, repo, commentId, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposPullsCommentsCommentIdReactions422ErrorException`](../../doc/models/repos-pulls-comments-comment-id-reactions-422-error-exception.md) |


# Reactions Delete-for-Pull-Request-Comment

**Note:** You can also specify a repository by `repository_id` using the route `DELETE /repositories/:repository_id/pulls/comments/:comment_id/reactions/:reaction_id.`

Delete a reaction to a [pull request review comment](https://docs.github.com/rest/reference/pulls#review-comments).

API method documentation: [https://docs.github.com/rest/reference/reactions#delete-a-pull-request-comment-reaction](https://docs.github.com/rest/reference/reactions#delete-a-pull-request-comment-reaction)

```java
CompletableFuture<Void> reactionsDeleteForPullRequestCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final int reactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `reactionId` | `int` | Template, Required | The unique identifier of the reaction. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
int reactionId = 16;

reactionsController.reactionsDeleteForPullRequestCommentAsync(owner, repo, commentId, reactionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reactions List-for-Release

List the reactions to a [release](https://docs.github.com/rest/reference/repos#releases).

API method documentation: [https://docs.github.com/rest/reference/reactions/#list-reactions-for-a-release](https://docs.github.com/rest/reference/reactions/#list-reactions-for-a-release)

```java
CompletableFuture<List<Reaction>> reactionsListForReleaseAsync(
    final String owner,
    final String repo,
    final int releaseId,
    final Content141Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `releaseId` | `int` | Template, Required | The unique identifier of the release. |
| `content` | [`Content141Enum`](../../doc/models/content-141-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a release. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int releaseId = 96;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForReleaseAsync(owner, repo, releaseId, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposReleasesReleaseIdReactions404ErrorException`](../../doc/models/repos-releases-release-id-reactions-404-error-exception.md) |


# Reactions Create-for-Release

Create a reaction to a [release](https://docs.github.com/rest/reference/repos#releases). A response with a `Status: 200 OK` means that you already added the reaction type to this release.

API method documentation: [https://docs.github.com/rest/reference/reactions/#create-reaction-for-a-release](https://docs.github.com/rest/reference/reactions/#create-reaction-for-a-release)

```java
CompletableFuture<ReposReleasesReleaseIdReactionsResponse> reactionsCreateForReleaseAsync(
    final String owner,
    final String repo,
    final int releaseId,
    final ReposReleasesReleaseIdReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `releaseId` | `int` | Template, Required | The unique identifier of the release. |
| `body` | [`ReposReleasesReleaseIdReactionsRequest`](../../doc/models/repos-releases-release-id-reactions-request.md) | Body, Required | - |

## Response Type

[`ReposReleasesReleaseIdReactionsResponse`](../../doc/models/repos-releases-release-id-reactions-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int releaseId = 96;
ReposReleasesReleaseIdReactionsRequest body = new ReposReleasesReleaseIdReactionsRequest();
body.setContent(Content15Enum.HEART);

reactionsController.reactionsCreateForReleaseAsync(owner, repo, releaseId, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposReleasesReleaseIdReactions422ErrorException`](../../doc/models/repos-releases-release-id-reactions-422-error-exception.md) |


# Reactions Delete-for-Release

**Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/releases/:release_id/reactions/:reaction_id`.

Delete a reaction to a [release](https://docs.github.com/rest/reference/repos#releases).

API method documentation: [https://docs.github.com/rest/reference/reactions/#delete-a-release-reaction](https://docs.github.com/rest/reference/reactions/#delete-a-release-reaction)

```java
CompletableFuture<Void> reactionsDeleteForReleaseAsync(
    final String owner,
    final String repo,
    final int releaseId,
    final int reactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `releaseId` | `int` | Template, Required | The unique identifier of the release. |
| `reactionId` | `int` | Template, Required | The unique identifier of the reaction. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int releaseId = 96;
int reactionId = 16;

reactionsController.reactionsDeleteForReleaseAsync(owner, repo, releaseId, reactionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Reactions List-for-Team-Discussion-Comment-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion comment`](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion-comment) endpoint.

List the reactions to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/reactions/#list-reactions-for-a-team-discussion-comment-legacy](https://docs.github.com/rest/reference/reactions/#list-reactions-for-a-team-discussion-comment-legacy)

```java
CompletableFuture<List<Reaction>> reactionsListForTeamDiscussionCommentLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final int commentNumber,
    final Content21Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |
| `content` | [`Content21Enum`](../../doc/models/content-21-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a team discussion comment. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
int commentNumber = 214;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForTeamDiscussionCommentLegacyAsync(teamId, discussionNumber, commentNumber, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```


# Reactions Create-for-Team-Discussion-Comment-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new "[Create reaction for a team discussion comment](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion-comment)" endpoint.

Create a reaction to a [team discussion comment](https://docs.github.com/rest/reference/teams#discussion-comments). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion comment.

API method documentation: [https://docs.github.com/rest/reference/reactions/#create-reaction-for-a-team-discussion-comment-legacy](https://docs.github.com/rest/reference/reactions/#create-reaction-for-a-team-discussion-comment-legacy)

```java
CompletableFuture<TeamsDiscussionsCommentsCommentNumberReactionsResponse> reactionsCreateForTeamDiscussionCommentLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final int commentNumber,
    final OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-reactions-request.md) | Body, Required | - |

## Response Type

[`TeamsDiscussionsCommentsCommentNumberReactionsResponse`](../../doc/models/teams-discussions-comments-comment-number-reactions-response.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
int commentNumber = 214;
OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest body = new OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberReactionsRequest();
body.setContent(Content3Enum.HEART);

reactionsController.reactionsCreateForTeamDiscussionCommentLegacyAsync(teamId, discussionNumber, commentNumber, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```


# Reactions List-for-Team-Discussion-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List reactions for a team discussion`](https://docs.github.com/rest/reference/reactions#list-reactions-for-a-team-discussion) endpoint.

List the reactions to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/reactions/#list-reactions-for-a-team-discussion-legacy](https://docs.github.com/rest/reference/reactions/#list-reactions-for-a-team-discussion-legacy)

```java
CompletableFuture<List<Reaction>> reactionsListForTeamDiscussionLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final Content22Enum content,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `content` | [`Content22Enum`](../../doc/models/content-22-enum.md) | Query, Optional | Returns a single [reaction type](https://docs.github.com/rest/reference/reactions#reaction-types). Omit this parameter to list all reactions to a team discussion. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Reaction>`](../../doc/models/reaction.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
Integer perPage = 30;
Integer page = 1;

reactionsController.reactionsListForTeamDiscussionLegacyAsync(teamId, discussionNumber, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDg6UmVhY3Rpb24x",
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
    "content": "heart",
    "created_at": "2016-05-20T20:09:31Z"
  }
]
```


# Reactions Create-for-Team-Discussion-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create reaction for a team discussion`](https://docs.github.com/rest/reference/reactions#create-reaction-for-a-team-discussion) endpoint.

Create a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/). A response with an HTTP `200` status means that you already added the reaction type to this team discussion.

API method documentation: [https://docs.github.com/rest/reference/reactions/#create-reaction-for-a-team-discussion-legacy](https://docs.github.com/rest/reference/reactions/#create-reaction-for-a-team-discussion-legacy)

```java
CompletableFuture<TeamsDiscussionsReactionsResponse> reactionsCreateForTeamDiscussionLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final OrgsTeamsDiscussionsDiscussionNumberReactionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberReactionsRequest`](../../doc/models/orgs-teams-discussions-discussion-number-reactions-request.md) | Body, Required | - |

## Response Type

[`TeamsDiscussionsReactionsResponse`](../../doc/models/teams-discussions-reactions-response.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
OrgsTeamsDiscussionsDiscussionNumberReactionsRequest body = new OrgsTeamsDiscussionsDiscussionNumberReactionsRequest();
body.setContent(Content5Enum.HEART);

reactionsController.reactionsCreateForTeamDiscussionLegacyAsync(teamId, discussionNumber, body).thenAccept(result -> {
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
  "node_id": "MDg6UmVhY3Rpb24x",
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
  "content": "heart",
  "created_at": "2016-05-20T20:09:31Z"
}
```

