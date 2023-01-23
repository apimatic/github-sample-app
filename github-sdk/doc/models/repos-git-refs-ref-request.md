
# Repos Git Refs Ref Request

## Structure

`ReposGitRefsRefRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Sha` | `String` | Required | The SHA1 value to set this reference to | String getSha() | setSha(String sha) |
| `Force` | `Boolean` | Optional | Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or setting it to `false` will make sure you're not overwriting work.<br>**Default**: `false` | Boolean getForce() | setForce(Boolean force) |

## Example (as JSON)

```json
{
  "sha": "sha6",
  "force": null
}
```

