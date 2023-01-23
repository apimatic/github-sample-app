
# Bypass Pull Request Allowances 5

## Structure

`BypassPullRequestAllowances5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Users` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Optional | The list of users allowed to bypass pull request requirements. | List<SimpleUser> getUsers() | setUsers(List<SimpleUser> users) |
| `Teams` | [`List<Team>`](../../doc/models/team.md) | Optional | The list of teams allowed to bypass pull request requirements. | List<Team> getTeams() | setTeams(List<Team> teams) |
| `Apps` | [`List<GitHubapp>`](../../doc/models/git-hubapp.md) | Optional | The list of apps allowed to bypass pull request requirements. | List<GitHubapp> getApps() | setApps(List<GitHubapp> apps) |

## Example (as JSON)

```json
{
  "users": null,
  "teams": null,
  "apps": null
}
```

