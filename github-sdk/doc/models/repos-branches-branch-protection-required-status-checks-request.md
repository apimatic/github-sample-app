
# Repos Branches Branch Protection Required Status Checks Request

## Structure

`ReposBranchesBranchProtectionRequiredStatusChecksRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Strict` | `Boolean` | Optional | Require branches to be up to date before merging. | Boolean getStrict() | setStrict(Boolean strict) |
| `Contexts` | `List<String>` | Optional | **Deprecated**: The list of status checks to require in order to merge into this branch. If any of these checks have recently been set by a particular GitHub App, they will be required to come from that app in future for the branch to merge. Use `checks` instead of `contexts` for more fine-grained control. | List<String> getContexts() | setContexts(List<String> contexts) |
| `Checks` | [`List<Checks30>`](../../doc/models/checks-30.md) | Optional | The list of status checks to require in order to merge into this branch. | List<Checks30> getChecks() | setChecks(List<Checks30> checks) |

## Example (as JSON)

```json
{
  "strict": null,
  "contexts": null,
  "checks": null
}
```

