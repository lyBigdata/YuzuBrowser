/*
 * Copyright (C) 2017 Hazuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.hazuki.yuzubrowser.utils.fastmatch;

import android.net.Uri;
import android.support.annotation.NonNull;

class ContainsHost extends SimpleCountMatcher {

    private final String host;

    ContainsHost(@NonNull String host) {
        this.host = host;
    }

    @Override
    protected boolean matchItem(Uri uri) {
        return host.contains(uri.getHost());
    }

    @Override
    public int getType() {
        return TYPE_CONTAINS_HOST;
    }

    @Override
    public String getPattern() {
        return host;
    }
}