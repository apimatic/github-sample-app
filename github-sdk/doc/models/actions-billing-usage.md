
# Actions Billing Usage

## Structure

`ActionsBillingUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalMinutesUsed` | `int` | Required | The sum of the free and paid GitHub Actions minutes used. | int getTotalMinutesUsed() | setTotalMinutesUsed(int totalMinutesUsed) |
| `TotalPaidMinutesUsed` | `int` | Required | The total paid GitHub Actions minutes used. | int getTotalPaidMinutesUsed() | setTotalPaidMinutesUsed(int totalPaidMinutesUsed) |
| `IncludedMinutes` | `int` | Required | The amount of free GitHub Actions minutes available. | int getIncludedMinutes() | setIncludedMinutes(int includedMinutes) |
| `MinutesUsedBreakdown` | [`MinutesUsedBreakdown`](../../doc/models/minutes-used-breakdown.md) | Required | - | MinutesUsedBreakdown getMinutesUsedBreakdown() | setMinutesUsedBreakdown(MinutesUsedBreakdown minutesUsedBreakdown) |

## Example (as JSON)

```json
{
  "total_minutes_used": 184,
  "total_paid_minutes_used": 146,
  "included_minutes": 186,
  "minutes_used_breakdown": {
    "UBUNTU": null,
    "MACOS": null,
    "WINDOWS": null,
    "ubuntu_4_core": null,
    "ubuntu_8_core": null,
    "ubuntu_16_core": null,
    "ubuntu_32_core": null,
    "ubuntu_64_core": null,
    "windows_4_core": null,
    "windows_8_core": null,
    "windows_16_core": null,
    "windows_32_core": null,
    "windows_64_core": null,
    "macos_12_core": null,
    "total": null
  }
}
```

