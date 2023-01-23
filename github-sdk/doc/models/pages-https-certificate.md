
# Pages Https Certificate

## Structure

`PagesHttpsCertificate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | [`State12Enum`](../../doc/models/state-12-enum.md) | Required | - | State12Enum getState() | setState(State12Enum state) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Domains` | `List<String>` | Required | Array of the domain set and its alternate name (if it is configured) | List<String> getDomains() | setDomains(List<String> domains) |
| `ExpiresAt` | `LocalDate` | Optional | - | LocalDate getExpiresAt() | setExpiresAt(LocalDate expiresAt) |

## Example (as JSON)

```json
{
  "state": null,
  "description": "Certificate is approved",
  "domains": [
    "example.com",
    "www.example.com"
  ]
}
```

