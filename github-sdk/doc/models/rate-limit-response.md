
# Rate Limit Response

## Structure

`RateLimitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Resources` | [`Resources`](../../doc/models/resources.md) | Required | - | Resources getResources() | setResources(Resources resources) |
| `Rate` | [`RateLimit`](../../doc/models/rate-limit.md) | Required | - | RateLimit getRate() | setRate(RateLimit rate) |

## Example (as JSON)

```json
{
  "resources": {
    "core": {
      "limit": 248,
      "remaining": 240,
      "reset": 176,
      "used": 216
    },
    "graphql": null,
    "search": {
      "limit": 14,
      "remaining": 234,
      "reset": 170,
      "used": 46
    },
    "source_import": null,
    "integration_manifest": null,
    "code_scanning_upload": null,
    "actions_runner_registration": null,
    "scim": null,
    "dependency_snapshots": null
  },
  "rate": {
    "limit": 134,
    "remaining": 126,
    "reset": 62,
    "used": 102
  }
}
```

