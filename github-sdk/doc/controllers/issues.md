# Issues

Interact with GitHub Issues.

```java
IssuesController issuesController = client.getIssuesController();
```

## Class Name

`IssuesController`

## Methods

* [Issues List](../../doc/controllers/issues.md#issues-list)
* [Issues List-for-Org](../../doc/controllers/issues.md#issues-list-for-org)
* [Issues List-Assignees](../../doc/controllers/issues.md#issues-list-assignees)
* [Issues Check-User-Can-Be-Assigned](../../doc/controllers/issues.md#issues-check-user-can-be-assigned)
* [Issues List-for-Repo](../../doc/controllers/issues.md#issues-list-for-repo)
* [Issues Create](../../doc/controllers/issues.md#issues-create)
* [Issues List-Comments-for-Repo](../../doc/controllers/issues.md#issues-list-comments-for-repo)
* [Issues Get-Comment](../../doc/controllers/issues.md#issues-get-comment)
* [Issues Update-Comment](../../doc/controllers/issues.md#issues-update-comment)
* [Issues Delete-Comment](../../doc/controllers/issues.md#issues-delete-comment)
* [Issues List-Events-for-Repo](../../doc/controllers/issues.md#issues-list-events-for-repo)
* [Issues Get-Event](../../doc/controllers/issues.md#issues-get-event)
* [Issues Get](../../doc/controllers/issues.md#issues-get)
* [Issues Update](../../doc/controllers/issues.md#issues-update)
* [Issues Add-Assignees](../../doc/controllers/issues.md#issues-add-assignees)
* [Issues Remove-Assignees](../../doc/controllers/issues.md#issues-remove-assignees)
* [Issues Check-User-Can-Be-Assigned-to-Issue](../../doc/controllers/issues.md#issues-check-user-can-be-assigned-to-issue)
* [Issues List-Comments](../../doc/controllers/issues.md#issues-list-comments)
* [Issues Create-Comment](../../doc/controllers/issues.md#issues-create-comment)
* [Issues List-Events](../../doc/controllers/issues.md#issues-list-events)
* [Issues List-Labels-on-Issue](../../doc/controllers/issues.md#issues-list-labels-on-issue)
* [Issues Add-Labels](../../doc/controllers/issues.md#issues-add-labels)
* [Issues Set-Labels](../../doc/controllers/issues.md#issues-set-labels)
* [Issues Remove-All-Labels](../../doc/controllers/issues.md#issues-remove-all-labels)
* [Issues Remove-Label](../../doc/controllers/issues.md#issues-remove-label)
* [Issues Lock](../../doc/controllers/issues.md#issues-lock)
* [Issues Unlock](../../doc/controllers/issues.md#issues-unlock)
* [Issues List-Events-for-Timeline](../../doc/controllers/issues.md#issues-list-events-for-timeline)
* [Issues List-Labels-for-Repo](../../doc/controllers/issues.md#issues-list-labels-for-repo)
* [Issues Create-Label](../../doc/controllers/issues.md#issues-create-label)
* [Issues Get-Label](../../doc/controllers/issues.md#issues-get-label)
* [Issues Update-Label](../../doc/controllers/issues.md#issues-update-label)
* [Issues Delete-Label](../../doc/controllers/issues.md#issues-delete-label)
* [Issues List-Milestones](../../doc/controllers/issues.md#issues-list-milestones)
* [Issues Create-Milestone](../../doc/controllers/issues.md#issues-create-milestone)
* [Issues Get-Milestone](../../doc/controllers/issues.md#issues-get-milestone)
* [Issues Update-Milestone](../../doc/controllers/issues.md#issues-update-milestone)
* [Issues Delete-Milestone](../../doc/controllers/issues.md#issues-delete-milestone)
* [Issues List-Labels-for-Milestone](../../doc/controllers/issues.md#issues-list-labels-for-milestone)
* [Issues List-for-Authenticated-User](../../doc/controllers/issues.md#issues-list-for-authenticated-user)


# Issues List

List issues assigned to the authenticated user across all visible repositories including owned repositories, member
repositories, and organization repositories. You can use the `filter` query parameter to fetch issues that are not
necessarily assigned to you.

**Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.

API method documentation: [https://docs.github.com/rest/reference/issues#list-issues-assigned-to-the-authenticated-user](https://docs.github.com/rest/reference/issues#list-issues-assigned-to-the-authenticated-user)

```java
CompletableFuture<List<Issue>> issuesListAsync(
    final Filter1Enum filter,
    final State1671Enum state,
    final String labels,
    final Sort23Enum sort,
    final Direction1Enum direction,
    final LocalDateTime since,
    final Boolean collab,
    final Boolean orgs,
    final Boolean owned,
    final Boolean pulls,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `filter` | [`Filter1Enum`](../../doc/models/filter-1-enum.md) | Query, Optional | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation. |
| `state` | [`State1671Enum`](../../doc/models/state-1671-enum.md) | Query, Optional | Indicates the state of the issues to return. |
| `labels` | `String` | Query, Optional | A list of comma separated label names. Example: `bug,ui,@high` |
| `sort` | [`Sort23Enum`](../../doc/models/sort-23-enum.md) | Query, Optional | What to sort results by. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `collab` | `Boolean` | Query, Optional | - |
| `orgs` | `Boolean` | Query, Optional | - |
| `owned` | `Boolean` | Query, Optional | - |
| `pulls` | `Boolean` | Query, Optional | - |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Issue>`](../../doc/models/issue.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListAsync(null, null, null, null, null, null, null, null, null, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDU6SXNzdWUx",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
    "repository_url": "https://api.github.com/repos/octocat/Hello-World",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
    "html_url": "https://github.com/octocat/Hello-World/issues/1347",
    "number": 1347,
    "state": "open",
    "title": "Found a bug",
    "body": "I'm having a problem with this.",
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
    "labels": [
      {
        "id": 208045946,
        "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
        "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
        "name": "bug",
        "description": "Something isn't working",
        "color": "f29513",
        "default": true
      }
    ],
    "assignee": {
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
    "assignees": [
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
    ],
    "milestone": {
      "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
      "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
      "id": 1002604,
      "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
      "number": 1,
      "state": "open",
      "title": "v1.0",
      "description": "Tracking milestone for version 1.0",
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
      "open_issues": 4,
      "closed_issues": 8,
      "created_at": "2011-04-10T20:09:31Z",
      "updated_at": "2014-03-03T18:58:10Z",
      "closed_at": "2013-02-12T13:22:01Z",
      "due_on": "2012-10-09T23:39:01Z"
    },
    "locked": true,
    "active_lock_reason": "too heated",
    "comments": 0,
    "pull_request": {
      "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
      "html_url": "https://github.com/octocat/Hello-World/pull/1347",
      "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
      "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
    },
    "closed_at": null,
    "created_at": "2011-04-22T13:33:48Z",
    "updated_at": "2011-04-22T13:33:48Z",
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
    },
    "author_association": "COLLABORATOR"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`Issues404ErrorException`](../../doc/models/issues-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Issues422ErrorException`](../../doc/models/issues-422-error-exception.md) |


# Issues List-for-Org

List issues in an organization assigned to the authenticated user.

**Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.

API method documentation: [https://docs.github.com/rest/reference/issues#list-organization-issues-assigned-to-the-authenticated-user](https://docs.github.com/rest/reference/issues#list-organization-issues-assigned-to-the-authenticated-user)

```java
CompletableFuture<List<Issue>> issuesListForOrgAsync(
    final String org,
    final Filter1Enum filter,
    final State1671Enum state,
    final String labels,
    final Sort23Enum sort,
    final Direction1Enum direction,
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `filter` | [`Filter1Enum`](../../doc/models/filter-1-enum.md) | Query, Optional | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation. |
| `state` | [`State1671Enum`](../../doc/models/state-1671-enum.md) | Query, Optional | Indicates the state of the issues to return. |
| `labels` | `String` | Query, Optional | A list of comma separated label names. Example: `bug,ui,@high` |
| `sort` | [`Sort23Enum`](../../doc/models/sort-23-enum.md) | Query, Optional | What to sort results by. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Issue>`](../../doc/models/issue.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListForOrgAsync(org, null, null, null, null, null, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDU6SXNzdWUx",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
    "repository_url": "https://api.github.com/repos/octocat/Hello-World",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
    "html_url": "https://github.com/octocat/Hello-World/issues/1347",
    "number": 1347,
    "state": "open",
    "title": "Found a bug",
    "body": "I'm having a problem with this.",
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
    "labels": [
      {
        "id": 208045946,
        "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
        "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
        "name": "bug",
        "description": "Something isn't working",
        "color": "f29513",
        "default": true
      }
    ],
    "assignee": {
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
    "assignees": [
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
    ],
    "milestone": {
      "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
      "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
      "id": 1002604,
      "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
      "number": 1,
      "state": "open",
      "title": "v1.0",
      "description": "Tracking milestone for version 1.0",
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
      "open_issues": 4,
      "closed_issues": 8,
      "created_at": "2011-04-10T20:09:31Z",
      "updated_at": "2014-03-03T18:58:10Z",
      "closed_at": "2013-02-12T13:22:01Z",
      "due_on": "2012-10-09T23:39:01Z"
    },
    "locked": true,
    "active_lock_reason": "too heated",
    "comments": 0,
    "pull_request": {
      "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
      "html_url": "https://github.com/octocat/Hello-World/pull/1347",
      "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
      "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
    },
    "closed_at": null,
    "created_at": "2011-04-22T13:33:48Z",
    "updated_at": "2011-04-22T13:33:48Z",
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
    },
    "author_association": "COLLABORATOR"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsIssues404ErrorException`](../../doc/models/orgs-issues-404-error-exception.md) |


# Issues List-Assignees

Lists the [available assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues in a repository.

API method documentation: [https://docs.github.com/rest/reference/issues#list-assignees](https://docs.github.com/rest/reference/issues#list-assignees)

```java
CompletableFuture<List<SimpleUser>> issuesListAssigneesAsync(
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

issuesController.issuesListAssigneesAsync(owner, repo, perPage, page).thenAccept(result -> {
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
| 404 | Resource not found | [`ReposAssignees404ErrorException`](../../doc/models/repos-assignees-404-error-exception.md) |


# Issues Check-User-Can-Be-Assigned

Checks if a user has permission to be assigned to an issue in this repository.

If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.

Otherwise a `404` status code is returned.

API method documentation: [https://docs.github.com/rest/reference/issues#check-if-a-user-can-be-assigned](https://docs.github.com/rest/reference/issues#check-if-a-user-can-be-assigned)

```java
CompletableFuture<Void> issuesCheckUserCanBeAssignedAsync(
    final String owner,
    final String repo,
    final String assignee)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `assignee` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String assignee = "assignee8";

issuesController.issuesCheckUserCanBeAssignedAsync(owner, repo, assignee).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Otherwise a `404` status code is returned. | [`ReposAssigneesAssignee404ErrorException`](../../doc/models/repos-assignees-assignee-404-error-exception.md) |


# Issues List-for-Repo

List issues in a repository. Only open issues will be listed.

**Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.

API method documentation: [https://docs.github.com/rest/reference/issues#list-repository-issues](https://docs.github.com/rest/reference/issues#list-repository-issues)

```java
CompletableFuture<List<Issue>> issuesListForRepoAsync(
    final String owner,
    final String repo,
    final String milestone,
    final State1671Enum state,
    final String assignee,
    final String creator,
    final String mentioned,
    final String labels,
    final Sort23Enum sort,
    final Direction1Enum direction,
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `milestone` | `String` | Query, Optional | If an `integer` is passed, it should refer to a milestone by its `number` field. If the string `*` is passed, issues with any milestone are accepted. If the string `none` is passed, issues without milestones are returned. |
| `state` | [`State1671Enum`](../../doc/models/state-1671-enum.md) | Query, Optional | Indicates the state of the issues to return. |
| `assignee` | `String` | Query, Optional | Can be the name of a user. Pass in `none` for issues with no assigned user, and `*` for issues assigned to any user. |
| `creator` | `String` | Query, Optional | The user that created the issue. |
| `mentioned` | `String` | Query, Optional | A user that's mentioned in the issue. |
| `labels` | `String` | Query, Optional | A list of comma separated label names. Example: `bug,ui,@high` |
| `sort` | [`Sort23Enum`](../../doc/models/sort-23-enum.md) | Query, Optional | What to sort results by. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Issue>`](../../doc/models/issue.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListForRepoAsync(owner, repo, null, null, null, null, null, null, null, null, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDU6SXNzdWUx",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
    "repository_url": "https://api.github.com/repos/octocat/Hello-World",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
    "html_url": "https://github.com/octocat/Hello-World/issues/1347",
    "number": 1347,
    "state": "open",
    "title": "Found a bug",
    "body": "I'm having a problem with this.",
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
    "labels": [
      {
        "id": 208045946,
        "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
        "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
        "name": "bug",
        "description": "Something isn't working",
        "color": "f29513",
        "default": true
      }
    ],
    "assignee": {
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
    "assignees": [
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
    ],
    "milestone": {
      "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
      "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
      "id": 1002604,
      "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
      "number": 1,
      "state": "open",
      "title": "v1.0",
      "description": "Tracking milestone for version 1.0",
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
      "open_issues": 4,
      "closed_issues": 8,
      "created_at": "2011-04-10T20:09:31Z",
      "updated_at": "2014-03-03T18:58:10Z",
      "closed_at": "2013-02-12T13:22:01Z",
      "due_on": "2012-10-09T23:39:01Z"
    },
    "locked": true,
    "active_lock_reason": "too heated",
    "comments": 0,
    "pull_request": {
      "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
      "html_url": "https://github.com/octocat/Hello-World/pull/1347",
      "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
      "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
    },
    "closed_at": null,
    "created_at": "2011-04-22T13:33:48Z",
    "updated_at": "2011-04-22T13:33:48Z",
    "closed_by": {
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
    "author_association": "COLLABORATOR",
    "state_reason": "completed"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssues404ErrorException`](../../doc/models/repos-issues-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssues422ErrorException`](../../doc/models/repos-issues-422-error-exception.md) |


# Issues Create

Any user with pull access to a repository can create an issue. If [issues are disabled in the repository](https://docs.github.com/articles/disabling-issues/), the API returns a `410 Gone` status.

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.

API method documentation: [https://docs.github.com/rest/reference/issues#create-an-issue](https://docs.github.com/rest/reference/issues#create-an-issue)

```java
CompletableFuture<ReposIssuesResponse1> issuesCreateAsync(
    final String owner,
    final String repo,
    final ReposIssuesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposIssuesRequest`](../../doc/models/repos-issues-request.md) | Body, Required | - |

## Response Type

[`ReposIssuesResponse1`](../../doc/models/repos-issues-response-1.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposIssuesRequest body = new ReposIssuesRequest();
String title = "Found a bug";

ReposIssuesRequestTitle titleContainer = ReposIssuesRequestTitle.fromMString(title);

body.setTitle(titleContainer);
body.setBody("I'm having a problem with this.");
int milestone = 1;

ReposIssuesRequestMilestone milestoneContainer = ReposIssuesRequestMilestone.fromNumber(milestone);

body.setMilestone(milestoneContainer);
List<ReposIssuesRequestLabels> labels = new LinkedList<>();
String labels0 = "bug";

ReposIssuesRequestLabels labelsContainer0 = ReposIssuesRequestLabels.fromMString(labels0);

labels.add(labelsContainer0);
body.setLabels(labels);
List<String> assignees = new LinkedList<>();
assignees.add("octocat");

body.setAssignees(assignees);

issuesController.issuesCreateAsync(owner, repo, body).thenAccept(result -> {
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
  "node_id": "MDU6SXNzdWUx",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "repository_url": "https://api.github.com/repos/octocat/Hello-World",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
  "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347",
  "number": 1347,
  "state": "open",
  "title": "Found a bug",
  "body": "I'm having a problem with this.",
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
  "labels": [
    {
      "id": 208045946,
      "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
      "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
      "name": "bug",
      "description": "Something isn't working",
      "color": "f29513",
      "default": true
    }
  ],
  "assignee": {
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
  "assignees": [
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
  ],
  "milestone": {
    "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
    "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
    "id": 1002604,
    "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
    "number": 1,
    "state": "open",
    "title": "v1.0",
    "description": "Tracking milestone for version 1.0",
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
    "open_issues": 4,
    "closed_issues": 8,
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z",
    "closed_at": "2013-02-12T13:22:01Z",
    "due_on": "2012-10-09T23:39:01Z"
  },
  "locked": true,
  "active_lock_reason": "too heated",
  "comments": 0,
  "pull_request": {
    "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
    "html_url": "https://github.com/octocat/Hello-World/pull/1347",
    "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
    "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
  },
  "closed_at": null,
  "created_at": "2011-04-22T13:33:48Z",
  "updated_at": "2011-04-22T13:33:48Z",
  "closed_by": {
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
  "author_association": "COLLABORATOR",
  "state_reason": "completed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposIssues403ErrorException`](../../doc/models/repos-issues-403-error-exception.md) |
| 404 | Resource not found | [`ReposIssues404ErrorException`](../../doc/models/repos-issues-404-error-exception.md) |
| 410 | Gone | [`ReposIssues410ErrorException`](../../doc/models/repos-issues-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssues422ErrorException`](../../doc/models/repos-issues-422-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Issues List-Comments-for-Repo

By default, Issue Comments are ordered by ascending ID.

API method documentation: [https://docs.github.com/rest/reference/issues#list-issue-comments-for-a-repository](https://docs.github.com/rest/reference/issues#list-issue-comments-for-a-repository)

```java
CompletableFuture<List<IssueComment>> issuesListCommentsForRepoAsync(
    final String owner,
    final String repo,
    final Sort1Enum sort,
    final Direction15Enum direction,
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `sort` | [`Sort1Enum`](../../doc/models/sort-1-enum.md) | Query, Optional | The property to sort the results by. `created` means when the repository was starred. `updated` means when the repository was last pushed to. |
| `direction` | [`Direction15Enum`](../../doc/models/direction-15-enum.md) | Query, Optional | Either `asc` or `desc`. Ignored without the `sort` parameter. |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<IssueComment>`](../../doc/models/issue-comment.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListCommentsForRepoAsync(owner, repo, null, null, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDEyOklzc3VlQ29tbWVudDE=",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/comments/1",
    "html_url": "https://github.com/octocat/Hello-World/issues/1347#issuecomment-1",
    "body": "Me too",
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
    "created_at": "2011-04-14T16:00:49Z",
    "updated_at": "2011-04-14T16:00:49Z",
    "issue_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
    "author_association": "COLLABORATOR"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesComments404ErrorException`](../../doc/models/repos-issues-comments-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesComments422ErrorException`](../../doc/models/repos-issues-comments-422-error-exception.md) |


# Issues Get-Comment

Get an issue comment

API method documentation: [https://docs.github.com/rest/reference/issues#get-an-issue-comment](https://docs.github.com/rest/reference/issues#get-an-issue-comment)

```java
CompletableFuture<ReposIssuesCommentsCommentIdResponse> issuesGetCommentAsync(
    final String owner,
    final String repo,
    final int commentId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |

## Response Type

[`ReposIssuesCommentsCommentIdResponse`](../../doc/models/repos-issues-comments-comment-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;

issuesController.issuesGetCommentAsync(owner, repo, commentId).thenAccept(result -> {
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
  "node_id": "MDEyOklzc3VlQ29tbWVudDE=",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/comments/1",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347#issuecomment-1",
  "body": "Me too",
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
  "created_at": "2011-04-14T16:00:49Z",
  "updated_at": "2011-04-14T16:00:49Z",
  "issue_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "author_association": "COLLABORATOR"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesCommentsCommentId404ErrorException`](../../doc/models/repos-issues-comments-comment-id-404-error-exception.md) |


# Issues Update-Comment

Update an issue comment

API method documentation: [https://docs.github.com/rest/reference/issues#update-an-issue-comment](https://docs.github.com/rest/reference/issues#update-an-issue-comment)

```java
CompletableFuture<ReposIssuesCommentsCommentIdResponse> issuesUpdateCommentAsync(
    final String owner,
    final String repo,
    final int commentId,
    final ReposIssuesCommentsCommentIdRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |
| `body` | [`ReposIssuesCommentsCommentIdRequest`](../../doc/models/repos-issues-comments-comment-id-request.md) | Body, Required | - |

## Response Type

[`ReposIssuesCommentsCommentIdResponse`](../../doc/models/repos-issues-comments-comment-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;
ReposIssuesCommentsCommentIdRequest body = new ReposIssuesCommentsCommentIdRequest();
body.setBody("Me too");

issuesController.issuesUpdateCommentAsync(owner, repo, commentId, body).thenAccept(result -> {
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
  "node_id": "MDEyOklzc3VlQ29tbWVudDE=",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/comments/1",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347#issuecomment-1",
  "body": "Me too",
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
  "created_at": "2011-04-14T16:00:49Z",
  "updated_at": "2011-04-14T16:00:49Z",
  "issue_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "author_association": "COLLABORATOR"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesCommentsCommentId422ErrorException`](../../doc/models/repos-issues-comments-comment-id-422-error-exception.md) |


# Issues Delete-Comment

Delete an issue comment

API method documentation: [https://docs.github.com/rest/reference/issues#delete-an-issue-comment](https://docs.github.com/rest/reference/issues#delete-an-issue-comment)

```java
CompletableFuture<Void> issuesDeleteCommentAsync(
    final String owner,
    final String repo,
    final int commentId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commentId` | `int` | Template, Required | The unique identifier of the comment. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int commentId = 46;

issuesController.issuesDeleteCommentAsync(owner, repo, commentId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Issues List-Events-for-Repo

List issue events for a repository

API method documentation: [https://docs.github.com/rest/reference/issues#list-issue-events-for-a-repository](https://docs.github.com/rest/reference/issues#list-issue-events-for-a-repository)

```java
CompletableFuture<List<IssueEvent>> issuesListEventsForRepoAsync(
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

[`List<IssueEvent>`](../../doc/models/issue-event.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListEventsForRepoAsync(owner, repo, perPage, page).thenAccept(result -> {
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
    "node_id": "MDEwOklzc3VlRXZlbnQx",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/events/1",
    "actor": {
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
    "event": "closed",
    "commit_id": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "commit_url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "created_at": "2011-04-14T16:00:49Z",
    "issue": {
      "id": 1,
      "node_id": "MDU6SXNzdWUx",
      "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
      "repository_url": "https://api.github.com/repos/octocat/Hello-World",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
      "html_url": "https://github.com/octocat/Hello-World/issues/1347",
      "number": 1347,
      "state": "open",
      "title": "Found a bug",
      "body": "I'm having a problem with this.",
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
      "labels": [
        {
          "id": 208045946,
          "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
          "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
          "name": "bug",
          "description": "Something isn't working",
          "color": "f29513",
          "default": true
        }
      ],
      "assignee": {
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
      "assignees": [
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
      ],
      "milestone": {
        "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
        "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
        "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
        "id": 1002604,
        "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
        "number": 1,
        "state": "open",
        "title": "v1.0",
        "description": "Tracking milestone for version 1.0",
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
        "open_issues": 4,
        "closed_issues": 8,
        "created_at": "2011-04-10T20:09:31Z",
        "updated_at": "2014-03-03T18:58:10Z",
        "closed_at": "2013-02-12T13:22:01Z",
        "due_on": "2012-10-09T23:39:01Z"
      },
      "locked": true,
      "active_lock_reason": "too heated",
      "comments": 0,
      "pull_request": {
        "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
        "html_url": "https://github.com/octocat/Hello-World/pull/1347",
        "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
        "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
      },
      "closed_at": null,
      "created_at": "2011-04-22T13:33:48Z",
      "updated_at": "2011-04-22T13:33:48Z",
      "author_association": "COLLABORATOR",
      "state_reason": "completed"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesEvents422ErrorException`](../../doc/models/repos-issues-events-422-error-exception.md) |


# Issues Get-Event

Get an issue event

API method documentation: [https://docs.github.com/rest/reference/issues#get-an-issue-event](https://docs.github.com/rest/reference/issues#get-an-issue-event)

```java
CompletableFuture<ReposIssuesEventsEventIdResponse> issuesGetEventAsync(
    final String owner,
    final String repo,
    final int eventId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `eventId` | `int` | Template, Required | - |

## Response Type

[`ReposIssuesEventsEventIdResponse`](../../doc/models/repos-issues-events-event-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int eventId = 136;

issuesController.issuesGetEventAsync(owner, repo, eventId).thenAccept(result -> {
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
  "node_id": "MDEwOklzc3VlRXZlbnQx",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/events/1",
  "actor": {
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
  "event": "closed",
  "commit_id": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "commit_url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "created_at": "2011-04-14T16:00:49Z",
  "issue": {
    "id": 1,
    "node_id": "MDU6SXNzdWUx",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
    "repository_url": "https://api.github.com/repos/octocat/Hello-World",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
    "html_url": "https://github.com/octocat/Hello-World/issues/1347",
    "number": 1347,
    "state": "open",
    "title": "Found a bug",
    "body": "I'm having a problem with this.",
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
    "labels": [
      {
        "id": 208045946,
        "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
        "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
        "name": "bug",
        "description": "Something isn't working",
        "color": "f29513",
        "default": true
      }
    ],
    "assignee": {
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
    "assignees": [
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
    ],
    "milestone": {
      "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
      "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
      "id": 1002604,
      "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
      "number": 1,
      "state": "open",
      "title": "v1.0",
      "description": "Tracking milestone for version 1.0",
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
      "open_issues": 4,
      "closed_issues": 8,
      "created_at": "2011-04-10T20:09:31Z",
      "updated_at": "2014-03-03T18:58:10Z",
      "closed_at": "2013-02-12T13:22:01Z",
      "due_on": "2012-10-09T23:39:01Z"
    },
    "locked": true,
    "performed_via_github_app": {
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
    "comments": 0,
    "pull_request": {
      "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
      "html_url": "https://github.com/octocat/Hello-World/pull/1347",
      "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
      "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
    },
    "closed_at": null,
    "created_at": "2011-04-22T13:33:48Z",
    "updated_at": "2011-04-22T13:33:48Z",
    "author_association": "COLLABORATOR",
    "state_reason": "completed"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposIssuesEventsEventId403ErrorException`](../../doc/models/repos-issues-events-event-id-403-error-exception.md) |
| 404 | Resource not found | [`ReposIssuesEventsEventId404ErrorException`](../../doc/models/repos-issues-events-event-id-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesEventsEventId410ErrorException`](../../doc/models/repos-issues-events-event-id-410-error-exception.md) |


# Issues Get

The API returns a [`301 Moved Permanently` status](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-redirects-redirects) if the issue was
[transferred](https://docs.github.com/articles/transferring-an-issue-to-another-repository/) to another repository. If
the issue was transferred to or deleted from a repository where the authenticated user lacks read access, the API
returns a `404 Not Found` status. If the issue was deleted from a repository where the authenticated user has read
access, the API returns a `410 Gone` status. To receive webhook events for transferred and deleted issues, subscribe
to the [`issues`](https://docs.github.com/webhooks/event-payloads/#issues) webhook.

**Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.

API method documentation: [https://docs.github.com/rest/reference/issues#get-an-issue](https://docs.github.com/rest/reference/issues#get-an-issue)

```java
CompletableFuture<ReposIssuesIssueNumberResponse> issuesGetAsync(
    final String owner,
    final String repo,
    final int issueNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |

## Response Type

[`ReposIssuesIssueNumberResponse`](../../doc/models/repos-issues-issue-number-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;

issuesController.issuesGetAsync(owner, repo, issueNumber).thenAccept(result -> {
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
  "node_id": "MDU6SXNzdWUx",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "repository_url": "https://api.github.com/repos/octocat/Hello-World",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
  "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347",
  "number": 1347,
  "state": "open",
  "title": "Found a bug",
  "body": "I'm having a problem with this.",
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
  "labels": [
    {
      "id": 208045946,
      "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
      "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
      "name": "bug",
      "description": "Something isn't working",
      "color": "f29513",
      "default": true
    }
  ],
  "assignee": {
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
  "assignees": [
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
  ],
  "milestone": {
    "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
    "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
    "id": 1002604,
    "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
    "number": 1,
    "state": "open",
    "title": "v1.0",
    "description": "Tracking milestone for version 1.0",
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
    "open_issues": 4,
    "closed_issues": 8,
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z",
    "closed_at": "2013-02-12T13:22:01Z",
    "due_on": "2012-10-09T23:39:01Z"
  },
  "locked": true,
  "active_lock_reason": "too heated",
  "comments": 0,
  "pull_request": {
    "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
    "html_url": "https://github.com/octocat/Hello-World/pull/1347",
    "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
    "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
  },
  "closed_at": null,
  "created_at": "2011-04-22T13:33:48Z",
  "updated_at": "2011-04-22T13:33:48Z",
  "closed_by": {
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
  "author_association": "COLLABORATOR",
  "state_reason": "completed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumber404ErrorException`](../../doc/models/repos-issues-issue-number-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumber410ErrorException`](../../doc/models/repos-issues-issue-number-410-error-exception.md) |


# Issues Update

Issue owners and users with push access can edit an issue.

API method documentation: [https://docs.github.com/rest/reference/issues#update-an-issue](https://docs.github.com/rest/reference/issues#update-an-issue)

```java
CompletableFuture<ReposIssuesIssueNumberResponse> issuesUpdateAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final ReposIssuesIssueNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `body` | [`ReposIssuesIssueNumberRequest`](../../doc/models/repos-issues-issue-number-request.md) | Body, Optional | - |

## Response Type

[`ReposIssuesIssueNumberResponse`](../../doc/models/repos-issues-issue-number-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
ReposIssuesIssueNumberRequest body = new ReposIssuesIssueNumberRequest();
String title = "Found a bug";

ReposIssuesIssueNumberRequestTitle titleContainer = ReposIssuesIssueNumberRequestTitle.fromMString(title);

body.setTitle(titleContainer);
body.setBody("I'm having a problem with this.");
body.setState(State175Enum.OPEN);
int milestone = 1;

ReposIssuesIssueNumberRequestMilestone milestoneContainer = ReposIssuesIssueNumberRequestMilestone.fromNumber(milestone);

body.setMilestone(milestoneContainer);
List<ReposIssuesIssueNumberRequestLabels> labels = new LinkedList<>();
String labels0 = "bug";

ReposIssuesIssueNumberRequestLabels labelsContainer0 = ReposIssuesIssueNumberRequestLabels.fromMString(labels0);

labels.add(labelsContainer0);
body.setLabels(labels);
List<String> assignees = new LinkedList<>();
assignees.add("octocat");

body.setAssignees(assignees);

issuesController.issuesUpdateAsync(owner, repo, issueNumber, body).thenAccept(result -> {
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
  "node_id": "MDU6SXNzdWUx",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "repository_url": "https://api.github.com/repos/octocat/Hello-World",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
  "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347",
  "number": 1347,
  "state": "open",
  "title": "Found a bug",
  "body": "I'm having a problem with this.",
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
  "labels": [
    {
      "id": 208045946,
      "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
      "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
      "name": "bug",
      "description": "Something isn't working",
      "color": "f29513",
      "default": true
    }
  ],
  "assignee": {
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
  "assignees": [
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
  ],
  "milestone": {
    "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
    "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
    "id": 1002604,
    "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
    "number": 1,
    "state": "open",
    "title": "v1.0",
    "description": "Tracking milestone for version 1.0",
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
    "open_issues": 4,
    "closed_issues": 8,
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z",
    "closed_at": "2013-02-12T13:22:01Z",
    "due_on": "2012-10-09T23:39:01Z"
  },
  "locked": true,
  "active_lock_reason": "too heated",
  "comments": 0,
  "pull_request": {
    "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
    "html_url": "https://github.com/octocat/Hello-World/pull/1347",
    "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
    "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
  },
  "closed_at": null,
  "created_at": "2011-04-22T13:33:48Z",
  "updated_at": "2011-04-22T13:33:48Z",
  "closed_by": {
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
  "author_association": "COLLABORATOR",
  "state_reason": "completed"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposIssuesIssueNumber403ErrorException`](../../doc/models/repos-issues-issue-number-403-error-exception.md) |
| 404 | Resource not found | [`ReposIssuesIssueNumber404ErrorException`](../../doc/models/repos-issues-issue-number-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumber410ErrorException`](../../doc/models/repos-issues-issue-number-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesIssueNumber422ErrorException`](../../doc/models/repos-issues-issue-number-422-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Issues Add-Assignees

Adds up to 10 assignees to an issue. Users already assigned to an issue are not replaced.

API method documentation: [https://docs.github.com/rest/reference/issues#add-assignees-to-an-issue](https://docs.github.com/rest/reference/issues#add-assignees-to-an-issue)

```java
CompletableFuture<ReposIssuesIssueNumberAssigneesResponse> issuesAddAssigneesAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final ReposIssuesIssueNumberAssigneesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `body` | [`ReposIssuesIssueNumberAssigneesRequest`](../../doc/models/repos-issues-issue-number-assignees-request.md) | Body, Optional | - |

## Response Type

[`ReposIssuesIssueNumberAssigneesResponse`](../../doc/models/repos-issues-issue-number-assignees-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
ReposIssuesIssueNumberAssigneesRequest body = new ReposIssuesIssueNumberAssigneesRequest();
List<String> assignees = new LinkedList<>();
assignees.add("hubot");
assignees.add("other_user");

body.setAssignees(assignees);

issuesController.issuesAddAssigneesAsync(owner, repo, issueNumber, body).thenAccept(result -> {
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
  "node_id": "MDU6SXNzdWUx",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "repository_url": "https://api.github.com/repos/octocat/Hello-World",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
  "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347",
  "number": 1347,
  "state": "open",
  "title": "Found a bug",
  "body": "I'm having a problem with this.",
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
  "labels": [
    {
      "id": 208045946,
      "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
      "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
      "name": "bug",
      "description": "Something isn't working",
      "color": "f29513",
      "default": true
    }
  ],
  "assignee": {
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
  "assignees": [
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
  ],
  "milestone": {
    "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
    "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
    "id": 1002604,
    "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
    "number": 1,
    "state": "open",
    "title": "v1.0",
    "description": "Tracking milestone for version 1.0",
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
    "open_issues": 4,
    "closed_issues": 8,
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z",
    "closed_at": "2013-02-12T13:22:01Z",
    "due_on": "2012-10-09T23:39:01Z"
  },
  "locked": true,
  "active_lock_reason": "too heated",
  "comments": 0,
  "pull_request": {
    "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
    "html_url": "https://github.com/octocat/Hello-World/pull/1347",
    "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
    "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
  },
  "closed_at": null,
  "created_at": "2011-04-22T13:33:48Z",
  "updated_at": "2011-04-22T13:33:48Z",
  "closed_by": {
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
  "author_association": "COLLABORATOR",
  "state_reason": "completed"
}
```


# Issues Remove-Assignees

Removes one or more assignees from an issue.

API method documentation: [https://docs.github.com/rest/reference/issues#remove-assignees-from-an-issue](https://docs.github.com/rest/reference/issues#remove-assignees-from-an-issue)

```java
CompletableFuture<ReposIssuesIssueNumberAssigneesResponse> issuesRemoveAssigneesAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final ContentType3Enum contentType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `contentType` | [`ContentType3Enum`](../../doc/models/content-type-3-enum.md) | Header, Required | - |

## Response Type

[`ReposIssuesIssueNumberAssigneesResponse`](../../doc/models/repos-issues-issue-number-assignees-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
ContentType3Enum contentType = ContentType3Enum.ENUM_APPLICATIONJSON;

issuesController.issuesRemoveAssigneesAsync(owner, repo, issueNumber, contentType).thenAccept(result -> {
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
  "node_id": "MDU6SXNzdWUx",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "repository_url": "https://api.github.com/repos/octocat/Hello-World",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
  "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347",
  "number": 1347,
  "state": "open",
  "title": "Found a bug",
  "body": "I'm having a problem with this.",
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
  "labels": [
    {
      "id": 208045946,
      "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
      "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
      "name": "bug",
      "description": "Something isn't working",
      "color": "f29513",
      "default": true
    }
  ],
  "assignee": {
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
  "assignees": [
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
  ],
  "milestone": {
    "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
    "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
    "id": 1002604,
    "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
    "number": 1,
    "state": "open",
    "title": "v1.0",
    "description": "Tracking milestone for version 1.0",
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
    "open_issues": 4,
    "closed_issues": 8,
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z",
    "closed_at": "2013-02-12T13:22:01Z",
    "due_on": "2012-10-09T23:39:01Z"
  },
  "locked": true,
  "active_lock_reason": "too heated",
  "comments": 0,
  "pull_request": {
    "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
    "html_url": "https://github.com/octocat/Hello-World/pull/1347",
    "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
    "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
  },
  "closed_at": null,
  "created_at": "2011-04-22T13:33:48Z",
  "updated_at": "2011-04-22T13:33:48Z",
  "closed_by": {
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
  "author_association": "COLLABORATOR",
  "state_reason": "completed"
}
```


# Issues Check-User-Can-Be-Assigned-to-Issue

Checks if a user has permission to be assigned to a specific issue.

If the `assignee` can be assigned to this issue, a `204` status code with no content is returned.

Otherwise a `404` status code is returned.

API method documentation: [https://docs.github.com/rest/reference/issues#check-if-a-user-can-be-assigned-to-a-issue](https://docs.github.com/rest/reference/issues#check-if-a-user-can-be-assigned-to-a-issue)

```java
CompletableFuture<Void> issuesCheckUserCanBeAssignedToIssueAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final String assignee)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `assignee` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
String assignee = "assignee8";

issuesController.issuesCheckUserCanBeAssignedToIssueAsync(owner, repo, issueNumber, assignee).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Response if `assignee` can not be assigned to `issue_number` | [`ReposIssuesIssueNumberAssigneesAssignee404ErrorException`](../../doc/models/repos-issues-issue-number-assignees-assignee-404-error-exception.md) |


# Issues List-Comments

Issue Comments are ordered by ascending ID.

API method documentation: [https://docs.github.com/rest/reference/issues#list-issue-comments](https://docs.github.com/rest/reference/issues#list-issue-comments)

```java
CompletableFuture<List<IssueComment>> issuesListCommentsAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<IssueComment>`](../../doc/models/issue-comment.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListCommentsAsync(owner, repo, issueNumber, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDEyOklzc3VlQ29tbWVudDE=",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/comments/1",
    "html_url": "https://github.com/octocat/Hello-World/issues/1347#issuecomment-1",
    "body": "Me too",
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
    "created_at": "2011-04-14T16:00:49Z",
    "updated_at": "2011-04-14T16:00:49Z",
    "issue_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
    "author_association": "COLLABORATOR"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberComments404ErrorException`](../../doc/models/repos-issues-issue-number-comments-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberComments410ErrorException`](../../doc/models/repos-issues-issue-number-comments-410-error-exception.md) |


# Issues Create-Comment

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.

API method documentation: [https://docs.github.com/rest/reference/issues#create-an-issue-comment](https://docs.github.com/rest/reference/issues#create-an-issue-comment)

```java
CompletableFuture<ReposIssuesIssueNumberCommentsResponse> issuesCreateCommentAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final ReposIssuesCommentsCommentIdRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `body` | [`ReposIssuesCommentsCommentIdRequest`](../../doc/models/repos-issues-comments-comment-id-request.md) | Body, Required | - |

## Response Type

[`ReposIssuesIssueNumberCommentsResponse`](../../doc/models/repos-issues-issue-number-comments-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
ReposIssuesCommentsCommentIdRequest body = new ReposIssuesCommentsCommentIdRequest();
body.setBody("Me too");

issuesController.issuesCreateCommentAsync(owner, repo, issueNumber, body).thenAccept(result -> {
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
  "node_id": "MDEyOklzc3VlQ29tbWVudDE=",
  "url": "https://api.github.com/repos/octocat/Hello-World/issues/comments/1",
  "html_url": "https://github.com/octocat/Hello-World/issues/1347#issuecomment-1",
  "body": "Me too",
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
  "created_at": "2011-04-14T16:00:49Z",
  "updated_at": "2011-04-14T16:00:49Z",
  "issue_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "author_association": "COLLABORATOR"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposIssuesIssueNumberComments403ErrorException`](../../doc/models/repos-issues-issue-number-comments-403-error-exception.md) |
| 404 | Resource not found | [`ReposIssuesIssueNumberComments404ErrorException`](../../doc/models/repos-issues-issue-number-comments-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberComments410ErrorException`](../../doc/models/repos-issues-issue-number-comments-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesIssueNumberComments422ErrorException`](../../doc/models/repos-issues-issue-number-comments-422-error-exception.md) |


# Issues List-Events

List issue events

API method documentation: [https://docs.github.com/rest/reference/issues#list-issue-events](https://docs.github.com/rest/reference/issues#list-issue-events)

```java
CompletableFuture<List<IssueEventforIssue1>> issuesListEventsAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<IssueEventforIssue1>`](../../doc/models/issue-eventfor-issue-1.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListEventsAsync(owner, repo, issueNumber, perPage, page).thenAccept(result -> {
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
    "node_id": "MDEwOklzc3VlRXZlbnQx",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/events/1",
    "actor": {
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
    "event": "closed",
    "commit_id": "6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "commit_url": "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
    "created_at": "2011-04-14T16:00:49Z",
    "performed_via_github_app": null,
    "label": {
      "name": "label",
      "color": "red"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 410 | Gone | [`ReposIssuesIssueNumberEvents410ErrorException`](../../doc/models/repos-issues-issue-number-events-410-error-exception.md) |


# Issues List-Labels-on-Issue

List labels for an issue

API method documentation: [https://docs.github.com/rest/reference/issues#list-labels-for-an-issue](https://docs.github.com/rest/reference/issues#list-labels-for-an-issue)

```java
CompletableFuture<List<Label>> issuesListLabelsOnIssueAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Label>`](../../doc/models/label.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListLabelsOnIssueAsync(owner, repo, issueNumber, perPage, page).thenAccept(result -> {
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
    "id": 208045946,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
    "name": "bug",
    "description": "Something isn't working",
    "color": "f29513",
    "default": true
  },
  {
    "id": 208045947,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDc=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/enhancement",
    "name": "enhancement",
    "description": "New feature or request",
    "color": "a2eeef",
    "default": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberLabels404ErrorException`](../../doc/models/repos-issues-issue-number-labels-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberLabels410ErrorException`](../../doc/models/repos-issues-issue-number-labels-410-error-exception.md) |


# Issues Add-Labels

Add labels to an issue

API method documentation: [https://docs.github.com/rest/reference/issues#add-labels-to-an-issue](https://docs.github.com/rest/reference/issues#add-labels-to-an-issue)

```java
CompletableFuture<List<Label>> issuesAddLabelsAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final IssuesAddLabelsBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `body` | [`IssuesAddLabelsBody`]($m/IssuesAddLabelsBody) | Body, Optional | - |

## Response Type

[`List<Label>`](../../doc/models/label.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
ReposIssuesIssueNumberLabelsRequest body = new ReposIssuesIssueNumberLabelsRequest();
List<String> labels = new LinkedList<>();
labels.add("bug");
labels.add("enhancement");

body.setLabels(labels);


IssuesAddLabelsBody bodyContainer = IssuesAddLabelsBody.fromReposIssuesIssueNumberLabelsRequest(body);

issuesController.issuesAddLabelsAsync(owner, repo, issueNumber, bodyContainer).thenAccept(result -> {
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
    "id": 208045946,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
    "name": "bug",
    "description": "Something isn't working",
    "color": "f29513",
    "default": true
  },
  {
    "id": 208045947,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDc=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/enhancement",
    "name": "enhancement",
    "description": "New feature or request",
    "color": "a2eeef",
    "default": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberLabels404ErrorException`](../../doc/models/repos-issues-issue-number-labels-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberLabels410ErrorException`](../../doc/models/repos-issues-issue-number-labels-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesIssueNumberLabels422ErrorException`](../../doc/models/repos-issues-issue-number-labels-422-error-exception.md) |


# Issues Set-Labels

Removes any previous labels and sets the new labels for an issue.

API method documentation: [https://docs.github.com/rest/reference/issues#set-labels-for-an-issue](https://docs.github.com/rest/reference/issues#set-labels-for-an-issue)

```java
CompletableFuture<List<Label>> issuesSetLabelsAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final IssuesSetLabelsBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `body` | [`IssuesSetLabelsBody`]($m/IssuesSetLabelsBody) | Body, Optional | - |

## Response Type

[`List<Label>`](../../doc/models/label.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
ReposIssuesIssueNumberLabelsRequest3 body = new ReposIssuesIssueNumberLabelsRequest3();
List<String> labels = new LinkedList<>();
labels.add("bug");
labels.add("enhancement");

body.setLabels(labels);


IssuesSetLabelsBody bodyContainer = IssuesSetLabelsBody.fromReposIssuesIssueNumberLabelsRequest3(body);

issuesController.issuesSetLabelsAsync(owner, repo, issueNumber, bodyContainer).thenAccept(result -> {
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
    "id": 208045946,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
    "name": "bug",
    "description": "Something isn't working",
    "color": "f29513",
    "default": true
  },
  {
    "id": 208045947,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDc=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/enhancement",
    "name": "enhancement",
    "description": "New feature or request",
    "color": "a2eeef",
    "default": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberLabels404ErrorException`](../../doc/models/repos-issues-issue-number-labels-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberLabels410ErrorException`](../../doc/models/repos-issues-issue-number-labels-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesIssueNumberLabels422ErrorException`](../../doc/models/repos-issues-issue-number-labels-422-error-exception.md) |


# Issues Remove-All-Labels

Remove all labels from an issue

API method documentation: [https://docs.github.com/rest/reference/issues#remove-all-labels-from-an-issue](https://docs.github.com/rest/reference/issues#remove-all-labels-from-an-issue)

```java
CompletableFuture<Void> issuesRemoveAllLabelsAsync(
    final String owner,
    final String repo,
    final int issueNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;

issuesController.issuesRemoveAllLabelsAsync(owner, repo, issueNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberLabels404ErrorException`](../../doc/models/repos-issues-issue-number-labels-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberLabels410ErrorException`](../../doc/models/repos-issues-issue-number-labels-410-error-exception.md) |


# Issues Remove-Label

Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a `404 Not Found` status if the label does not exist.

API method documentation: [https://docs.github.com/rest/reference/issues#remove-a-label-from-an-issue](https://docs.github.com/rest/reference/issues#remove-a-label-from-an-issue)

```java
CompletableFuture<List<Label>> issuesRemoveLabelAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `name` | `String` | Template, Required | - |

## Response Type

[`List<Label>`](../../doc/models/label.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
String name = "name0";

issuesController.issuesRemoveLabelAsync(owner, repo, issueNumber, name).thenAccept(result -> {
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
    "id": 208045946,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
    "name": "bug",
    "description": "Something isn't working",
    "color": "f29513",
    "default": true
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberLabelsName404ErrorException`](../../doc/models/repos-issues-issue-number-labels-name-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberLabelsName410ErrorException`](../../doc/models/repos-issues-issue-number-labels-name-410-error-exception.md) |


# Issues Lock

Users with push access can lock an issue or pull request's conversation.

Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

API method documentation: [https://docs.github.com/rest/reference/issues#lock-an-issue](https://docs.github.com/rest/reference/issues#lock-an-issue)

```java
CompletableFuture<Void> issuesLockAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `body` | `Object` | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
Object body = com.github.api.ApiHelper.deserialize("{\"lock_reason\":\"off-topic\"}");

issuesController.issuesLockAsync(owner, repo, issueNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposIssuesIssueNumberLock403ErrorException`](../../doc/models/repos-issues-issue-number-lock-403-error-exception.md) |
| 404 | Resource not found | [`ReposIssuesIssueNumberLock404ErrorException`](../../doc/models/repos-issues-issue-number-lock-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberLock410ErrorException`](../../doc/models/repos-issues-issue-number-lock-410-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposIssuesIssueNumberLock422ErrorException`](../../doc/models/repos-issues-issue-number-lock-422-error-exception.md) |


# Issues Unlock

Users with push access can unlock an issue's conversation.

API method documentation: [https://docs.github.com/rest/reference/issues#unlock-an-issue](https://docs.github.com/rest/reference/issues#unlock-an-issue)

```java
CompletableFuture<Void> issuesUnlockAsync(
    final String owner,
    final String repo,
    final int issueNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;

issuesController.issuesUnlockAsync(owner, repo, issueNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposIssuesIssueNumberLock403ErrorException`](../../doc/models/repos-issues-issue-number-lock-403-error-exception.md) |
| 404 | Resource not found | [`ReposIssuesIssueNumberLock404ErrorException`](../../doc/models/repos-issues-issue-number-lock-404-error-exception.md) |


# Issues List-Events-for-Timeline

List timeline events for an issue

API method documentation: [https://docs.github.com/rest/reference/issues#list-timeline-events-for-an-issue](https://docs.github.com/rest/reference/issues#list-timeline-events-for-an-issue)

```java
CompletableFuture<List<TimelineEvent1>> issuesListEventsForTimelineAsync(
    final String owner,
    final String repo,
    final int issueNumber,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `issueNumber` | `int` | Template, Required | The number that identifies the issue. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<TimelineEvent1>`](../../doc/models/timeline-event-1.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int issueNumber = 76;
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListEventsForTimelineAsync(owner, repo, issueNumber, perPage, page).thenAccept(result -> {
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
    "id": 6430295168,
    "node_id": "LOE_lADODwFebM5HwC0kzwAAAAF_RoSA",
    "url": "https://api.github.com/repos/github/roadmap/issues/events/6430295168",
    "actor": {
      "login": "github",
      "id": 9919,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/github",
      "html_url": "https://github.com/github",
      "followers_url": "https://api.github.com/users/github/followers",
      "following_url": "https://api.github.com/users/github/following{/other_user}",
      "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github/subscriptions",
      "organizations_url": "https://api.github.com/users/github/orgs",
      "repos_url": "https://api.github.com/users/github/repos",
      "events_url": "https://api.github.com/users/github/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "event": "locked",
    "commit_id": null,
    "commit_url": null,
    "created_at": "2022-04-13T20:49:13Z",
    "lock_reason": null,
    "performed_via_github_app": null
  },
  {
    "id": 6430296748,
    "node_id": "LE_lADODwFebM5HwC0kzwAAAAF_Roqs",
    "url": "https://api.github.com/repos/github/roadmap/issues/events/6430296748",
    "actor": {
      "login": "github-product-roadmap",
      "id": 67656570,
      "node_id": "MDQ6VXNlcjY3NjU2NTcw",
      "avatar_url": "https://avatars.githubusercontent.com/u/67656570?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/github-product-roadmap",
      "html_url": "https://github.com/github-product-roadmap",
      "followers_url": "https://api.github.com/users/github-product-roadmap/followers",
      "following_url": "https://api.github.com/users/github-product-roadmap/following{/other_user}",
      "gists_url": "https://api.github.com/users/github-product-roadmap/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github-product-roadmap/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github-product-roadmap/subscriptions",
      "organizations_url": "https://api.github.com/users/github-product-roadmap/orgs",
      "repos_url": "https://api.github.com/users/github-product-roadmap/repos",
      "events_url": "https://api.github.com/users/github-product-roadmap/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github-product-roadmap/received_events",
      "type": "User",
      "site_admin": false
    },
    "event": "labeled",
    "commit_id": null,
    "commit_url": null,
    "created_at": "2022-04-13T20:49:34Z",
    "label": {
      "name": "beta",
      "color": "99dd88"
    },
    "performed_via_github_app": null
  },
  {
    "id": 6635165802,
    "node_id": "RTE_lADODwFebM5HwC0kzwAAAAGLfJhq",
    "url": "https://api.github.com/repos/github/roadmap/issues/events/6635165802",
    "actor": {
      "login": "github-product-roadmap",
      "id": 67656570,
      "node_id": "MDQ6VXNlcjY3NjU2NTcw",
      "avatar_url": "https://avatars.githubusercontent.com/u/67656570?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/github-product-roadmap",
      "html_url": "https://github.com/github-product-roadmap",
      "followers_url": "https://api.github.com/users/github-product-roadmap/followers",
      "following_url": "https://api.github.com/users/github-product-roadmap/following{/other_user}",
      "gists_url": "https://api.github.com/users/github-product-roadmap/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github-product-roadmap/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github-product-roadmap/subscriptions",
      "organizations_url": "https://api.github.com/users/github-product-roadmap/orgs",
      "repos_url": "https://api.github.com/users/github-product-roadmap/repos",
      "events_url": "https://api.github.com/users/github-product-roadmap/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github-product-roadmap/received_events",
      "type": "User",
      "site_admin": false
    },
    "event": "renamed",
    "commit_id": null,
    "commit_url": null,
    "created_at": "2022-05-18T19:29:01Z",
    "rename": {
      "from": "Secret scanning: dry-runs for enterprise-level custom patterns (cloud)",
      "to": "Secret scanning: dry-runs for enterprise-level custom patterns"
    },
    "performed_via_github_app": null
  },
  {
    "url": "https://api.github.com/repos/github/roadmap/issues/comments/1130876857",
    "html_url": "https://github.com/github/roadmap/issues/493#issuecomment-1130876857",
    "issue_url": "https://api.github.com/repos/github/roadmap/issues/493",
    "id": 1130876857,
    "node_id": "IC_kwDODwFebM5DZ8-5",
    "user": {
      "login": "octocat",
      "id": 94867353,
      "node_id": "U_kgDOBaePmQ",
      "avatar_url": "https://avatars.githubusercontent.com/u/94867353?v=4",
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
      "site_admin": true
    },
    "created_at": "2022-05-19T00:52:15Z",
    "updated_at": "2022-05-19T00:52:15Z",
    "author_association": "COLLABORATOR",
    "body": "🚢  Shipped to the cloud: https://github.blog/changelog/2022-05-12-secret-scanning-dry-runs-for-enterprise-level-custom-patterns/",
    "reactions": {
      "url": "https://api.github.com/repos/github/roadmap/issues/comments/1130876857/reactions",
      "total_count": 0,
      "plus1": 0,
      "minus1": 0,
      "laugh": 0,
      "hooray": 0,
      "confused": 0,
      "heart": 0,
      "rocket": 0,
      "eyes": 0
    },
    "performed_via_github_app": null,
    "event": "commented",
    "actor": {
      "login": "octocat",
      "id": 94867353,
      "node_id": "U_kgDOBaePmQ",
      "avatar_url": "https://avatars.githubusercontent.com/u/94867353?v=4",
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
      "site_admin": true
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposIssuesIssueNumberTimeline404ErrorException`](../../doc/models/repos-issues-issue-number-timeline-404-error-exception.md) |
| 410 | Gone | [`ReposIssuesIssueNumberTimeline410ErrorException`](../../doc/models/repos-issues-issue-number-timeline-410-error-exception.md) |


# Issues List-Labels-for-Repo

List labels for a repository

API method documentation: [https://docs.github.com/rest/reference/issues#list-labels-for-a-repository](https://docs.github.com/rest/reference/issues#list-labels-for-a-repository)

```java
CompletableFuture<List<Label>> issuesListLabelsForRepoAsync(
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

[`List<Label>`](../../doc/models/label.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListLabelsForRepoAsync(owner, repo, perPage, page).thenAccept(result -> {
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
    "id": 208045946,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
    "name": "bug",
    "description": "Something isn't working",
    "color": "f29513",
    "default": true
  },
  {
    "id": 208045947,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDc=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/enhancement",
    "name": "enhancement",
    "description": "New feature or request",
    "color": "a2eeef",
    "default": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposLabels404ErrorException`](../../doc/models/repos-labels-404-error-exception.md) |


# Issues Create-Label

Create a label

API method documentation: [https://docs.github.com/rest/reference/issues#create-a-label](https://docs.github.com/rest/reference/issues#create-a-label)

```java
CompletableFuture<ReposLabelsResponse> issuesCreateLabelAsync(
    final String owner,
    final String repo,
    final ReposLabelsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposLabelsRequest`](../../doc/models/repos-labels-request.md) | Body, Required | - |

## Response Type

[`ReposLabelsResponse`](../../doc/models/repos-labels-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposLabelsRequest body = new ReposLabelsRequest();
body.setName("bug");
body.setColor("f29513");
body.setDescription("Something isn't working");

issuesController.issuesCreateLabelAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 208045946,
  "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
  "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
  "name": "bug",
  "description": "Something isn't working",
  "color": "f29513",
  "default": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposLabels404ErrorException`](../../doc/models/repos-labels-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposLabels422ErrorException`](../../doc/models/repos-labels-422-error-exception.md) |


# Issues Get-Label

Get a label

API method documentation: [https://docs.github.com/rest/reference/issues#get-a-label](https://docs.github.com/rest/reference/issues#get-a-label)

```java
CompletableFuture<ReposLabelsNameResponse> issuesGetLabelAsync(
    final String owner,
    final String repo,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `name` | `String` | Template, Required | - |

## Response Type

[`ReposLabelsNameResponse`](../../doc/models/repos-labels-name-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String name = "name0";

issuesController.issuesGetLabelAsync(owner, repo, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 208045946,
  "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
  "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
  "name": "bug",
  "description": "Something isn't working",
  "color": "f29513",
  "default": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposLabelsName404ErrorException`](../../doc/models/repos-labels-name-404-error-exception.md) |


# Issues Update-Label

Update a label

API method documentation: [https://docs.github.com/rest/reference/issues#update-a-label](https://docs.github.com/rest/reference/issues#update-a-label)

```java
CompletableFuture<ReposLabelsNameResponse> issuesUpdateLabelAsync(
    final String owner,
    final String repo,
    final String name,
    final ReposLabelsNameRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `name` | `String` | Template, Required | - |
| `body` | [`ReposLabelsNameRequest`](../../doc/models/repos-labels-name-request.md) | Body, Optional | - |

## Response Type

[`ReposLabelsNameResponse`](../../doc/models/repos-labels-name-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String name = "name0";
ReposLabelsNameRequest body = new ReposLabelsNameRequest();
body.setNewName("bug :bug:");
body.setColor("b01f26");
body.setDescription("Small bug fix required");

issuesController.issuesUpdateLabelAsync(owner, repo, name, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 208045946,
  "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
  "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug%20:bug:",
  "name": "bug :bug:",
  "description": "Small bug fix required",
  "color": "b01f26",
  "default": true
}
```


# Issues Delete-Label

Delete a label

API method documentation: [https://docs.github.com/rest/reference/issues#delete-a-label](https://docs.github.com/rest/reference/issues#delete-a-label)

```java
CompletableFuture<Void> issuesDeleteLabelAsync(
    final String owner,
    final String repo,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `name` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String name = "name0";

issuesController.issuesDeleteLabelAsync(owner, repo, name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Issues List-Milestones

List milestones

API method documentation: [https://docs.github.com/rest/reference/issues#list-milestones](https://docs.github.com/rest/reference/issues#list-milestones)

```java
CompletableFuture<List<Milestone>> issuesListMilestonesAsync(
    final String owner,
    final String repo,
    final State1674Enum state,
    final Sort121Enum sort,
    final Direction16Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `state` | [`State1674Enum`](../../doc/models/state-1674-enum.md) | Query, Optional | The state of the milestone. Either `open`, `closed`, or `all`. |
| `sort` | [`Sort121Enum`](../../doc/models/sort-121-enum.md) | Query, Optional | What to sort results by. Either `due_on` or `completeness`. |
| `direction` | [`Direction16Enum`](../../doc/models/direction-16-enum.md) | Query, Optional | The direction of the sort. Either `asc` or `desc`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Milestone>`](../../doc/models/milestone.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListMilestonesAsync(owner, repo, null, null, null, perPage, page).thenAccept(result -> {
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
    "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
    "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
    "id": 1002604,
    "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
    "number": 1,
    "state": "open",
    "title": "v1.0",
    "description": "Tracking milestone for version 1.0",
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
    "open_issues": 4,
    "closed_issues": 8,
    "created_at": "2011-04-10T20:09:31Z",
    "updated_at": "2014-03-03T18:58:10Z",
    "closed_at": "2013-02-12T13:22:01Z",
    "due_on": "2012-10-09T23:39:01Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposMilestones404ErrorException`](../../doc/models/repos-milestones-404-error-exception.md) |


# Issues Create-Milestone

Create a milestone

API method documentation: [https://docs.github.com/rest/reference/issues#create-a-milestone](https://docs.github.com/rest/reference/issues#create-a-milestone)

```java
CompletableFuture<ReposMilestonesResponse> issuesCreateMilestoneAsync(
    final String owner,
    final String repo,
    final ReposMilestonesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposMilestonesRequest`](../../doc/models/repos-milestones-request.md) | Body, Required | - |

## Response Type

[`ReposMilestonesResponse`](../../doc/models/repos-milestones-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposMilestonesRequest body = new ReposMilestonesRequest();
body.setTitle("v1.0");
body.setState(State177Enum.OPEN);
body.setDescription("Tracking milestone for version 1.0");
body.setDueOn(LocalDateTime.parse("2012-10-09T23:39:01Z", DateTimeFormatter.ISO_DATE_TIME));

issuesController.issuesCreateMilestoneAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
  "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
  "id": 1002604,
  "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
  "number": 1,
  "state": "open",
  "title": "v1.0",
  "description": "Tracking milestone for version 1.0",
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
  "open_issues": 4,
  "closed_issues": 8,
  "created_at": "2011-04-10T20:09:31Z",
  "updated_at": "2014-03-03T18:58:10Z",
  "closed_at": "2013-02-12T13:22:01Z",
  "due_on": "2012-10-09T23:39:01Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposMilestones404ErrorException`](../../doc/models/repos-milestones-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposMilestones422ErrorException`](../../doc/models/repos-milestones-422-error-exception.md) |


# Issues Get-Milestone

Get a milestone

API method documentation: [https://docs.github.com/rest/reference/issues#get-a-milestone](https://docs.github.com/rest/reference/issues#get-a-milestone)

```java
CompletableFuture<ReposMilestonesMilestoneNumberResponse> issuesGetMilestoneAsync(
    final String owner,
    final String repo,
    final int milestoneNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `milestoneNumber` | `int` | Template, Required | The number that identifies the milestone. |

## Response Type

[`ReposMilestonesMilestoneNumberResponse`](../../doc/models/repos-milestones-milestone-number-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int milestoneNumber = 32;

issuesController.issuesGetMilestoneAsync(owner, repo, milestoneNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
  "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
  "id": 1002604,
  "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
  "number": 1,
  "state": "open",
  "title": "v1.0",
  "description": "Tracking milestone for version 1.0",
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
  "open_issues": 4,
  "closed_issues": 8,
  "created_at": "2011-04-10T20:09:31Z",
  "updated_at": "2014-03-03T18:58:10Z",
  "closed_at": "2013-02-12T13:22:01Z",
  "due_on": "2012-10-09T23:39:01Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposMilestonesMilestoneNumber404ErrorException`](../../doc/models/repos-milestones-milestone-number-404-error-exception.md) |


# Issues Update-Milestone

Update a milestone

API method documentation: [https://docs.github.com/rest/reference/issues#update-a-milestone](https://docs.github.com/rest/reference/issues#update-a-milestone)

```java
CompletableFuture<ReposMilestonesMilestoneNumberResponse> issuesUpdateMilestoneAsync(
    final String owner,
    final String repo,
    final int milestoneNumber,
    final ReposMilestonesMilestoneNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `milestoneNumber` | `int` | Template, Required | The number that identifies the milestone. |
| `body` | [`ReposMilestonesMilestoneNumberRequest`](../../doc/models/repos-milestones-milestone-number-request.md) | Body, Optional | - |

## Response Type

[`ReposMilestonesMilestoneNumberResponse`](../../doc/models/repos-milestones-milestone-number-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int milestoneNumber = 32;
ReposMilestonesMilestoneNumberRequest body = new ReposMilestonesMilestoneNumberRequest();
body.setTitle("v1.0");
body.setState(State177Enum.OPEN);
body.setDescription("Tracking milestone for version 1.0");
body.setDueOn(LocalDateTime.parse("2012-10-09T23:39:01Z", DateTimeFormatter.ISO_DATE_TIME));

issuesController.issuesUpdateMilestoneAsync(owner, repo, milestoneNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
  "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
  "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
  "id": 1002604,
  "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
  "number": 1,
  "state": "open",
  "title": "v1.0",
  "description": "Tracking milestone for version 1.0",
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
  "open_issues": 4,
  "closed_issues": 8,
  "created_at": "2011-04-10T20:09:31Z",
  "updated_at": "2014-03-03T18:58:10Z",
  "closed_at": "2013-02-12T13:22:01Z",
  "due_on": "2012-10-09T23:39:01Z"
}
```


# Issues Delete-Milestone

Delete a milestone

API method documentation: [https://docs.github.com/rest/reference/issues#delete-a-milestone](https://docs.github.com/rest/reference/issues#delete-a-milestone)

```java
CompletableFuture<Void> issuesDeleteMilestoneAsync(
    final String owner,
    final String repo,
    final int milestoneNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `milestoneNumber` | `int` | Template, Required | The number that identifies the milestone. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int milestoneNumber = 32;

issuesController.issuesDeleteMilestoneAsync(owner, repo, milestoneNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposMilestonesMilestoneNumber404ErrorException`](../../doc/models/repos-milestones-milestone-number-404-error-exception.md) |


# Issues List-Labels-for-Milestone

List labels for issues in a milestone

API method documentation: [https://docs.github.com/rest/reference/issues#list-labels-for-issues-in-a-milestone](https://docs.github.com/rest/reference/issues#list-labels-for-issues-in-a-milestone)

```java
CompletableFuture<List<Label>> issuesListLabelsForMilestoneAsync(
    final String owner,
    final String repo,
    final int milestoneNumber,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `milestoneNumber` | `int` | Template, Required | The number that identifies the milestone. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Label>`](../../doc/models/label.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int milestoneNumber = 32;
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListLabelsForMilestoneAsync(owner, repo, milestoneNumber, perPage, page).thenAccept(result -> {
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
    "id": 208045946,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
    "name": "bug",
    "description": "Something isn't working",
    "color": "f29513",
    "default": true
  },
  {
    "id": 208045947,
    "node_id": "MDU6TGFiZWwyMDgwNDU5NDc=",
    "url": "https://api.github.com/repos/octocat/Hello-World/labels/enhancement",
    "name": "enhancement",
    "description": "New feature or request",
    "color": "a2eeef",
    "default": false
  }
]
```


# Issues List-for-Authenticated-User

List issues across owned and member repositories assigned to the authenticated user.

**Note**: GitHub's REST API considers every pull request an issue, but not every issue is a pull request. For this
reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by
the `pull_request` key. Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull
request id, use the "[List pull requests](https://docs.github.com/rest/reference/pulls#list-pull-requests)" endpoint.

API method documentation: [https://docs.github.com/rest/reference/issues#list-user-account-issues-assigned-to-the-authenticated-user](https://docs.github.com/rest/reference/issues#list-user-account-issues-assigned-to-the-authenticated-user)

```java
CompletableFuture<List<Issue>> issuesListForAuthenticatedUserAsync(
    final Filter1Enum filter,
    final State1671Enum state,
    final String labels,
    final Sort23Enum sort,
    final Direction1Enum direction,
    final LocalDateTime since,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `filter` | [`Filter1Enum`](../../doc/models/filter-1-enum.md) | Query, Optional | Indicates which sorts of issues to return. `assigned` means issues assigned to you. `created` means issues created by you. `mentioned` means issues mentioning you. `subscribed` means issues you're subscribed to updates for. `all` or `repos` means all issues you can see, regardless of participation or creation. |
| `state` | [`State1671Enum`](../../doc/models/state-1671-enum.md) | Query, Optional | Indicates the state of the issues to return. |
| `labels` | `String` | Query, Optional | A list of comma separated label names. Example: `bug,ui,@high` |
| `sort` | [`Sort23Enum`](../../doc/models/sort-23-enum.md) | Query, Optional | What to sort results by. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `since` | `LocalDateTime` | Query, Optional | Only show notifications updated after the given time. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Issue>`](../../doc/models/issue.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

issuesController.issuesListForAuthenticatedUserAsync(null, null, null, null, null, null, perPage, page).thenAccept(result -> {
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
    "node_id": "MDU6SXNzdWUx",
    "url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
    "repository_url": "https://api.github.com/repos/octocat/Hello-World",
    "labels_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/labels{/name}",
    "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
    "events_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/events",
    "html_url": "https://github.com/octocat/Hello-World/issues/1347",
    "number": 1347,
    "state": "open",
    "title": "Found a bug",
    "body": "I'm having a problem with this.",
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
    "labels": [
      {
        "id": 208045946,
        "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
        "url": "https://api.github.com/repos/octocat/Hello-World/labels/bug",
        "name": "bug",
        "description": "Something isn't working",
        "color": "f29513",
        "default": true
      }
    ],
    "assignee": {
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
    "assignees": [
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
    ],
    "milestone": {
      "url": "https://api.github.com/repos/octocat/Hello-World/milestones/1",
      "html_url": "https://github.com/octocat/Hello-World/milestones/v1.0",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/milestones/1/labels",
      "id": 1002604,
      "node_id": "MDk6TWlsZXN0b25lMTAwMjYwNA==",
      "number": 1,
      "state": "open",
      "title": "v1.0",
      "description": "Tracking milestone for version 1.0",
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
      "open_issues": 4,
      "closed_issues": 8,
      "created_at": "2011-04-10T20:09:31Z",
      "updated_at": "2014-03-03T18:58:10Z",
      "closed_at": "2013-02-12T13:22:01Z",
      "due_on": "2012-10-09T23:39:01Z"
    },
    "locked": true,
    "active_lock_reason": "too heated",
    "comments": 0,
    "pull_request": {
      "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
      "html_url": "https://github.com/octocat/Hello-World/pull/1347",
      "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
      "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch"
    },
    "closed_at": null,
    "created_at": "2011-04-22T13:33:48Z",
    "updated_at": "2011-04-22T13:33:48Z",
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
    },
    "author_association": "COLLABORATOR"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`UserIssues404ErrorException`](../../doc/models/user-issues-404-error-exception.md) |

