package com.thuan6420.buildsrc

object Configuration {
    const val targetSdk = 34
    const val minSdk = 21
    const val compileSdk = targetSdk
    const val minSdkBenchmark = 23
    const val majorVersion = 1
    const val minorVersion = 0
    const val patchVersion = 0
    const val versionName = "$majorVersion.$minorVersion.$patchVersion"
    const val versionCode = 1
    const val snapshotVersionName = "$majorVersion.$minorVersion.${patchVersion + 1}-SNAPSHOT"
    const val artifactGroup = "com.thuan6420.yamcore"
}