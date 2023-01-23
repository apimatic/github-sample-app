
# Actions OID Csubjectcustomizationforarepository

Actions OIDC subject customization for a repository

## Structure

`ActionsOIDCsubjectcustomizationforarepository`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UseDefault` | `boolean` | Required | Whether to use the default template or not. If `true`, the `include_claim_keys` field is ignored. | boolean getUseDefault() | setUseDefault(boolean useDefault) |
| `IncludeClaimKeys` | `List<String>` | Optional | Array of unique strings. Each claim key can only contain alphanumeric characters and underscores. | List<String> getIncludeClaimKeys() | setIncludeClaimKeys(List<String> includeClaimKeys) |

## Example (as JSON)

```json
{
  "use_default": false,
  "include_claim_keys": null
}
```

