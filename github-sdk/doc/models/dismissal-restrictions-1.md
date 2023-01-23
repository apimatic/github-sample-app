
# Dismissal Restrictions 1

## Structure

`DismissalRestrictions1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `UsersUrl` | `String` | Required | - | String getUsersUrl() | setUsersUrl(String usersUrl) |
| `TeamsUrl` | `String` | Required | - | String getTeamsUrl() | setTeamsUrl(String teamsUrl) |
| `Users` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Required | - | List<SimpleUser> getUsers() | setUsers(List<SimpleUser> users) |
| `Teams` | [`List<Team>`](../../doc/models/team.md) | Required | - | List<Team> getTeams() | setTeams(List<Team> teams) |
| `Apps` | [`List<GitHubapp>`](../../doc/models/git-hubapp.md) | Optional | - | List<GitHubapp> getApps() | setApps(List<GitHubapp> apps) |

## Example (as JSON)

```json
{
  "url": null,
  "users_url": null,
  "teams_url": null,
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

