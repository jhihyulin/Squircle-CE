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

package com.blacksquircle.ui.feature.themes.data.utils

import com.blacksquircle.ui.editorkit.utils.EditorTheme
import com.blacksquircle.ui.feature.themes.domain.model.ThemeModel

enum class InternalTheme(val theme: ThemeModel) {
    THEME_DARCULA(
        theme = ThemeModel(
            uuid = "DARCULA",
            name = "Darcula",
            author = "Squircle CE",
            description = "Default color scheme",
            isExternal = false,
            colorScheme = EditorTheme.DARCULA
        )
    ),
    THEME_MONOKAI(
        theme = ThemeModel(
            uuid = "MONOKAI",
            name = "Monokai",
            author = "Squircle CE",
            description = "Default color scheme",
            isExternal = false,
            colorScheme = EditorTheme.MONOKAI
        )
    ),
    THEME_OBSIDIAN(
        theme = ThemeModel(
            uuid = "OBSIDIAN",
            name = "Obsidian",
            author = "Squircle CE",
            description = "Default color scheme",
            isExternal = false,
            colorScheme = EditorTheme.OBSIDIAN
        )
    ),
    THEME_LADIES_NIGHT(
        theme = ThemeModel(
            uuid = "LADIES_NIGHT",
            name = "Ladies Night",
            author = "Squircle CE",
            description = "Default color scheme",
            isExternal = false,
            colorScheme = EditorTheme.LADIES_NIGHT
        )
    ),
    THEME_TOMORROW_NIGHT(
        theme = ThemeModel(
            uuid = "TOMORROW_NIGHT",
            name = "Tomorrow Night",
            author = "Squircle CE",
            description = "Default color scheme",
            isExternal = false,
            colorScheme = EditorTheme.TOMORROW_NIGHT
        )
    ),
    THEME_VISUAL_STUDIO_2013(
        theme = ThemeModel(
            uuid = "VISUAL_STUDIO_2013",
            name = "Visual Studio 2013",
            author = "Squircle CE",
            description = "Default color scheme",
            isExternal = false,
            colorScheme = EditorTheme.VISUAL_STUDIO_2013
        )
    );

    companion object {

        fun find(id: String): ThemeModel? {
            return values().find { it.theme.uuid == id }?.theme
        }
    }
}