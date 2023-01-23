
# Dismissal Restrictions 3

## Structure

`DismissalRestrictions3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Users` | `List<String>` | Optional | The list of user `login`s with dismissal access | List<String> getUsers() | setUsers(List<String> users) |
| `Teams` | `List<String>` | Optional | The list of team `slug`s with dismissal access | List<String> getTeams() | setTeams(List<String> teams) |
| `Apps` | `List<String>` | Optional | The list of app `slug`s with dismissal access | List<String> getApps() | setApps(List<String> apps) |

## Example (as JSON)

```json
{
  "users": null,
  "teams": null,
  "apps": null
}
```

