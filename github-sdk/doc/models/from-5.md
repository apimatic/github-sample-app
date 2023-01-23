
# From 5

## Structure

`From5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Admin` | `Boolean` | Optional | The previous version of the team member's `admin` permission on a repository, if the action was `edited`. | Boolean getAdmin() | setAdmin(Boolean admin) |
| `Pull` | `Boolean` | Optional | The previous version of the team member's `pull` permission on a repository, if the action was `edited`. | Boolean getPull() | setPull(Boolean pull) |
| `Push` | `Boolean` | Optional | The previous version of the team member's `push` permission on a repository, if the action was `edited`. | Boolean getPush() | setPush(Boolean push) |

## Example (as JSON)

```json
{
  "admin": null,
  "pull": null,
  "push": null
}
```

