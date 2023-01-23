
# Bypass Pull Request Allowances 3

## Structure

`BypassPullRequestAllowances3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Users` | `List<String>` | Optional | The list of user `login`s allowed to bypass pull request requirements. | List<String> getUsers() | setUsers(List<String> users) |
| `Teams` | `List<String>` | Optional | The list of team `slug`s allowed to bypass pull request requirements. | List<String> getTeams() | setTeams(List<String> teams) |
| `Apps` | `List<String>` | Optional | The list of app `slug`s allowed to bypass pull request requirements. | List<String> getApps() | setApps(List<String> apps) |

## Example (as JSON)

```json
{
  "users": null,
  "teams": null,
  "apps": null
}
```

