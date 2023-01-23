
# Secret Scanning Push Protection 1

Use the `status` property to enable or disable secret scanning push protection for this repository. For more information, see "[Protecting pushes with secret scanning](/code-security/secret-scanning/protecting-pushes-with-secret-scanning)."

## Structure

`SecretScanningPushProtection1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | Can be `enabled` or `disabled`. | String getStatus() | setStatus(String status) |

## Example (as JSON)

```json
{
  "status": null
}
```

