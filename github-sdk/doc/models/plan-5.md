
# Plan 5

## Structure

`Plan5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `AccountsUrl` | `String` | Required | - | String getAccountsUrl() | setAccountsUrl(String accountsUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `MonthlyPriceInCents` | `int` | Required | - | int getMonthlyPriceInCents() | setMonthlyPriceInCents(int monthlyPriceInCents) |
| `YearlyPriceInCents` | `int` | Required | - | int getYearlyPriceInCents() | setYearlyPriceInCents(int yearlyPriceInCents) |
| `PriceModel` | [`PriceModelEnum`](../../doc/models/price-model-enum.md) | Required | - | PriceModelEnum getPriceModel() | setPriceModel(PriceModelEnum priceModel) |
| `HasFreeTrial` | `boolean` | Required | - | boolean getHasFreeTrial() | setHasFreeTrial(boolean hasFreeTrial) |
| `UnitName` | `String` | Required | - | String getUnitName() | setUnitName(String unitName) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `Bullets` | `List<String>` | Required | - | List<String> getBullets() | setBullets(List<String> bullets) |

## Example (as JSON)

```json
{
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
```

