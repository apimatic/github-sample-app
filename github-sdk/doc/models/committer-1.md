
# Committer 1

## Structure

`Committer1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Date` | `LocalDateTime` | Required | Timestamp of the commit | LocalDateTime getDate() | setDate(LocalDateTime date) |
| `Email` | `String` | Required | Git email address of the user | String getEmail() | setEmail(String email) |
| `Name` | `String` | Required | Name of the git user | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "date": "08/09/2014 01:02:04",
  "email": "monalisa.octocat@example.com",
  "name": "Monalisa Octocat"
}
```

