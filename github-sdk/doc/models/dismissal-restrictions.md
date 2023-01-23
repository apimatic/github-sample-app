
# Dismissal Restrictions

## Structure

`DismissalRestrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Users` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Optional | The list of users with review dismissal access. | List<SimpleUser> getUsers() | setUsers(List<SimpleUser> users) |
| `Teams` | [`List<Team>`](../../doc/models/team.md) | Optional | The list of teams with review dismissal access. | List<Team> getTeams() | setTeams(List<Team> teams) |
| `Apps` | [`List<GitHubapp>`](../../doc/models/git-hubapp.md) | Optional | The list of apps with review dismissal access. | List<GitHubapp> getApps() | setApps(List<GitHubapp> apps) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `UsersUrl` | `String` | Optional | - | String getUsersUrl() | setUsersUrl(String usersUrl) |
| `TeamsUrl` | `String` | Optional | - | String getTeamsUrl() | setTeamsUrl(String teamsUrl) |

## Example (as JSON)

```json
{
  "users": null,
  "teams": null,
  "apps": null,
  "url": null,
  "users_url": null,
  "teams_url": null
}
```

