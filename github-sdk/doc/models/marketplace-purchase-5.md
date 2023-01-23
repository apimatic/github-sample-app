
# Marketplace Purchase 5

## Structure

`MarketplacePurchase5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Account` | [`Account2`](../../doc/models/account-2.md) | Required | - | Account2 getAccount() | setAccount(Account2 account) |
| `BillingCycle` | `String` | Required | - | String getBillingCycle() | setBillingCycle(String billingCycle) |
| `FreeTrialEndsOn` | `String` | Required | - | String getFreeTrialEndsOn() | setFreeTrialEndsOn(String freeTrialEndsOn) |
| `NextBillingDate` | `String` | Optional | - | String getNextBillingDate() | setNextBillingDate(String nextBillingDate) |
| `OnFreeTrial` | `Boolean` | Required | - | Boolean getOnFreeTrial() | setOnFreeTrial(Boolean onFreeTrial) |
| `Plan` | [`Plan4`](../../doc/models/plan-4.md) | Required | - | Plan4 getPlan() | setPlan(Plan4 plan) |
| `UnitCount` | `int` | Required | - | int getUnitCount() | setUnitCount(int unitCount) |

## Example (as JSON)

```json
{
  "account": {
    "id": 52,
    "login": "login0",
    "node_id": "node_id2",
    "organization_billing_email": "organization_billing_email8",
    "type": "type0"
  },
  "billing_cycle": "billing_cycle8",
  "free_trial_ends_on": "free_trial_ends_on4",
  "next_billing_date": null,
  "on_free_trial": false,
  "plan": {
    "bullets": [
      "bullets2",
      "bullets3",
      "bullets4"
    ],
    "description": "description4",
    "has_free_trial": false,
    "id": 178,
    "monthly_price_in_cents": 82,
    "name": "name4",
    "price_model": "FLAT_RATE",
    "unit_name": "unit_name6",
    "yearly_price_in_cents": 128
  },
  "unit_count": 50
}
```

