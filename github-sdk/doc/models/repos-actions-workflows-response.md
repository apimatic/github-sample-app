
# Repos Actions Workflows Response

## Structure

`ReposActionsWorkflowsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Workflows` | [`List<Workflow>`](../../doc/models/workflow.md) | Required | - | List<Workflow> getWorkflows() | setWorkflows(List<Workflow> workflows) |

## Example (as JSON)

```json
{
  "total_count": null,
  "workflows": {
    "id": 5,
    "node_id": "MDg6V29ya2Zsb3cxMg==",
    "name": "CI",
    "path": "ruby.yaml",
    "state": null,
    "created_at": "12/06/2019 14:20:20",
    "updated_at": "12/06/2019 14:20:20",
    "url": "https://api.github.com/repos/actions/setup-ruby/workflows/5",
    "html_url": "https://github.com/actions/setup-ruby/blob/master/.github/workflows/ruby.yaml",
    "badge_url": "https://github.com/actions/setup-ruby/workflows/CI/badge.svg"
  }
}
```

