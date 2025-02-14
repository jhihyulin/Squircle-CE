/*
 * Copyright 2022 Squircle CE contributors.
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

package com.blacksquircle.ui.feature.editor.domain.model

data class DocumentModel(
    val uuid: String,
    val fileUri: String,
    val filesystemUuid: String,
    var modified: Boolean,
    var position: Int,
    var scrollX: Int,
    var scrollY: Int,
    var selectionStart: Int,
    var selectionEnd: Int
) {

    val scheme: String
        get() = fileUri.substringBeforeLast("://") + "://"
    val path: String
        get() = fileUri.substringAfterLast("://")
    val name: String
        get() = fileUri.substringAfterLast('/')

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as DocumentModel
        if (fileUri != other.fileUri) return false
        return true
    }

    override fun hashCode(): Int {
        return fileUri.hashCode()
    }
}