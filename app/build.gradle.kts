plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.dicoding.sahabatgula"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dicoding.sahabatgula"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    //retrofit
    implementation(libs.retrofit)
    //logging-interceptor
    implementation(libs.logging.interceptor)
    //gson-converter
    implementation(libs.retrofit2.converter.gson)
    //live-data
    implementation(libs.androidx.lifecycle.livedata.ktx)
    //view-model
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    //fragment-ktx
    implementation(libs.androidx.fragment.ktx)
    //navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    //activity-ktx
    implementation(libs.androidx.activity.ktx)
    //mockito
    testImplementation(libs.mockito.core)
    //mockito-inline
    testImplementation(libs.mockito.mockito.inline)
    // JUnit
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    // espresso
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.runner)
    androidTestImplementation(libs.androidx.rules)
}