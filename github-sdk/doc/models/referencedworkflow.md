
# Referencedworkflow

A workflow referenced/reused by the initial caller workflow

## Structure

`Referencedworkflow`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Ref` | `String` | Optional | - | String getRef() | setRef(String ref) |

## Example (as JSON)

```json
{
  "path": "path6",
  "sha": "sha6",
  "ref": null
}
```

