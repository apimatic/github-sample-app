
# Plan 4

## Structure

`Plan4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bullets` | `List<String>` | Required | - | List<String> getBullets() | setBullets(List<String> bullets) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `HasFreeTrial` | `boolean` | Required | - | boolean getHasFreeTrial() | setHasFreeTrial(boolean hasFreeTrial) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `MonthlyPriceInCents` | `int` | Required | - | int getMonthlyPriceInCents() | setMonthlyPriceInCents(int monthlyPriceInCents) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `PriceModel` | [`PriceModelEnum`](../../doc/models/price-model-enum.md) | Required | - | PriceModelEnum getPriceModel() | setPriceModel(PriceModelEnum priceModel) |
| `UnitName` | `String` | Required | - | String getUnitName() | setUnitName(String unitName) |
| `YearlyPriceInCents` | `int` | Required | - | int getYearlyPriceInCents() | setYearlyPriceInCents(int yearlyPriceInCents) |

## Example (as JSON)

```json
{
  "bullets": [
    "bullets8",
    "bullets9",
    "bullets0"
  ],
  "description": "description0",
  "has_free_trial": false,
  "id": 112,
  "monthly_price_in_cents": 16,
  "name": "name0",
  "price_model": "FLAT_RATE",
  "unit_name": "unit_name2",
  "yearly_price_in_cents": 194
}
```

