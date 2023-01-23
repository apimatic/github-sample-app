
# Committer 17

Metaproperties for Git author/committer information.

## Structure

`Committer17`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Date` | `LocalDateTime` | Optional | - | LocalDateTime getDate() | setDate(LocalDateTime date) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Name` | `String` | Required | The git author's name. | String getName() | setName(String name) |
| `Username` | `String` | Optional | - | String getUsername() | setUsername(String username) |

## Example (as JSON)

```json
{
  "date": null,
  "email": null,
  "name": "name0",
  "username": null
}
```

