/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivianuu.rxactivityresultextensions

import android.app.Activity
import android.content.Intent
import android.content.IntentSender
import android.os.Bundle
import android.support.annotation.CheckResult
import io.reactivex.Observable
import rx_activity_result2.OnPreResult
import rx_activity_result2.Result
import rx_activity_result2.RxActivityResult

@CheckResult
fun <T : Activity> T.startIntentRx(intent: Intent) : Observable<Result<T>>
        = RxActivityResult.on(this).startIntent(intent)

@CheckResult
fun <T : Activity> T.startIntentRx(intent: Intent, onPreResult: OnPreResult<T>) : Observable<Result<T>>
        = RxActivityResult.on(this).startIntent(intent, onPreResult)

@CheckResult
fun <T : Activity> T.startIntentSenderRx(intentSender: IntentSender,
                                         fillInIntent: Intent? = null,
                                         flagsMask: Int = 0,
                                         flagsValues: Int = 0,
                                         extraFlags: Int = 0): Observable<Result<T>>
        = RxActivityResult.on(this).startIntentSender(intentSender, fillInIntent, flagsMask, flagsValues, extraFlags)

@CheckResult
fun <T : Activity> T.startIntentSenderRx(intentSender: IntentSender,
                                         fillInIntent: Intent? = null,
                                         flagsMask: Int = 0,
                                         flagsValues: Int = 0,
                                         extraFlags: Int = 0,
                                         options: Bundle? = null): Observable<Result<T>>
        = RxActivityResult.on(this).startIntentSender(intentSender, fillInIntent, flagsMask, flagsValues, extraFlags, options)
