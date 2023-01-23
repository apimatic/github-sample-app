
# Head

## Structure

`Head`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Required | - | String getRef() | setRef(String ref) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Repo` | [`Repo`](../../doc/models/repo.md) | Required | - | Repo getRepo() | setRepo(Repo repo) |

## Example (as JSON)

```json
{
  "ref": "ref0",
  "sha": "sha6",
  "repo": {
    "id": 94,
    "name": "name4",
    "url": "url8"
  }
}
```

