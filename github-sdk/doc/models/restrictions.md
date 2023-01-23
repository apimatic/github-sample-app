
# Restrictions

Restrict who can push to the protected branch. User, app, and team `restrictions` are only available for organization-owned repositories. Set to `null` to disable.

## Structure

`Restrictions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Users` | `List<String>` | Required | The list of user `login`s with push access | List<String> getUsers() | setUsers(List<String> users) |
| `Teams` | `List<String>` | Required | The list of team `slug`s with push access | List<String> getTeams() | setTeams(List<String> teams) |
| `Apps` | `List<String>` | Optional | The list of app `slug`s with push access | List<String> getApps() | setApps(List<String> apps) |

## Example (as JSON)

```json
{
  "users": [
    "users3",
    "users4"
  ],
  "teams": [
    "teams9",
    "teams0",
    "teams1"
  ],
  "apps": null
}
```

