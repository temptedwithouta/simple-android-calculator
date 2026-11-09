# Simple Android Calculator

A small native Android calculator built with Java and XML layouts. It provides a welcome screen and a keypad for basic two-operand arithmetic.

## Features

- Addition, subtraction, multiplication, and division
- Remainder using `%`
- Clear the current input and result
- Return from the calculator to the welcome screen

The calculator evaluates one binary operation at a time. `%` is the remainder operator, not percentage conversion.

## Technology Stack

- Java
- Android XML layouts
- Android Gradle Plugin 8.1.1
- Gradle 8.0 (Gradle wrapper)
- AndroidX AppCompat, Material Components, and ConstraintLayout

## Requirements

- Android Studio with JDK 17
- Android SDK Platform 33
- An Android emulator or device running Android 7.0 (API 24) or later to run the app

The app's minimum SDK is 24 and target SDK is 33.

## Getting Started

1. Open the project root in Android Studio.
2. Install Android SDK Platform 33 if Android Studio prompts you to do so.
3. Sync the project with Gradle.
4. Select an emulator or connected device and run the `app` configuration. Tap **Continue** on the welcome screen to open the calculator.

You can also install the debug build to a connected device or running emulator with the Gradle wrapper commands below.

## Build

Run these commands from the project root.

macOS/Linux:

```bash
./gradlew assembleDebug
```

Windows PowerShell:

```powershell
.\gradlew.bat assembleDebug
```

The debug APK is written to `app/build/outputs/apk/debug/app-debug.apk`.

To install the debug build on a connected device or running emulator:

macOS/Linux:

```bash
./gradlew installDebug
```

Windows PowerShell:

```powershell
.\gradlew.bat installDebug
```

## Tests

Run the local unit test task from the project root:

macOS/Linux:

```bash
./gradlew testDebugUnitTest
```

Windows PowerShell:

```powershell
.\gradlew.bat testDebugUnitTest
```

## Project Structure

```text
.
├── app/
│   ├── src/main/
│   │   ├── java/com/example/gslc_1/
│   │   │   ├── MainActivity.java
│   │   │   └── SecondActivity.java
│   │   ├── res/layout/
│   │   │   ├── activity_main.xml
│   │   │   └── activity_second.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/wrapper/
├── build.gradle.kts
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

## Screenshots

| Welcome screen | Calculator |
| --- | --- |
| ![Welcome screen](https://github.com/temptedwithouta/simple_android_calculator/assets/93007514/5fa1f75f-fa94-466b-b179-90820537c9d1) | ![Calculator screen](https://github.com/temptedwithouta/simple_android_calculator/assets/93007514/fd4368d8-1293-42c2-954c-aae168c3cb13) |

## License

No license is specified for this project.
