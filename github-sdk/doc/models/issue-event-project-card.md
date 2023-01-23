
# Issue Event Project Card

Issue Event Project Card

## Structure

`IssueEventProjectCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `ProjectUrl` | `String` | Required | - | String getProjectUrl() | setProjectUrl(String projectUrl) |
| `ProjectId` | `int` | Required | - | int getProjectId() | setProjectId(int projectId) |
| `ColumnName` | `String` | Required | - | String getColumnName() | setColumnName(String columnName) |
| `PreviousColumnName` | `String` | Optional | - | String getPreviousColumnName() | setPreviousColumnName(String previousColumnName) |

## Example (as JSON)

```json
{
  "url": "url4",
  "id": 112,
  "project_url": "project_url6",
  "project_id": 160,
  "column_name": "column_name4",
  "previous_column_name": null
}
```

