
# Marketplace Listing Accounts Response

## Structure

`MarketplaceListingAccountsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Login` | `String` | Required | - | String getLogin() | setLogin(String login) |
| `OrganizationBillingEmail` | `String` | Optional | - | String getOrganizationBillingEmail() | setOrganizationBillingEmail(String organizationBillingEmail) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `MarketplacePendingChange` | `Object` | Optional | - | Object getMarketplacePendingChange() | setMarketplacePendingChange(Object marketplacePendingChange) |
| `MarketplacePurchase` | [`MarketplacePurchase1`](../../doc/models/marketplace-purchase-1.md) | Required | - | MarketplacePurchase1 getMarketplacePurchase() | setMarketplacePurchase(MarketplacePurchase1 marketplacePurchase) |

## Example (as JSON)

```json
{
  "url": "url4",
  "type": "type0",
  "id": 112,
  "login": "login0",
  "organization_billing_email": null,
  "email": null,
  "marketplace_pending_change": null,
  "marketplace_purchase": {
    "billing_cycle": null,
    "next_billing_date": null,
    "is_installed": null,
    "unit_count": null,
    "on_free_trial": null,
    "free_trial_ends_on": null,
    "updated_at": null,
    "plan": null
  }
}
```

