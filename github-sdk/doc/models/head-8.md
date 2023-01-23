
# Head 8

## Structure

`Head8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |
| `Ref` | `String` | Required | - | String getRef() | setRef(String ref) |
| `Repo` | `Object` | Required | - | Object getRepo() | setRepo(Object repo) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "label": "label0",
  "ref": "ref0",
  "repo": {
    "key1": "val1",
    "key2": "val2"
  },
  "sha": "sha6",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

