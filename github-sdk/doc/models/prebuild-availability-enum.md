
# Prebuild Availability Enum

Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be "null" if prebuilds are not supported or prebuild availability could not be determined. Value will be "none" if no prebuild is available. Latest values "ready" and "in_progress" indicate the prebuild availability status.

## Enumeration

`PrebuildAvailabilityEnum`

## Fields

| Name |
|  --- |
| `None` |
| `Ready` |
| `InProgress` |

## Example

```
ready
```

