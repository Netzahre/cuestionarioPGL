# Práctica 2 - Cuestionario

This is an Android quiz app. The quiz is about the video game "Death Stranding." It features single-choice (radio buttons, spinners) and multiple-choice (checkboxes) questions. Users can submit their answers to see their score and get feedback on each question.

## How to Build

This is a standard Android Studio project.
1.  Clone the repository.
2.  Open the project in Android Studio.
3.  Let Gradle sync and download dependencies.
4.  You can then build the application using the "Build" menu in Android Studio or by running the appropriate Gradle tasks (e.g., `./gradlew assembleDebug`).

**SDK Versions:**
-   `minSdk`: 24
-   `targetSdk`: 34
-   `compileSdk`: 34

## How to Use

1.  Launch the application on an Android device or emulator.
2.  You will be presented with a series of questions about the video game "Death Stranding."
3.  Answer each question:
    *   For some questions, you will select a single answer from a list of radio buttons.
    *   For others, you will select a single answer from a dropdown menu (spinner).
    *   Some questions allow you to select multiple answers using checkboxes.
4.  Once you have answered all the questions, tap the **"Corregir"** button at the bottom.
5.  The application will then display:
    *   Your total score.
    *   The number of questions you answered correctly.
    *   Feedback for each question, indicating if your answer was correct or incorrect. If incorrect, the correct answer(s) will be shown.

## Dependencies

The project uses the following primary dependencies:

*   AndroidX Core KTX (`androidx.core:core-ktx`)
*   AndroidX AppCompat (`androidx.appcompat:appcompat`)
*   Google Material Components (`com.google.android.material:material`)
*   AndroidX Activity (`androidx.activity:activity`)
*   AndroidX ConstraintLayout (`androidx.constraintlayout:constraintlayout`)
*   JUnit (`junit:junit`) - For unit testing.
*   AndroidX JUnit (`androidx.test.ext:junit`) - For instrumented tests.
*   AndroidX Espresso Core (`androidx.test.espresso:espresso-core`) - For UI tests.

These dependencies are managed by Gradle and are defined in the `app/build.gradle.kts` file.
