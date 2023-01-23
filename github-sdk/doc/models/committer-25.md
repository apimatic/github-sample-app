
# Committer 25

The person that committed the file. Default: the authenticated user.

## Structure

`Committer25`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted. | String getName() | setName(String name) |
| `Email` | `String` | Required | The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted. | String getEmail() | setEmail(String email) |
| `Date` | `String` | Optional | - | String getDate() | setDate(String date) |

## Example (as JSON)

```json
{
  "name": "name0",
  "email": "email6",
  "date": null
}
```

