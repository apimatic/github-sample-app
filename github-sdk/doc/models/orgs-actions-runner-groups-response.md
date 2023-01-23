
# Orgs Actions Runner Groups Response

## Structure

`OrgsActionsRunnerGroupsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `double` | Required | - | double getTotalCount() | setTotalCount(double totalCount) |
| `RunnerGroups` | [`List<RunnerGroupsOrg>`](../../doc/models/runner-groups-org.md) | Required | - | List<RunnerGroupsOrg> getRunnerGroups() | setRunnerGroups(List<RunnerGroupsOrg> runnerGroups) |

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
      "selected_repositories_url": null,
      "runners_url": "runners_url0",
      "inherited": false,
      "inherited_allows_public_repositories": null,
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
      "selected_repositories_url": null,
      "runners_url": "runners_url1",
      "inherited": true,
      "inherited_allows_public_repositories": null,
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
      "selected_repositories_url": null,
      "runners_url": "runners_url2",
      "inherited": false,
      "inherited_allows_public_repositories": null,
      "allows_public_repositories": false,
      "workflow_restrictions_read_only": null,
      "restricted_to_workflows": null,
      "selected_workflows": null
    }
  ]
}
```

