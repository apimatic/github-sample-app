
# Repos Interaction Limits Response 2

## Structure

`ReposInteractionLimitsResponse2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Limit` | [`InteractionGroupEnum`](../../doc/models/interaction-group-enum.md) | Required | - | InteractionGroupEnum getLimit() | setLimit(InteractionGroupEnum limit) |
| `Origin` | `String` | Required | - | String getOrigin() | setOrigin(String origin) |
| `ExpiresAt` | `LocalDateTime` | Required | - | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |

## Example (as JSON)

```json
{
  "limit": null,
  "origin": "repository",
  "expires_at": "08/17/2018 04:18:39"
}
```

