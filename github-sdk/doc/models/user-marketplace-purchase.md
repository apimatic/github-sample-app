
# User Marketplace Purchase

User Marketplace Purchase

## Structure

`UserMarketplacePurchase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingCycle` | `String` | Required | - | String getBillingCycle() | setBillingCycle(String billingCycle) |
| `NextBillingDate` | `LocalDateTime` | Required | - | LocalDateTime getNextBillingDate() | setNextBillingDate(LocalDateTime nextBillingDate) |
| `UnitCount` | `Integer` | Required | - | Integer getUnitCount() | setUnitCount(Integer unitCount) |
| `OnFreeTrial` | `boolean` | Required | - | boolean getOnFreeTrial() | setOnFreeTrial(boolean onFreeTrial) |
| `FreeTrialEndsOn` | `LocalDateTime` | Required | - | LocalDateTime getFreeTrialEndsOn() | setFreeTrialEndsOn(LocalDateTime freeTrialEndsOn) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Account` | [`MarketplaceAccount`](../../doc/models/marketplace-account.md) | Required | - | MarketplaceAccount getAccount() | setAccount(MarketplaceAccount account) |
| `Plan` | [`Plan5`](../../doc/models/plan-5.md) | Required | - | Plan5 getPlan() | setPlan(Plan5 plan) |

## Example (as JSON)

```json
{
  "billing_cycle": "monthly",
  "next_billing_date": "11/11/2017 00:00:00",
  "unit_count": null,
  "on_free_trial": true,
  "free_trial_ends_on": "11/11/2017 00:00:00",
  "updated_at": "11/02/2017 01:12:12",
  "account": null,
  "plan": {
    "url": "https://api.github.com/marketplace_listing/plans/1313",
    "accounts_url": "https://api.github.com/marketplace_listing/plans/1313/accounts",
    "id": 1313,
    "number": 3,
    "name": "Pro",
    "description": "A professional-grade CI solution",
    "monthly_price_in_cents": 1099,
    "yearly_price_in_cents": 11870,
    "price_model": null,
    "has_free_trial": true,
    "unit_name": null,
    "state": "published",
    "bullets": [
      "Up to 25 private repositories",
      "11 concurrent builds"
    ]
  }
}
```

