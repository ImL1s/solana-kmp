pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "kotlin-solana"

fun includeBuildIfExists(path: String) {
    if (file(path).exists()) {
        includeBuild(path)
    }
}

includeBuildIfExists("../kotlin-crypto-pure")
includeBuildIfExists("../kotlin-address")

include(":solana")
include(":solanapublickeys")
include(":base58")
include(":solanaeddsa")
include(":amount")
include(":readapi")
include(":rpc")
include(":signer")
include(":mplbubblegum")
include(":mpltokenmetadata")

