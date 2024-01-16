# Randomized Quotes (Sample) 📚 Android App

Randomized Quotes is an Android application that allows users to get quotes from various sources. The app leverages Android development practices and provides insights into using View Binding, Coroutines, Retrofit, and other key technologies.

## Technologies Used 💻

- **Language:** Kotlin
- **Data Architecture:** MVVM (Model-View-ViewModel)
- **Android Frameworks:** Android SDK, Android Jetpack
- **UI Components:** XML layout with Material Design components
- **RecyclerView:** Display of quotes
- **View Binding:** Interaction with UI components
- **Kotlin Coroutines:** Handling of asynchronous programming tasks
- **Libraries:** Retrofit for API requests, Gson for JSON parsing
- **Dependency Injection:** Dagger Hilt
- **Version Control:** Git
- **Build Tool:** Gradle

## Features ⚙️

- Utilizes a custom API to fetch and display a collection of quotes.
- Search functionality for users to find specific quotes.
- Asynchronous programming using Kotlin Coroutines for data retrieval.
- Utilizes RecyclerView to showcase a list of quotes.
- View Binding for interaction with UI components.

## Key Components 🛠️

### Models:

- **QuoteModel**
  - Represents a quote, including the quote text and author.

### Networking:

- **QuoteApiClient**
  - Retrofit interface defining API endpoints for fetching quotes.

- **QuoteService**
  - Handles API requests using the QuoteApiClient.

### Data:

- **QuoteRepository**
  - Manages data retrieval and serves as a single source of truth for quotes.

### Dependency Injection:

- **NetworkModule**
  - Provides Dagger Hilt module for setting up network-related dependencies.

### Use Cases:

- **GetQuotesUseCase**
  - Retrieves a list of quotes from the repository.

- **GetRandomQuoteUseCase**
  - Retrieves a random quote from the repository.

### ViewModels:

- **QuoteViewModel**
  - Manages UI-related logic and communicates with the repository.

### UI:

- **MainActivity**
  - Displays a RecyclerView for listing quotes.
  - Implements a SearchView for quote searches.

- **QuoteDetailActivity**
  - Displays detailed information about a selected quote.

## Key Features 🚀

- Get a collection of random pre-generated quotes.
- Visual feedback during quote retrieval with the help of Kotlin Coroutines.
- Utilizes Android development practices for an enhanced user experience.


## How to Use Custom JSON Data from Firebase 🌐

To enhance the app with custom quotes, you can use a Firebase-hosted JSON file. Follow these steps to set it up:

### Step 1: Create a Firebase Project

1. Go to the [Firebase Console](https://console.firebase.google.com/).
2. Click on "Add Project" and follow the instructions to create a new Firebase project:
<img src="https://github.com/Jve386/MVVM-DaggerHilt-Sample/blob/main/img/firebase_guide_toJson.jpg" alt="Firebase Setup Guide: Convert JSON to Firebase">


### Step 2: Add a Realtime Database to Your Project

1. In the Firebase Console, navigate to your project.
2. Click on "Database" in the left-hand menu.
3. Click on "Create Database" and choose "Start in test mode" for simplicity.

### Step 3: Upload Custom JSON Data

1. In the "Database" section, click on the "Realtime Database" tab.
2. Click on "Import JSON" and upload your custom JSON file with quotes.

### Step 4: Configure the App

1. Open the `RetrofitHelper.kt` file in your Android Studio project.
2. Update the `baseUrl` in the `getRetrofit` function to point to your Firebase Realtime Database URL.

 ```kotlin
   .baseUrl("https://your-firebase-project-id.firebaseio.com/")
```

Build and run the app on your device or emulator.

# Media 📷
<img src="https://github.com/Jve386/MVVM-DaggerHilt-Sample/blob/main/img/preview.gif" alt="MVVM-DaggerHilt-Sample">


## How to Use ✨

1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run on an Android device or emulator.

## Additional Notes 📝

Feel free to contribute, open issues, or use this project as a learning resource for Android development and API integration. Happy coding 👌!