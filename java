
// Initialize the Gemini Developer API backend service
// Create a `GenerativeModel` instance with a model that supports your use case
GenerativeModel ai = FirebaseAI.getInstance(GenerativeBackend.googleAI())
        .generativeModel("gemini-2.5-flash");

// Use the GenerativeModelFutures Java compatibility layer which offers
// support for ListenableFuture and Publisher APIs
GenerativeModelFutures model = GenerativeModelFutures.from(ai);
