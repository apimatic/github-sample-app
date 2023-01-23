
# Package Version Metadata

## Structure

`PackageVersionMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PackageType` | [`PackageType2Enum`](../../doc/models/package-type-2-enum.md) | Required | - | PackageType2Enum getPackageType() | setPackageType(PackageType2Enum packageType) |
| `Container` | [`ContainerMetadata`](../../doc/models/container-metadata.md) | Optional | - | ContainerMetadata getContainer() | setContainer(ContainerMetadata container) |
| `Docker` | [`DockerMetadata`](../../doc/models/docker-metadata.md) | Optional | - | DockerMetadata getDocker() | setDocker(DockerMetadata docker) |

## Example (as JSON)

```json
{
  "package_type": "nuget",
  "container": null,
  "docker": null
}
```

