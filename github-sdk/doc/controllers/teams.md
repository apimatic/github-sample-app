# Teams

Interact with GitHub Teams.

```java
TeamsController teamsController = client.getTeamsController();
```

## Class Name

`TeamsController`

## Methods

* [Teams List](../../doc/controllers/teams.md#teams-list)
* [Teams Create](../../doc/controllers/teams.md#teams-create)
* [Teams Get-by-Name](../../doc/controllers/teams.md#teams-get-by-name)
* [Teams Update-in-Org](../../doc/controllers/teams.md#teams-update-in-org)
* [Teams Delete-in-Org](../../doc/controllers/teams.md#teams-delete-in-org)
* [Teams List-Discussions-in-Org](../../doc/controllers/teams.md#teams-list-discussions-in-org)
* [Teams Create-Discussion-in-Org](../../doc/controllers/teams.md#teams-create-discussion-in-org)
* [Teams Get-Discussion-in-Org](../../doc/controllers/teams.md#teams-get-discussion-in-org)
* [Teams Update-Discussion-in-Org](../../doc/controllers/teams.md#teams-update-discussion-in-org)
* [Teams Delete-Discussion-in-Org](../../doc/controllers/teams.md#teams-delete-discussion-in-org)
* [Teams List-Discussion-Comments-in-Org](../../doc/controllers/teams.md#teams-list-discussion-comments-in-org)
* [Teams Create-Discussion-Comment-in-Org](../../doc/controllers/teams.md#teams-create-discussion-comment-in-org)
* [Teams Get-Discussion-Comment-in-Org](../../doc/controllers/teams.md#teams-get-discussion-comment-in-org)
* [Teams Update-Discussion-Comment-in-Org](../../doc/controllers/teams.md#teams-update-discussion-comment-in-org)
* [Teams Delete-Discussion-Comment-in-Org](../../doc/controllers/teams.md#teams-delete-discussion-comment-in-org)
* [Teams List-Pending-Invitations-in-Org](../../doc/controllers/teams.md#teams-list-pending-invitations-in-org)
* [Teams List-Members-in-Org](../../doc/controllers/teams.md#teams-list-members-in-org)
* [Teams Get-Membership-for-User-in-Org](../../doc/controllers/teams.md#teams-get-membership-for-user-in-org)
* [Teams Add-or-Update-Membership-for-User-in-Org](../../doc/controllers/teams.md#teams-add-or-update-membership-for-user-in-org)
* [Teams Remove-Membership-for-User-in-Org](../../doc/controllers/teams.md#teams-remove-membership-for-user-in-org)
* [Teams List-Projects-in-Org](../../doc/controllers/teams.md#teams-list-projects-in-org)
* [Teams Check-Permissions-for-Project-in-Org](../../doc/controllers/teams.md#teams-check-permissions-for-project-in-org)
* [Teams Add-or-Update-Project-Permissions-in-Org](../../doc/controllers/teams.md#teams-add-or-update-project-permissions-in-org)
* [Teams Remove-Project-in-Org](../../doc/controllers/teams.md#teams-remove-project-in-org)
* [Teams List-Repos-in-Org](../../doc/controllers/teams.md#teams-list-repos-in-org)
* [Teams Check-Permissions-for-Repo-in-Org](../../doc/controllers/teams.md#teams-check-permissions-for-repo-in-org)
* [Teams Add-or-Update-Repo-Permissions-in-Org](../../doc/controllers/teams.md#teams-add-or-update-repo-permissions-in-org)
* [Teams Remove-Repo-in-Org](../../doc/controllers/teams.md#teams-remove-repo-in-org)
* [Teams List-Child-in-Org](../../doc/controllers/teams.md#teams-list-child-in-org)
* [Teams Get-Legacy](../../doc/controllers/teams.md#teams-get-legacy)
* [Teams Update-Legacy](../../doc/controllers/teams.md#teams-update-legacy)
* [Teams Delete-Legacy](../../doc/controllers/teams.md#teams-delete-legacy)
* [Teams List-Discussions-Legacy](../../doc/controllers/teams.md#teams-list-discussions-legacy)
* [Teams Create-Discussion-Legacy](../../doc/controllers/teams.md#teams-create-discussion-legacy)
* [Teams Get-Discussion-Legacy](../../doc/controllers/teams.md#teams-get-discussion-legacy)
* [Teams Update-Discussion-Legacy](../../doc/controllers/teams.md#teams-update-discussion-legacy)
* [Teams Delete-Discussion-Legacy](../../doc/controllers/teams.md#teams-delete-discussion-legacy)
* [Teams List-Discussion-Comments-Legacy](../../doc/controllers/teams.md#teams-list-discussion-comments-legacy)
* [Teams Create-Discussion-Comment-Legacy](../../doc/controllers/teams.md#teams-create-discussion-comment-legacy)
* [Teams Get-Discussion-Comment-Legacy](../../doc/controllers/teams.md#teams-get-discussion-comment-legacy)
* [Teams Update-Discussion-Comment-Legacy](../../doc/controllers/teams.md#teams-update-discussion-comment-legacy)
* [Teams Delete-Discussion-Comment-Legacy](../../doc/controllers/teams.md#teams-delete-discussion-comment-legacy)
* [Teams List-Pending-Invitations-Legacy](../../doc/controllers/teams.md#teams-list-pending-invitations-legacy)
* [Teams List-Members-Legacy](../../doc/controllers/teams.md#teams-list-members-legacy)
* [Teams Get-Member-Legacy](../../doc/controllers/teams.md#teams-get-member-legacy)
* [Teams Add-Member-Legacy](../../doc/controllers/teams.md#teams-add-member-legacy)
* [Teams Remove-Member-Legacy](../../doc/controllers/teams.md#teams-remove-member-legacy)
* [Teams Get-Membership-for-User-Legacy](../../doc/controllers/teams.md#teams-get-membership-for-user-legacy)
* [Teams Add-or-Update-Membership-for-User-Legacy](../../doc/controllers/teams.md#teams-add-or-update-membership-for-user-legacy)
* [Teams Remove-Membership-for-User-Legacy](../../doc/controllers/teams.md#teams-remove-membership-for-user-legacy)
* [Teams List-Projects-Legacy](../../doc/controllers/teams.md#teams-list-projects-legacy)
* [Teams Check-Permissions-for-Project-Legacy](../../doc/controllers/teams.md#teams-check-permissions-for-project-legacy)
* [Teams Add-or-Update-Project-Permissions-Legacy](../../doc/controllers/teams.md#teams-add-or-update-project-permissions-legacy)
* [Teams Remove-Project-Legacy](../../doc/controllers/teams.md#teams-remove-project-legacy)
* [Teams List-Repos-Legacy](../../doc/controllers/teams.md#teams-list-repos-legacy)
* [Teams Check-Permissions-for-Repo-Legacy](../../doc/controllers/teams.md#teams-check-permissions-for-repo-legacy)
* [Teams Add-or-Update-Repo-Permissions-Legacy](../../doc/controllers/teams.md#teams-add-or-update-repo-permissions-legacy)
* [Teams Remove-Repo-Legacy](../../doc/controllers/teams.md#teams-remove-repo-legacy)
* [Teams List-Child-Legacy](../../doc/controllers/teams.md#teams-list-child-legacy)
* [Teams List-for-Authenticated-User](../../doc/controllers/teams.md#teams-list-for-authenticated-user)


# Teams List

Lists all teams in an organization that are visible to the authenticated user.

API method documentation: [https://docs.github.com/rest/reference/teams#list-teams](https://docs.github.com/rest/reference/teams#list-teams)

```java
CompletableFuture<List<Team>> teamsListAsync(
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

[`List<Team>`](../../doc/models/team.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListAsync(org, perPage, page).thenAccept(result -> {
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
| 403 | Forbidden | [`OrgsTeams403ErrorException`](../../doc/models/orgs-teams-403-error-exception.md) |


# Teams Create

To create a team, the authenticated user must be a member or owner of `{org}`. By default, organization members can create teams. Organization owners can limit team creation to organization owners. For more information, see "[Setting team creation permissions](https://docs.github.com/articles/setting-team-creation-permissions-in-your-organization)."

When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the optional array of `maintainers`. For more information, see "[About teams](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/about-teams)".

API method documentation: [https://docs.github.com/rest/reference/teams#create-a-team](https://docs.github.com/rest/reference/teams#create-a-team)

```java
CompletableFuture<OrgsTeamsResponse> teamsCreateAsync(
    final String org,
    final OrgsTeamsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsTeamsRequest`](../../doc/models/orgs-teams-request.md) | Body, Required | - |

## Response Type

[`OrgsTeamsResponse`](../../doc/models/orgs-teams-response.md)

## Example Usage

```java
String org = "org6";
OrgsTeamsRequest body = new OrgsTeamsRequest();
body.setName("Justice League");
body.setDescription("A great team");
body.setPrivacy(Privacy146Enum.CLOSED);
body.setPermission(Permission2Enum.PUSH);

teamsController.teamsCreateAsync(org, body).thenAccept(result -> {
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
  "parent": null,
  "members_count": 3,
  "repos_count": 10,
  "created_at": "2017-07-14T16:53:42Z",
  "updated_at": "2017-08-17T12:37:15Z",
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
    "description": "A great organization",
    "name": "github",
    "company": "GitHub",
    "blog": "https://github.com/blog",
    "location": "San Francisco",
    "email": "octocat@github.com",
    "is_verified": true,
    "has_organization_projects": true,
    "has_repository_projects": true,
    "public_repos": 2,
    "public_gists": 1,
    "followers": 20,
    "following": 0,
    "html_url": "https://github.com/octocat",
    "created_at": "2008-01-14T04:33:35Z",
    "updated_at": "2017-08-17T12:37:15Z",
    "type": "Organization"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsTeams403ErrorException`](../../doc/models/orgs-teams-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsTeams422ErrorException`](../../doc/models/orgs-teams-422-error-exception.md) |


# Teams Get-by-Name

Gets a team using the team's `slug`. GitHub generates the `slug` from the team `name`.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}`.

API method documentation: [https://docs.github.com/rest/reference/teams#get-a-team-by-name](https://docs.github.com/rest/reference/teams#get-a-team-by-name)

```java
CompletableFuture<OrgsTeamsResponse> teamsGetByNameAsync(
    final String org,
    final String teamSlug)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |

## Response Type

[`OrgsTeamsResponse`](../../doc/models/orgs-teams-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";

teamsController.teamsGetByNameAsync(org, teamSlug).thenAccept(result -> {
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
  "parent": null,
  "members_count": 3,
  "repos_count": 10,
  "created_at": "2017-07-14T16:53:42Z",
  "updated_at": "2017-08-17T12:37:15Z",
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
    "description": "A great organization",
    "name": "github",
    "company": "GitHub",
    "blog": "https://github.com/blog",
    "location": "San Francisco",
    "email": "octocat@github.com",
    "is_verified": true,
    "has_organization_projects": true,
    "has_repository_projects": true,
    "public_repos": 2,
    "public_gists": 1,
    "followers": 20,
    "following": 0,
    "html_url": "https://github.com/octocat",
    "created_at": "2008-01-14T04:33:35Z",
    "updated_at": "2017-08-17T12:37:15Z",
    "type": "Organization"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsTeams404ErrorException`](../../doc/models/orgs-teams-404-error-exception.md) |


# Teams Update-in-Org

To edit a team, the authenticated user must either be an organization owner or a team maintainer.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/{org_id}/team/{team_id}`.

API method documentation: [https://docs.github.com/rest/reference/teams#update-a-team](https://docs.github.com/rest/reference/teams#update-a-team)

```java
CompletableFuture<OrgsTeamsResponse> teamsUpdateInOrgAsync(
    final String org,
    final String teamSlug,
    final OrgsTeamsRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `body` | [`OrgsTeamsRequest1`](../../doc/models/orgs-teams-request-1.md) | Body, Optional | - |

## Response Type

[`OrgsTeamsResponse`](../../doc/models/orgs-teams-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
OrgsTeamsRequest1 body = new OrgsTeamsRequest1();
body.setName("new team name");
body.setDescription("new team description");
body.setPrivacy(Privacy147Enum.CLOSED);

teamsController.teamsUpdateInOrgAsync(org, teamSlug, body).thenAccept(result -> {
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
  "parent": null,
  "members_count": 3,
  "repos_count": 10,
  "created_at": "2017-07-14T16:53:42Z",
  "updated_at": "2017-08-17T12:37:15Z",
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
    "description": "A great organization",
    "name": "github",
    "company": "GitHub",
    "blog": "https://github.com/blog",
    "location": "San Francisco",
    "email": "octocat@github.com",
    "is_verified": true,
    "has_organization_projects": true,
    "has_repository_projects": true,
    "public_repos": 2,
    "public_gists": 1,
    "followers": 20,
    "following": 0,
    "html_url": "https://github.com/octocat",
    "created_at": "2008-01-14T04:33:35Z",
    "updated_at": "2017-08-17T12:37:15Z",
    "type": "Organization"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`OrgsTeams403ErrorException`](../../doc/models/orgs-teams-403-error-exception.md) |
| 404 | Resource not found | [`OrgsTeams404ErrorException`](../../doc/models/orgs-teams-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsTeams422ErrorException`](../../doc/models/orgs-teams-422-error-exception.md) |


# Teams Delete-in-Org

To delete a team, the authenticated user must be an organization owner or team maintainer.

If you are an organization owner, deleting a parent team will delete all of its child teams as well.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}`.

API method documentation: [https://docs.github.com/rest/reference/teams#delete-a-team](https://docs.github.com/rest/reference/teams#delete-a-team)

```java
CompletableFuture<Void> teamsDeleteInOrgAsync(
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

teamsController.teamsDeleteInOrgAsync(org, teamSlug).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Discussions-in-Org

List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/discussions`.

API method documentation: [https://docs.github.com/rest/reference/teams#list-discussions](https://docs.github.com/rest/reference/teams#list-discussions)

```java
CompletableFuture<List<TeamDiscussion>> teamsListDiscussionsInOrgAsync(
    final String org,
    final String teamSlug,
    final Direction1Enum direction,
    final Integer perPage,
    final Integer page,
    final String pinned)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `pinned` | `String` | Query, Optional | Pinned discussions only filter |

## Response Type

[`List<TeamDiscussion>`](../../doc/models/team-discussion.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListDiscussionsInOrgAsync(org, teamSlug, null, perPage, page, null).thenAccept(result -> {
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
    "author": {
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
    "body": "Hi! This is an area for us to collaborate as a team.",
    "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
    "body_version": "0d495416a700fb06133c612575d92bfb",
    "comments_count": 0,
    "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
    "created_at": "2018-01-25T18:56:31Z",
    "last_edited_at": null,
    "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
    "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
    "number": 1,
    "pinned": false,
    "private": false,
    "team_url": "https://api.github.com/teams/2343027",
    "title": "Our first team post",
    "updated_at": "2018-01-25T18:56:31Z",
    "url": "https://api.github.com/teams/2343027/discussions/1",
    "reactions": {
      "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
      "total_count": 5,
      "plus1": 3,
      "minus1": 1,
      "laugh": 0,
      "confused": 0,
      "heart": 1,
      "hooray": 0,
      "eyes": 1,
      "rocket": 1
    }
  }
]
```


# Teams Create-Discussion-in-Org

Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/{org_id}/team/{team_id}/discussions`.

API method documentation: [https://docs.github.com/rest/reference/teams#create-a-discussion](https://docs.github.com/rest/reference/teams#create-a-discussion)

```java
CompletableFuture<OrgsTeamsDiscussionsResponse> teamsCreateDiscussionInOrgAsync(
    final String org,
    final String teamSlug,
    final OrgsTeamsDiscussionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `body` | [`OrgsTeamsDiscussionsRequest`](../../doc/models/orgs-teams-discussions-request.md) | Body, Required | - |

## Response Type

[`OrgsTeamsDiscussionsResponse`](../../doc/models/orgs-teams-discussions-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
OrgsTeamsDiscussionsRequest body = new OrgsTeamsDiscussionsRequest();
body.setTitle("Our first team post");
body.setBody("Hi! This is an area for us to collaborate as a team.");

teamsController.teamsCreateDiscussionInOrgAsync(org, teamSlug, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Hi! This is an area for us to collaborate as a team.",
  "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
  "body_version": "0d495416a700fb06133c612575d92bfb",
  "comments_count": 0,
  "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
  "created_at": "2018-01-25T18:56:31Z",
  "last_edited_at": null,
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
  "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
  "number": 1,
  "pinned": false,
  "private": false,
  "team_url": "https://api.github.com/teams/2343027",
  "title": "Our first team post",
  "updated_at": "2018-01-25T18:56:31Z",
  "url": "https://api.github.com/teams/2343027/discussions/1",
  "reactions": {
    "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Get-Discussion-in-Org

Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}`.

API method documentation: [https://docs.github.com/rest/reference/teams#get-a-discussion](https://docs.github.com/rest/reference/teams#get-a-discussion)

```java
CompletableFuture<OrgsTeamsDiscussionsDiscussionNumberResponse> teamsGetDiscussionInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |

## Response Type

[`OrgsTeamsDiscussionsDiscussionNumberResponse`](../../doc/models/orgs-teams-discussions-discussion-number-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;

teamsController.teamsGetDiscussionInOrgAsync(org, teamSlug, discussionNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Hi! This is an area for us to collaborate as a team.",
  "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
  "body_version": "0d495416a700fb06133c612575d92bfb",
  "comments_count": 0,
  "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
  "created_at": "2018-01-25T18:56:31Z",
  "last_edited_at": null,
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
  "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
  "number": 1,
  "pinned": false,
  "private": false,
  "team_url": "https://api.github.com/teams/2343027",
  "title": "Our first team post",
  "updated_at": "2018-01-25T18:56:31Z",
  "url": "https://api.github.com/teams/2343027/discussions/1",
  "reactions": {
    "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Update-Discussion-in-Org

Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}`.

API method documentation: [https://docs.github.com/rest/reference/teams#update-a-discussion](https://docs.github.com/rest/reference/teams#update-a-discussion)

```java
CompletableFuture<OrgsTeamsDiscussionsDiscussionNumberResponse> teamsUpdateDiscussionInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final OrgsTeamsDiscussionsDiscussionNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberRequest`](../../doc/models/orgs-teams-discussions-discussion-number-request.md) | Body, Optional | - |

## Response Type

[`OrgsTeamsDiscussionsDiscussionNumberResponse`](../../doc/models/orgs-teams-discussions-discussion-number-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
OrgsTeamsDiscussionsDiscussionNumberRequest body = new OrgsTeamsDiscussionsDiscussionNumberRequest();
body.setTitle("Welcome to our first team post");

teamsController.teamsUpdateDiscussionInOrgAsync(org, teamSlug, discussionNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Hi! This is an area for us to collaborate as a team.",
  "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
  "body_version": "0d495416a700fb06133c612575d92bfb",
  "comments_count": 1,
  "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
  "created_at": "2018-01-25T18:56:31Z",
  "last_edited_at": "2018-01-26T18:22:20Z",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
  "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
  "number": 1,
  "pinned": false,
  "private": false,
  "team_url": "https://api.github.com/teams/2343027",
  "title": "Welcome to our first team post",
  "updated_at": "2018-01-26T18:22:20Z",
  "url": "https://api.github.com/teams/2343027/discussions/1",
  "reactions": {
    "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Delete-Discussion-in-Org

Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}`.

API method documentation: [https://docs.github.com/rest/reference/teams#delete-a-discussion](https://docs.github.com/rest/reference/teams#delete-a-discussion)

```java
CompletableFuture<Void> teamsDeleteDiscussionInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;

teamsController.teamsDeleteDiscussionInOrgAsync(org, teamSlug, discussionNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Discussion-Comments-in-Org

List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments`.

API method documentation: [https://docs.github.com/rest/reference/teams#list-discussion-comments](https://docs.github.com/rest/reference/teams#list-discussion-comments)

```java
CompletableFuture<List<TeamDiscussionComment>> teamsListDiscussionCommentsInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final Direction1Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<TeamDiscussionComment>`](../../doc/models/team-discussion-comment.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListDiscussionCommentsInOrgAsync(org, teamSlug, discussionNumber, null, perPage, page).thenAccept(result -> {
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
    "author": {
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
    "body": "Do you like apples?",
    "body_html": "<p>Do you like apples?</p>",
    "body_version": "5eb32b219cdc6a5a9b29ba5d6caa9c51",
    "created_at": "2018-01-15T23:53:58Z",
    "last_edited_at": null,
    "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
    "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
    "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
    "number": 1,
    "updated_at": "2018-01-15T23:53:58Z",
    "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
    "reactions": {
      "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
      "total_count": 5,
      "plus1": 3,
      "minus1": 1,
      "laugh": 0,
      "confused": 0,
      "heart": 1,
      "hooray": 0,
      "eyes": 1,
      "rocket": 1
    }
  }
]
```


# Teams Create-Discussion-Comment-in-Org

Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `POST /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments`.

API method documentation: [https://docs.github.com/rest/reference/teams#create-a-discussion-comment](https://docs.github.com/rest/reference/teams#create-a-discussion-comment)

```java
CompletableFuture<OrgsTeamsDiscussionsDiscussionNumberCommentsResponse> teamsCreateDiscussionCommentInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-request.md) | Body, Required | - |

## Response Type

[`OrgsTeamsDiscussionsDiscussionNumberCommentsResponse`](../../doc/models/orgs-teams-discussions-discussion-number-comments-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body = new OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest();
body.setBody("Do you like apples?");

teamsController.teamsCreateDiscussionCommentInOrgAsync(org, teamSlug, discussionNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Do you like apples?",
  "body_html": "<p>Do you like apples?</p>",
  "body_version": "5eb32b219cdc6a5a9b29ba5d6caa9c51",
  "created_at": "2018-01-15T23:53:58Z",
  "last_edited_at": null,
  "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
  "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
  "number": 1,
  "updated_at": "2018-01-15T23:53:58Z",
  "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
  "reactions": {
    "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Get-Discussion-Comment-in-Org

Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}`.

API method documentation: [https://docs.github.com/rest/reference/teams#get-a-discussion-comment](https://docs.github.com/rest/reference/teams#get-a-discussion-comment)

```java
CompletableFuture<OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberResponse> teamsGetDiscussionCommentInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final int commentNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |

## Response Type

[`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberResponse`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
int commentNumber = 214;

teamsController.teamsGetDiscussionCommentInOrgAsync(org, teamSlug, discussionNumber, commentNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Do you like apples?",
  "body_html": "<p>Do you like apples?</p>",
  "body_version": "5eb32b219cdc6a5a9b29ba5d6caa9c51",
  "created_at": "2018-01-15T23:53:58Z",
  "last_edited_at": null,
  "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
  "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
  "number": 1,
  "updated_at": "2018-01-15T23:53:58Z",
  "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
  "reactions": {
    "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Update-Discussion-Comment-in-Org

Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}`.

API method documentation: [https://docs.github.com/rest/reference/teams#update-a-discussion-comment](https://docs.github.com/rest/reference/teams#update-a-discussion-comment)

```java
CompletableFuture<OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberResponse> teamsUpdateDiscussionCommentInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final int commentNumber,
    final OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-request.md) | Body, Required | - |

## Response Type

[`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberResponse`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
int commentNumber = 214;
OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body = new OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest();
body.setBody("Do you like pineapples?");

teamsController.teamsUpdateDiscussionCommentInOrgAsync(org, teamSlug, discussionNumber, commentNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Do you like pineapples?",
  "body_html": "<p>Do you like pineapples?</p>",
  "body_version": "e6907b24d9c93cc0c5024a7af5888116",
  "created_at": "2018-01-15T23:53:58Z",
  "last_edited_at": "2018-01-26T18:22:20Z",
  "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
  "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
  "number": 1,
  "updated_at": "2018-01-26T18:22:20Z",
  "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
  "reactions": {
    "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Delete-Discussion-Comment-in-Org

Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

**Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}/comments/{comment_number}`.

API method documentation: [https://docs.github.com/rest/reference/teams#delete-a-discussion-comment](https://docs.github.com/rest/reference/teams#delete-a-discussion-comment)

```java
CompletableFuture<Void> teamsDeleteDiscussionCommentInOrgAsync(
    final String org,
    final String teamSlug,
    final int discussionNumber,
    final int commentNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int discussionNumber = 238;
int commentNumber = 214;

teamsController.teamsDeleteDiscussionCommentInOrgAsync(org, teamSlug, discussionNumber, commentNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Pending-Invitations-in-Org

The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/invitations`.

API method documentation: [https://docs.github.com/rest/reference/teams#list-pending-team-invitations](https://docs.github.com/rest/reference/teams#list-pending-team-invitations)

```java
CompletableFuture<List<OrganizationInvitation>> teamsListPendingInvitationsInOrgAsync(
    final String org,
    final String teamSlug,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrganizationInvitation>`](../../doc/models/organization-invitation.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListPendingInvitationsInOrgAsync(org, teamSlug, perPage, page).thenAccept(result -> {
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


# Teams List-Members-in-Org

Team members will include the members of child teams.

To list members in a team, the team must be visible to the authenticated user.

API method documentation: [https://docs.github.com/rest/reference/teams#list-team-members](https://docs.github.com/rest/reference/teams#list-team-members)

```java
CompletableFuture<List<SimpleUser>> teamsListMembersInOrgAsync(
    final String org,
    final String teamSlug,
    final Role51Enum role,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `role` | [`Role51Enum`](../../doc/models/role-51-enum.md) | Query, Optional | Filters members returned by their role in the team. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListMembersInOrgAsync(org, teamSlug, null, perPage, page).thenAccept(result -> {
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


# Teams Get-Membership-for-User-in-Org

Team members will include the members of child teams.

To get a user's membership with a team, the team must be visible to the authenticated user.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/memberships/{username}`.

**Note:**
The response contains the `state` of the membership and the member's `role`.

The `role` for organization owners is set to `maintainer`. For more information about `maintainer` roles, see see [Create a team](https://docs.github.com/rest/reference/teams#create-a-team).

API method documentation: [https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user](https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user)

```java
CompletableFuture<OrgsTeamsMembershipsUsernameResponse> teamsGetMembershipForUserInOrgAsync(
    final String org,
    final String teamSlug,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`OrgsTeamsMembershipsUsernameResponse`](../../doc/models/orgs-teams-memberships-username-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
String username = "username0";

teamsController.teamsGetMembershipForUserInOrgAsync(org, teamSlug, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/teams/1/memberships/octocat",
  "role": "maintainer",
  "state": "active"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | if user has no team membership | `ApiException` |


# Teams Add-or-Update-Membership-for-User-in-Org

Adds an organization member to a team. An authenticated organization owner or team maintainer can add organization members to a team.

Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

**Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."

An organization owner can add someone who is not part of the team's organization to a team. When an organization owner adds someone to a team who is not an organization member, this endpoint will send an invitation to the person via email. This newly-created membership will be in the "pending" state until the person accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team.

If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/{org_id}/team/{team_id}/memberships/{username}`.

API method documentation: [https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user](https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user)

```java
CompletableFuture<OrgsTeamsMembershipsUsernameResponse> teamsAddOrUpdateMembershipForUserInOrgAsync(
    final String org,
    final String teamSlug,
    final String username,
    final TeamsMembershipsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `body` | [`TeamsMembershipsRequest`](../../doc/models/teams-memberships-request.md) | Body, Optional | - |

## Response Type

[`OrgsTeamsMembershipsUsernameResponse`](../../doc/models/orgs-teams-memberships-username-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
String username = "username0";
TeamsMembershipsRequest body = new TeamsMembershipsRequest();
body.setRole(Role6Enum.MAINTAINER);

teamsController.teamsAddOrUpdateMembershipForUserInOrgAsync(org, teamSlug, username, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/teams/1/memberships/octocat",
  "role": "member",
  "state": "pending"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden if team synchronization is set up | `ApiException` |
| 422 | Unprocessable Entity if you attempt to add an organization to a team | `ApiException` |


# Teams Remove-Membership-for-User-in-Org

To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.

Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

**Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."

**Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/memberships/{username}`.

API method documentation: [https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user](https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user)

```java
CompletableFuture<Void> teamsRemoveMembershipForUserInOrgAsync(
    final String org,
    final String teamSlug,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
String username = "username0";

teamsController.teamsRemoveMembershipForUserInOrgAsync(org, teamSlug, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden if team synchronization is set up | `ApiException` |


# Teams List-Projects-in-Org

Lists the organization projects for a team.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/projects`.

API method documentation: [https://docs.github.com/rest/reference/teams#list-team-projects](https://docs.github.com/rest/reference/teams#list-team-projects)

```java
CompletableFuture<List<TeamProject>> teamsListProjectsInOrgAsync(
    final String org,
    final String teamSlug,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<TeamProject>`](../../doc/models/team-project.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListProjectsInOrgAsync(org, teamSlug, perPage, page).thenAccept(result -> {
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
    "private": false,
    "permissions": {
      "read": true,
      "write": true,
      "admin": false
    }
  }
]
```


# Teams Check-Permissions-for-Project-in-Org

Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. The response includes projects inherited from a parent team.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/projects/{project_id}`.

API method documentation: [https://docs.github.com/rest/reference/teams#check-team-permissions-for-a-project](https://docs.github.com/rest/reference/teams#check-team-permissions-for-a-project)

```java
CompletableFuture<OrgsTeamsProjectsProjectIdResponse> teamsCheckPermissionsForProjectInOrgAsync(
    final String org,
    final String teamSlug,
    final int projectId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |

## Response Type

[`OrgsTeamsProjectsProjectIdResponse`](../../doc/models/orgs-teams-projects-project-id-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int projectId = 160;

teamsController.teamsCheckPermissionsForProjectInOrgAsync(org, teamSlug, projectId).thenAccept(result -> {
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
  "updated_at": "2014-03-04T18:58:10Z",
  "organization_permission": "write",
  "private": false,
  "permissions": {
    "read": true,
    "write": true,
    "admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found if project is not managed by this team | `ApiException` |


# Teams Add-or-Update-Project-Permissions-in-Org

Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/{org_id}/team/{team_id}/projects/{project_id}`.

API method documentation: [https://docs.github.com/rest/reference/teams#add-or-update-team-project-permissions](https://docs.github.com/rest/reference/teams#add-or-update-team-project-permissions)

```java
CompletableFuture<Void> teamsAddOrUpdateProjectPermissionsInOrgAsync(
    final String org,
    final String teamSlug,
    final int projectId,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `body` | `Object` | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int projectId = 160;
Object body = com.github.api.ApiHelper.deserialize("{\"permission\":\"write\"}");

teamsController.teamsAddOrUpdateProjectPermissionsInOrgAsync(org, teamSlug, projectId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden if the project is not owned by the organization | [`OrgsTeamsProjectsProjectId403ErrorException`](../../doc/models/orgs-teams-projects-project-id-403-error-exception.md) |


# Teams Remove-Project-in-Org

Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. This endpoint removes the project from the team, but does not delete the project.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/projects/{project_id}`.

API method documentation: [https://docs.github.com/rest/reference/teams#remove-a-project-from-a-team](https://docs.github.com/rest/reference/teams#remove-a-project-from-a-team)

```java
CompletableFuture<Void> teamsRemoveProjectInOrgAsync(
    final String org,
    final String teamSlug,
    final int projectId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
int projectId = 160;

teamsController.teamsRemoveProjectInOrgAsync(org, teamSlug, projectId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Repos-in-Org

Lists a team's repositories visible to the authenticated user.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/repos`.

API method documentation: [https://docs.github.com/rest/reference/teams#list-team-repositories](https://docs.github.com/rest/reference/teams#list-team-repositories)

```java
CompletableFuture<List<MinimalRepository>> teamsListReposInOrgAsync(
    final String org,
    final String teamSlug,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MinimalRepository>`](../../doc/models/minimal-repository.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListReposInOrgAsync(org, teamSlug, perPage, page).thenAccept(result -> {
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


# Teams Check-Permissions-for-Repo-in-Org

Checks whether a team has `admin`, `push`, `maintain`, `triage`, or `pull` permission for a repository. Repositories inherited through a parent team will also be checked.

You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `application/vnd.github.v3.repository+json` accept header.

If a team doesn't have permission for the repository, you will receive a `404 Not Found` response status.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.

API method documentation: [https://docs.github.com/rest/reference/teams/#check-team-permissions-for-a-repository](https://docs.github.com/rest/reference/teams/#check-team-permissions-for-a-repository)

```java
CompletableFuture<OrgsTeamsReposOwnerRepoResponse> teamsCheckPermissionsForRepoInOrgAsync(
    final String org,
    final String teamSlug,
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`OrgsTeamsReposOwnerRepoResponse`](../../doc/models/orgs-teams-repos-owner-repo-response.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
String owner = "owner4";
String repo = "repo4";

teamsController.teamsCheckPermissionsForRepoInOrgAsync(org, teamSlug, owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
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
  "archived": false,
  "disabled": false,
  "visibility": "public",
  "pushed_at": "2011-01-26T19:06:43Z",
  "created_at": "2011-01-26T19:01:12Z",
  "updated_at": "2011-01-26T19:14:43Z",
  "permissions": {
    "admin": false,
    "maintain": false,
    "push": false,
    "triage": false,
    "pull": true
  },
  "role_name": "read",
  "allow_rebase_merge": true,
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
      "pull": true,
      "triage": false,
      "push": false,
      "maintain": false,
      "admin": false
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
    "html_url": "https://api.github.com/licenses/mit"
  },
  "forks": 1,
  "open_issues": 1,
  "watchers": 1
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found if team does not have permission for the repository | `ApiException` |


# Teams Add-or-Update-Repo-Permissions-in-Org

To add a repository to a team or update the team's permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you attempt to add a repository to a team that is not owned by the organization. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

**Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.

For more information about the permission levels, see "[Repository permission levels for an organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)".

API method documentation: [https://docs.github.com/rest/reference/teams/#add-or-update-team-repository-permissions](https://docs.github.com/rest/reference/teams/#add-or-update-team-repository-permissions)

```java
CompletableFuture<Void> teamsAddOrUpdateRepoPermissionsInOrgAsync(
    final String org,
    final String teamSlug,
    final String owner,
    final String repo,
    final OrgsTeamsReposOwnerRepoRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`OrgsTeamsReposOwnerRepoRequest`](../../doc/models/orgs-teams-repos-owner-repo-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
String owner = "owner4";
String repo = "repo4";
OrgsTeamsReposOwnerRepoRequest body = new OrgsTeamsReposOwnerRepoRequest();
body.setPermission("push");

teamsController.teamsAddOrUpdateRepoPermissionsInOrgAsync(org, teamSlug, owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams Remove-Repo-in-Org

If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. This does not delete the repository, it just removes it from the team.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.

API method documentation: [https://docs.github.com/rest/reference/teams/#remove-a-repository-from-a-team](https://docs.github.com/rest/reference/teams/#remove-a-repository-from-a-team)

```java
CompletableFuture<Void> teamsRemoveRepoInOrgAsync(
    final String org,
    final String teamSlug,
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
String owner = "owner4";
String repo = "repo4";

teamsController.teamsRemoveRepoInOrgAsync(org, teamSlug, owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Child-in-Org

Lists the child teams of the team specified by `{team_slug}`.

**Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/teams`.

API method documentation: [https://docs.github.com/rest/reference/teams#list-child-teams](https://docs.github.com/rest/reference/teams#list-child-teams)

```java
CompletableFuture<List<Team>> teamsListChildInOrgAsync(
    final String org,
    final String teamSlug,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `teamSlug` | `String` | Template, Required | The slug of the team name. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Team>`](../../doc/models/team.md)

## Example Usage

```java
String org = "org6";
String teamSlug = "team_slug2";
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListChildInOrgAsync(org, teamSlug, perPage, page).thenAccept(result -> {
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
    "id": 2,
    "node_id": "MDQ6VGVhbTI=",
    "url": "https://api.github.com/teams/2",
    "name": "Original Roster",
    "slug": "original-roster",
    "description": "Started it all.",
    "privacy": "closed",
    "permission": "admin",
    "members_url": "https://api.github.com/teams/2/members{/member}",
    "repositories_url": "https://api.github.com/teams/2/repos",
    "parent": {
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
      "repositories_url": "https://api.github.com/teams/1/repos"
    },
    "html_url": "https://github.com/orgs/rails/teams/core"
  }
]
```


# Teams Get-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the [Get a team by name](https://docs.github.com/rest/reference/teams#get-a-team-by-name) endpoint.

API method documentation: [https://docs.github.com/rest/reference/teams/#get-a-team-legacy](https://docs.github.com/rest/reference/teams/#get-a-team-legacy)

```java
CompletableFuture<TeamsResponse> teamsGetLegacyAsync(
    final int teamId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |

## Response Type

[`TeamsResponse`](../../doc/models/teams-response.md)

## Example Usage

```java
int teamId = 20;

teamsController.teamsGetLegacyAsync(teamId).thenAccept(result -> {
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
  "parent": null,
  "members_count": 3,
  "repos_count": 10,
  "created_at": "2017-07-14T16:53:42Z",
  "updated_at": "2017-08-17T12:37:15Z",
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
    "description": "A great organization",
    "name": "github",
    "company": "GitHub",
    "blog": "https://github.com/blog",
    "location": "San Francisco",
    "email": "octocat@github.com",
    "is_verified": true,
    "has_organization_projects": true,
    "has_repository_projects": true,
    "public_repos": 2,
    "public_gists": 1,
    "followers": 20,
    "following": 0,
    "html_url": "https://github.com/octocat",
    "created_at": "2008-01-14T04:33:35Z",
    "updated_at": "2017-08-17T12:37:15Z",
    "type": "Organization"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`Teams404ErrorException`](../../doc/models/teams-404-error-exception.md) |


# Teams Update-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a team](https://docs.github.com/rest/reference/teams#update-a-team) endpoint.

To edit a team, the authenticated user must either be an organization owner or a team maintainer.

**Note:** With nested teams, the `privacy` for parent teams cannot be `secret`.

API method documentation: [https://docs.github.com/rest/reference/teams/#update-a-team-legacy](https://docs.github.com/rest/reference/teams/#update-a-team-legacy)

```java
CompletableFuture<TeamsResponse> teamsUpdateLegacyAsync(
    final int teamId,
    final TeamsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `body` | [`TeamsRequest`](../../doc/models/teams-request.md) | Body, Required | - |

## Response Type

[`TeamsResponse`](../../doc/models/teams-response.md)

## Example Usage

```java
int teamId = 20;
TeamsRequest body = new TeamsRequest();
body.setName("new team name");
body.setDescription("new team description");
body.setPrivacy(Privacy148Enum.CLOSED);

teamsController.teamsUpdateLegacyAsync(teamId, body).thenAccept(result -> {
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
  "parent": null,
  "members_count": 3,
  "repos_count": 10,
  "created_at": "2017-07-14T16:53:42Z",
  "updated_at": "2017-08-17T12:37:15Z",
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
    "description": "A great organization",
    "name": "github",
    "company": "GitHub",
    "blog": "https://github.com/blog",
    "location": "San Francisco",
    "email": "octocat@github.com",
    "is_verified": true,
    "has_organization_projects": true,
    "has_repository_projects": true,
    "public_repos": 2,
    "public_gists": 1,
    "followers": 20,
    "following": 0,
    "html_url": "https://github.com/octocat",
    "created_at": "2008-01-14T04:33:35Z",
    "updated_at": "2017-08-17T12:37:15Z",
    "type": "Organization"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Teams403ErrorException`](../../doc/models/teams-403-error-exception.md) |
| 404 | Resource not found | [`Teams404ErrorException`](../../doc/models/teams-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Teams422ErrorException`](../../doc/models/teams-422-error-exception.md) |


# Teams Delete-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a team](https://docs.github.com/rest/reference/teams#delete-a-team) endpoint.

To delete a team, the authenticated user must be an organization owner or team maintainer.

If you are an organization owner, deleting a parent team will delete all of its child teams as well.

API method documentation: [https://docs.github.com/rest/reference/teams/#delete-a-team-legacy](https://docs.github.com/rest/reference/teams/#delete-a-team-legacy)

```java
CompletableFuture<Void> teamsDeleteLegacyAsync(
    final int teamId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;

teamsController.teamsDeleteLegacyAsync(teamId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`Teams404ErrorException`](../../doc/models/teams-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`Teams422ErrorException`](../../doc/models/teams-422-error-exception.md) |


# Teams List-Discussions-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List discussions`](https://docs.github.com/rest/reference/teams#list-discussions) endpoint.

List all discussions on a team's page. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#list-discussions-legacy](https://docs.github.com/rest/reference/teams#list-discussions-legacy)

```java
CompletableFuture<List<TeamDiscussion>> teamsListDiscussionsLegacyAsync(
    final int teamId,
    final Direction1Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<TeamDiscussion>`](../../doc/models/team-discussion.md)

## Example Usage

```java
int teamId = 20;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListDiscussionsLegacyAsync(teamId, null, perPage, page).thenAccept(result -> {
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
    "author": {
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
    "body": "Hi! This is an area for us to collaborate as a team.",
    "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
    "body_version": "0d495416a700fb06133c612575d92bfb",
    "comments_count": 0,
    "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
    "created_at": "2018-01-25T18:56:31Z",
    "last_edited_at": null,
    "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
    "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
    "number": 1,
    "pinned": false,
    "private": false,
    "team_url": "https://api.github.com/teams/2343027",
    "title": "Our first team post",
    "updated_at": "2018-01-25T18:56:31Z",
    "url": "https://api.github.com/teams/2343027/discussions/1",
    "reactions": {
      "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
      "total_count": 5,
      "plus1": 3,
      "minus1": 1,
      "laugh": 0,
      "confused": 0,
      "heart": 1,
      "hooray": 0,
      "eyes": 1,
      "rocket": 1
    }
  }
]
```


# Teams Create-Discussion-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Create a discussion`](https://docs.github.com/rest/reference/teams#create-a-discussion) endpoint.

Creates a new discussion post on a team's page. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.

API method documentation: [https://docs.github.com/rest/reference/teams#create-a-discussion-legacy](https://docs.github.com/rest/reference/teams#create-a-discussion-legacy)

```java
CompletableFuture<TeamsDiscussionsResponse> teamsCreateDiscussionLegacyAsync(
    final int teamId,
    final OrgsTeamsDiscussionsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `body` | [`OrgsTeamsDiscussionsRequest`](../../doc/models/orgs-teams-discussions-request.md) | Body, Required | - |

## Response Type

[`TeamsDiscussionsResponse`](../../doc/models/teams-discussions-response.md)

## Example Usage

```java
int teamId = 20;
OrgsTeamsDiscussionsRequest body = new OrgsTeamsDiscussionsRequest();
body.setTitle("Our first team post");
body.setBody("Hi! This is an area for us to collaborate as a team.");

teamsController.teamsCreateDiscussionLegacyAsync(teamId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Hi! This is an area for us to collaborate as a team.",
  "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
  "body_version": "0d495416a700fb06133c612575d92bfb",
  "comments_count": 0,
  "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
  "created_at": "2018-01-25T18:56:31Z",
  "last_edited_at": null,
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
  "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
  "number": 1,
  "pinned": false,
  "private": false,
  "team_url": "https://api.github.com/teams/2343027",
  "title": "Our first team post",
  "updated_at": "2018-01-25T18:56:31Z",
  "url": "https://api.github.com/teams/2343027/discussions/1",
  "reactions": {
    "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Get-Discussion-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion](https://docs.github.com/rest/reference/teams#get-a-discussion) endpoint.

Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#get-a-discussion-legacy](https://docs.github.com/rest/reference/teams#get-a-discussion-legacy)

```java
CompletableFuture<TeamsDiscussionsResponse> teamsGetDiscussionLegacyAsync(
    final int teamId,
    final int discussionNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |

## Response Type

[`TeamsDiscussionsResponse`](../../doc/models/teams-discussions-response.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;

teamsController.teamsGetDiscussionLegacyAsync(teamId, discussionNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Hi! This is an area for us to collaborate as a team.",
  "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
  "body_version": "0d495416a700fb06133c612575d92bfb",
  "comments_count": 0,
  "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
  "created_at": "2018-01-25T18:56:31Z",
  "last_edited_at": null,
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
  "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
  "number": 1,
  "pinned": false,
  "private": false,
  "team_url": "https://api.github.com/teams/2343027",
  "title": "Our first team post",
  "updated_at": "2018-01-25T18:56:31Z",
  "url": "https://api.github.com/teams/2343027/discussions/1",
  "reactions": {
    "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Update-Discussion-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion](https://docs.github.com/rest/reference/teams#update-a-discussion) endpoint.

Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#update-a-discussion-legacy](https://docs.github.com/rest/reference/teams#update-a-discussion-legacy)

```java
CompletableFuture<TeamsDiscussionsResponse> teamsUpdateDiscussionLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final OrgsTeamsDiscussionsDiscussionNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberRequest`](../../doc/models/orgs-teams-discussions-discussion-number-request.md) | Body, Optional | - |

## Response Type

[`TeamsDiscussionsResponse`](../../doc/models/teams-discussions-response.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
OrgsTeamsDiscussionsDiscussionNumberRequest body = new OrgsTeamsDiscussionsDiscussionNumberRequest();
body.setTitle("Welcome to our first team post");

teamsController.teamsUpdateDiscussionLegacyAsync(teamId, discussionNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Hi! This is an area for us to collaborate as a team.",
  "body_html": "<p>Hi! This is an area for us to collaborate as a team</p>",
  "body_version": "0d495416a700fb06133c612575d92bfb",
  "comments_count": 1,
  "comments_url": "https://api.github.com/teams/2343027/discussions/1/comments",
  "created_at": "2018-01-25T18:56:31Z",
  "last_edited_at": "2018-01-26T18:22:20Z",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1",
  "node_id": "MDE0OlRlYW1EaXNjdXNzaW9uMQ==",
  "number": 1,
  "pinned": false,
  "private": false,
  "team_url": "https://api.github.com/teams/2343027",
  "title": "Welcome to our first team post",
  "updated_at": "2018-01-26T18:22:20Z",
  "url": "https://api.github.com/teams/2343027/discussions/1",
  "reactions": {
    "url": "https://api.github.com/teams/2343027/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Delete-Discussion-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`Delete a discussion`](https://docs.github.com/rest/reference/teams#delete-a-discussion) endpoint.

Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#delete-a-discussion-legacy](https://docs.github.com/rest/reference/teams#delete-a-discussion-legacy)

```java
CompletableFuture<Void> teamsDeleteDiscussionLegacyAsync(
    final int teamId,
    final int discussionNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;

teamsController.teamsDeleteDiscussionLegacyAsync(teamId, discussionNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Discussion-Comments-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List discussion comments](https://docs.github.com/rest/reference/teams#list-discussion-comments) endpoint.

List all comments on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#list-discussion-comments-legacy](https://docs.github.com/rest/reference/teams#list-discussion-comments-legacy)

```java
CompletableFuture<List<TeamDiscussionComment>> teamsListDiscussionCommentsLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final Direction1Enum direction,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<TeamDiscussionComment>`](../../doc/models/team-discussion-comment.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListDiscussionCommentsLegacyAsync(teamId, discussionNumber, null, perPage, page).thenAccept(result -> {
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
    "author": {
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
    "body": "Do you like apples?",
    "body_html": "<p>Do you like apples?</p>",
    "body_version": "5eb32b219cdc6a5a9b29ba5d6caa9c51",
    "created_at": "2018-01-15T23:53:58Z",
    "last_edited_at": null,
    "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
    "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
    "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
    "number": 1,
    "updated_at": "2018-01-15T23:53:58Z",
    "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
    "reactions": {
      "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
      "total_count": 5,
      "plus1": 3,
      "minus1": 1,
      "laugh": 0,
      "confused": 0,
      "heart": 1,
      "hooray": 0,
      "eyes": 1,
      "rocket": 1
    }
  }
]
```


# Teams Create-Discussion-Comment-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Create a discussion comment](https://docs.github.com/rest/reference/teams#create-a-discussion-comment) endpoint.

Creates a new comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

This endpoint triggers [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notifications). Creating content too quickly using this endpoint may result in secondary rate limiting. See "[Secondary rate limits](https://docs.github.com/rest/overview/resources-in-the-rest-api#secondary-rate-limits)" and "[Dealing with secondary rate limits](https://docs.github.com/rest/guides/best-practices-for-integrators#dealing-with-secondary-rate-limits)" for details.

API method documentation: [https://docs.github.com/rest/reference/teams#create-a-discussion-comment-legacy](https://docs.github.com/rest/reference/teams#create-a-discussion-comment-legacy)

```java
CompletableFuture<TeamsDiscussionsCommentsResponse> teamsCreateDiscussionCommentLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-request.md) | Body, Required | - |

## Response Type

[`TeamsDiscussionsCommentsResponse`](../../doc/models/teams-discussions-comments-response.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body = new OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest();
body.setBody("Do you like apples?");

teamsController.teamsCreateDiscussionCommentLegacyAsync(teamId, discussionNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Do you like apples?",
  "body_html": "<p>Do you like apples?</p>",
  "body_version": "5eb32b219cdc6a5a9b29ba5d6caa9c51",
  "created_at": "2018-01-15T23:53:58Z",
  "last_edited_at": null,
  "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
  "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
  "number": 1,
  "updated_at": "2018-01-15T23:53:58Z",
  "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
  "reactions": {
    "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Get-Discussion-Comment-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get a discussion comment](https://docs.github.com/rest/reference/teams#get-a-discussion-comment) endpoint.

Get a specific comment on a team discussion. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#get-a-discussion-comment-legacy](https://docs.github.com/rest/reference/teams#get-a-discussion-comment-legacy)

```java
CompletableFuture<TeamsDiscussionsCommentsCommentNumberResponse> teamsGetDiscussionCommentLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final int commentNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |

## Response Type

[`TeamsDiscussionsCommentsCommentNumberResponse`](../../doc/models/teams-discussions-comments-comment-number-response.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
int commentNumber = 214;

teamsController.teamsGetDiscussionCommentLegacyAsync(teamId, discussionNumber, commentNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Do you like apples?",
  "body_html": "<p>Do you like apples?</p>",
  "body_version": "5eb32b219cdc6a5a9b29ba5d6caa9c51",
  "created_at": "2018-01-15T23:53:58Z",
  "last_edited_at": null,
  "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
  "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
  "number": 1,
  "updated_at": "2018-01-15T23:53:58Z",
  "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
  "reactions": {
    "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Update-Discussion-Comment-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a discussion comment](https://docs.github.com/rest/reference/teams#update-a-discussion-comment) endpoint.

Edits the body text of a discussion comment. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#update-a-discussion-comment-legacy](https://docs.github.com/rest/reference/teams#update-a-discussion-comment-legacy)

```java
CompletableFuture<TeamsDiscussionsCommentsCommentNumberResponse> teamsUpdateDiscussionCommentLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final int commentNumber,
    final OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |
| `body` | [`OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest`](../../doc/models/orgs-teams-discussions-discussion-number-comments-comment-number-request.md) | Body, Required | - |

## Response Type

[`TeamsDiscussionsCommentsCommentNumberResponse`](../../doc/models/teams-discussions-comments-comment-number-response.md)

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
int commentNumber = 214;
OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest body = new OrgsTeamsDiscussionsDiscussionNumberCommentsCommentNumberRequest();
body.setBody("Do you like pineapples?");

teamsController.teamsUpdateDiscussionCommentLegacyAsync(teamId, discussionNumber, commentNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "author": {
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
  "body": "Do you like pineapples?",
  "body_html": "<p>Do you like pineapples?</p>",
  "body_version": "e6907b24d9c93cc0c5024a7af5888116",
  "created_at": "2018-01-15T23:53:58Z",
  "last_edited_at": "2018-01-26T18:22:20Z",
  "discussion_url": "https://api.github.com/teams/2403582/discussions/1",
  "html_url": "https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1",
  "node_id": "MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE=",
  "number": 1,
  "updated_at": "2018-01-26T18:22:20Z",
  "url": "https://api.github.com/teams/2403582/discussions/1/comments/1",
  "reactions": {
    "url": "https://api.github.com/teams/2403582/discussions/1/reactions",
    "total_count": 5,
    "plus1": 3,
    "minus1": 1,
    "laugh": 0,
    "confused": 0,
    "heart": 1,
    "hooray": 0,
    "eyes": 1,
    "rocket": 1
  }
}
```


# Teams Delete-Discussion-Comment-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a discussion comment](https://docs.github.com/rest/reference/teams#delete-a-discussion-comment) endpoint.

Deletes a comment on a team discussion. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#delete-a-discussion-comment-legacy](https://docs.github.com/rest/reference/teams#delete-a-discussion-comment-legacy)

```java
CompletableFuture<Void> teamsDeleteDiscussionCommentLegacyAsync(
    final int teamId,
    final int discussionNumber,
    final int commentNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `discussionNumber` | `int` | Template, Required | The number that identifies the discussion. |
| `commentNumber` | `int` | Template, Required | The number that identifies the comment. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
int discussionNumber = 238;
int commentNumber = 214;

teamsController.teamsDeleteDiscussionCommentLegacyAsync(teamId, discussionNumber, commentNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Pending-Invitations-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List pending team invitations`](https://docs.github.com/rest/reference/teams#list-pending-team-invitations) endpoint.

The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.

API method documentation: [https://docs.github.com/rest/reference/teams#list-pending-team-invitations-legacy](https://docs.github.com/rest/reference/teams#list-pending-team-invitations-legacy)

```java
CompletableFuture<List<OrganizationInvitation>> teamsListPendingInvitationsLegacyAsync(
    final int teamId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<OrganizationInvitation>`](../../doc/models/organization-invitation.md)

## Example Usage

```java
int teamId = 20;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListPendingInvitationsLegacyAsync(teamId, perPage, page).thenAccept(result -> {
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


# Teams List-Members-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List team members`](https://docs.github.com/rest/reference/teams#list-team-members) endpoint.

Team members will include the members of child teams.

API method documentation: [https://docs.github.com/rest/reference/teams#list-team-members-legacy](https://docs.github.com/rest/reference/teams#list-team-members-legacy)

```java
CompletableFuture<List<SimpleUser>> teamsListMembersLegacyAsync(
    final int teamId,
    final Role51Enum role,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `role` | [`Role51Enum`](../../doc/models/role-51-enum.md) | Query, Optional | Filters members returned by their role in the team. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
int teamId = 20;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListMembersLegacyAsync(teamId, null, perPage, page).thenAccept(result -> {
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
| 404 | Resource not found | [`TeamsMembers404ErrorException`](../../doc/models/teams-members-404-error-exception.md) |


# Teams Get-Member-Legacy

**This endpoint is deprecated.**

The "Get team member" endpoint (described below) is deprecated.

We recommend using the [Get team membership for a user](https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user) endpoint instead. It allows you to get both active and pending memberships.

To list members in a team, the team must be visible to the authenticated user.

API method documentation: [https://docs.github.com/rest/reference/teams#get-team-member-legacy](https://docs.github.com/rest/reference/teams#get-team-member-legacy)

```java
CompletableFuture<Void> teamsGetMemberLegacyAsync(
    final int teamId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
String username = "username0";

teamsController.teamsGetMemberLegacyAsync(teamId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | if user is not a member | `ApiException` |


# Teams Add-Member-Legacy

**This endpoint is deprecated.**

The "Add team member" endpoint (described below) is deprecated.

We recommend using the [Add or update team membership for a user](https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user) endpoint instead. It allows you to invite new organization members to your teams.

Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

To add someone to a team, the authenticated user must be an organization owner or a team maintainer in the team they're changing. The person being added to the team must be a member of the team's organization.

**Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."

Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

API method documentation: [https://docs.github.com/rest/reference/teams#add-team-member-legacy](https://docs.github.com/rest/reference/teams#add-team-member-legacy)

```java
CompletableFuture<Void> teamsAddMemberLegacyAsync(
    final int teamId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
String username = "username0";

teamsController.teamsAddMemberLegacyAsync(teamId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`TeamsMembers403ErrorException`](../../doc/models/teams-members-403-error-exception.md) |
| 404 | Not Found if team synchronization is set up | `ApiException` |
| 422 | Unprocessable Entity if you attempt to add an organization to a team or you attempt to add a user to a team when they are not a member of at least one other team in the same organization | `ApiException` |


# Teams Remove-Member-Legacy

**This endpoint is deprecated.**

The "Remove team member" endpoint (described below) is deprecated.

We recommend using the [Remove team membership for a user](https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user) endpoint instead. It allows you to remove both active and pending memberships.

Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

To remove a team member, the authenticated user must have 'admin' permissions to the team or be an owner of the org that the team is associated with. Removing a team member does not delete the user, it just removes them from the team.

**Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."

API method documentation: [https://docs.github.com/rest/reference/teams#remove-team-member-legacy](https://docs.github.com/rest/reference/teams#remove-team-member-legacy)

```java
CompletableFuture<Void> teamsRemoveMemberLegacyAsync(
    final int teamId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
String username = "username0";

teamsController.teamsRemoveMemberLegacyAsync(teamId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found if team synchronization is setup | `ApiException` |


# Teams Get-Membership-for-User-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Get team membership for a user](https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user) endpoint.

Team members will include the members of child teams.

To get a user's membership with a team, the team must be visible to the authenticated user.

**Note:**
The response contains the `state` of the membership and the member's `role`.

The `role` for organization owners is set to `maintainer`. For more information about `maintainer` roles, see [Create a team](https://docs.github.com/rest/reference/teams#create-a-team).

API method documentation: [https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user-legacy](https://docs.github.com/rest/reference/teams#get-team-membership-for-a-user-legacy)

```java
CompletableFuture<TeamsMembershipsResponse> teamsGetMembershipForUserLegacyAsync(
    final int teamId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`TeamsMembershipsResponse`](../../doc/models/teams-memberships-response.md)

## Example Usage

```java
int teamId = 20;
String username = "username0";

teamsController.teamsGetMembershipForUserLegacyAsync(teamId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/teams/1/memberships/octocat",
  "role": "maintainer",
  "state": "active"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`TeamsMemberships404ErrorException`](../../doc/models/teams-memberships-404-error-exception.md) |


# Teams Add-or-Update-Membership-for-User-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Add or update team membership for a user](https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user) endpoint.

Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

If the user is already a member of the team's organization, this endpoint will add the user to the team. To add a membership between an organization member and a team, the authenticated user must be an organization owner or a team maintainer.

**Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."

If the user is unaffiliated with the team's organization, this endpoint will send an invitation to the user via email. This newly-created membership will be in the "pending" state until the user accepts the invitation, at which point the membership will transition to the "active" state and the user will be added as a member of the team. To add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.

If the user is already a member of the team, this endpoint will update the role of the team member's role. To update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.

API method documentation: [https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user-legacy](https://docs.github.com/rest/reference/teams#add-or-update-team-membership-for-a-user-legacy)

```java
CompletableFuture<TeamsMembershipsResponse> teamsAddOrUpdateMembershipForUserLegacyAsync(
    final int teamId,
    final String username,
    final TeamsMembershipsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `body` | [`TeamsMembershipsRequest`](../../doc/models/teams-memberships-request.md) | Body, Optional | - |

## Response Type

[`TeamsMembershipsResponse`](../../doc/models/teams-memberships-response.md)

## Example Usage

```java
int teamId = 20;
String username = "username0";
TeamsMembershipsRequest body = new TeamsMembershipsRequest();
body.setRole(Role6Enum.MEMBER);

teamsController.teamsAddOrUpdateMembershipForUserLegacyAsync(teamId, username, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/teams/1/memberships/octocat",
  "role": "member",
  "state": "pending"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden if team synchronization is set up | `ApiException` |
| 404 | Resource not found | [`TeamsMemberships404ErrorException`](../../doc/models/teams-memberships-404-error-exception.md) |
| 422 | Unprocessable Entity if you attempt to add an organization to a team | `ApiException` |


# Teams Remove-Membership-for-User-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove team membership for a user](https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user) endpoint.

Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help documentation.

To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team or be an owner of the organization that the team is associated with. Removing team membership does not delete the user, it just removes their membership from the team.

**Note:** When you have team synchronization set up for a team with your organization's identity provider (IdP), you will see an error if you attempt to use the API for making changes to the team's membership. If you have access to manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams between your identity provider and GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."

API method documentation: [https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user-legacy](https://docs.github.com/rest/reference/teams#remove-team-membership-for-a-user-legacy)

```java
CompletableFuture<Void> teamsRemoveMembershipForUserLegacyAsync(
    final int teamId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
String username = "username0";

teamsController.teamsRemoveMembershipForUserLegacyAsync(teamId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | if team synchronization is set up | `ApiException` |


# Teams List-Projects-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List team projects`](https://docs.github.com/rest/reference/teams#list-team-projects) endpoint.

Lists the organization projects for a team.

API method documentation: [https://docs.github.com/rest/reference/teams/#list-team-projects-legacy](https://docs.github.com/rest/reference/teams/#list-team-projects-legacy)

```java
CompletableFuture<List<TeamProject>> teamsListProjectsLegacyAsync(
    final int teamId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<TeamProject>`](../../doc/models/team-project.md)

## Example Usage

```java
int teamId = 20;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListProjectsLegacyAsync(teamId, perPage, page).thenAccept(result -> {
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
    "private": false,
    "permissions": {
      "read": true,
      "write": true,
      "admin": false
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`TeamsProjects404ErrorException`](../../doc/models/teams-projects-404-error-exception.md) |


# Teams Check-Permissions-for-Project-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Check team permissions for a project](https://docs.github.com/rest/reference/teams#check-team-permissions-for-a-project) endpoint.

Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. The response includes projects inherited from a parent team.

API method documentation: [https://docs.github.com/rest/reference/teams/#check-team-permissions-for-a-project-legacy](https://docs.github.com/rest/reference/teams/#check-team-permissions-for-a-project-legacy)

```java
CompletableFuture<TeamsProjectsResponse> teamsCheckPermissionsForProjectLegacyAsync(
    final int teamId,
    final int projectId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |

## Response Type

[`TeamsProjectsResponse`](../../doc/models/teams-projects-response.md)

## Example Usage

```java
int teamId = 20;
int projectId = 160;

teamsController.teamsCheckPermissionsForProjectLegacyAsync(teamId, projectId).thenAccept(result -> {
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
  "updated_at": "2014-03-04T18:58:10Z",
  "organization_permission": "write",
  "private": false,
  "permissions": {
    "read": true,
    "write": true,
    "admin": false
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found if project is not managed by this team | `ApiException` |


# Teams Add-or-Update-Project-Permissions-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Add or update team project permissions](https://docs.github.com/rest/reference/teams#add-or-update-team-project-permissions) endpoint.

Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.

API method documentation: [https://docs.github.com/rest/reference/teams/#add-or-update-team-project-permissions-legacy](https://docs.github.com/rest/reference/teams/#add-or-update-team-project-permissions-legacy)

```java
CompletableFuture<Void> teamsAddOrUpdateProjectPermissionsLegacyAsync(
    final int teamId,
    final int projectId,
    final TeamsProjectsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |
| `body` | [`TeamsProjectsRequest`](../../doc/models/teams-projects-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
int projectId = 160;
TeamsProjectsRequest body = new TeamsProjectsRequest();
body.setPermission(Permission4Enum.READ);

teamsController.teamsAddOrUpdateProjectPermissionsLegacyAsync(teamId, projectId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden if the project is not owned by the organization | [`TeamsProjects403ErrorException`](../../doc/models/teams-projects-403-error-exception.md) |
| 404 | Resource not found | [`TeamsProjects404ErrorException`](../../doc/models/teams-projects-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`TeamsProjects422ErrorException`](../../doc/models/teams-projects-422-error-exception.md) |


# Teams Remove-Project-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove a project from a team](https://docs.github.com/rest/reference/teams#remove-a-project-from-a-team) endpoint.

Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.

API method documentation: [https://docs.github.com/rest/reference/teams/#remove-a-project-from-a-team-legacy](https://docs.github.com/rest/reference/teams/#remove-a-project-from-a-team-legacy)

```java
CompletableFuture<Void> teamsRemoveProjectLegacyAsync(
    final int teamId,
    final int projectId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `projectId` | `int` | Template, Required | The unique identifier of the project. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
int projectId = 160;

teamsController.teamsRemoveProjectLegacyAsync(teamId, projectId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`TeamsProjects404ErrorException`](../../doc/models/teams-projects-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`TeamsProjects422ErrorException`](../../doc/models/teams-projects-422-error-exception.md) |


# Teams List-Repos-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List team repositories](https://docs.github.com/rest/reference/teams#list-team-repositories) endpoint.

API method documentation: [https://docs.github.com/rest/reference/teams/#list-team-repositories-legacy](https://docs.github.com/rest/reference/teams/#list-team-repositories-legacy)

```java
CompletableFuture<List<MinimalRepository>> teamsListReposLegacyAsync(
    final int teamId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MinimalRepository>`](../../doc/models/minimal-repository.md)

## Example Usage

```java
int teamId = 20;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListReposLegacyAsync(teamId, perPage, page).thenAccept(result -> {
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
| 404 | Resource not found | [`TeamsRepos404ErrorException`](../../doc/models/teams-repos-404-error-exception.md) |


# Teams Check-Permissions-for-Repo-Legacy

**This endpoint is deprecated.**

**Note**: Repositories inherited through a parent team will also be checked.

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Check team permissions for a repository](https://docs.github.com/rest/reference/teams#check-team-permissions-for-a-repository) endpoint.

You can also get information about the specified repository, including what permissions the team grants on it, by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header:

API method documentation: [https://docs.github.com/rest/reference/teams/#check-team-permissions-for-a-repository-legacy](https://docs.github.com/rest/reference/teams/#check-team-permissions-for-a-repository-legacy)

```java
CompletableFuture<TeamsReposRepoResponse> teamsCheckPermissionsForRepoLegacyAsync(
    final int teamId,
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`TeamsReposRepoResponse`](../../doc/models/teams-repos-repo-response.md)

## Example Usage

```java
int teamId = 20;
String owner = "owner4";
String repo = "repo4";

teamsController.teamsCheckPermissionsForRepoLegacyAsync(teamId, owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
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
  "archived": false,
  "disabled": false,
  "visibility": "public",
  "pushed_at": "2011-01-26T19:06:43Z",
  "created_at": "2011-01-26T19:01:12Z",
  "updated_at": "2011-01-26T19:14:43Z",
  "permissions": {
    "admin": false,
    "maintain": false,
    "push": false,
    "triage": false,
    "pull": true
  },
  "role_name": "read",
  "allow_rebase_merge": true,
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
      "pull": true,
      "triage": false,
      "push": false,
      "maintain": false,
      "admin": false
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
    "html_url": "https://api.github.com/licenses/mit"
  },
  "forks": 1,
  "open_issues": 1,
  "watchers": 1
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found if repository is not managed by this team | `ApiException` |


# Teams Add-or-Update-Repo-Permissions-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new "[Add or update team repository permissions](https://docs.github.com/rest/reference/teams#add-or-update-team-repository-permissions)" endpoint.

To add a repository to a team or update the team's permission on a repository, the authenticated user must have admin access to the repository, and must be able to see the team. The repository must be owned by the organization, or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you attempt to add a repository to a team that is not owned by the organization.

Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

API method documentation: [https://docs.github.com/rest/reference/teams#add-or-update-team-repository-permissions-legacy](https://docs.github.com/rest/reference/teams#add-or-update-team-repository-permissions-legacy)

```java
CompletableFuture<Void> teamsAddOrUpdateRepoPermissionsLegacyAsync(
    final int teamId,
    final String owner,
    final String repo,
    final TeamsReposRepoRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`TeamsReposRepoRequest`](../../doc/models/teams-repos-repo-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
String owner = "owner4";
String repo = "repo4";
TeamsReposRepoRequest body = new TeamsReposRepoRequest();
body.setPermission(Permission9Enum.PUSH);

teamsController.teamsAddOrUpdateRepoPermissionsLegacyAsync(teamId, owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`TeamsReposRepo403ErrorException`](../../doc/models/teams-repos-repo-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`TeamsReposRepo422ErrorException`](../../doc/models/teams-repos-repo-422-error-exception.md) |


# Teams Remove-Repo-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove a repository from a team](https://docs.github.com/rest/reference/teams#remove-a-repository-from-a-team) endpoint.

If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the team. To remove a repository from a team as an organization member, the authenticated user must have admin access to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it from the team.

API method documentation: [https://docs.github.com/rest/reference/teams/#remove-a-repository-from-a-team-legacy](https://docs.github.com/rest/reference/teams/#remove-a-repository-from-a-team-legacy)

```java
CompletableFuture<Void> teamsRemoveRepoLegacyAsync(
    final int teamId,
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

`void`

## Example Usage

```java
int teamId = 20;
String owner = "owner4";
String repo = "repo4";

teamsController.teamsRemoveRepoLegacyAsync(teamId, owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Teams List-Child-Legacy

**This endpoint is deprecated.**

**Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List child teams`](https://docs.github.com/rest/reference/teams#list-child-teams) endpoint.

API method documentation: [https://docs.github.com/rest/reference/teams/#list-child-teams-legacy](https://docs.github.com/rest/reference/teams/#list-child-teams-legacy)

```java
CompletableFuture<List<Team>> teamsListChildLegacyAsync(
    final int teamId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `teamId` | `int` | Template, Required | The unique identifier of the team. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Team>`](../../doc/models/team.md)

## Example Usage

```java
int teamId = 20;
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListChildLegacyAsync(teamId, perPage, page).thenAccept(result -> {
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
    "id": 2,
    "node_id": "MDQ6VGVhbTI=",
    "url": "https://api.github.com/teams/2",
    "name": "Original Roster",
    "slug": "original-roster",
    "description": "Started it all.",
    "privacy": "closed",
    "permission": "admin",
    "members_url": "https://api.github.com/teams/2/members{/member}",
    "repositories_url": "https://api.github.com/teams/2/repos",
    "parent": {
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
      "repositories_url": "https://api.github.com/teams/1/repos"
    },
    "html_url": "https://github.com/orgs/rails/teams/core"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`TeamsTeams403ErrorException`](../../doc/models/teams-teams-403-error-exception.md) |
| 404 | Resource not found | [`TeamsTeams404ErrorException`](../../doc/models/teams-teams-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`TeamsTeams422ErrorException`](../../doc/models/teams-teams-422-error-exception.md) |


# Teams List-for-Authenticated-User

List all of the teams across all of the organizations to which the authenticated user belongs. This method requires `user`, `repo`, or `read:org` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/) when authenticating via [OAuth](https://docs.github.com/apps/building-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/teams#list-teams-for-the-authenticated-user](https://docs.github.com/rest/reference/teams#list-teams-for-the-authenticated-user)

```java
CompletableFuture<List<FullTeam>> teamsListForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<FullTeam>`](../../doc/models/full-team.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

teamsController.teamsListForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
    "parent": null,
    "members_count": 3,
    "repos_count": 10,
    "created_at": "2017-07-14T16:53:42Z",
    "updated_at": "2017-08-17T12:37:15Z",
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
      "description": "A great organization",
      "name": "github",
      "company": "GitHub",
      "blog": "https://github.com/blog",
      "location": "San Francisco",
      "email": "octocat@github.com",
      "is_verified": true,
      "has_organization_projects": true,
      "has_repository_projects": true,
      "public_repos": 2,
      "public_gists": 1,
      "followers": 20,
      "following": 0,
      "html_url": "https://github.com/octocat",
      "created_at": "2008-01-14T04:33:35Z",
      "updated_at": "2017-08-17T12:37:15Z",
      "type": "Organization"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`UserTeams403ErrorException`](../../doc/models/user-teams-403-error-exception.md) |
| 404 | Resource not found | [`UserTeams404ErrorException`](../../doc/models/user-teams-404-error-exception.md) |

