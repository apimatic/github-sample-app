
# Dismissal Restrictions 2

Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories.

## Structure

`DismissalRestrictions2`

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

