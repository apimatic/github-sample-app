
# Sponsorship Tier

The `tier_changed` and `pending_tier_change` will include the original tier before the change or pending change. For more information, see the pending tier change payload.

## Structure

`SponsorshipTier`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `IsCustomAmmount` | `Boolean` | Optional | - | Boolean getIsCustomAmmount() | setIsCustomAmmount(Boolean isCustomAmmount) |
| `IsCustomAmount` | `Boolean` | Optional | - | Boolean getIsCustomAmount() | setIsCustomAmount(Boolean isCustomAmount) |
| `IsOneTime` | `boolean` | Required | - | boolean getIsOneTime() | setIsOneTime(boolean isOneTime) |
| `MonthlyPriceInCents` | `int` | Required | - | int getMonthlyPriceInCents() | setMonthlyPriceInCents(int monthlyPriceInCents) |
| `MonthlyPriceInDollars` | `int` | Required | - | int getMonthlyPriceInDollars() | setMonthlyPriceInDollars(int monthlyPriceInDollars) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |

## Example (as JSON)

```json
{
  "created_at": "created_at2",
  "description": "description0",
  "is_custom_ammount": null,
  "is_custom_amount": null,
  "is_one_time": false,
  "monthly_price_in_cents": 16,
  "monthly_price_in_dollars": 232,
  "name": "name0",
  "node_id": "node_id2"
}
```

