
# Repos Git Refs Request

## Structure

`ReposGitRefsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Required | The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with 'refs' and have at least two slashes, it will be rejected. | String getRef() | setRef(String ref) |
| `Sha` | `String` | Required | The SHA1 value for this reference. | String getSha() | setSha(String sha) |
| `Key` | `String` | Optional | - | String getKey() | setKey(String key) |

## Example (as JSON)

```json
{
  "ref": "ref0",
  "sha": "sha6",
  "key": null
}
```

