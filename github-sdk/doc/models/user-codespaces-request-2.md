
# User Codespaces Request 2

## Structure

`UserCodespacesRequest2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Machine` | `String` | Optional | A valid machine to transition this codespace to. | String getMachine() | setMachine(String machine) |
| `DisplayName` | `String` | Optional | Display name for this codespace | String getDisplayName() | setDisplayName(String displayName) |
| `RecentFolders` | `List<String>` | Optional | Recently opened folders inside the codespace. It is currently used by the clients to determine the folder path to load the codespace in. | List<String> getRecentFolders() | setRecentFolders(List<String> recentFolders) |

## Example (as JSON)

```json
{
  "machine": null,
  "display_name": null,
  "recent_folders": null
}
```

