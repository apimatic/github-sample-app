
# User Codespaces Machines Response

## Structure

`UserCodespacesMachinesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Machines` | [`List<Codespacemachine>`](../../doc/models/codespacemachine.md) | Required | - | List<Codespacemachine> getMachines() | setMachines(List<Codespacemachine> machines) |

## Example (as JSON)

```json
{
  "total_count": null,
  "machines": {
    "name": "standardLinux",
    "display_name": "4 cores, 8 GB RAM, 64 GB storage",
    "operating_system": "linux",
    "storage_in_bytes": 68719476736,
    "memory_in_bytes": 8589934592,
    "cpus": 4,
    "prebuild_availability": null
  }
}
```

