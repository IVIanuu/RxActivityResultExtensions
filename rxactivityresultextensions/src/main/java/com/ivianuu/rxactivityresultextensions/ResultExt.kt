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
import rx_activity_result2.Result

/**
 * Returns whether the result is ok
 */
fun Result<*>.isOk() = resultCode() == Activity.RESULT_OK

/**
 * Returns whether the result is canceled
 */
fun Result<*>.isCanceled() = resultCode() == Activity.RESULT_CANCELED

/**
 * Returns whether the result is first user
 */
fun Result<*>.isFirstUser() = resultCode() == Activity.RESULT_FIRST_USER

/**
 * Returns whether the request code is matching the of this result or not
 */
fun Result<*>.isRequestCode(requestCode: Int) = requestCode() == requestCode