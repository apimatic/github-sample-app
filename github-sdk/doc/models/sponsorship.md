
# Sponsorship

## Structure

`Sponsorship`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Maintainer` | [`Author7`](../../doc/models/author-7.md) | Optional | - | Author7 getMaintainer() | setMaintainer(Author7 maintainer) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `PrivacyLevel` | `String` | Required | - | String getPrivacyLevel() | setPrivacyLevel(String privacyLevel) |
| `Sponsor` | `Object` | Required | - | Object getSponsor() | setSponsor(Object sponsor) |
| `Sponsorable` | `Object` | Required | - | Object getSponsorable() | setSponsorable(Object sponsorable) |
| `Tier` | [`Tier3`](../../doc/models/tier-3.md) | Required | - | Tier3 getTier() | setTier(Tier3 tier) |

## Example (as JSON)

```json
{
  "created_at": "created_at2",
  "maintainer": null,
  "node_id": "node_id2",
  "privacy_level": "privacy_level8",
  "sponsor": {
    "key1": "val1",
    "key2": "val2"
  },
  "sponsorable": {
    "key1": "val1",
    "key2": "val2"
  },
  "tier": {
    "created_at": "created_at0",
    "description": "description2",
    "is_custom_ammount": null,
    "is_custom_amount": null,
    "is_one_time": false,
    "monthly_price_in_cents": 110,
    "monthly_price_in_dollars": 70,
    "name": "name2",
    "node_id": "node_id0"
  }
}
```

