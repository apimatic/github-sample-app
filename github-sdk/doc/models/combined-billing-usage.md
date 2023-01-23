
# Combined Billing Usage

## Structure

`CombinedBillingUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DaysLeftInBillingCycle` | `int` | Required | Numbers of days left in billing cycle. | int getDaysLeftInBillingCycle() | setDaysLeftInBillingCycle(int daysLeftInBillingCycle) |
| `EstimatedPaidStorageForMonth` | `int` | Required | Estimated storage space (GB) used in billing cycle. | int getEstimatedPaidStorageForMonth() | setEstimatedPaidStorageForMonth(int estimatedPaidStorageForMonth) |
| `EstimatedStorageForMonth` | `int` | Required | Estimated sum of free and paid storage space (GB) used in billing cycle. | int getEstimatedStorageForMonth() | setEstimatedStorageForMonth(int estimatedStorageForMonth) |

## Example (as JSON)

```json
{
  "days_left_in_billing_cycle": 106,
  "estimated_paid_storage_for_month": 146,
  "estimated_storage_for_month": 124
}
```

