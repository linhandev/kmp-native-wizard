# Kotlin/Native Template

使用
- 替换 `/Volumes/disk/git/kmp/kotlin22-ohos/build/repo` 为本地kotlin依赖目录
- 替换 `/Volumes/disk/git/kmp/kotlin22-ohos/kotlin-native/dist/` 为本地kotlin-native工具地址
- 打包二进制 `./gradlew clean build`

```shell
./build/bin/macosArm64/releaseExecutable/KotlinNativeTemplate.kexe


hdc shell rm /data/KotlinNativeTemplate.kexe
hdc file send ./build/bin/ohosArm64/releaseExecutable/KotlinNativeTemplate.kexe /data/
hdc shell chmod u+x /data/KotlinNativeTemplate.kexe
hdc shell /data/KotlinNativeTemplate.kexe
```