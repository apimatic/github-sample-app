
# Conclusion 20 Enum

**Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.
**Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a check run conclusion to `stale`, only GitHub can set this.

## Enumeration

`Conclusion20Enum`

## Fields

| Name |
|  --- |
| `ActionRequired` |
| `Cancelled` |
| `Failure` |
| `Neutral` |
| `Success` |
| `Skipped` |
| `Stale` |
| `TimedOut` |

