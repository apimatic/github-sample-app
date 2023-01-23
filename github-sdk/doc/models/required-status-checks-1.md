
# Required Status Checks 1

Require status checks to pass before merging. Set to `null` to disable.

## Structure

`RequiredStatusChecks1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Strict` | `boolean` | Required | Require branches to be up to date before merging. | boolean getStrict() | setStrict(boolean strict) |
| `Contexts` | `List<String>` | Required | **Deprecated**: The list of status checks to require in order to merge into this branch. If any of these checks have recently been set by a particular GitHub App, they will be required to come from that app in future for the branch to merge. Use `checks` instead of `contexts` for more fine-grained control. | List<String> getContexts() | setContexts(List<String> contexts) |
| `Checks` | [`List<Checks30>`](../../doc/models/checks-30.md) | Optional | The list of status checks to require in order to merge into this branch. | List<Checks30> getChecks() | setChecks(List<Checks30> checks) |

## Example (as JSON)

```json
{
  "strict": false,
  "contexts": [
    "contexts3"
  ],
  "checks": null
}
```

