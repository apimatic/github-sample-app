
# User Interaction Limits Response

## Structure

`UserInteractionLimitsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Limit` | [`InteractionGroupEnum`](../../doc/models/interaction-group-enum.md) | Optional | - | InteractionGroupEnum getLimit() | setLimit(InteractionGroupEnum limit) |
| `Origin` | `String` | Optional | - | String getOrigin() | setOrigin(String origin) |
| `ExpiresAt` | `LocalDateTime` | Optional | - | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |

## Example (as JSON)

```json
{
  "limit": null,
  "origin": null,
  "expires_at": null
}
```

