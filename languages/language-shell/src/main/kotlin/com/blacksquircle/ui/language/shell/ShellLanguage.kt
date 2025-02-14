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

package com.blacksquircle.ui.language.shell

import com.blacksquircle.ui.language.base.Language
import com.blacksquircle.ui.language.base.parser.LanguageParser
import com.blacksquircle.ui.language.base.provider.SuggestionProvider
import com.blacksquircle.ui.language.base.styler.LanguageStyler
import com.blacksquircle.ui.language.base.utils.endsWith
import com.blacksquircle.ui.language.shell.parser.ShellParser
import com.blacksquircle.ui.language.shell.provider.ShellProvider
import com.blacksquircle.ui.language.shell.styler.ShellStyler

class ShellLanguage : Language {

    companion object {

        private val FILE_EXTENSIONS = arrayOf(
            ".sh", ".ksh", ".bsh", ".csh", ".tcsh", ".zsh", ".bash", ".py"
        )

        fun supportFormat(fileName: String): Boolean {
            return fileName.endsWith(FILE_EXTENSIONS)
        }
    }

    override val languageName = "shell"

    override fun getParser(): LanguageParser {
        return ShellParser.getInstance()
    }

    override fun getProvider(): SuggestionProvider {
        return ShellProvider.getInstance()
    }

    override fun getStyler(): LanguageStyler {
        return ShellStyler.getInstance()
    }
}