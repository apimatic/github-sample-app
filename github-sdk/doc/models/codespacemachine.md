
# Codespacemachine

A description of the machine powering a codespace.

## Structure

`Codespacemachine`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the machine. | String getName() | setName(String name) |
| `DisplayName` | `String` | Required | The display name of the machine includes cores, memory, and storage. | String getDisplayName() | setDisplayName(String displayName) |
| `OperatingSystem` | `String` | Required | The operating system of the machine. | String getOperatingSystem() | setOperatingSystem(String operatingSystem) |
| `StorageInBytes` | `long` | Required | How much storage is available to the codespace. | long getStorageInBytes() | setStorageInBytes(long storageInBytes) |
| `MemoryInBytes` | `long` | Required | How much memory is available to the codespace. | long getMemoryInBytes() | setMemoryInBytes(long memoryInBytes) |
| `Cpus` | `int` | Required | How many cores are available to the codespace. | int getCpus() | setCpus(int cpus) |
| `PrebuildAvailability` | `Object` | Required | - | Object getPrebuildAvailability() | setPrebuildAvailability(Object prebuildAvailability) |

## Example (as JSON)

```json
{
  "name": "standardLinux",
  "display_name": "4 cores, 8 GB RAM, 64 GB storage",
  "operating_system": "linux",
  "storage_in_bytes": 68719476736,
  "memory_in_bytes": 8589934592,
  "cpus": 4,
  "prebuild_availability": null
}
```

