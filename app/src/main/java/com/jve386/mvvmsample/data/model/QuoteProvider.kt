/**
 * This file defines a singleton class `QuoteProvider` responsible for providing and managing a list of quotes
 * in the MVVM sample application. The class is annotated with `@Singleton` to ensure a single instance is used
 * throughout the application, and it is injected using Dagger's `@Inject` constructor.
 *
 * @property quotes A list of `QuoteModel` instances representing quotes.
 */
package com.jve386.mvvmsample.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor() {
    var quotes: List<QuoteModel> = emptyList()
}
