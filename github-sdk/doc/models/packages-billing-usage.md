
# Packages Billing Usage

## Structure

`PackagesBillingUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalGigabytesBandwidthUsed` | `int` | Required | Sum of the free and paid storage space (GB) for GitHuub Packages. | int getTotalGigabytesBandwidthUsed() | setTotalGigabytesBandwidthUsed(int totalGigabytesBandwidthUsed) |
| `TotalPaidGigabytesBandwidthUsed` | `int` | Required | Total paid storage space (GB) for GitHuub Packages. | int getTotalPaidGigabytesBandwidthUsed() | setTotalPaidGigabytesBandwidthUsed(int totalPaidGigabytesBandwidthUsed) |
| `IncludedGigabytesBandwidth` | `int` | Required | Free storage space (GB) for GitHub Packages. | int getIncludedGigabytesBandwidth() | setIncludedGigabytesBandwidth(int includedGigabytesBandwidth) |

## Example (as JSON)

```json
{
  "total_gigabytes_bandwidth_used": 92,
  "total_paid_gigabytes_bandwidth_used": 172,
  "included_gigabytes_bandwidth": 220
}
```

