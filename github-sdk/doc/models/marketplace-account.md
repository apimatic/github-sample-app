
# Marketplace Account

## Structure

`MarketplaceAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `Login` | `String` | Required | - | String getLogin() | setLogin(String login) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `OrganizationBillingEmail` | `String` | Optional | - | String getOrganizationBillingEmail() | setOrganizationBillingEmail(String organizationBillingEmail) |

## Example (as JSON)

```json
{
  "url": "url4",
  "id": 112,
  "type": "type0",
  "node_id": null,
  "login": "login0",
  "email": null,
  "organization_billing_email": null
}
```

