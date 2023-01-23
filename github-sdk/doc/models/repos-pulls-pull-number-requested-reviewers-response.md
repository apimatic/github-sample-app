
# Repos Pulls Pull Number Requested Reviewers Response

## Structure

`ReposPullsPullNumberRequestedReviewersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Users` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Required | - | List<SimpleUser> getUsers() | setUsers(List<SimpleUser> users) |
| `Teams` | [`List<Team>`](../../doc/models/team.md) | Required | - | List<Team> getTeams() | setTeams(List<Team> teams) |

## Example (as JSON)

```json
{
  "users": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
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
    "site_admin": null
  },
  "teams": {
    "id": null,
    "node_id": null,
    "name": null,
    "slug": null,
    "description": null,
    "permission": null,
    "url": null,
    "html_url": "https://github.com/orgs/rails/teams/core",
    "members_url": null,
    "repositories_url": null,
    "parent": null
  }
}
```

