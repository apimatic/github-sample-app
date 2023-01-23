
# Repos Branches Branch Protection Restrictions Response

## Structure

`ReposBranchesBranchProtectionRestrictionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `UsersUrl` | `String` | Required | - | String getUsersUrl() | setUsersUrl(String usersUrl) |
| `TeamsUrl` | `String` | Required | - | String getTeamsUrl() | setTeamsUrl(String teamsUrl) |
| `AppsUrl` | `String` | Required | - | String getAppsUrl() | setAppsUrl(String appsUrl) |
| `Users` | [`List<User>`](../../doc/models/user.md) | Required | - | List<User> getUsers() | setUsers(List<User> users) |
| `Teams` | [`List<Team1>`](../../doc/models/team-1.md) | Required | - | List<Team1> getTeams() | setTeams(List<Team1> teams) |
| `Apps` | [`List<App1>`](../../doc/models/app-1.md) | Required | - | List<App1> getApps() | setApps(List<App1> apps) |

## Example (as JSON)

```json
{
  "url": "url4",
  "users_url": "users_url8",
  "teams_url": "teams_url2",
  "apps_url": "apps_url0",
  "users": [
    {
      "login": null,
      "id": null,
      "node_id": null,
      "avatar_url": null,
      "gravatar_id": null,
      "url": null,
      "html_url": null,
      "followers_url": null,
      "following_url": null,
      "gists_url": null,
      "starred_url": null,
      "subscriptions_url": null,
      "organizations_url": null,
      "repos_url": null,
      "events_url": null,
      "received_events_url": null,
      "type": null,
      "site_admin": null
    },
    {
      "login": null,
      "id": null,
      "node_id": null,
      "avatar_url": null,
      "gravatar_id": null,
      "url": null,
      "html_url": null,
      "followers_url": null,
      "following_url": null,
      "gists_url": null,
      "starred_url": null,
      "subscriptions_url": null,
      "organizations_url": null,
      "repos_url": null,
      "events_url": null,
      "received_events_url": null,
      "type": null,
      "site_admin": null
    }
  ],
  "teams": [
    {
      "id": null,
      "node_id": null,
      "url": null,
      "html_url": null,
      "name": null,
      "slug": null,
      "description": null,
      "privacy": null,
      "permission": null,
      "members_url": null,
      "repositories_url": null,
      "parent": null
    },
    {
      "id": null,
      "node_id": null,
      "url": null,
      "html_url": null,
      "name": null,
      "slug": null,
      "description": null,
      "privacy": null,
      "permission": null,
      "members_url": null,
      "repositories_url": null,
      "parent": null
    },
    {
      "id": null,
      "node_id": null,
      "url": null,
      "html_url": null,
      "name": null,
      "slug": null,
      "description": null,
      "privacy": null,
      "permission": null,
      "members_url": null,
      "repositories_url": null,
      "parent": null
    }
  ],
  "apps": [
    {
      "id": null,
      "slug": null,
      "node_id": null,
      "owner": null,
      "name": null,
      "description": null,
      "external_url": null,
      "html_url": null,
      "created_at": null,
      "updated_at": null,
      "permissions": null,
      "events": null
    },
    {
      "id": null,
      "slug": null,
      "node_id": null,
      "owner": null,
      "name": null,
      "description": null,
      "external_url": null,
      "html_url": null,
      "created_at": null,
      "updated_at": null,
      "permissions": null,
      "events": null
    }
  ]
}
```

