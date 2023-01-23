
# Repos Actions Workflows Workflow Id Dispatches Request

## Structure

`ReposActionsWorkflowsWorkflowIdDispatchesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ref` | `String` | Required | The git reference for the workflow. The reference can be a branch or tag name. | String getRef() | setRef(String ref) |
| `Inputs` | `Map<String, String>` | Optional | Input keys and values configured in the workflow file. The maximum number of properties is 10. Any default properties configured in the workflow file will be used when `inputs` are omitted. | Map<String, String> getInputs() | setInputs(Map<String, String> inputs) |

## Example (as JSON)

```json
{
  "ref": "ref0",
  "inputs": null
}
```

