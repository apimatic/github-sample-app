
# Project Card 1

## Structure

`ProjectCard1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ProjectId` | `int` | Required | - | int getProjectId() | setProjectId(int projectId) |
| `ProjectUrl` | `String` | Required | - | String getProjectUrl() | setProjectUrl(String projectUrl) |
| `ColumnName` | `String` | Required | - | String getColumnName() | setColumnName(String columnName) |
| `PreviousColumnName` | `String` | Optional | - | String getPreviousColumnName() | setPreviousColumnName(String previousColumnName) |

## Example (as JSON)

```json
{
  "id": 112,
  "url": "url4",
  "project_id": 160,
  "project_url": "project_url6",
  "column_name": "column_name4",
  "previous_column_name": null
}
```

