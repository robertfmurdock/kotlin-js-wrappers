@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.displayname

import react.*

@JsName("FormattedDisplayName")
external class FormattedDisplayNameComponent : Component<FormattedDisplayNameProps, State> {
    override fun render(): ReactElement?
}

external interface FormattedDisplayNameProps : DisplayNamesOptions, Props {
    var value: Any /* String | Number | Msp<String, Unknown> */
}

external interface DisplayNamesOptions {
    var localeMatcher: String? /* "lookup" | "best fit" */
    var style: String? /* "narrow" | "short" | "long" */
    var type: String /* "language" | "region" | "script" | "currency" */
    var fallback: String? /* "code" | "none" */
}

external interface DisplayNamesResolvedOptions {
    var locale: String
    var style: String /* "narrow" | "short" | "long" */
    var type: String /* "language" | "region" | "script" | "currency" */
    var fallback: String /* "code" | "none" */
}

external class DisplayNames(
    locales: Any? /* String | Array<String> */ = definedExternally,
    options: DisplayNamesOptions
) {
    fun of(code: Any /* String | Number | Record<String, Any> */): String?
    fun resolvedOptions(): DisplayNamesResolvedOptions
}
