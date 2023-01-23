
# Enterprises Actions Runner Groups Response

## Structure

`EnterprisesActionsRunnerGroupsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `double` | Required | - | double getTotalCount() | setTotalCount(double totalCount) |
| `RunnerGroups` | [`List<RunnerGroupsEnterprise>`](../../doc/models/runner-groups-enterprise.md) | Required | - | List<RunnerGroupsEnterprise> getRunnerGroups() | setRunnerGroups(List<RunnerGroupsEnterprise> runnerGroups) |

## Example (as JSON)

```json
{
  "total_count": 82.96,
  "runner_groups": [
    {
      "id": 98.88,
      "name": "name8",
      "visibility": "visibility0",
      "default": false,
      "selected_organizations_url": null,
      "runners_url": "runners_url0",
      "allows_public_repositories": false,
      "workflow_restrictions_read_only": null,
      "restricted_to_workflows": null,
      "selected_workflows": null
    },
    {
      "id": 98.89,
      "name": "name9",
      "visibility": "visibility1",
      "default": true,
      "selected_organizations_url": null,
      "runners_url": "runners_url1",
      "allows_public_repositories": true,
      "workflow_restrictions_read_only": null,
      "restricted_to_workflows": null,
      "selected_workflows": null
    },
    {
      "id": 98.9,
      "name": "name0",
      "visibility": "visibility2",
      "default": false,
      "selected_organizations_url": null,
      "runners_url": "runners_url2",
      "allows_public_repositories": false,
      "workflow_restrictions_read_only": null,
      "restricted_to_workflows": null,
      "selected_workflows": null
    }
  ]
}
```

