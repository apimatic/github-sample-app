# Activity

Activity APIs provide access to notifications, subscriptions, and timelines.

```java
ActivityController activityController = client.getActivityController();
```

## Class Name

`ActivityController`

## Methods

* [Activity List-Public-Events](../../doc/controllers/activity.md#activity-list-public-events)
* [Activity Get-Feeds](../../doc/controllers/activity.md#activity-get-feeds)
* [Activity List-Public-Events-for-Repo-Network](../../doc/controllers/activity.md#activity-list-public-events-for-repo-network)
* [Activity List-Notifications-for-Authenticated-User](../../doc/controllers/activity.md#activity-list-notifications-for-authenticated-user)
* [Activity Mark-Notifications-as-Read](../../doc/controllers/activity.md#activity-mark-notifications-as-read)
* [Activity Get-Thread](../../doc/controllers/activity.md#activity-get-thread)
* [Activity Mark-Thread-as-Read](../../doc/controllers/activity.md#activity-mark-thread-as-read)
* [Activity Get-Thread-Subscription-for-Authenticated-User](../../doc/controllers/activity.md#activity-get-thread-subscription-for-authenticated-user)
* [Activity Set-Thread-Subscription](../../doc/controllers/activity.md#activity-set-thread-subscription)
* [Activity Delete-Thread-Subscription](../../doc/controllers/activity.md#activity-delete-thread-subscription)
* [Activity List-Public-Org-Events](../../doc/controllers/activity.md#activity-list-public-org-events)
* [Activity List-Repo-Events](../../doc/controllers/activity.md#activity-list-repo-events)
* [Activity List-Repo-Notifications-for-Authenticated-User](../../doc/controllers/activity.md#activity-list-repo-notifications-for-authenticated-user)
* [Activity Mark-Repo-Notifications-as-Read](../../doc/controllers/activity.md#activity-mark-repo-notifications-as-read)
* [Activity List-Stargazers-for-Repo](../../doc/controllers/activity.md#activity-list-stargazers-for-repo)
* [Activity List-Watchers-for-Repo](../../doc/controllers/activity.md#activity-list-watchers-for-repo)
* [Activity Get-Repo-Subscription](../../doc/controllers/activity.md#activity-get-repo-subscription)
* [Activity Set-Repo-Subscription](../../doc/controllers/activity.md#activity-set-repo-subscription)
* [Activity Delete-Repo-Subscription](../../doc/controllers/activity.md#activity-delete-repo-subscription)
* [Activity List-Repos-Starred-by-Authenticated-User](../../doc/controllers/activity.md#activity-list-repos-starred-by-authenticated-user)
* [Activity Check-Repo-Is-Starred-by-Authenticated-User](../../doc/controllers/activity.md#activity-check-repo-is-starred-by-authenticated-user)
* [Activity Star-Repo-for-Authenticated-User](../../doc/controllers/activity.md#activity-star-repo-for-authenticated-user)
* [Activity Unstar-Repo-for-Authenticated-User](../../doc/controllers/activity.md#activity-unstar-repo-for-authenticated-user)
* [Activity List-Watched-Repos-for-Authenticated-User](../../doc/controllers/activity.md#activity-list-watched-repos-for-authenticated-user)
* [Activity List-Events-for-Authenticated-User](../../doc/controllers/activity.md#activity-list-events-for-authenticated-user)
* [Activity List-Org-Events-for-Authenticated-User](../../doc/controllers/activity.md#activity-list-org-events-for-authenticated-user)
* [Activity List-Public-Events-for-User](../../doc/controllers/activity.md#activity-list-public-events-for-user)
* [Activity List-Received-Events-for-User](../../doc/controllers/activity.md#activity-list-received-events-for-user)
* [Activity List-Received-Public-Events-for-User](../../doc/controllers/activity.md#activity-list-received-public-events-for-user)
* [Activity List-Repos-Starred-by-User](../../doc/controllers/activity.md#activity-list-repos-starred-by-user)
* [Activity List-Repos-Watched-by-User](../../doc/controllers/activity.md#activity-list-repos-watched-by-user)


# Activity List-Public-Events

We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago.

API method documentation: [https://docs.github.com/rest/reference/activity#list-public-events](https://docs.github.com/rest/reference/activity#list-public-events)

```java
CompletableFuture<List<Event>> activityListPublicEventsAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

activityController.activityListPublicEventsAsync(perPage, page).thenAccept(result -> {
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
    "id": "22249084947",
    "type": "WatchEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "action": "started"
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": true,
    "created_at": "2022-06-07T07:50:26Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Events403ErrorException`](../../doc/models/events-403-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Activity Get-Feeds

GitHub provides several timeline resources in [Atom](http://en.wikipedia.org/wiki/Atom_(standard)) format. The Feeds API lists all the feeds available to the authenticated user:

* **Timeline**: The GitHub global public timeline
* **User**: The public timeline for any user, using [URI template](https://docs.github.com/rest/overview/resources-in-the-rest-api#hypermedia)
* **Current user public**: The public timeline for the authenticated user
* **Current user**: The private timeline for the authenticated user
* **Current user actor**: The private timeline for activity created by the authenticated user
* **Current user organizations**: The private timeline for the organizations the authenticated user is a member of.
* **Security advisories**: A collection of public announcements that provide information about security-related vulnerabilities in software on GitHub.

**Note**: Private feeds are only returned when [authenticating via Basic Auth](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) since current feed URIs use the older, non revocable auth tokens.

API method documentation: [https://docs.github.com/rest/reference/activity#get-feeds](https://docs.github.com/rest/reference/activity#get-feeds)

```java
CompletableFuture<FeedsResponse> activityGetFeedsAsync()
```

## Response Type

[`FeedsResponse`](../../doc/models/feeds-response.md)

## Example Usage

```java
activityController.activityGetFeedsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "timeline_url": "https://github.com/timeline",
  "user_url": "https://github.com/{user}",
  "current_user_public_url": "https://github.com/octocat",
  "current_user_url": "https://github.com/octocat.private?token=abc123",
  "current_user_actor_url": "https://github.com/octocat.private.actor?token=abc123",
  "current_user_organization_url": "",
  "current_user_organization_urls": [
    "https://github.com/organizations/github/octocat.private.atom?token=abc123"
  ],
  "security_advisories_url": "https://github.com/security-advisories",
  "_links": {
    "timeline": {
      "href": "https://github.com/timeline",
      "type": "application/atom+xml"
    },
    "user": {
      "href": "https://github.com/{user}",
      "type": "application/atom+xml"
    },
    "current_user_public": {
      "href": "https://github.com/octocat",
      "type": "application/atom+xml"
    },
    "current_user": {
      "href": "https://github.com/octocat.private?token=abc123",
      "type": "application/atom+xml"
    },
    "current_user_actor": {
      "href": "https://github.com/octocat.private.actor?token=abc123",
      "type": "application/atom+xml"
    },
    "current_user_organization": {
      "href": "",
      "type": ""
    },
    "current_user_organizations": [
      {
        "href": "https://github.com/organizations/github/octocat.private.atom?token=abc123",
        "type": "application/atom+xml"
      }
    ],
    "security_advisories": {
      "href": "https://github.com/security-advisories",
      "type": "application/atom+xml"
    }
  }
}
```


# Activity List-Public-Events-for-Repo-Network

List public events for a network of repositories

API method documentation: [https://docs.github.com/rest/reference/activity#list-public-events-for-a-network-of-repositories](https://docs.github.com/rest/reference/activity#list-public-events-for-a-network-of-repositories)

```java
CompletableFuture<List<Event>> activityListPublicEventsForRepoNetworkAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

activityController.activityListPublicEventsForRepoNetworkAsync(owner, repo, perPage, page).thenAccept(result -> {
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
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22237752260",
    "type": "WatchEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/rrubenich",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "action": "started"
    },
    "public": true,
    "created_at": "2022-06-08T23:29:25Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`NetworksEvents403ErrorException`](../../doc/models/networks-events-403-error-exception.md) |
| 404 | Resource not found | [`NetworksEvents404ErrorException`](../../doc/models/networks-events-404-error-exception.md) |


# Activity List-Notifications-for-Authenticated-User

List all notifications for the current user, sorted by most recently updated.

API method documentation: [https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user)

```java
CompletableFuture<List<Thread>> activityListNotificationsForAuthenticatedUserAsync(
    final Boolean all,
    final Boolean participating,
    final LocalDateTime since,
    final LocalDateTime before,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `all` | `Boolean` | Query, Optional | If `true`, show notifications marked as read.<br>**Default**: `false` |
| `participating` | `Boolean` | Query, Optional | If `true`, only shows notifications in which the user is directly participating or mentioned.<br>**Default**: `false` |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `before` | `LocalDateTime` | Query, Optional | Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 50).<br>**Default**: `50` |

## Response Type

[`List<Thread>`](../../doc/models/thread.md)

## Example Usage

```java
Boolean all = false;
Boolean participating = false;
Integer page = 1;
Integer perPage = 50;

activityController.activityListNotificationsForAuthenticatedUserAsync(all, participating, null, null, page, perPage).thenAccept(result -> {
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
    "id": "1",
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
      "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
    },
    "subject": {
      "title": "Greetings",
      "url": "https://api.github.com/repos/octokit/octokit.rb/issues/123",
      "latest_comment_url": "https://api.github.com/repos/octokit/octokit.rb/issues/comments/123",
      "type": "Issue"
    },
    "reason": "subscribed",
    "unread": true,
    "updated_at": "2014-11-07T22:01:45Z",
    "last_read_at": "2014-11-07T22:01:45Z",
    "url": "https://api.github.com/notifications/threads/1",
    "subscription_url": "https://api.github.com/notifications/threads/1/subscription"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`Notifications401ErrorException`](../../doc/models/notifications-401-error-exception.md) |
| 403 | Forbidden | [`Notifications403ErrorException`](../../doc/models/notifications-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Notifications422ErrorException`](../../doc/models/notifications-422-error-exception.md) |


# Activity Mark-Notifications-as-Read

Marks all notifications as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.

API method documentation: [https://docs.github.com/rest/reference/activity#mark-notifications-as-read](https://docs.github.com/rest/reference/activity#mark-notifications-as-read)

```java
CompletableFuture<NotificationsResponse> activityMarkNotificationsAsReadAsync(
    final NotificationsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`NotificationsRequest`](../../doc/models/notifications-request.md) | Body, Optional | - |

## Response Type

[`NotificationsResponse`](../../doc/models/notifications-response.md)

## Example Usage

```java
NotificationsRequest body = new NotificationsRequest();
body.setLastReadAt(LocalDateTime.parse("2022-06-10T00:00:00Z", DateTimeFormatter.ISO_DATE_TIME));
body.setRead(true);

activityController.activityMarkNotificationsAsReadAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "message": "Unread notifications couldn't be marked in a single request. Notifications are being marked as read in the background."
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`Notifications401ErrorException`](../../doc/models/notifications-401-error-exception.md) |
| 403 | Forbidden | [`Notifications403ErrorException`](../../doc/models/notifications-403-error-exception.md) |


# Activity Get-Thread

Gets information about a notification thread.

API method documentation: [https://docs.github.com/rest/reference/activity#get-a-thread](https://docs.github.com/rest/reference/activity#get-a-thread)

```java
CompletableFuture<NotificationsThreadsResponse> activityGetThreadAsync(
    final int threadId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `threadId` | `int` | Template, Required | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user)). |

## Response Type

[`NotificationsThreadsResponse`](../../doc/models/notifications-threads-response.md)

## Example Usage

```java
int threadId = 198;

activityController.activityGetThreadAsync(threadId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "1",
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
    "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
  },
  "subject": {
    "title": "Greetings",
    "url": "https://api.github.com/repos/octokit/octokit.rb/issues/123",
    "latest_comment_url": "https://api.github.com/repos/octokit/octokit.rb/issues/comments/123",
    "type": "Issue"
  },
  "reason": "subscribed",
  "unread": true,
  "updated_at": "2014-11-07T22:01:45Z",
  "last_read_at": "2014-11-07T22:01:45Z",
  "url": "https://api.github.com/notifications/threads/1",
  "subscription_url": "https://api.github.com/notifications/threads/1/subscription"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`NotificationsThreads401ErrorException`](../../doc/models/notifications-threads-401-error-exception.md) |
| 403 | Forbidden | [`NotificationsThreads403ErrorException`](../../doc/models/notifications-threads-403-error-exception.md) |


# Activity Mark-Thread-as-Read

Marks a thread as "read." Marking a thread as "read" is equivalent to clicking a notification in your notification inbox on GitHub: https://github.com/notifications.

API method documentation: [https://docs.github.com/rest/reference/activity#mark-a-thread-as-read](https://docs.github.com/rest/reference/activity#mark-a-thread-as-read)

```java
CompletableFuture<Void> activityMarkThreadAsReadAsync(
    final int threadId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `threadId` | `int` | Template, Required | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user)). |

## Response Type

`void`

## Example Usage

```java
int threadId = 198;

activityController.activityMarkThreadAsReadAsync(threadId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`NotificationsThreads403ErrorException`](../../doc/models/notifications-threads-403-error-exception.md) |


# Activity Get-Thread-Subscription-for-Authenticated-User

This checks to see if the current user is subscribed to a thread. You can also [get a repository subscription](https://docs.github.com/rest/reference/activity#get-a-repository-subscription).

Note that subscriptions are only generated if a user is participating in a conversation--for example, they've replied to the thread, were **@mentioned**, or manually subscribe to a thread.

API method documentation: [https://docs.github.com/rest/reference/activity#get-a-thread-subscription-for-the-authenticated-user](https://docs.github.com/rest/reference/activity#get-a-thread-subscription-for-the-authenticated-user)

```java
CompletableFuture<NotificationsThreadsSubscriptionResponse> activityGetThreadSubscriptionForAuthenticatedUserAsync(
    final int threadId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `threadId` | `int` | Template, Required | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user)). |

## Response Type

[`NotificationsThreadsSubscriptionResponse`](../../doc/models/notifications-threads-subscription-response.md)

## Example Usage

```java
int threadId = 198;

activityController.activityGetThreadSubscriptionForAuthenticatedUserAsync(threadId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "subscribed": true,
  "ignored": false,
  "reason": null,
  "created_at": "2012-10-06T21:34:12Z",
  "url": "https://api.github.com/notifications/threads/1/subscription",
  "thread_url": "https://api.github.com/notifications/threads/1"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`NotificationsThreadsSubscription401ErrorException`](../../doc/models/notifications-threads-subscription-401-error-exception.md) |
| 403 | Forbidden | [`NotificationsThreadsSubscription403ErrorException`](../../doc/models/notifications-threads-subscription-403-error-exception.md) |


# Activity Set-Thread-Subscription

If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore future notifications for threads until you comment on the thread or get an **@mention**.

You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to subscribed to threads that you have previously ignored.

Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the [Delete a thread subscription](https://docs.github.com/rest/reference/activity#delete-a-thread-subscription) endpoint.

API method documentation: [https://docs.github.com/rest/reference/activity#set-a-thread-subscription](https://docs.github.com/rest/reference/activity#set-a-thread-subscription)

```java
CompletableFuture<NotificationsThreadsSubscriptionResponse> activitySetThreadSubscriptionAsync(
    final int threadId,
    final NotificationsThreadsSubscriptionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `threadId` | `int` | Template, Required | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user)). |
| `body` | [`NotificationsThreadsSubscriptionRequest`](../../doc/models/notifications-threads-subscription-request.md) | Body, Optional | - |

## Response Type

[`NotificationsThreadsSubscriptionResponse`](../../doc/models/notifications-threads-subscription-response.md)

## Example Usage

```java
int threadId = 198;
NotificationsThreadsSubscriptionRequest body = new NotificationsThreadsSubscriptionRequest();
body.setIgnored(false);

activityController.activitySetThreadSubscriptionAsync(threadId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "subscribed": true,
  "ignored": false,
  "reason": null,
  "created_at": "2012-10-06T21:34:12Z",
  "url": "https://api.github.com/notifications/threads/1/subscription",
  "thread_url": "https://api.github.com/notifications/threads/1"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`NotificationsThreadsSubscription401ErrorException`](../../doc/models/notifications-threads-subscription-401-error-exception.md) |
| 403 | Forbidden | [`NotificationsThreadsSubscription403ErrorException`](../../doc/models/notifications-threads-subscription-403-error-exception.md) |


# Activity Delete-Thread-Subscription

Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you are watching the repository of the thread, you will still receive notifications. To ignore future notifications for a repository you are watching, use the [Set a thread subscription](https://docs.github.com/rest/reference/activity#set-a-thread-subscription) endpoint and set `ignore` to `true`.

API method documentation: [https://docs.github.com/rest/reference/activity#delete-a-thread-subscription](https://docs.github.com/rest/reference/activity#delete-a-thread-subscription)

```java
CompletableFuture<Void> activityDeleteThreadSubscriptionAsync(
    final int threadId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `threadId` | `int` | Template, Required | The unique identifier of the notification thread. This corresponds to the value returned in the `id` field when you retrieve notifications (for example with the [`GET /notifications` operation](https://docs.github.com/rest/reference/activity#list-notifications-for-the-authenticated-user)). |

## Response Type

`void`

## Example Usage

```java
int threadId = 198;

activityController.activityDeleteThreadSubscriptionAsync(threadId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`NotificationsThreadsSubscription401ErrorException`](../../doc/models/notifications-threads-subscription-401-error-exception.md) |
| 403 | Forbidden | [`NotificationsThreadsSubscription403ErrorException`](../../doc/models/notifications-threads-subscription-403-error-exception.md) |


# Activity List-Public-Org-Events

List public organization events

API method documentation: [https://docs.github.com/rest/reference/activity#list-public-organization-events](https://docs.github.com/rest/reference/activity#list-public-organization-events)

```java
CompletableFuture<List<Event>> activityListPublicOrgEventsAsync(
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

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

activityController.activityListPublicOrgEventsAsync(org, perPage, page).thenAccept(result -> {
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
    "id": "22237752260",
    "type": "WatchEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octo-org/octo-repo",
      "url": "https://api.github.com/repos/octo-org/octo-repo"
    },
    "payload": {
      "action": "started"
    },
    "public": true,
    "created_at": "2022-06-08T23:29:25Z"
  },
  {
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octo-org/octo-repo",
      "url": "https://api.github.com/repos/octo-org/oct-repo"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octo-org/oct-repo/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  }
]
```


# Activity List-Repo-Events

List repository events

API method documentation: [https://docs.github.com/rest/reference/activity#list-repository-events](https://docs.github.com/rest/reference/activity#list-repository-events)

```java
CompletableFuture<List<Event>> activityListRepoEventsAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

activityController.activityListRepoEventsAsync(owner, repo, perPage, page).thenAccept(result -> {
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
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22237752260",
    "type": "WatchEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "action": "started"
    },
    "public": true,
    "created_at": "2022-06-08T23:29:25Z"
  }
]
```


# Activity List-Repo-Notifications-for-Authenticated-User

Lists all notifications for the current user in the specified repository.

API method documentation: [https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user](https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user)

```java
CompletableFuture<List<Thread>> activityListRepoNotificationsForAuthenticatedUserAsync(
    final String owner,
    final String repo,
    final Boolean all,
    final Boolean participating,
    final LocalDateTime since,
    final LocalDateTime before,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `all` | `Boolean` | Query, Optional | If `true`, show notifications marked as read.<br>**Default**: `false` |
| `participating` | `Boolean` | Query, Optional | If `true`, only shows notifications in which the user is directly participating or mentioned.<br>**Default**: `false` |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `before` | `LocalDateTime` | Query, Optional | Only show notifications updated before the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Thread>`](../../doc/models/thread.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Boolean all = false;
Boolean participating = false;
Integer perPage = 30;
Integer page = 1;

activityController.activityListRepoNotificationsForAuthenticatedUserAsync(owner, repo, all, participating, null, null, perPage, page).thenAccept(result -> {
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
    "id": "1",
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
      "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
    },
    "subject": {
      "title": "Greetings",
      "url": "https://api.github.com/repos/octokit/octokit.rb/issues/123",
      "latest_comment_url": "https://api.github.com/repos/octokit/octokit.rb/issues/comments/123",
      "type": "Issue"
    },
    "reason": "subscribed",
    "unread": true,
    "updated_at": "2014-11-07T22:01:45Z",
    "last_read_at": "2014-11-07T22:01:45Z",
    "url": "https://api.github.com/notifications/threads/1",
    "subscription_url": "https://api.github.com/notifications/threads/1/subscription"
  }
]
```


# Activity Mark-Repo-Notifications-as-Read

Marks all notifications in a repository as "read" for the current user. If the number of notifications is too large to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository notifications for the authenticated user](https://docs.github.com/rest/reference/activity#list-repository-notifications-for-the-authenticated-user) endpoint and pass the query parameter `all=false`.

API method documentation: [https://docs.github.com/rest/reference/activity#mark-repository-notifications-as-read](https://docs.github.com/rest/reference/activity#mark-repository-notifications-as-read)

```java
CompletableFuture<ReposNotificationsResponse> activityMarkRepoNotificationsAsReadAsync(
    final String owner,
    final String repo,
    final ReposNotificationsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposNotificationsRequest`](../../doc/models/repos-notifications-request.md) | Body, Optional | - |

## Response Type

[`ReposNotificationsResponse`](../../doc/models/repos-notifications-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposNotificationsRequest body = new ReposNotificationsRequest();
body.setLastReadAt(LocalDateTime.parse("2019-01-01T00:00:00Z", DateTimeFormatter.ISO_DATE_TIME));

activityController.activityMarkRepoNotificationsAsReadAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "message": "Unread notifications couldn't be marked in a single request. Notifications are being marked as read in the background."
}
```


# Activity List-Stargazers-for-Repo

Lists the people that have starred the repository.

You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.

API method documentation: [https://docs.github.com/rest/reference/activity#list-stargazers](https://docs.github.com/rest/reference/activity#list-stargazers)

```java
CompletableFuture<ActivityListStargazersForRepoResponse> activityListStargazersForRepoAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

`ActivityListStargazersForRepoResponse`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

activityController.activityListStargazersForRepoAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
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
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposStargazers422ErrorException`](../../doc/models/repos-stargazers-422-error-exception.md) |


# Activity List-Watchers-for-Repo

Lists the people watching the specified repository.

API method documentation: [https://docs.github.com/rest/reference/activity#list-watchers](https://docs.github.com/rest/reference/activity#list-watchers)

```java
CompletableFuture<List<SimpleUser>> activityListWatchersForRepoAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

activityController.activityListWatchersForRepoAsync(owner, repo, perPage, page).thenAccept(result -> {
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


# Activity Get-Repo-Subscription

Get a repository subscription

API method documentation: [https://docs.github.com/rest/reference/activity#get-a-repository-subscription](https://docs.github.com/rest/reference/activity#get-a-repository-subscription)

```java
CompletableFuture<ReposSubscriptionResponse> activityGetRepoSubscriptionAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposSubscriptionResponse`](../../doc/models/repos-subscription-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

activityController.activityGetRepoSubscriptionAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "subscribed": true,
  "ignored": false,
  "reason": null,
  "created_at": "2012-10-06T21:34:12Z",
  "url": "https://api.github.com/repos/octocat/example/subscription",
  "repository_url": "https://api.github.com/repos/octocat/example"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposSubscription403ErrorException`](../../doc/models/repos-subscription-403-error-exception.md) |
| 404 | Not Found if you don't subscribe to the repository | `ApiException` |


# Activity Set-Repo-Subscription

If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the repository's subscription](https://docs.github.com/rest/reference/activity#delete-a-repository-subscription) completely.

API method documentation: [https://docs.github.com/rest/reference/activity#set-a-repository-subscription](https://docs.github.com/rest/reference/activity#set-a-repository-subscription)

```java
CompletableFuture<ReposSubscriptionResponse> activitySetRepoSubscriptionAsync(
    final String owner,
    final String repo,
    final ReposSubscriptionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposSubscriptionRequest`](../../doc/models/repos-subscription-request.md) | Body, Optional | - |

## Response Type

[`ReposSubscriptionResponse`](../../doc/models/repos-subscription-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposSubscriptionRequest body = new ReposSubscriptionRequest();
body.setSubscribed(true);
body.setIgnored(false);

activityController.activitySetRepoSubscriptionAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "subscribed": true,
  "ignored": false,
  "reason": null,
  "created_at": "2012-10-06T21:34:12Z",
  "url": "https://api.github.com/repos/octocat/example/subscription",
  "repository_url": "https://api.github.com/repos/octocat/example"
}
```


# Activity Delete-Repo-Subscription

This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive notifications from a repository, [set the repository's subscription manually](https://docs.github.com/rest/reference/activity#set-a-repository-subscription).

API method documentation: [https://docs.github.com/rest/reference/activity#delete-a-repository-subscription](https://docs.github.com/rest/reference/activity#delete-a-repository-subscription)

```java
CompletableFuture<Void> activityDeleteRepoSubscriptionAsync(
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

activityController.activityDeleteRepoSubscriptionAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Activity List-Repos-Starred-by-Authenticated-User

Lists repositories the authenticated user has starred.

You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.

API method documentation: [https://docs.github.com/rest/reference/activity#list-repositories-starred-by-the-authenticated-user](https://docs.github.com/rest/reference/activity#list-repositories-starred-by-the-authenticated-user)

```java
CompletableFuture<List<Repository>> activityListReposStarredByAuthenticatedUserAsync(
    final Sort1Enum sort,
    final Direction1Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `sort` | [`Sort1Enum`](../../doc/models/sort-1-enum.md) | Query, Optional | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Repository>`](../../doc/models/repository.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

activityController.activityListReposStarredByAuthenticatedUserAsync(null, null, perPage, page).thenAccept(result -> {
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
    "allow_rebase_merge": true,
    "template_repository": null,
    "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
    "allow_squash_merge": true,
    "allow_auto_merge": false,
    "delete_branch_on_merge": true,
    "allow_merge_commit": true,
    "subscribers_count": 42,
    "network_count": 0,
    "license": {
      "key": "mit",
      "name": "MIT License",
      "url": "https://api.github.com/licenses/mit",
      "spdx_id": "MIT",
      "node_id": "MDc6TGljZW5zZW1pdA==",
      "html_url": "https://github.com/licenses/mit"
    },
    "forks": 1,
    "open_issues": 1,
    "watchers": 1
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserStarred401ErrorException`](../../doc/models/user-starred-401-error-exception.md) |
| 403 | Forbidden | [`UserStarred403ErrorException`](../../doc/models/user-starred-403-error-exception.md) |


# Activity Check-Repo-Is-Starred-by-Authenticated-User

Check if a repository is starred by the authenticated user

API method documentation: [https://docs.github.com/rest/reference/activity#check-if-a-repository-is-starred-by-the-authenticated-user](https://docs.github.com/rest/reference/activity#check-if-a-repository-is-starred-by-the-authenticated-user)

```java
CompletableFuture<Void> activityCheckRepoIsStarredByAuthenticatedUserAsync(
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

activityController.activityCheckRepoIsStarredByAuthenticatedUserAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserStarred401ErrorException`](../../doc/models/user-starred-401-error-exception.md) |
| 403 | Forbidden | [`UserStarred403ErrorException`](../../doc/models/user-starred-403-error-exception.md) |
| 404 | Not Found if this repository is not starred by you | [`UserStarred404ErrorException`](../../doc/models/user-starred-404-error-exception.md) |


# Activity Star-Repo-for-Authenticated-User

Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

API method documentation: [https://docs.github.com/rest/reference/activity#star-a-repository-for-the-authenticated-user](https://docs.github.com/rest/reference/activity#star-a-repository-for-the-authenticated-user)

```java
CompletableFuture<Void> activityStarRepoForAuthenticatedUserAsync(
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

activityController.activityStarRepoForAuthenticatedUserAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserStarred401ErrorException`](../../doc/models/user-starred-401-error-exception.md) |
| 403 | Forbidden | [`UserStarred403ErrorException`](../../doc/models/user-starred-403-error-exception.md) |
| 404 | Resource not found | [`UserStarred404ErrorException`](../../doc/models/user-starred-404-error-exception.md) |


# Activity Unstar-Repo-for-Authenticated-User

Unstar a repository for the authenticated user

API method documentation: [https://docs.github.com/rest/reference/activity#unstar-a-repository-for-the-authenticated-user](https://docs.github.com/rest/reference/activity#unstar-a-repository-for-the-authenticated-user)

```java
CompletableFuture<Void> activityUnstarRepoForAuthenticatedUserAsync(
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

activityController.activityUnstarRepoForAuthenticatedUserAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserStarred401ErrorException`](../../doc/models/user-starred-401-error-exception.md) |
| 403 | Forbidden | [`UserStarred403ErrorException`](../../doc/models/user-starred-403-error-exception.md) |
| 404 | Resource not found | [`UserStarred404ErrorException`](../../doc/models/user-starred-404-error-exception.md) |


# Activity List-Watched-Repos-for-Authenticated-User

Lists repositories the authenticated user is watching.

API method documentation: [https://docs.github.com/rest/reference/activity#list-repositories-watched-by-the-authenticated-user](https://docs.github.com/rest/reference/activity#list-repositories-watched-by-the-authenticated-user)

```java
CompletableFuture<List<MinimalRepository>> activityListWatchedReposForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MinimalRepository>`](../../doc/models/minimal-repository.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

activityController.activityListWatchedReposForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
    "has_discussions": false,
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
    "security_and_analysis": {
      "advanced_security": {
        "status": "enabled"
      },
      "secret_scanning": {
        "status": "enabled"
      },
      "secret_scanning_push_protection": {
        "status": "disabled"
      }
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserSubscriptions401ErrorException`](../../doc/models/user-subscriptions-401-error-exception.md) |
| 403 | Forbidden | [`UserSubscriptions403ErrorException`](../../doc/models/user-subscriptions-403-error-exception.md) |


# Activity List-Events-for-Authenticated-User

If you are authenticated as the given user, you will see your private events. Otherwise, you'll only see public events.

API method documentation: [https://docs.github.com/rest/reference/activity#list-events-for-the-authenticated-user](https://docs.github.com/rest/reference/activity#list-events-for-the-authenticated-user)

```java
CompletableFuture<List<Event>> activityListEventsForAuthenticatedUserAsync(
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

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

activityController.activityListEventsForAuthenticatedUserAsync(username, perPage, page).thenAccept(result -> {
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
    "id": "22249084947",
    "type": "WatchEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "action": "started"
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": false,
    "created_at": "2022-06-07T07:50:26Z"
  }
]
```


# Activity List-Org-Events-for-Authenticated-User

This is the user's organization dashboard. You must be authenticated as the user to view this.

API method documentation: [https://docs.github.com/rest/reference/activity#list-organization-events-for-the-authenticated-user](https://docs.github.com/rest/reference/activity#list-organization-events-for-the-authenticated-user)

```java
CompletableFuture<List<Event>> activityListOrgEventsForAuthenticatedUserAsync(
    final String username,
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String username = "username0";
String org = "org6";
Integer perPage = 30;
Integer page = 1;

activityController.activityListOrgEventsForAuthenticatedUserAsync(username, org, perPage, page).thenAccept(result -> {
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
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": false,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22196946742",
    "type": "CreateEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "ref": null,
      "ref_type": "repository",
      "master_branch": "master",
      "description": null,
      "pusher_type": "user"
    },
    "public": false,
    "created_at": "2022-06-07T07:50:26Z",
    "org": {
      "id": 9919,
      "login": "github",
      "gravatar_id": "",
      "url": "https://api.github.com/orgs/github",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?"
    }
  }
]
```


# Activity List-Public-Events-for-User

List public events for a user

API method documentation: [https://docs.github.com/rest/reference/activity#list-public-events-for-a-user](https://docs.github.com/rest/reference/activity#list-public-events-for-a-user)

```java
CompletableFuture<List<Event>> activityListPublicEventsForUserAsync(
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

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

activityController.activityListPublicEventsForUserAsync(username, perPage, page).thenAccept(result -> {
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
    "id": "22249084947",
    "type": "WatchEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "action": "started"
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": true,
    "created_at": "2022-06-08T23:29:25Z"
  }
]
```


# Activity List-Received-Events-for-User

These are events that you've received by watching repos and following users. If you are authenticated as the given user, you will see private events. Otherwise, you'll only see public events.

API method documentation: [https://docs.github.com/rest/reference/activity#list-events-received-by-the-authenticated-user](https://docs.github.com/rest/reference/activity#list-events-received-by-the-authenticated-user)

```java
CompletableFuture<List<Event>> activityListReceivedEventsForUserAsync(
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

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

activityController.activityListReceivedEventsForUserAsync(username, perPage, page).thenAccept(result -> {
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
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22196946742",
    "type": "CreateEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "ref": null,
      "ref_type": "repository",
      "master_branch": "master",
      "description": null,
      "pusher_type": "user"
    },
    "public": false,
    "created_at": "2022-06-07T07:50:26Z",
    "org": {
      "id": 9919,
      "login": "github",
      "gravatar_id": "",
      "url": "https://api.github.com/orgs/github",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?"
    }
  }
]
```


# Activity List-Received-Public-Events-for-User

List public events received by a user

API method documentation: [https://docs.github.com/rest/reference/activity#list-public-events-received-by-a-user](https://docs.github.com/rest/reference/activity#list-public-events-received-by-a-user)

```java
CompletableFuture<List<Event>> activityListReceivedPublicEventsForUserAsync(
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

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

activityController.activityListReceivedPublicEventsForUserAsync(username, perPage, page).thenAccept(result -> {
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
    "id": "22249084964",
    "type": "PushEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "push_id": 10115855396,
      "size": 1,
      "distinct_size": 1,
      "ref": "refs/heads/master",
      "head": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
      "before": "883efe034920928c47fe18598c01249d1a9fdabd",
      "commits": [
        {
          "sha": "7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300",
          "author": {
            "email": "octocat@github.com",
            "name": "Monalisa Octocat"
          },
          "message": "commit",
          "distinct": true,
          "url": "https://api.github.com/repos/octocat/Hello-World/commits/7a8f3ac80e2ad2f6842cb86f576d4bfe2c03e300"
        }
      ]
    },
    "public": true,
    "created_at": "2022-06-09T12:47:28Z"
  },
  {
    "id": "22196946742",
    "type": "CreateEvent",
    "actor": {
      "id": 583231,
      "login": "octocat",
      "display_login": "octocat",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4"
    },
    "repo": {
      "id": 1296269,
      "name": "octocat/Hello-World",
      "url": "https://api.github.com/repos/octocat/Hello-World"
    },
    "payload": {
      "ref": null,
      "ref_type": "repository",
      "master_branch": "master",
      "description": null,
      "pusher_type": "user"
    },
    "public": false,
    "created_at": "2022-06-07T07:50:26Z",
    "org": {
      "id": 9919,
      "login": "github",
      "gravatar_id": "",
      "url": "https://api.github.com/orgs/github",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?"
    }
  }
]
```


# Activity List-Repos-Starred-by-User

Lists repositories a user has starred.

You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.

API method documentation: [https://docs.github.com/rest/reference/activity#list-repositories-starred-by-a-user](https://docs.github.com/rest/reference/activity#list-repositories-starred-by-a-user)

```java
CompletableFuture<ActivityListReposStarredByUserResponse> activityListReposStarredByUserAsync(
    final String username,
    final Sort1Enum sort,
    final Direction1Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `sort` | [`Sort1Enum`](../../doc/models/sort-1-enum.md) | Query, Optional | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

`ActivityListReposStarredByUserResponse`

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

activityController.activityListReposStarredByUserAsync(username, null, null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
[
  {
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
    "allow_rebase_merge": true,
    "template_repository": null,
    "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
    "allow_squash_merge": true,
    "allow_auto_merge": false,
    "delete_branch_on_merge": true,
    "allow_merge_commit": true,
    "subscribers_count": 42,
    "network_count": 0,
    "license": {
      "key": "mit",
      "name": "MIT License",
      "url": "https://api.github.com/licenses/mit",
      "spdx_id": "MIT",
      "node_id": "MDc6TGljZW5zZW1pdA==",
      "html_url": "https://github.com/licenses/mit"
    },
    "forks": 1,
    "open_issues": 1,
    "watchers": 1
  }
]
```


# Activity List-Repos-Watched-by-User

Lists repositories a user is watching.

API method documentation: [https://docs.github.com/rest/reference/activity#list-repositories-watched-by-a-user](https://docs.github.com/rest/reference/activity#list-repositories-watched-by-a-user)

```java
CompletableFuture<List<MinimalRepository>> activityListReposWatchedByUserAsync(
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

[`List<MinimalRepository>`](../../doc/models/minimal-repository.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

activityController.activityListReposWatchedByUserAsync(username, perPage, page).thenAccept(result -> {
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
    "has_discussions": false,
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
    "security_and_analysis": {
      "advanced_security": {
        "status": "enabled"
      },
      "secret_scanning": {
        "status": "enabled"
      },
      "secret_scanning_push_protection": {
        "status": "disabled"
      }
    }
  }
]
```

