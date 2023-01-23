
# Actions OIDC Subjectcustomization

Actions OIDC Subject customization

## Structure

`ActionsOIDCSubjectcustomization`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IncludeClaimKeys` | `List<String>` | Required | Array of unique strings. Each claim key can only contain alphanumeric characters and underscores. | List<String> getIncludeClaimKeys() | setIncludeClaimKeys(List<String> includeClaimKeys) |

## Example (as JSON)

```json
{
  "include_claim_keys": [
    "include_claim_keys3"
  ]
}
```

