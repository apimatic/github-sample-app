
# Orgs Interaction Limits Request

## Structure

`OrgsInteractionLimitsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Limit` | [`InteractionGroupEnum`](../../doc/models/interaction-group-enum.md) | Required | - | InteractionGroupEnum getLimit() | setLimit(InteractionGroupEnum limit) |
| `Expiry` | [`InteractionExpiryEnum`](../../doc/models/interaction-expiry-enum.md) | Optional | - | InteractionExpiryEnum getExpiry() | setExpiry(InteractionExpiryEnum expiry) |

## Example (as JSON)

```json
{
  "limit": "contributors_only",
  "expiry": null
}
```

