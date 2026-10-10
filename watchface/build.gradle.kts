plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.matrixrain"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.matrixrain"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}
